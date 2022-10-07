class parent{
    public void meth1(){
        System.out.println("hello");
    }
}
class child extends parent{
    @Override
    public void meth1(){
        System.out.println("Hello1");
    }
}



public class Overriding {
    public static void main(String[] args) {
        child c=new child();
        c.meth1();
    }
    
}
