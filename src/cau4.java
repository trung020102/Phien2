import java.util.Scanner;
public class cau4 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		int i,n=0,s=0;
		double avg;
		{
		   
	        System.out.println("Nhap 5 So : ");  
	         
		}
			for (i=0;i<5;i++)
			{
			   
			    n = scanner.nextInt();
			    
	  		s +=n;
		}
		avg=s/5;
		System.out.println("The sum of 5 no is : " +s+"\nThe Average is : " +avg);
	 
	}
	}