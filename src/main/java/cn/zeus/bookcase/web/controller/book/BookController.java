package cn.zeus.bookcase.web.controller.book;

import cn.zeus.bookcase.common.BaseResponse;
import cn.zeus.bookcase.component.book.service.BookService;
import cn.zeus.bookcase.component.book.vo.req.BookReq;
import cn.zeus.bookcase.component.book.vo.resp.BookResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
            @RequestParam(value = "page", required = false) Integer page,
            @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        LOG.info("[书籍列表] - 访问[GET /books]接口, reqParams title = " + title);
        BookReq filterParams = new BookReq(title, authors, isbn, category, page, pageSize);
        BaseResponse<List<BookResp>> br = new BaseResponse<List<BookResp>>();
        br.setData(bookService.fetchBooks(filterParams));
        br.setTotal(bookService.countBooks(filterParams));
        br.setMessage("查询成功");
        return br;
    }
}
