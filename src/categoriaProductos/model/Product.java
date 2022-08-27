package categoriaProductos.model;


public class Product {

    private Color color;
    private Category category;

    public Product(Color color, Category category) {
        this.color = color;
        this.category = category;
    }

    public Product() {
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
