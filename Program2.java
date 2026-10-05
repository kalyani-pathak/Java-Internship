import java.util.Scanner;
class Program2
{  
     public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Cost Price:");
		 int costPrice = sc.nextInt();
		 
		 System.out.println("Enter Selling Price:");
		 int sellingPrice = sc.nextInt();
		 
		 
		 if(sellingPrice > costPrice)
		 {
			 int profit = sellingPrice - costPrice;
			  
			  System.out.println("Profit ="+profit);
		 }
		 else if (costPrice > sellingPrice)
		 {
			 int loss = costPrice - sellingPrice ;
		    System.out.println("Loss =" + loss);
		 }
		 else
		 {
			 System.out.println("No Profit No Loss");
		 }
	 }
}