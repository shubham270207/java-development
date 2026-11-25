//Store item price and quality, calculate subtotal ,tax amount and final bill.

public class Exercise10 {
    public static void main(String arg[]){
        double price = 150.0;
        int quality = 5;
        int taxRate = 18;
        double subTotal = quality * price;
        double taxAmount = subTotal*taxRate/100;
        double finalBill = subTotal + taxAmount;

        System.out.println("sub Total="+subTotal+"\n"+"Tax Amount="+taxAmount+"\n"+"Final Bill="+finalBill);



    }
}
