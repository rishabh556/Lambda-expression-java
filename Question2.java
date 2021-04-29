//2. WAP using Lambda Expression with single parameter

interface lambdaparam
{
public void param(int rollno);
}

public class Question2 {
	
	public static void main(String[] args) {
		lambdaparam p=(int rollno) -> System.out.println("ROLL_NO:"+rollno); 
		p.param(167);
		}
		}