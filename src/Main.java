import com.sun.jdi.IntegerValue;

import java.io.FileNotFoundException;
import java.io.File;
import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //System.out.println(new BigDecimal(testline("987654321111111")));
        //System.out.println(new BigDecimal(testline("811111111111119")));
        //System.out.println(new BigDecimal(testline("234234234234278")));
        //System.out.println(new BigDecimal(testline("818181911112111")));
        System.out.println(testlineMultiple());

    }

    public static double testline(String line) {
        int num = 0;
        int numindex = 0;
        int earliestindex = 0;
        double sum = 0;
        for (int charnum = 1; charnum < 13; charnum++) {
            num = 0;
            numindex = 0;
            for (int i = earliestindex; i < line.length() - (12 - charnum); i++) {
                if (Integer.parseInt(line.substring(i, i + 1)) > num) {
                    num = Integer.parseInt((line.substring(i, i + 1)));
                    numindex = i;
                    earliestindex = i;
                    //System.out.println("Num is:");
                    //System.out.println(num);
                    //System.out.println("Index is:");;
                    //System.out.println(numindex);
                    //System.out.println("Line is:");
                    //System.out.println(line);
                }
        }
            line = line.replaceFirst(String.valueOf(line.charAt(numindex)), "");
            sum += num * Math.pow(10, 12-charnum);
    }




        return (sum);
    }





      public static BigDecimal testlineMultiple() throws FileNotFoundException {
          File f = new File("input.txt");
          Scanner s = new Scanner(f);
          double count = 0;
          while (s.hasNextLine()) {
                count += testline(s.nextLine());
          }
          BigDecimal newcount = new BigDecimal(count);
          return newcount;
      }

}