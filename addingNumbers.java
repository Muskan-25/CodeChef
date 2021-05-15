import java.util.Scanner;

public class addingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total, num1,num2,add;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Total number of test cases : ");
		total = s.nextInt();
		
		for(int i=0;i<total;i++) {
			 System.out.print("Enter Two Numbers : ");
			 num1=s.nextInt();
			 num2=s.nextInt();
			 add=num1+num2;
		System.out.println("result is : "+add);	 
		}
	}

}
