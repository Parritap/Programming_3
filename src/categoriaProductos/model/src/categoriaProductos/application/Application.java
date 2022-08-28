package categoriaProductos.model.src.categoriaProductos.application;

import categoriaProductos.model.src.categoriaProductos.model.Color;
import categoriaProductos.model.src.categoriaProductos.model.Product;
import categoriaProductos.model.src.categoriaProductos.model.Shop;
import categoriaProductos.model.src.categoriaProductos.utils.ObjectsCreator;

import java.util.ArrayList;

public class Application {

    static Shop shop = new Shop(ObjectsCreator.returnGenericObjects());

    public static void main(String[] args) {
        ArrayList<Product> array1 = shop.getI_categorizableShop().findProductsWithPrice(10000, shop.getCategories(), new ArrayList<>());
        ArrayList<Product> array2 = shop.getI_categorizableShop().findProductsWithColor(Color.RED, shop.getCategories(), new ArrayList<>());


        //Se imprimen los productos con precio mayor que 10000Arrays.asList(tech, kitchen)
        for (Product p: array1) {
            System.out.println(p.getName());
        }


        //Se imprimen los productos con color rojo.
        for (Product p: array2){
            System.out.println(p.getName());
        }
    }

}
