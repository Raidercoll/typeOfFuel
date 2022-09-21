package hello;

import java.util.ArrayList;

public class ListaCategorias {
    private ArrayList<Categoria> categorias;

    public ListaCategorias(){
        categorias = new ArrayList<>(5);
    }

    public boolean categoriaEntra(Categoria c){
        if(c == null) return false;
        categorias.add(c);
        return true;
    }
}
