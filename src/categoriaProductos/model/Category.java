package categoriaProductos.model;

public class Category {

    private Category subcategory;

    public Category(Category subcategory) {
        this.subcategory = subcategory;
    }

    public Category() {
    }

    public Category getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(Category subcategory) {
        this.subcategory = subcategory;
    }
}
