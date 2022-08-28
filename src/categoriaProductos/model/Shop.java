package categoriaProductos.model;

import categoriaProductos.implementations.ICategorizable;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Category> categories;
    private final ICategorizable i_categorizable = new ICategorizable(categories);

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

    public ICategorizable getI_categorizable() {
        return i_categorizable;
    }
}
