package list;
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

    public void addTaskList(Task descricao) {
        taskList.add(descricao);
    }

    public void removeTaskList(int index){
        taskList.remove(index);
    }

}

