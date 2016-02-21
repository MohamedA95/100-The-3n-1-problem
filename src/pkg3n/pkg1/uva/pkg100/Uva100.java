
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Uva100 {

    public static void main(String[] args) {
        Scanner input = null;
        try {
            input = new Scanner(Paths.get("input.in"));
        } catch (IOException io) {
            System.out.println("IO");
        }
        while (input.hasNext()) {
            int s = input.nextInt(), e = input.nextInt();
            int counter = 0;
            int count = 0;
            
            for (int i = Math.min(s, e); i <= Math.max(e, s); i++) {

                int temp = i;
                boolean test = true;
                                    count = 0;

                while (test) {
                    if (temp % 2 == 0 && temp != 1) {
                        count++;
                        temp /= 2;
                    } else if( temp != 1) {
                        temp = (3 * temp )+ 1;
                        count++;
                    }
                    if (temp == 1) {
                        count ++;
                        test = false;
                    }

                }
                if (count > counter) {
                    counter = count;
                }
            }
            System.out.println(s + " " + e + " " + counter);
        }

    }

}
