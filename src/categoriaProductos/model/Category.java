package categoriaProductos.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Category {

   private String name;
   private ArrayList<Category> categories;
   private ArrayList<Product> products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
