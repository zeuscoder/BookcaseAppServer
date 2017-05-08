package cn.zeus.bookcase.component.book.service;

import cn.zeus.bookcase.component.book.dao.BookDao;
import cn.zeus.bookcase.component.book.vo.BookInfoVo;
import cn.zeus.bookcase.component.book.vo.req.BookReq;
import cn.zeus.bookcase.component.book.vo.resp.BookResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lvzimou on 2016/11/19.
 */
@Service("BookService")
public class BookService {

    @Autowired
    private BookDao bookDao;

    /**
     * 书籍数量统计
     *
     * @return
     * @param filterParams
     */
    public int countBooks(BookReq filterParams) {
        return bookDao.countBooksByParams(filterParams);
    }

    /**
     * 书籍列表
     *
     * @return
     * @param filterParams
     */
    public List<BookResp> fetchBooks(BookReq filterParams) {
        return BookResp.fetchBooks(bookDao.selectBooksByParams(filterParams));
    }

    /**
     * 查找书籍
     *
     * @param bookId
     * @return
     */
    public BookInfoVo fetchBookInfo(int bookId) {
        return new BookInfoVo(bookDao.selectBookById(bookId));
    }

    /**
     * 修改书籍
     *
     * @param bookInfoVo
     */
    public void setBookInfo(BookInfoVo bookInfoVo) {
        bookDao.updateBook(bookInfoVo);
    }

    /**
     * 删除书籍
     *
     * @param bookId
     */
    public void deleteBook(int bookId) {
        bookDao.deleteBook(bookId);
    }
}
