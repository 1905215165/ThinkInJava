/**
 * hello_world
 */
public class StorageTest{

    public static void main(String[] args) {

        class DataOnly{
            int i;
            double d;
            boolean b;
            String str;
            int storage(String s){
                return s.length() *2;
            }
        }

        DataOnly d1 = new DataOnly(); 
        d1.i=100;                       
        d1.d=3.1416;
        d1.b=true;
        d1.str = "abcdef";
        System.out.println("Hello,World!");
        System.out.println(d1.i);
        System.out.println(d1.d);
        System.out.println(d1.b);
        System.out.println(d1.storage(d1.str));

    }
    
}