import java.util.Scanner;
      public class Bank{
        public static void main(String[] args){  
    Scanner sc  =new Scanner(System.in);
        double balance = 10000;
        System.out.println("Welcome To  Kiran Bank");
        System.out.println("Openning balance is RS:" + balance);
        while(true){
            System.out.println("\n===BAKING MENU===");
            System.out.println("1 Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3 Withdraw Money");
            System.out.println("4.Exit");
            System.out.println("Enter Your Choice");
            if(!sc.hasNextInt()){
                System.out.println("Invalid Choice Plese Enter a valid choice");
                sc.nextLine();
                continue;
            }
            int choice = sc.nextInt();
            if(choice ==1)
            {
                System.out.println("Current Balance is RS:"+ balance);
            }
            else if(choice == 2){
                System.out.println("Enter a amount to deposit");
            if(!sc.hasNextDouble()){
                System.out.println("Inavalid choice ");
                sc.nextLine();
                continue;
            }
            double amount = sc.nextDouble();
            if(amount >0){
                balance =balance+ amount;
                System.out.println("Deposited Successfully.");
                System.out.println("Updated Balance" + balance);
            }
        
           else{
            System.out.println("Invalid amount ! Enter a valid amount");
           }
        }
          else if(choice == 3){
            System.out.println("Enter a withdrawal amount:");
            if(!sc.hasNextDouble()) {
             System.out.println("Invalid amount");
                sc.nextLine();
                continue;
            }
        
            double amount = sc.nextDouble();
            if(amount <=0){
                System.out.println("Invalid amount ! Enter a valid amount");
            }
            else if(amount <= balance){
                balance = balance - amount;
                System.out.println("Amount withdrawn successfully.");
                System.out.println("Updated Balance is RS"+ balance);
            }
            else{
                System.out.println("Transaction  Failed: Insufficient balance");
                System.out.println("Current Balance RS"+balance);
            }

        }
        else if(choice==4){
            System.out.println("Thank you for banking with us");
            break;
        }
        else{
            System.out.println("Invalid Choice plese select valid choice");
        }
    }
    sc.close();
}
      }
    