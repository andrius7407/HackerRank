import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;
	
    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
	
    // Print person data
    public void printPerson(){
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber); 
    } 
}

class Student extends Person{
    private int[] testScores;
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] testScores){
        super(firstName, lastName, id);
        this.testScores = testScores;
    }
    
    char calculate(){
        int suma = 0;
        char c = 'O';
        for(int i = 0; i < testScores.length; i ++){
            suma += testScores[i];
        }
        int average = suma / testScores.length;
        if(90 <= average && average <= 100){
            return c;
        }else if(80 <= average && average < 90){
            c = 'E';
            return c;
        }else if(70 <= average && average < 80){
            c = 'A';
            return c;
        }else if(55 <= average && average < 70){ 
            c = 'P';
            return c;
        }else if(40 <= average && average < 55){
            c = 'D';
            return c;
        }else{
            c = 'T';
            return c;
        }
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
	}
}
