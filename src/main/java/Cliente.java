public class Cliente {

    private String nome;
    private Raca raca;

    public Cliente(String nome, Raca raca){
        this.nome = nome;
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + this.nome + '\'' +
                ", raca='" + raca.getNome() + '\'' +
                ", descricao='" + raca.getDescricao() + '\'' +
                '}';
    }
}
