// Singleton class properties

public class Sixteen {
    private static Sixteen instance=null;
    public String str;
    private Sixteen(){}
    public static Sixteen getinstance(){
        if(instance==null)
        {
            instance=new Sixteen();
        }
        return instance;
    }
    public static void main(String[] args)
    {
        Sixteen single=Sixteen.getinstance();
        single.str="My name is Gaurav";
        Sixteen single1=Sixteen.getinstance();
        single1.str="My name is Gaurav Kumar Jaiswal";
        System.out.println(single.str);
        System.out.println(single1.str);
    }
}
