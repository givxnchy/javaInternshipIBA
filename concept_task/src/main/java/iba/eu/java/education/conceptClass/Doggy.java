package iba.eu.java.education.conceptClass;

public class Doggy {
    static int paws = 4;
    String breed = "";
    String gender = "";
    int age;
    /*
    error looks like -
    class 'Doggy' must either be declared abstract or implement abstract method 'changeNumberOfPaws(int) in 'Dog'
    solution -
    we must declare all methods from interface if we want to make our class non-abstract
     */
    public void changeNumberOfPaws(int newValue){
        paws = newValue;
    }

    public void changeNameOfBreed(String changeBreed){
        breed = changeBreed;
    }

    public void changeGender(String changeGndr){
        gender = changeGndr;
    }

    public void changeAge(int newValue){
        age = newValue;
    }
}
