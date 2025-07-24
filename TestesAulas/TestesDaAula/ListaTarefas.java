
import java.util.List;
import java.util.ArrayList;


public class ListaTarefas {
    private List<Tarefa> tarefalist;

    public ListaTarefas(){
        this.tarefalist= new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefalist.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for (Tarefa t : tarefalist) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(t);
            }
        }
        tarefalist.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefalist.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefalist);
    }

    public static void main(String[] args) {
        ListaTarefas listatarefas= new ListaTarefas();

        System.out.println("O número de tarefas é: " + listatarefas.obterNumeroTotalTarefas());

        listatarefas.adicionarTarefa("Tarefa 1");
        listatarefas.adicionarTarefa("Tarefa 1");
        listatarefas.adicionarTarefa("Tarefa 3");

         System.out.println("O número de tarefas é: " + listatarefas.obterNumeroTotalTarefas());

        listatarefas.removerTarefa("Tarefa 3");

         System.out.println("O número de tarefas é: " + listatarefas.obterNumeroTotalTarefas());

         listatarefas.obterDescricoesTarefas();
    }
}
