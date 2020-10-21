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
  public String[][] ReadCiclistesFile() throws IOException {
    String[][] ciclistes = new String[10][3];

    try {
      // Open the file that is the first
      // command line parameter
      FileInputStream fstream = new FileInputStream(this.fileName);
      // Get the object of DataInputStream
      DataInputStream in = new DataInputStream(fstream);
      BufferedReader br = new BufferedReader(new InputStreamReader(in));
      String strLine;
      String[] dadesCiclista;
      //Read File Line By Line

      int n = 0;

      while ((strLine = br.readLine()) != null) {
        dadesCiclista = strLine.split("-");

        String[] dadesCiclista2 = new String[3];
        int i=0;
        for (String c : dadesCiclista) {
          dadesCiclista2[i++] = c.trim();
        }

        ciclistes[n++] = dadesCiclista2;

        //System.out.println(strLine);
      }
      //Close the input stream
      in.close();
    } catch (Exception e) { //Catch exception if any
      System.err.println("Error: " + e.getMessage());
    }

    return ciclistes;
  }
}
