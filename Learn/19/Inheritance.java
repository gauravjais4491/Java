class Base{

        Base(int a){
            System.out.println("i am a child of derived class contrustor and value of a is: "+a);
    
    }

}
class Derived extends Base{
    Derived(int a,int b){
        super(a);
        System.out.println("i am a child of derived class contrustor and value of b is: "+b);

    }

}
class child extends Derived{
    child(int a,int b,int c){
        super(a,b);
        System.out.println("i am a child of derived class contrustor and value of c is: "+c);

    }
}



public class Inheritance {
    public static void main(String[] args) {
        child c =new child(21, 23,32);
    }
    
}
