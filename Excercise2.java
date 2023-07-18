
import javax.swing.JOptionPane;

public class Excercise2 {
    public static void main(String[] args) {
        
         
        char letra;

       letra =  JOptionPane.showInputDialog(null,"escribe una letra: ") .charAt (0);

         if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null,"es una letra mayuscula ");

         }else{
              JOptionPane.showMessageDialog(null,"es una letra minuscula ");
         }

    }
}
