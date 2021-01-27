public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID(){ 
        return id; 
    }

    public String getFirstName(){ 
        return firstName; 
    }

    public String getLastName(){ 
        return lastName; 
    }

    public String getName(){ 
        return firstName + " " + lastName; 
    }

    public int getSalary(){ 
        return salary; 
    }

    public int setSalary(){
        return salary = 100_000;
    }

    public int getAnnualSalary(){
        return salary * 12;
    }

    public int raiseSalary(double p){
      double computeSalary = (salary * (p/100)) + salary;
      int newSalary = (int) computeSalary;

      return newSalary;
    }
    
}