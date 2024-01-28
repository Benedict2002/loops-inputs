public class sumOFDigits {
    private  static int sumDigits(int number){
        if(number < 10){
            return -1;
        }
        int sum = 0;

        while(number > 0){

            // Geting the least significant digit.
            int digit = number % 10;
            sum += digit;


            //removing the least significant digit
            number /= 10;

        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Sum of 125 is "+sumDigits(509875675));
    }
}
