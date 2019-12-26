/**
 * hello_world
 */
public class DataOnlyTest{


    public static void main(String[] args) {

        class String1{
            int i;
            double d;
            String str;
            boolean b;
            int storage(String s){
                return s.length() * 2;
            }

        }

        String1 d1 = new String1(); 
        
        d1.i=100;                       
        d1.d=3.1416;
        d1.b=true;
        d1.str = "abcde";
        int x = d1.storage(d1.str);
        System.out.println("Hello,World!");
        System.out.println(d1.i);
        System.out.println(d1.d);
        System.out.println(d1.b);
        System.out.println(x);
    }
    
}