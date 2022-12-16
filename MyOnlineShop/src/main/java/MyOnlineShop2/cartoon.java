package MyOnlineShop2;

public class cartoon extends book {
    protected double dis;
    
    public cartoon(){};
    public cartoon (double price,String name){
        super(price,name);
    }
    
    public cartoon (double price,String name,double dis){
        super(price,name);
        this.dis=dis;
    }
    public double getDis() {
        return dis;
    }

    public void setDiscount(double dis) {
        this.dis = dis;
    }

    @Override
    public double BPrice(){
        double Ctotal=price - (dis*price);
        return Ctotal;
    }
    

    @Override
    public String toString() {
        return "cartoon{" + "price=" + price + ", name=" + name + ", discount=" + dis + ", price with discount ="+ BPrice()+ '}';
    }
   
}
