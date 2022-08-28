package categoriaProductos.model;

import categoriaProductos.implementations.ICategorizable;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Product> products;
    private ArrayList<Category> categories;
    private final ICategorizable i_categorizable= new ICategorizable(categories);

    public Shop(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
