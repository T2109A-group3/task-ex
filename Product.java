public class Product {
    String Name;
    Float Price;
    int ID;
    int Qty;

    public Product (String name,Float price,int id,int qty){
        Name =name ;
        Price=price;
        ID=id;
        Qty=qty;
    }
 public Product(){
 }

    public String getName()
    {
        return Name;
    }
    public Float getPrice()
    {
        return Price;
    }
    public int getID()
    {
        return ID;
    }
    public int getQty()
    {
        return Qty;
    }

    public String toString(){
        return "ten:" +Name+ "co gia la" +Price+ "Id la " +ID+ "QTY la "+Qty;
    }
}
