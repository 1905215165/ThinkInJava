//: object/Overloading.java

/** create type Tree with two constructors and one info method 
 */

 class Tree{
     int height;

     /** no-argument constructor
      * assigns height = 0
        */

      Tree() {
          System.out.println("Planting a seedling");
          height = 0;
      }
      /** constructor taking an int argument,
       *  assigns height that int argument
       */

       Tree(int initialHeight){
           height = initialHeight;
           System.out.println("Creatint new tree that is " + height + " feet tall ");
       }

       /** method to print height of tree object
        */

        void info(){
            System.out.println("Tree is " + height + "feet tall");
        }

        /** overloaded method to print string argument
         * and height of a tree object 
         */
        
         void info(String s){
             System.out.println(s + ": Tree is " + height + " feet tall");
         }

 }

 /**class to test constructino of tree  objects
  */

  public class Overloading{
      public static void main(String[] args) {
          for(int i=0; i<5;i++){
              Tree t = new Tree(i);
              t.info();
              t.info("overloading method");
          }
          // Overloaded constructor:
          new Tree();
      }
  }