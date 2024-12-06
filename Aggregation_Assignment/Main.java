public class Main {
    public static void main(String[] args) {
        Flipkart f = new Flipkart();
        f.accessories();
        Amazon a = new Amazon();
        a.grocery();
        Myntra m = new Myntra();
        m.brand(); 
    }
}
/*file Flipcart 
->accessories() :covariant return type 

file Amazon
->grocery():covariant return type 

file Myntra
->brand() :covariant return type 


file Main*/