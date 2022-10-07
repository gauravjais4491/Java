import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * float [] num=new float[5];
         * float sum=0;
         * 
         * for(int i=0;i<num.length;i++)
         * {
         * num[i]=sc.nextFloat();
         * }
         * 
         * 
         * 
         * 
         * for(float Element:num)
         * {
         * sum=sum+Element;
         * 
         * }
         * System.out.println(sum);
         */

        /*
         * 
         * int [] num=new int[5];
         * System.out.println("Enter which integer you want to check: ");
         * int Input=sc.nextInt();
         * Boolean Present=false;
         * 
         * for(int i=0;i<num.length;i++)
         * {
         * System.out.println("Enter "+i+" element of an array" );
         * num[i]=sc.nextInt();
         * }
         * for(int i=0;i<num.length;i++)
         * {
         * if(num[i]==Input){
         * Present=true;
         * break;
         * }else{
         * continue;
         * 
         * }
         * 
         * }
         * if(Present)
         * {
         * System.out.println(Input+" is present in an array");
         * 
         * }
         * else{
         * System.out.println(Input+" is not present in an array");
         * 
         * }
         */
        /*
         * System.out.print("Enter how many student marks you want to store: ");
         * int n=sc.nextInt();
         * int [] physics=new int[n];
         * int sum=0;
         * for(int i=0;i<physics.length;i++)
         * {
         * System.out.print("Enter " +i+ " student marks: ");
         * physics[i]=sc.nextInt();
         * }
         * for(int element:physics)
         * {
         * sum=sum+element;
         * }
         * float average=sum/physics.length;
         * System.out.println("The average marks of each student in physics is "
         * +average+" percent");
         * 
         */
        /*
         * int [][] marks=new int[2][3];
         * int [][] marks1=new int[2][3];
         * int [][] result=new int[2][3];
         * System.out.println("Here we are taking 1st matrices input");
         * for(int i=0;i<marks.length;i++)
         * {
         * for(int j=0;j<marks[i].length;j++)
         * {
         * System.out.println("Enter [" + i+"]["+j+ "] element of an array" );
         * marks[i][j]=sc.nextInt();
         * }
         * }
         * System.out.println("Here we are taking 2nd matrices input");
         * for(int i=0;i<marks1.length;i++)
         * {
         * for(int j=0;j<marks1[i].length;j++)
         * {
         * System.out.println("Enter [" + i+"]["+j+ "] element of an array" );
         * marks1[i][j]=sc.nextInt();
         * }
         * }
         * for(int i=0;i<result.length;i++)
         * {
         * for(int j=0;j<result[i].length;j++)
         * {
         * result[i][j]=marks[i][j]+marks1[i][j];
         * }
         * }
         * 
         * System.out.println("The result matrices: ");
         * for(int i=0;i<result.length;i++)
         * {
         * for(int j=0;j<result[i].length;j++)
         * {
         * System.out.print(result[i][j]+" ");
         * }
         * System.out.print("\n");
         * }
         */
        /*
         * 
         * System.out.print("Enter an element in an array: ");
         * int n = sc.nextInt();
         * int[] marks = new int[n];
         * int temp;
         * int Input=Math.floorDiv(marks.length, 2);
         * 
         * for (int i = 0; i < marks.length; i++) {
         * System.out.println("Enter [" + i + "] element of an array");
         * marks[i] = sc.nextInt();
         * 
         * }
         * System.out.println("Array Before Reverse");
         * System.out.print("[ ");
         * for(int i=0;i<marks.length;i++)
         * {
         * System.out.print(marks[i]+" ");
         * }
         * System.out.println("]");
         * 
         * for (int i = 0; i < Input; i++) {
         * temp=marks[i];
         * marks[i]=marks[marks.length-i-1];
         * marks[marks.length-i-1]=temp;
         * }
         * System.out.println("Array After reverse");
         * 
         * System.out.print("[ ");
         * 
         * for(int i=0;i<marks.length;i++)
         * {
         * System.out.print(marks[i]+" ");
         * }
         * System.out.println("]");
         */

         /* 
        System.out.print("Enter an element in an array: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for (int i = 0; i < marks.length; i++) {
             System.out.println("Enter [" + i + "] element of an array");
             marks[i] = sc.nextInt();
             
             }

        for(int e:marks)
        {
            if(e>max){
                max=e;
            }
           

        }
        for(int e:marks)
        {
        if(e<min){
                min=e;
            }
           

        }
        System.out.println("The Maximum elemnt in an array is "+max);
        System.out.println("The Manimum elemnt in an array is "+min);

        */

        
        sc.close();

    }

}
