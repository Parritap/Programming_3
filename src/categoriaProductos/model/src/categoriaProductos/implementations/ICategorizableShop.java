package categoriaProductos.model.src.categoriaProductos.implementations;

import categoriaProductos.model.src.categoriaProductos.interfaces.CategorizableShop;
import categoriaProductos.model.src.categoriaProductos.model.Category;
import categoriaProductos.model.src.categoriaProductos.model.Color;
import categoriaProductos.model.src.categoriaProductos.model.Product;

import java.util.ArrayList;

public class ICategorizableShop implements CategorizableShop<Product, Color, Category> {

    private ArrayList<Category> categories;

    public ICategorizableShop(ArrayList<Category> categories) {
        this.categories = categories;
    }

    @Override
    public ArrayList<Product> findProductsWithPrice(double price, ArrayList<Category> categories, ArrayList<Product> savedItems) {

        if (categories != null && categories.size() > 0) {

            for (Category c : categories) {

                if (c.getProducts() != null) {
                    for (Product p : c.getProducts()) {
                        if (p != null && p.getPrice() > price)
                            savedItems.add(p);
                    }
                }
                findProductsWithPrice(price, c.getCategories(), savedItems);
            }
        }
        return savedItems;
    }

    @Override
    public ArrayList<Product> findProductsWithColor(Color color, ArrayList<Category> categories, ArrayList<Product> savedItems) {


        if (categories != null && categories.size() > 0) {

            for (Category c : categories) {

                if (c.getProducts() != null) {
                    for (Product p : c.getProducts()) {
                        if (p != null && p.getColor() == color)
                            savedItems.add(p);
                    }
                }
                findProductsWithColor(color, c.getCategories(), savedItems);
            }
        }
        return savedItems;

    }


}
