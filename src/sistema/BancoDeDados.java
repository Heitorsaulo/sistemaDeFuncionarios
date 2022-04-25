package sistema;

public class BancoDeDados {
    private static final String port = "5432";
    private static final String host = "localhost";
    private static final String db = "sistema_de_funcionarios";
    public static final String stringDeConexao = "jdbc:postgresql://"+ host +":"+ port + "/"+ db;
    public static final String usuario = "postgres";
    public static final String senha = "Tars-081004";
    
}
