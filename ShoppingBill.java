//Date: 14/10/2026//
public class ShoppingBill {
    static double calculateElectronicsGST(double a, double b){
        return (a+b)+(a+b)*18/100;
    }
    static double calculateFashionGST(double c , double d){
        return(c+d)+(c+d)*13/100;
    }
    static double calculateFoodGST(double e){
        return e+ e * 7 /100;
    }
    static double calculateTotalBill(double a, double b, double c,double d, double e){
        return calculateElectronicsGST(a, b) +calculateFashionGST(c,d)+calculateFoodGST(e);
    }
    static double calculateDiscountedBill(double a, double b, double c, double d, double e){
        double total = calculateTotalBill(a, b, c, d, e);
        return total - (total * 20 / 100);

    }
    public static void main(String [] args){
        double a = 100 ,b=100, c=100,d=100,e=100;
        double total = calculateTotalBill(a, b, c, d, e);
        double  finalBill=calculateDiscountedBill(a,b,c,d,e);
        double discount = total * 20 / 100;
        System.out.println("Total Bill: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill: " + finalBill);

    }
}