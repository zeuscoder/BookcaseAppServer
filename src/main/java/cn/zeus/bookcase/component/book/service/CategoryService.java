package cn.zeus.bookcase.component.book.service;

import cn.zeus.bookcase.component.book.dao.CategoryDao;
import cn.zeus.bookcase.component.book.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lvzimou on 2016/11/20.
 */
@Service("CategoryService")
public class CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    /**
     * 书籍类型列表
     *
     * @return
     */
    public List<Category> fetchCategories() {
        return categoryDao.selectCategories();
    }

}
