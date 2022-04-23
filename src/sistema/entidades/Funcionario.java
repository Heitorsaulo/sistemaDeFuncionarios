package sistema.entidades;

public class Funcionario {
    // variável destinado ao id do funcionário
    private int id; 
    // variável destinado ao nome do funcionário
    private String nome; 
    // variável destinado ao sobrenome do funcionário
    private String sobrenome; 
    // variável destinado a data de nascimento do funcionário
    private String dataNascimento;
    // variável destinado ao email do funcionário
    private String email;
    // variável destinado ao cargo do funcionário
    private int cargo; 
    // variável destinado ao salário atual do funcionário
    private double salario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return this.nome + " " + this.sobrenome;
    }    
}
