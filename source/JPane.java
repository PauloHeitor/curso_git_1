import javax.swing.JOptionPane;

public class JPane{
    
    private String nome;
    
    public JPane() {
        this.nome = "";
    }
    
    public JPane(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void JPanel(){
        this.setNome(JOptionPane.showInputDialog("Digite seu Nome:", this.getNome()));

        JOptionPane.showMessageDialog(null,"Hello " + this.getNome() + "!");

    }

}