abstract class Pen{
    abstract void refil();
    abstract void write();
    abstract void changenib();
}
class FountainPen extends Pen{
    void refil(){
        System.out.println("Refilling....");
    }
    void write()
    {
        System.out.println("Writting.....");
    }
    void changenib(){
        System.out.println("Changing the nib");
    }
}
class Monkey{
    void jump()
    {
        System.out.println("Jump");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void sleep();
    void eat();
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void sleep(){
        System.out.println("Sleeping");
    }
    @Override
    public void eat(){
        System.out.println("Eating..");
    }
}
public class Fifteen {
    public static void main(String[] args) {
        FountainPen fp=new FountainPen();
        fp.refil();
        fp.write();
        fp.changenib();
    }
}
