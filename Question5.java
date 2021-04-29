//5. WAP using Lambda Expression with or without return keyword.
interface lambdareturn
	{
		public int mul(int v1,int v2 );
	}
	interface lambdanoreturn
	{
		public void div(int n1,int n2 );
	}

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lambda No return Example
		lambdanoreturn d1=(n1,n2) -> System.out.println("Division:"+(n1/n2));
		d1.div(20, 10);
		
		//Lambda Return Example
		lambdareturn d=(v1,v2) -> v1*v2;
		int ans=d.mul(3, 4);
		System.out.print("Multiplication:"+ans);



	}

}
