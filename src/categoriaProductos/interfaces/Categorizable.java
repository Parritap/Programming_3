package categoriaProductos.interfaces;


public interface Categorizable<T>  {

    /**
     * Searchs a subcategory of Type T and
     * @param category
     */
    boolean findSubcategory (T category);




}
