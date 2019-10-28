package HPClasses;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author <a href="https://kamla.com.np">Abdhesh Nayak</a>
 * This Class Read the String value from String present in csv format
 */
public class stringToCsvReader {
    public ArrayList<ArrayList> read() throws IOException {
        //Creating Object with the address of csv file
        fileToStringReader fileHandler = new fileToStringReader(System.getProperty("user.dir") + "/src/abc.csv");
        //Getting the data of csv file in Single String Form
        String str = fileHandler.getString();
//        System.out.println(String.valueOf((int) '"'));
        String str2 = "";
        //Creating ArrayList to Store Data
        ArrayList<String> column = new ArrayList<>();
        ArrayList<ArrayList> row = new ArrayList<>();


        boolean flag = false;
        int columnCount = 0;

        //Main Code where we read csv file into usable values
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '\n' || i == str.length() - 1) {
                ++columnCount;
                if (i == str.length() - 1) {
                    str2 = str2 + str.charAt(i);
                }
//                System.out.println(columnCount + " :" + str2);
                column.add(str2);
                row.add(column);
                column = new ArrayList<>();
                str2 = "";
                if (i != str.length() - 1) {
                    ++i;
                }
            }
            if (str.charAt(i) == '"' && flag == true) {
                flag = false;
                ++i;
            }

            if (str.charAt(i) == ',' && flag != true) {
                ++columnCount;
//                System.out.print(columnCount + " :" + str2);
                column.add(str2);
                str2 = "";
                ++i;
//                if (str.charAt(i) != '\n') {
//                    System.out.print(", ");
//                }
            }
            if (str.charAt(i) == '"' && flag == false) {
                flag = true;
                ++i;
            }

            str2 = str2 + str.charAt(i);
        }
        return row;
    }
}
