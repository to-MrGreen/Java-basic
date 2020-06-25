
/**
 * Write a description of Condition here.
 * 
 * @author (Md.Samiul Haque) 
 * @version (1.0)
 */
import edu.duke.*;
public class Condition {
    int f (int x, int y) {
        if (x < y) {
            System.out.println("x < y");
            return y + x;
        }
        else {
            System.out.println("x > y");
            if (x > 8) {
                return y + 7;
            }
        }
        return x - 2;
    }
    int g() {
        int a = f (3, 4);
        int b = f (a, 5);
        return b;
    }
}
