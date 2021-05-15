import java.util.Scanner;

public class sumOfNNaturalNumbers {

	public static void main(String[] args) {
		
		int n , res=0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		n=s.nextInt();
		
		for(int i=0; i<=n;i++) {
			if(n>1 && n<1000000000) {
				res=res+i;
				
			}
		}
		System.out.println("result is : "+res);
		if(n<=0) {
			System.out.println("Wrong input");
		}
		
	}
}
