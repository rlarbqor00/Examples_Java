package ListExam;

public class Product {
    String code;
    String name;
    String color;
    int qty;

    public Product () {
        this("0001", "스마트폰", "Black", 100);

    }
    public Product(String code, String name, String color, int qty) {
        this.code = code;
        this.name = name;
        this.color = color;
        this.qty =qty;

    }

    public String getCode() {
        return code;
        
    }
    public String getName() {
        return name;

    }
    public String getColor() {
        return color;

    }
    public int getQty() {
        return qty;
        
    }



    
}
