package cn.zeus.bookcase.web.controller.book;

import cn.zeus.bookcase.common.BaseResponse;
import cn.zeus.bookcase.component.book.entity.Category;
import cn.zeus.bookcase.component.book.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lvzimou on 2016/11/20.
 */
@Controller
@RequestMapping("/books/categories")
public class CategoryController {

    private static final Logger LOG = LoggerFactory
            .getLogger(CategoryController.class);

    @Autowired
    private CategoryService categoryService;

    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET)
    public BaseResponse<List<Category>> fetchBooks() {
        LOG.info("[书籍类型列表] - 访问[GET /books/categories]接口");
        BaseResponse<List<Category>> br = new BaseResponse<List<Category>>();
        br.setData(categoryService.fetchCategories());
        br.setMessage("查询成功");
        return br;
    }
}
