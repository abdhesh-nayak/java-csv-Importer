package HPClasses;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * @author <a href="https://kamla.com.np">Abdhesh Nayak</a>
 * This Class Read the String value from String present in csv format
 */

public class fileToStringReader {
    String pname;
    public fileToStringReader(String filename) {
        pname=filename;
    }

    public String getString() throws IOException {
        String singleString= new String();
        FileReader inputStream = null;
        int x=0;
        try {
            inputStream = new FileReader(String.valueOf(pname));
            int c;
            while ((c = inputStream.read()) != -1) {
                singleString=singleString+String.valueOf((char)c);
//                System.out.println(c);
                x++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return singleString;
    }
}
