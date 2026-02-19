package td2.exercice2;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return name + " (" + age + " years old)";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;
        
        Person other = (Person) obj;
        return this.age == other.age && this.name.equals(other.name);
    }
}
