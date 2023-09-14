package list.OperacoesBasicas;

public class Tarefa {
    private String descricao;
    //Atributo
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return  descricao;
    }
    //Criar o método get
    public String getDescricao() {
        return descricao;
    }
}
