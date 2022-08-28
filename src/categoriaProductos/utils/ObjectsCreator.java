package categoriaProductos.utils;


import categoriaProductos.model.Category;
import categoriaProductos.model.Color;
import categoriaProductos.model.Product;
import categoriaProductos.model.Shop;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectsCreator {

    static public ArrayList<Category> returnGenericObjects() {

        //Declaration of the mother categories.
        Category kitchen = new Category("kitchen");
        Category tech = new Category("Tech");


        //---Declaration of the kitchen subcategories.
        Category food = new Category("food");
        Category pot = new Category("pot");

        //Declaration of the food products.
        Product tomato = new Product("Tomato", Color.RED, food, 1000);
        Product cucumber = new Product("Cucumber", Color.GREEN, food, 12000);

        //Declaration of the pot products
        Product imusaPot = new Product("ImusaPot", Color.BLUE, pot, 15000);
        Product pressureCooker = new Product("Pressure Cooker", Color.RED, pot, 9000);


        food.getProducts().addAll(Arrays.asList(tomato, cucumber));
        pot.getProducts().addAll(Arrays.asList(imusaPot, pressureCooker));

        kitchen.getCategories().addAll(Arrays.asList(food, pot));


        //---------------------------------------------------------------------------------------------


        //----Declaration of the tech subcategories
        Category pc = new Category("PC");
        Category mobile = new Category("Mobile");

        //Declaration of the tech subcategories
        Category office = new Category("Office");
        Category gamer = new Category("Gamer");

        //Declaration of the office products
        Product allInOne = new Product("All In One", Color.RED, office, 1000000);


        //Declaration of the gamer subcategories
        Category intel = new Category("Intel");
        Category amd = new Category("AMD");


        //Declaration of the AMD products
        Product amd_cpu1 = new Product("AMD CPU1", Color.RED, amd, 500000);
        Product amd_cpu2 = new Product("AMD CPU2", Color.GREEN, amd, 1000);


        //Declaration of the Intel products
        Product intel_cpu1 = new Product("INTEL CPU1", Color.RED, intel, 200);
        Product intel_cpu2 = new Product("INTEL CPU2", Color.GREEN, intel, 15000);


        intel.getProducts().addAll(Arrays.asList(intel_cpu1, intel_cpu2));
        amd.getProducts().addAll(Arrays.asList(amd_cpu1, amd_cpu2));
        pc.getProducts().add(new Product("Arduino", Color.BLUE, pc, 9000));
        office.getProducts().add(allInOne);
        gamer.getCategories().addAll(Arrays.asList(intel, amd));
        pc.getCategories().addAll(Arrays.asList(office, gamer));


        //Declaration of the mobile subcategories
        Category ios = new Category("ios");
        Category android = new Category("Android");


        //ios products
        Product iphone = new Product("iphone X", Color.KEY, ios, 3000000);
        //Android products.
        Product samsumg = new Product("Samsumg", Color.RED, android, 6000);


        ios.getProducts().add(iphone);
        android.getProducts().add(samsumg);
        mobile.getCategories().addAll(Arrays.asList(ios, android));
        tech.getCategories().addAll(Arrays.asList(pc, mobile));

        return new ArrayList<Category>(Arrays.asList(tech, kitchen));

        ////////////////////////////////////////////////////
    }
}
