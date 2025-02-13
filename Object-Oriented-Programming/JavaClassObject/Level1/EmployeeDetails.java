package Level1;

class Employee{
    //Attributes
    String name;
    int id;
    int salary;

    //constructor
    Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //method to display details of employee
    void displayEmployeeDetails(){
        System.out.println("Name of Employee is: " + name + " with id: " + id + " and salary is: " + salary);
    }

}

class EmployeeDetails{
    public static void main(String[] args) {
        Employee employee = new Employee("Simran", 453, 340000);
        employee.displayEmployeeDetails();
    }
}