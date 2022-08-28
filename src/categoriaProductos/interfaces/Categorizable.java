package categoriaProductos.interfaces;


import categoriaProductos.model.Category;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface Categorizable<Product, Color, Category>  {

    /**
     * Returns an array of productos that fullfill that their price is greater than a certain number.
     * @param price Lowest limit for the price that a product must have in order to be listed in the array.
     * @return An array of the products within the Categories thayt fulllil the condition.
     */
    ArrayList<Product> findProductsWithPrice (double price, ArrayList<Category> categories, ArrayList<Product> savedItems);

    ArrayList<Product> findProductoWithColor (Color color);





}
