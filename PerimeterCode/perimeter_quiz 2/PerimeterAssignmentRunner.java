import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        // Put code here
        int countP = 0;
        for(Point p: s.getPoints()) {
            countP = countP + 1;
        }
        return countP;
    }

    public double getAverageLength(Shape s) {
        // Put code here
        PerimeterAssignmentRunner p = new PerimeterAssignmentRunner();
        double perimeter = p.getPerimeter(s);
        double totalP = p.getNumPoints(s);
        double avg = perimeter / totalP;
        return avg;
    }

    public double getLargestSide(Shape s) {
        // Put code here
        Point lastPoint =s.getLastPoint();
        double lrg = 0.0;
        for(Point p: s.getPoints()) {
            double dist =lastPoint.distance(p);
            if(dist>lrg) {
                lrg = dist;
            }
            lastPoint = p;
        }
        return lrg;
    }

    public double getLargestX(Shape s) {
        // Put code here
        Point lastPoint = s.getLastPoint();
        int LastPointX = lastPoint.getX();
        double lrgX = (double) LastPointX;
        
        for(Point p: s.getPoints()) {
            int newX = p.getX();
            if(newX>lrgX) {
                lrgX = (double)newX;
            }
        }
            
        return lrgX;
    }

    public double getLargestPerimeterMultipleFiles() {
        // Put code here
        DirectoryResource dr = new DirectoryResource();
        double largPrem = 0.0;
        FileResource largFile = null;
        
        for(File f:  dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double prem =getPerimeter(s);
            if(largPrem<prem) {
                largPrem = prem;
            }
        }
        return largPrem;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        DirectoryResource dr = new DirectoryResource();
        double largPrem = 0.0;
        File temp = null;// replace this code
        
        for(File f: dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double prem = getPerimeter(s);
            if(prem>largPrem) {
                largPrem = prem;
                temp = f;
            }
        }
        return temp.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
    }
    
    public void testPerimeterMultipleFiles() {
        // Put code here
        double larg = getLargestPerimeterMultipleFiles();
        System.out.println("Largest perimeter is: "+larg);
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
        String f = getFileWithLargestPerimeter();
        System.out.println("Largest perimeter file is: "+f);
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }
    
    public void testAvgShape() {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double avg = getAverageLength(s);
        System.out.println(avg);
    }
    
    public void testLrgSide() {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double side = getLargestSide(s);
        System.out.println("Large side: "+side);
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
        
    }
}
