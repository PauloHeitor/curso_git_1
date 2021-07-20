import javax.swing.JOptionPane;

class JPane{
    public static void main(String[] args){
        System.out.println("Hello World!");

        String txt = "Paulo Heitor";

        JOptionPane.showInputDialog("Digite seu Nome:", txt);

        JOptionPane.showMessageDialog(null,"Hello " + txt);

    }

    }