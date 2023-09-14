package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Atributo
    private List<Tarefa> tarefaList;

    //Construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
        //New arraylist vazio.
    }
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);

            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotaldeTarefas () {
        return tarefaList.size();
    }
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
       }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos é: "+ listaTarefa.obterNumeroTotaldeTarefas());


        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos é: "+ listaTarefa.obterNumeroTotaldeTarefas());

        //listaTarefa.removerTarefa("Tarefa 3");
        System.out.println("O número total de elementos é: "+ listaTarefa.obterNumeroTotaldeTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
