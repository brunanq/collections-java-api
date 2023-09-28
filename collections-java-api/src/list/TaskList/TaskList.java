package TaskList;
import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> taskList;

    public TaskList(){
       this.taskList = new ArrayList<>();
    }

    public List<Task> getTaskList() {
        return taskList;

    }

    public void addTaskList(String description) {
        Task taskToBeAdded = new Task(description);
        taskList.add(taskToBeAdded);
    }

    public void removeTaskList(int index){
        taskList.remove(index);
    }
    public int sizeOfTaskList(){
       return taskList.size();
    }

    public List<String> getAllDescriptions(){
        List<String> descricoes = new ArrayList<>();

        for(Task task : taskList){
            var descricao = task.getDescription();
            descricoes.add(descricao);
        }

        return descricoes;
    }
}

