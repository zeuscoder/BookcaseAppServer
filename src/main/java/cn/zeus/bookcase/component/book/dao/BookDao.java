package cn.zeus.bookcase.component.book.dao;

import cn.zeus.bookcase.component.book.entity.Book;
import cn.zeus.bookcase.component.book.vo.BookInfoVo;
import cn.zeus.bookcase.component.book.vo.req.BookReq;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * 删除书籍
     *
     * @param bookId
     */
    public void deleteBook(int bookId) {
        sqlSession.update(NAMESPACE + "deleteBook", bookId);
    }

    /**
     * 批量修改书籍状态
     *
     * @param bookIds
     * @param state
     */
    public void batchState(List<Integer> bookIds, int state) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("bookIds", bookIds);
        params.put("state", state);
        sqlSession.update(NAMESPACE + "batchState", params);
    }
}
