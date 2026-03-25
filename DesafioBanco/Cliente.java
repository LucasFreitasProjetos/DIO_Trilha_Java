package DIO_Trilha_Java.DesafioBanco;

public class Cliente {

    private String nome;
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return java.util.Objects.equals(nome, cliente.nome);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nome);
    }

}
