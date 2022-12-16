
package MyOnlineShop2;

public class childrenbook extends book {
 protected double dis;
    
    public childrenbook(){}
    
     public childrenbook(double price , String name ){
        super(price,name);
    }
            
    public childrenbook(double price , String name , double dis ){
        super(price,name);
        this.dis=dis;
    }

    public double getDis() {
        return dis;
    }

    public void setBonus(double dis) {
        this.dis = dis;
    }

    @Override
    public double BPrice(){
        double total=price - (dis*price);
        return total;
    }
    

    @Override
    public String toString() {
        return "childrenbook{" + "price=" + price + ", name=" + name + ", discount=" + dis + ", price with discount ="+ BPrice()+ '}';
    }
   
}
