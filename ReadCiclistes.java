import java.io.*;

class ReadCiclistes {
  String fileName;

  /**
   * Constructor
   */
  public ReadCiclistes(String fileName) {
    this.fileName = fileName;
  }

  /**
   * Read Ciclistes
   */
  public void ReadCiclistesFile() throws IOException {
    try {
      // Open the file that is the first
      // command line parameter
      FileInputStream fstream = new FileInputStream(this.fileName);
      // Get the object of DataInputStream
      DataInputStream in = new DataInputStream(fstream);
      BufferedReader br = new BufferedReader(new InputStreamReader(in));
      String strLine;
      //Read File Line By Line
      while ((strLine = br.readLine()) != null) {
        // Print the content on the console
        System.out.println(strLine);
      }
      //Close the input stream
      in.close();
    } catch (Exception e) { //Catch exception if any
      System.err.println("Error: " + e.getMessage());
    }
  }
}
