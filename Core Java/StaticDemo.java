class Mobile{
    String brand;
    int price;
    static String name;
}
public class StaticDemo {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 100000;
        Mobile.name = "iPhone15";

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 100000;
        
        System.out.println(obj.name);
    }
    
}
