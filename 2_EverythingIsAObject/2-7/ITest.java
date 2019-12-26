/**
 * hello_world
 */
class StaticTest{
    static int i=47;

}
class Incrementable{
    static void increment(){
        StaticTest.i++;
    }
}


public class ITest{

    public static void main(String[] args) {

        StaticTest s1 = new StaticTest();
        StaticTest s2 = new StaticTest();
        Incrementable i1 = new Incrementable();
        Incrementable.increment();
        System.out.println(StaticTest.i);
        i1.increment();
        System.out.println(s1.i);
        System.out.println(s2.i);
        s1.i++;
        System.out.println(s1.i);
        System.out.println(s2.i);
        s2.i++;
        System.out.println(s1.i);
        System.out.println(s2.i);

    }
    
}