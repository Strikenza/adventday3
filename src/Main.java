import com.sun.jdi.IntegerValue;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(testline("93211111111111114221"));

    }

    public static int testline(String line) {
        int first = 0;
        int firstindex = 0;
        int second = 0;
        for (int i = 0; i < line.length() - 1; i++) {
            if (Integer.parseInt(line.substring(i,i+1)) > first) {
                first = Integer.parseInt((line.substring(i,i+1)));
                firstindex = i;
            }
        }
        for (int i = firstindex + 1; i < line.length(); i++) {
            if (Integer.parseInt(line.substring(i,i+1)) > second) {
                second = Integer.parseInt((line.substring(i,i+1)));
            }
        }
        return (first * 10 + second);
    }





     // public static int testZeros() throws FileNotFoundException {
     //   File f = new File("input.txt");
     //   Scanner s = new Scanner(f);
     //   while (s.hasNextLine()) {
     //  }
     // }

}