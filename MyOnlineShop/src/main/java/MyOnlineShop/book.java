package MyOnlineShop;

public class book extends product {
    protected double price;
    protected String name;

    public book(){}

    public book(double price, String name) {
        this.price = price;
        this.name=name;
    }
 
    @Override
    public double getPrice() {
        return price;
    }


    @Override
    public String getName() {
        return name;
    }

    
    @Override
    public double BPrice (){
        return price ;
    }

    @Override
    public String toString() {
        return "book{" + "price=" + price + ", name=" + name +", Total price="+ BPrice()+ '}';
    }
    
    
    
}
