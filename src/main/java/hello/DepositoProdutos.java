package hello;

import java.util.ArrayList;

public class DepositoProdutos {
    private ArrayList<Produtos> produtos;

    public DepositoProdutos(){
        produtos = new ArrayList<>(2000);
    }

    public boolean produtoEntra(Produtos p){
        if(p == null){
            return false;
        }
        produtos.add(p);
        return true;
    }

    public Produtos produtroSai(int id){
        for (Produtos p2 : produtos) {
            if(p2.getId() == id){
                return produtos.remove(p2.getId());
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

