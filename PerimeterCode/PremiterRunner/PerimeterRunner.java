
/**
 * Write a description of PerimeterRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class PerimeterRunner {
    public double getPerimeter (Shape s) {
        //total perimeter 0 debo
        double totalPerim = 0;
        Point prevPt = s.getLastPoint();
        for(Point currPt: s.getPoints()){
            double currDist = prevPt.distance(currPt);
            totalPerim = totalPerim + currDist;
            prevPt = currPt;
        }
        return totalPerim;
    }
    
    public void testPerimeter (){
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = "+length);
    }
    
    public static void main(String[]args){
        PerimeterRunner pr = new PerimeterRunner();
        pr.testPerimeter();
    }
}
