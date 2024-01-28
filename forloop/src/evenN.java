public class evenN {
    public static boolean isEven(int n){
        if(n % 2==0){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        int n =4;
        int finishNumber = 20;
        while (n<=finishNumber){
            n++;
            if(!isEven(n)){
                continue;
            }
            System.out.println("Number "+ n +" is Even");
        }
    }
}
