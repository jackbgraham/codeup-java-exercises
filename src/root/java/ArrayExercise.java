package root.java;
import java.util.Arrays;

public class ArrayExercise {

    //this creates a new array, using new guys and the old array
    public static Person[] addPerson(Person newPerson, Person[] PeopleArray){
        Person[] newPeopleArray;
        newPeopleArray = new Person[PeopleArray.length + 1];
        //at this point we are at an array with 4 empty elements
        //we are telling the array how many positions it has, then iterating through it and assigning values
        for (int i = 0; i <= PeopleArray.length - 1; i++){
            newPeopleArray[i] = PeopleArray[i];
        }
        newPeopleArray[newPeopleArray.length-1] = newPerson;
        System.out.println(Arrays.toString(newPeopleArray));
        return newPeopleArray;
    }
    public static void main(String[] args) {
        //Why is Arrays.toString necessary?
        int [] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers) );

        Person[] PeopleArray = {
                new Person("SteveDave"),
                new Person("BobbySue"),
                new Person("JimBob")
        };
        for(Person person : PeopleArray){
            System.out.println(person.getName());
        }

        //add more people to the array
        Person newPerson = new Person("BillyRay");
        Person[] newPeopleArray = addPerson(newPerson, PeopleArray);


        ServerNameGenerator server1 = new ServerNameGenerator();
        System.out.println("servername: " + server1);
        ServerNameGenerator server2 = new ServerNameGenerator();
        System.out.println("servername: " + server2);
        ServerNameGenerator server3 = new ServerNameGenerator();
        System.out.println("servername: " + server3);


    }
}
