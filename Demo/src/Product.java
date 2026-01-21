public class Product {
    private String itemNo;
    private String name;
    private double price;
    private double qty;

    public Product(String itemNo, String name, double price, double qty){
        this.itemNo=itemNo;
        this.name=name;
        this.price=price;
        this.qty=qty;
    }

    public String getItemNo() {
        return itemNo;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        if(qty>0) qty = qty;
        else qty = 0;
    }
}
