// POJO (Plain Old Java Object) Person.java

public class Person {

    private String firstName;
    private String lastName;

    // default no arg constructor
    public Person(){}

    public Person(String first,String last){
        this.firstName = first;
        this.lastName = last;
    }
    
    public void setFirstName(String first){
        this.firstName = first;
    } 
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String last){
        this.firstName = last;
    } 
    
    public String getLastName(){
        return firstName;
    }
    
    public static void main(String[] args){
        Person person = new Person("Dan","Vega");
        System.out.println(person);
    }

    public String toString(){
        return firstName + ' ' + lastName;
    }

}
