package Level2;

class Student{
    //Attributes
    String name;
    int rollNumber;
    int marks;

    //Constructor
    Student(String name, int rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    //method to calculate grade based on marks
    static String calculateGrade(float marks){
        if(marks >= 90){
            return "A";
        }
        else if(marks > 80 && marks < 90){
           return "B";
        }
        else if(marks > 70 && marks <= 80){
           return "C";
        }
        else if(marks > 60 && marks <= 70){
            return "D";
        }
        else if(marks > 50 && marks <= 60){
            return "E";
        }
        else{
            return "Fail";
        }
    }

    //method to display details of student
    static void displayDetails(String name, int rollNumber, float marks){
        System.out.println("Name of Student: " + name);
        System.out.println("Roll Number of Student: "+ rollNumber);
        System.out.println("Marks of Student: "+ marks);
        System.out.println("Grade of Student:" + calculateGrade(marks));
    }

}

public class StudentReport {
    public static void main(String[] args) {
        Student.displayDetails("Simran", 45, 67);
    }
}
