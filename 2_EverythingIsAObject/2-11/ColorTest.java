/**
 * date : 2019-12-25
 */

public class ColorTest{
    public static void main(String[] args) {
        class AllTheColorOfRainbow{
            int anIntegerColor;
            void changeColor(int newColor){
                anIntegerColor = anIntegerColor + newColor;
            }
        }

        AllTheColorOfRainbow all1 = new AllTheColorOfRainbow();
        all1.changeColor(3);
        System.out.println(all1.anIntegerColor);
    }
}
