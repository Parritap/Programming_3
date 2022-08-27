package categoriaProductos.model;

import java.util.ArrayList;

public class Shop {

    private ArrayList listOfProductos;

    public Shop(ArrayList listOfProductos) {
        this.listOfProductos = listOfProductos;
    }

    public ArrayList getListOfProductos() {
        return listOfProductos;
    }

    public void setListOfProductos(ArrayList listOfProductos) {
        this.listOfProductos = listOfProductos;
    }
}
