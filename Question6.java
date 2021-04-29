
interface lambdaconcat
	{
		public void concat(String s1,String s2);
	}

public class Question6 {
	public static void main(String[] args) {
lambdaconcat c=(String s1, String s2)->
System.out.println("Concated string: "+s1+s2);
			c.concat("Rishabh Tiwari ", "167");
		}

}
