import javax.swing.JOptionPane;

public class JPane{
    
    public void JPanel(){
        System.out.println("Hello World!");

        String txt = "Paulo Heitor";

        JOptionPane.showInputDialog("Digite seu Nome:", txt);

        JOptionPane.showMessageDialog(null,"Hello " + txt);

    }

}