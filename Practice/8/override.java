class A {
    public void meth2() {
        System.out.println("i am method 2 of class A");
    }

}

class B extends A {
    @Override
    public void meth2() {
        System.out.println("i am method 2 of class B");

    }
}

public class override {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.meth2();
        // b.meth2();

    }
}
