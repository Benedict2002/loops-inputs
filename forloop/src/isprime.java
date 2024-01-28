public class isprime {
    public static boolean isprime(int n){
        if (n == 1 ){
            return false;
        }
       for (int i =2; i <= (long)Math.sqrt(n); i++){
           if(n % 2 == 0){
               return false;
           }

        }
       return true;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i =10; i<=50; i++){
            if(isprime(i)){
                count++;
                System.out.println("Prime number is ="+i);

                if(count==3){
                    System.out.println("Exiting the loop");
                    break;

                }
            }
        }
        System.out.println(isprime(15));
    }
}
