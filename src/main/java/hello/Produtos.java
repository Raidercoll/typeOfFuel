package hello;

public class Produtos {
    private int id;
    private String name;
    private int amount;
    private int price;
    private int idProviders;
    private int idCategories;

    public Produtos(int idProduct, String name, int amount, int price, int idProviders, int idCategories){
        this.id = idProduct;
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.idProviders = idProviders;
        this.idCategories = idCategories;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public int getIdProviders() {
        return idProviders;
    }

    public int getIdCategories() {
        return idCategories;
    }

    public String toString() {
        return "Produtos [amount=" + amount + ", name=" + name + ", idCategories=" + idCategories + ", idProduct=" + id
                + ", idProviders=" + idProviders + ", price=" + price + "]";
    }

   
    
}
