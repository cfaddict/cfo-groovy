// Person.groovy

public class Person {

    private String firstName;
    private String lastName;

    // default no arg constructor
    public Person(){}

    public Person(String first,String last){
        this.firstName = first;
        this.lastName = last;
    }

    public static void main(String[] args){
        Person person = new Person("Dan","Vega");
        System.out.println(person);
    }

    public String toString(){
        return firstName + ' ' + lastName;
    }

}