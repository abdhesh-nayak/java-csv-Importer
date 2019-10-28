import HPClasses.stringToCsvReader;

import java.io.IOException;
import java.util.ArrayList;
/**
 * @author <a href="https://kamla.com.np">Abdhesh Nayak</a>
 *This Program can read Csv file from the csv file.
 *And Give you the result in the form of ArrayList<ArrayList<String>>.
 * So This is Good way to convert and get your values easily.
 */

public class Main {
    public static void main(String[] arg) throws IOException {
        //Creating Object of Csvreader
        stringToCsvReader csvReader= new stringToCsvReader();
        //Creating Arraylist variable
        ArrayList<ArrayList> data;
        //Reading Data
        data=csvReader.read();
        //getting Data at index Second row and First column
        System.out.println(data.get(2-1).get(1-1));
    }
}