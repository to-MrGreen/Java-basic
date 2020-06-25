
/**
 * Write a description of Loop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import  edu.duke.FileResource;
import  edu.duke.URLResource;
public class Loop {
    public void Floop(){
        FileResource f;
        URLResource u;
        u = new URLResource("https://www.facebook.com.ext");
        for(String l: u.lines()) {
            System.out.println(l);
        }
    }
    
    public static void main(String[]args) {
        Loop l1 = new Loop();
        l1.Floop();
    }
}
