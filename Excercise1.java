import java.util.Scanner;

public class Excercise1{
    public static void main(String[] args) {
        
        Scanner enter = new Scanner(System.in);
        int salario;
        int total;
        boolean close = false;

        /* char letter;

        System.out.println("Letra: ");
        letter = enter.next().charAt(0);
        System.out.println(Character.isLowerCase(letter)); */

        do {
             System.out.println("cuantas horas trabajastes? ");
             salario = enter.nextInt();

            if(salario <= 40){
              total = salario * 16;

                System.out.println("tu salario es de:" + total);

            }else {
                total = (40 * 16) + (salario - 40) * (20);
                System.out.println("tu salario es de: " + total);
                close = true;
            }        

        } while (!close);
        
    }
}