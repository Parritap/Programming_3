package categoriaProductos.application;

import categoriaProductos.model.Category;
import categoriaProductos.model.Color;
import categoriaProductos.model.Product;
import categoriaProductos.model.Shop;
import categoriaProductos.utils.ObjectsCreator;

import java.util.ArrayList;

public class Application {

    static Shop shop = new Shop(ObjectsCreator.returnGenericObjects());

    public static void main(String[] args) {
        ArrayList<Product> array1 = shop.getI_categorizable().findProductsWithPrice(10000, shop.getCategories(), new ArrayList<>());
        ArrayList<Product> array2 = shop.getI_categorizable().findProductsWithColor(Color.RED, shop.getCategories(), new ArrayList<>());

      //  for (Product p: array1) {
      //      System.out.println(p.getName());
      //  }


        for (Product p: array2){
            System.out.println(p.getName());
        }
    }

}
