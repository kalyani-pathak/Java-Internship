public class ElectricityBill{
    static double calculateBill(double units){
        if(units <= 100) {
            return units *5;
        }
        else if(units<=200){
            return(100*5)+(units -100)*7;
        }
        else{
            return (100 *5) +(100 * 7)+(units -200) *10;
        }
    }
        static double calculateExtraCharge(){
        return 50;
        }
        static double calculateTotalBill(double units){
            double bill = calculateBill(units);
            double extraCharge = calculateExtraCharge();
            return bill + extraCharge;
        }
        public static void main(String [] args){
            double units = 250;
            double bill = calculateBill(units);
            double extraCharge = calculateExtraCharge();
            double total = calculateTotalBill(units);
            System.out.println("Units Consumed ="+ units);
            System.out.println("Electricity Bill="+ bill);
            System.out.println("Extra Charge="+ extraCharge);
            System.out.println("Total Bill =" + total);
        }
    }
