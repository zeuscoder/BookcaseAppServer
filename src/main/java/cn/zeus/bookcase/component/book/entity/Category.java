package cn.zeus.bookcase.component.book.entity;

/**
 * Created by lvzimou on 2016/11/20.
 */
public class Category {

    private int categoryId;

    private String categoryName;

    public Category() {

    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
