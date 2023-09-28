package OrdemPessoas;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private double height;

    @Override
    public int compareTo(Person p) {
        return Integer.compare(age, p.getAge());
    }

    public Person(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person [\nname=" + name + ",\n age=" + age + ",\n height=" + height + "]\n";
    }

   

   
}