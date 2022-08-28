package categoriaProductos.model;


public class Product {

    private Color color;
    private Category category;
    private double price;

    public Product(Color color, Category category, double price) {
        this.color = color;
        this.category = category;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
