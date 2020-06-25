
/**
 * Write a description of Function here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class Function {
    int myFunction(int x, int y) {
        int z = 2 * x - y;
        return z * x;
    }
    int f(int n) {
        return 3 + myFunction(n, n+1);
    }
    int g() {
        int a;
        a = myFunction(3, 7);
        int b = f(a * a);
        return b;
    }
}
