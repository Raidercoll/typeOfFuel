package hello;

import java.util.ArrayList;

public class ListaProvedores {
    private ArrayList<Provedores> provedores;

    public ListaProvedores(){
        provedores = new ArrayList<>(50);
    }

    public boolean provedorEntra(Provedores p){
        if(p == null)return false;
        provedores.add(p);
        return true;
    }
}
