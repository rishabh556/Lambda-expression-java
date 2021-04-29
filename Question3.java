//2.	WAP using Lambda Expression with multiple parameter to print addition of two numbers
interface Task{
	public void Sum(int a, int b);
}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task O=(a,b)-> System.out.println(a+b); 
		O.Sum(5,6);
	}

}
