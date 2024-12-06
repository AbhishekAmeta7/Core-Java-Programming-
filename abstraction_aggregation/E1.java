abstract class E {
    abstract E show4();
}
public class E1 extends E{
    public E show4(){
        System.out.println("abstract covariant return in abstract class E");
        return this;
    }
}
