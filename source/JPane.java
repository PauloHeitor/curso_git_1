import javax.swing.JOptionPane;

public class JPane{
    
    private String nome;
    private String email;
    
    public JPane() {
        this.nome = "";
        this.email = "";
    }
    
    public JPane(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void JPanel(){
        this.setNome(JOptionPane.showInputDialog("Digite seu Nome:", this.getNome()));
        this.setEmail(JOptionPane.showInputDialog("Digite seu EMAIL: ", this.getEmail()));

        JOptionPane.showMessageDialog(null,"Hello " + this.getNome() + "!\nSeu Email é:" + this.getEmail());

    }

}