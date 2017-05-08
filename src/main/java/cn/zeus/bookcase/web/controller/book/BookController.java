package cn.zeus.bookcase.web.controller.book;

import cn.zeus.bookcase.common.BaseResponse;
import cn.zeus.bookcase.component.book.service.BookService;
import cn.zeus.bookcase.component.book.vo.BookInfoVo;
import cn.zeus.bookcase.component.book.vo.BookVo;
import cn.zeus.bookcase.component.book.vo.req.BookReq;
import cn.zeus.bookcase.component.book.vo.resp.BookResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lvzimou on 16-11-19.
 */
@Controller
@RequestMapping("/books")
public class BookController {

    private static final Logger LOG = LoggerFactory
            .getLogger(BookController.class);

    @Autowired
    private BookService bookService;

    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET)
    public BaseResponse<List<BookResp>> fetchBooks(
            @RequestParam(value = "title", required = false) String title,
            @RequestParam(value = "authors", required = false) String authors,
            @RequestParam(value = "isbn", required = false) String isbn,
            @RequestParam(value = "category", required = false) Integer category,
            @RequestParam(value = "state", required = false, defaultValue = "-1") Integer state,
            @RequestParam(value = "publishStartDate", required = false) String publishStartDate,
            @RequestParam(value = "publishEndDate", required = false) String publishEndDate,
            @RequestParam(value = "page", required = false) Integer page,
            @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        LOG.info("[书籍列表] - 访问[GET /books]接口, reqParams title = " + title);
        BookReq filterParams = new BookReq(title, authors, isbn, category, state,
                publishStartDate, publishEndDate, page, pageSize);
        BaseResponse<List<BookResp>> br = new BaseResponse<List<BookResp>>();
        br.setData(bookService.fetchBooks(filterParams));
        br.setTotal(bookService.countBooks(filterParams));
        br.setMessage("查询成功");
        return br;
    }

    @ResponseBody
    @RequestMapping(value = "/{bookId:\\d+}", method = RequestMethod.GET)
    public BaseResponse<BookInfoVo> fetchBookInfo(
            @PathVariable("bookId") int bookId) {
        LOG.info("[查看书籍] - 访问[GET /book/" + bookId + "]接口");
        BaseResponse<BookInfoVo> br = new BaseResponse<BookInfoVo>();
        br.setData(bookService.fetchBookInfo(bookId));
        br.setMessage("查询成功");
        return br;
    }

    @ResponseBody
    @RequestMapping(value = "/{bookId:\\d+}", method = RequestMethod.PUT)
    public BaseResponse<String> setBookInfo(
            @PathVariable("bookId") int bookId,
            @RequestBody BookInfoVo bookInfoVo) {
        LOG.info("[修改书籍] - 访问[PUT /book/" + bookId + "]接口");
        BaseResponse<String> br = new BaseResponse<String>();
        bookService.setBookInfo(bookInfoVo);
        br.setMessage("修改成功");
        return br;
    }

    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.POST)
    public BaseResponse<String> saveBook(@RequestBody BookVo bookVo) {
        LOG.info("[添加书籍] - 访问[POST /book]接口");
        BaseResponse<String> br = new BaseResponse<String>();
        br.setMessage("添加成功");
        return br;
    }
}
