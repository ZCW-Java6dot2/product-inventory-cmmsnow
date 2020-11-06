package models;

public class Toesocks {
    private int id;
    private String name;
    private String brand;
    private String sport;
    private int size;
    private int qty;
    private float price;

    public Toesocks(int id,String name, String brand, String sport, int size, int qty, float price){
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.sport = sport;
        this.size = size;
        this.qty = qty;
        this.price = price;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }


    public void setSport(String brand){
        this.sport = sport;
    }

    public String getSport(){
        return this.sport;
    }

    public void setSize(int size){
        this.size = size;
    }

    public int getSize(){
        return this.size;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public int getQty(){
        return this.qty;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public float getPrice(){
        return this.price;
    }
}
