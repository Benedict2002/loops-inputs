import java.util.Scanner;

public class inputS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt= scanner.hasNextInt();

        if(hasNextInt){
            System.out.println("Enter your year of birth : ");
            int yearOfbirth = scanner.nextInt();
            scanner.nextLine();// Handle next line character

            System.out.println("Enter your name : ");
            String name = scanner.nextLine();

            int age = 2024 - yearOfbirth;

            if (age >= 0  && age <= 100){
                System.out.println("your name is "+ name+" , and your are "+age+" years old");
            } else {
                System.out.println(" Invalid year of birth!");
            }
        }else {
            System.out.println("Unable to pass the year of birth!");
        }
     scanner.close();
    }
}
