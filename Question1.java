//1.	WAP using Lambda Expression to print “Hello World”
interface operation{
	public void print_msg();
}

public class Question1 {
	public static void main(String args[]) {
		operation O=()->System.out.println("Hello World");
		O.print_msg();	
	}


}
