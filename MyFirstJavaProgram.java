public class MyFirstJavaProgram {

   /* This is my first java program.
    * This will print 'Hello World' as the output
    */

   public static void main(String []args) {

      System.out.println("Hello World\n"); // prints Hello World
      
      Ciclista ciclista1 = new Ciclista("Peter Sagan", 30);

      System.out.println( ciclista1.getName() ) ;

   }
}