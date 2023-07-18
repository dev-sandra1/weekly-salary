import java.util.Scanner;

public class Excercise1{
    public static void main(String[] args) {
        
        Scanner enter = new Scanner(System.in);
        int salary;
        int total;
        boolean close = false;

        /* char letter;

        System.out.println("Letra: ");
        letter = enter.next().charAt(0);
        System.out.println(Character.isLowerCase(letter)); */

        do {
             System.out.println("how many hours did you work?: ");
             salary = enter.nextInt();

            if(salary <= 40){
              total = salary * 16;

                System.out.println("your salary is: " + total);

            }else {
                total = (40 * 16) + (salary - 40) * (20);
                System.out.println("your salary is: " + total);
                close = true;
            }        

        } while (!close);
        
    }
}