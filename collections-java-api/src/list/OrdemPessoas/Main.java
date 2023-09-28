package OrdemPessoas;

public class Main {
    public static void main(String[] args) {
        PeopleOrdering peopleArray = new PeopleOrdering();

        peopleArray.addPerson("bruna", 26, 1.55);
        peopleArray.addPerson("ernesto", 25, 1.90);

        System.out.println(peopleArray.getPeople().toString());
    }
    


}
