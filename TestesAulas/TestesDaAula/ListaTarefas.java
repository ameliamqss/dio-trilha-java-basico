import java.util.list;

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
}
