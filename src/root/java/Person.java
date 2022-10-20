package root.java;

public class Person {

    private String name;

    //getter
    public String getName() {
        return name;
    }

    //setter, name is a property of the person class
    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("%s says hello", name);
    }

    //"no args" default constructor, this exists without you making it
    public Person(){}

    //overloaded constructor, this overrides the default constructor
    //"custom default"
    //"explicit default"
    public Person(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
