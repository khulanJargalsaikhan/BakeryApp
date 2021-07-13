public class BakedGood {
    //attributes
    private String name;
    private double price;
    private String expDate;
    private String restriction;
    private String restriction2;
    private int stock;

    //constructors
    public BakedGood(){

    }

    public BakedGood(String name, double price, String expDate, String restriction, int stock){
        this.name = name;
        this.price = price;
        this.expDate = expDate;
        this.restriction = restriction;
        this.stock = stock;
    }

    public BakedGood(String name, double price, String expDate, String restriction, String restriction2, int stock){
        this.name = name;
        this.price = price;
        this.expDate = expDate;
        this.restriction = restriction;
        this.restriction2 = restriction2;
        this.stock = stock;
    }

    //getters and setters
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }

    public void setExpDate(String expDate){
        this.expDate = expDate;
    }
    public String getExpDate(){
        return this.expDate;
    }

    public void setRestriction(String restriction){
        this.restriction = restriction;
    }
    public String getRestriction(){
        return this.restriction;
    }

    public void setRestriction2(String restriction2){
        this.restriction2 = restriction2;
    }
    public String getRestriction2(){
        return this.restriction2;
    }

    public void setStock(int stock){
        this.stock = stock;
    }
    public int getStock(){
        return this.stock;
    }

    //display baked good
    public void displayBakedGood(){
        System.out.printf("Name: %s, Price: $%.2f, Exp Date: %s, Dietary restrictions: %s, Dietary restriction2: %s, In Stock: %d\n", name, price, expDate, restriction, restriction2, stock);
    }










}
