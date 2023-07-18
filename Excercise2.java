
import javax.swing.JOptionPane;

public class Excercise2 {
    public static void main(String[] args) {
        
         
        char letter;

        letter =  JOptionPane.showInputDialog(null,"write a letter: ") .charAt (0);

         if (Character.isUpperCase(letter)) {
            JOptionPane.showMessageDialog(null,"is a capital letter");

         }else{
              JOptionPane.showMessageDialog(null,"it is a lowercase letter");
         }

    }
}
