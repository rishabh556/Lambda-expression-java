//3.	WAP using Lambda Expression to calculate following:
//a. convert Fahrenheit to Celcius
//b. convert Km to m
interface convert_operation
{
	public void convert(int temp,int km);
}

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convert_operation C=(int temp, int km)->{
			System.out.println("Fahrenhiet to Celcius:"+ ((temp-32)*5/9) );
			System.out.println("Kilometer to Meter:"+km*1000);
				};
				C.convert(100,45);


	}

}
