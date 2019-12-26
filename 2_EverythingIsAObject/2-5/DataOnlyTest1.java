/**
 * hello_world
 */
public class DataOnlyTest1{


    public static void main(String[] args) {

        class DataOnly{
            int i;
            double d;
            boolean b;
        }

        DataOnly d1 = new DataOnly(); 
        d1.i=100;                       
        d1.d=3.1416;
        d1.b=true;
        System.out.println("Hello,World!");
        System.out.println(d1.i);
        System.out.println(d1.d);
        System.out.println(d1.b);

    }
    
}