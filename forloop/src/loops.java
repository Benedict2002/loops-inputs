public class loops {
    public static double calculateInterest(double amount, double interest) {

    return (amount*(interest/100));
    }

    public static void main(String[] args) {
        for (int i =2 ; i <= 8; i++ ){
            System.out.println("10000 at "+i+"% Interest = "+calculateInterest(10000,i));
        }
    }


}
