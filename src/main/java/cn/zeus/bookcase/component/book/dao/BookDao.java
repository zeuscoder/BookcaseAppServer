package cn.zeus.bookcase.component.book.dao;

import cn.zeus.bookcase.component.book.entity.Book;
import cn.zeus.bookcase.component.book.vo.BookInfoVo;
import cn.zeus.bookcase.component.book.vo.req.BookReq;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lvzimou on 2016/11/19.
 */
@Repository("BookDao")
public class BookDao {

    private final static String NAMESPACE = BookDao.class.getName()
            + ".";

    @Autowired
    private SqlSession sqlSession;

    /**
     * 书籍数量统计
     *
     * @param filterParams
     * @return
     */
    public int countBooksByParams(BookReq filterParams) {
        return sqlSession.selectOne(NAMESPACE + "countBooksByParams", filterParams);
    }

    /**
     * 书籍列表
     *
     * @return
     * @param filterParams
     */
    public List<Book> selectBooksByParams(BookReq filterParams) {
        return sqlSession.selectList(NAMESPACE + "selectBooksByParams", filterParams);
    }

    /**
     * 通过ID寻找书籍信息
     *
     * @param bookId
     * @return
     */
    public Book selectBookById(int bookId) {
        return sqlSession.selectOne(NAMESPACE + "selectBookById", bookId);
    }

    /**
     * 修改书籍信息
     *
     * @param bookInfoVo
     */
    public void updateBook(BookInfoVo bookInfoVo) {
        sqlSession.update(NAMESPACE + "updateBook", bookInfoVo);
    }
}
