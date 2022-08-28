package categoriaProductos.implementations;

import categoriaProductos.interfaces.Categorizable;
import categoriaProductos.model.Category;
import categoriaProductos.model.Color;
import categoriaProductos.model.Product;

import java.util.ArrayList;

public class ICategorizable implements Categorizable<Product, Color, Category> {

    private ArrayList<Category> categories;

    public ICategorizable(ArrayList<Category> categories) {
        this.categories = categories;
    }

    @Override
    public ArrayList<Product> findProductsWithPrice(double price, ArrayList<Category> categories, ArrayList<Product> savedItems) {

        ArrayList<Product> array = savedItems;

        if (categories != null && categories.size() > 0) {

            for (Category c : categories) {

                if (c.getProducts() != null) {
                    for (Product p : c.getProducts()) {
                        if (p != null && p.getPrice() > price)
                            savedItems.add(p);
                    }
                }
                findProductsWithPrice(price, c.getCategories(), array);
            }
        }
        return array;
    }

    @Override
    public ArrayList<Product> findProductoWithColor(Color color) {
        return null;
    }
}
