/**
 * hello_world
 */
public class ATypeNameTest{


    public static void main(String[] args) {

        class ATypeName{
            int x;
            char y;
        }

        ATypeName a = new ATypeName(); 
        a.x=100;                      
        a.y='c';
        System.out.println("Hello,World!");
        System.out.println(a.x);
        System.out.println(a.y);

    }
    
}