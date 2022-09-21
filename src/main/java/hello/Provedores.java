package hello;

public class Provedores {
    private int id;
    private String name;
    private String Street;
    private String city;
    private String state;

    public Provedores(int id, String name, String street, String city, String state ){
        this.id = id;
        this.name = name;
        this.Street = street; 
        this.city = city;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return Street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Provedores [Street=" + Street + ", city=" + city + ", id=" + id + ", name=" + name + ", state=" + state
                + "]";
    }

    
}
