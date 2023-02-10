// builder desgn pattern

class Seventeen {
    private final String fName;
    private final String lNmame;
    private Seventeen(NestSeventeen ref){
        this.fName=ref.fName;
        this.lNmame=ref.lName;
    }
    public String toString(){
        return "My anme is: "+this.fName+" "+this.lNmame;
    }
    public static class NestSeventeen{
        private final String fName;
        private String lName;

        public NestSeventeen(String fName)
        {
            this.fName=fName;
        }
        public NestSeventeen lName(String lName)
        {
            this.lName=lName;
            return this;
            
        }
        public Seventeen build(){
            Seventeen seven=new Seventeen(this);
            return seven;
        }
    }

}
public class Seventeen1{
    public static void main(String[] args) {
        Seventeen n1=new Seventeen.NestSeventeen("Gaurav").build();
        System.out.println(n1);
        Seventeen n2=new Seventeen.NestSeventeen("Gaurav").lName("Jaiswal").build();
        System.out.println(n2);
    }

}
