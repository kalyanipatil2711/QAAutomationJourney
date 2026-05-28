
public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
       // Example 1 - simple if else
		  int age = 10;
		  if (age>=18) {
			  System.out.println("you can vote");
		  }
			  else {
				  System.out.println("you cant vote");
			  }	 
		  
		  //result  // Example 2 - if else if
		  
		  int marks =75;
		  if(marks>=90) {
			  System.out.println("Grade :  A" );
		  }else if(marks >=70) {
			  System.out.println("Grade : B");
		  }else if(marks>=50) {
			  System.out.println("Grade : C");
		  }else {
			  System.out.println("Fail");
		  }
		       // Example 3 - AND condition
		  
		int  salary =50000;
		double experiance =2.6;
		if (salary >=30000 && experiance >=2 ) {
			System.out.println("elgible for Loan ");
		}else {
			System.out.println("not eligible");
		}
		// Check if number is Positive, Negative or Zero
		int number =0;
		if (number>0) {
			System.out.println("Number is Positive");
		}else if (number<0) {
			System.out.println("Number is Negative");
		}else  {
			System.out.println("Number is Zero");
		}
		// Check if number is Even or Odd
		 int num = 10;
		  if (num % 2==0) {
			  System.out.println("number is Even ");
		  }else {
			  System.out.println("Number is Odd");
		  }
		  // Loops 
		  //for loop 
		  System.out.println("for loop : ");
		  for(int i=1;i<=5;i++) {
			  System.out.println(i);
		  }
		  //while loop
		  System.out.println("while loop : ");
		  int i=1;
		  while(i<=5) {
			  System.out.println(i);
			  i++;
		  }
		  //even number 1 to 10
		  System.out.println("Even No : 1 to 10 ");
		  for (int j=1;j<=10;j++) {
			  if(j % 2 == 0) {
				  System.out.println(j);
				  
			  }
		  }
		  //table  in for loops
		  int tableNo =10;
		  
		  for (int k=1;k<=10;k++) {
			  System.out.println(tableNo +"X" +k+ " =" + (tableNo*k));
		  }
		  
		 //febonacci series 
		  System.out.println("fibonacci series no");
		  int a =0;int b=1;int c;
		  int term=10;
		  for(int l=0;l<term;l++) {
			  System.out.print(a+"  ");
			  c=a+b;
			  a=b;
			  b=c;
		  }
		  
	}

}
