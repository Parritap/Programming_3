package categoriaProductos.model.src.categoriaProductos.model;

import categoriaProductos.model.src.categoriaProductos.implementations.ICategorizableShop;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Category> categories;
    private final ICategorizableShop i_categorizableShop = new ICategorizableShop(categories);

    public Shop(ArrayList<Category> categories) {
        this.categories = categories;
    }

    public Shop() {
    }



    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }

    public ICategorizableShop getI_categorizableShop() {
        return i_categorizableShop;
    }
}
