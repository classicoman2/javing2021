import java.io.*;

public class MyFirstJavaProgram {

   /* This is my first java program.
    * This will print 'Hello World' as the output
    */

   public static void main(String []args) throws IOException {

      System.out.println("Hello World\n"); // prints Hello World
      
      Ciclista ciclista1 = new Ciclista("Peter Sagan", 30);

      System.out.println( ciclista1.getName() );

      ReadCiclistes readciclistes1 = new ReadCiclistes("ciclistes.txt");
      readciclistes1.ReadCiclistesFile();

   }
}