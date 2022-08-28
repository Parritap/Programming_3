package categoriaProductos.implementations;

import categoriaProductos.interfaces.ObjectGenerator;
import categoriaProductos.model.Product;

import java.util.ArrayList;

public class IProductGenerator implements ObjectGenerator<Product> {
    @Override
    public ArrayList<Product> generateObjects(int numOfObjects) {
        return null;
    }
}
