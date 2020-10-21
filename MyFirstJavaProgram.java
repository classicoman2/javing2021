import java.io.*;

public class MyFirstJavaProgram {

  /* This is my first java program.
   * This will print 'Hello World' as the output
   */

  public static void main(String[] args) throws IOException {
    Ciclista ciclista1 = new Ciclista("Peter Sagan", 30);

    //System.out.println(ciclista1.getName());

    ReadCiclistes readciclistes1 = new ReadCiclistes("ciclistes.txt");
    
    //Array de dades de ciclistes
    String[][] ciclistes = readciclistes1.ReadCiclistesFile();

    //Imprimeix Ciclistes
    int n = 1;
    for(String[] line: ciclistes) {
       System.out.println( String.format("\n {%s} ", n) );
       n++;
       for(String dada:line) {
         System.out.print( String.format("[%s]", dada) );
       }
    }
    
  }
}
