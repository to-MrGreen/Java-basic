
/**
 * Write a description of Hello here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class Hello {
    public void SHello() {
        FileResource file = new FileResource("README.TXT");
        for (String line : file.lines()) {
            System.out.println(line);
        }
    }
}
