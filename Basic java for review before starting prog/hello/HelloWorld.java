import edu.duke.*;
import java.util.Scanner;
public class HelloWorld {
    public static void main(string[]args){
    Scanner sc=new Scanner(system.in);
	public void runHello () {
		FileResource res = new FileResource("hello_unicode.txt");
		for (String line : res.lines()) {
			System.out.println(line);
		}
}
	
	
	public void yourName(){
	    for(int i=0;i<=9;i++){
	        System.out.println("Enter your name");
	        String name=sc.nextLine();
	        System.out.println("############");
	        System.out.println("## "+name+" #");
	        System.out.println("############");
	       }
	   }
}
}
