package list.TaskList;

public class Main {
    public static void main(String[] args) {
        TaskList lista = new TaskList();

        lista.addTaskList("fazer dever");
        lista.addTaskList("alimentar cachorro");

        System.out.println(lista.getAllDescriptions());
    }
}
