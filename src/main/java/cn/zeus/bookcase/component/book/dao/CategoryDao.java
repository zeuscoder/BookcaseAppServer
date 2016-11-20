package cn.zeus.bookcase.component.book.dao;

import cn.zeus.bookcase.component.book.entity.Category;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lvzimou on 2016/11/20.
 */
@Repository("CategoryDao")
public class CategoryDao {

    private final static String NAMESPACE = CategoryDao.class.getName()
            + ".";

    @Autowired
    private SqlSession sqlSession;

    /**
     * 书籍类型列表
     *
     * @return
     */
    public List<Category> selectCategories() {
        return sqlSession.selectList(NAMESPACE + "selectCategories");
    }
}
