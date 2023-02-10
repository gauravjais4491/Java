interface Details{
    void name(String fName,String lName);
}
public class Nineteen {
    static void fun(Details d1,String fName,String lName){
        d1.name(fName, lName);
    }
    public static void main(String[] args) {
        fun((fName,lName)-> System.out.println(fName+" "+lName),"Gaurav","Jaiswal");
        
    }
}
