import java.util.Scanner;
import java.util.Random;

public class CabBookingChatbot{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    while (true) {
        System.out.println("\n Welcome to the cab Booking Chatbot");
        System.out.println("1. Book Ride");
        System.out.println("2.Exit");
        System.out.print("Enter your choice: ");
        if (!sc.hasNext()){
            System.out.println("Invalid input Enter a valid choice");
            sc.nextLine();
            continue;
        }
        int choice = sc.nextInt();
        if(choice ==2){
            System.out.println("Thank you for using the cab Booking Chatbot");
            break;
        }
        else if( choice !=1){
            System.out.println("Invalid Choice.plese try again");
            continue;
        }
        System.out.println("\n Choose the Cab type:");
        System.out.println("1 . Auto- RS.12/km");;
        System.out.println("2 . Sedan- RS.18/km");
        System.out.println("3 . SUV- RS.25/km");
        System.out.println("Enter your choice");
        if(!sc.hasNext()){
            System.out.println("Invalid input Enter a valid choice");
            sc.nextLine();
            continue;

        }
        int cabchoice = sc.nextInt();
        String cabType ;
        int rate;
        if(cabchoice == 1){
            cabType = "Auto";
            rate = 12;
        }
        else if(cabchoice == 2){
            cabType = "Sedan";
            rate = 18;
        }
        else if(cabchoice == 3){
            cabType = "SUV";
            rate = 25;
        }
        else{
            System.out.println("Invalid Choice. Please try again");
            continue;
        }
        System.out.println("\n Choose the Route:");
        System.out.println("1. Pune Station to Shivaji Nagar (5 km)");
        System.out.println("2. Swarget to Kothrud(8 km)");
        System.out.println("3. Hinjawadi to Wakad(10 km) ");
        System.out.println("Enter your choice");
        if(!sc.hasNext()){
            System.out.println("Invalid input Enter a valid choice");
            sc.nextLine();
            continue;
        }
        int routeChoice = sc.nextInt();
        String source;
        String destination;
        int distance;
        if(routeChoice ==1){
            source = "Pune Station";
            destination = "Shivaji Nagar";
            distance =5;
        }
        else if(routeChoice ==2){
            source = "Swarget";
            destination = "Kothrud";
            distance = 8;
        }
        else if(routeChoice ==3){
            source = "Hinjawadi";
            destination = "Wakad";
            distance = 10;
        }
        else{
            System.out.println("Invalid Choice. Please try again");
            continue;
        }
        int fare = distance * rate;
        System.out.println("\n Booking deatils:");
        System.out.println("Cab Type: " + cabType);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Rate: Rs. " + rate + "/km");
        System.out.println("Total Fare: Rs. " + fare);
        System.out.println("\n1. Confirm & Share OTP");
        System.out.println("2. cancel Ride");
        System.out .println("Enter Your Choice");
        if(!sc.hasNext()){
            System.out.println("Invalid input Enter a valid choice");
            sc.nextLine();
            continue;
        }
        int confirmChoice = sc.nextInt();
        if(confirmChoice == 2){
            System.out.println("Ride cancelled.");
            System.out.println("NO OTP has been shared.");
        }else if(confirmChoice==1){
            int otp = 1000 + random.nextInt(9000);
            System.out.println("Your OTP is :"+ otp);
            System.out.println("Ride Cannot be cancelled after sharing the OTP");
            System.out.println("Cab Booking Confirmed.");
        }else{
            System.out.println("Invalid Choice. Ride not Confirmed");
        }

    }
   
}
}
