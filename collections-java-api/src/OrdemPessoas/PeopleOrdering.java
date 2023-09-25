package OrdemPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PeopleOrdering {
    private List<Person> people;

    public PeopleOrdering(){
        this.people = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height){
        Person personToBeAdded = new Person(name, age, height);
        people.add(personToBeAdded);
    }


    public List<Person> orderByAge(){
        List<Person> peopleByAge = new ArrayList<>(people);
        Collections.sort(peopleByAge);
        return peopleByAge;
    }

   

   /*  

   public void orderByHeight(){
        person.sort(person.height)
    }

*/
 public List<Person> getPeople() {
        return people;
    }

}