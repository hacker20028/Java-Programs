/*
 * Design an employee class with empno, name, basic salary, department, and netsalary.
 * Define the following meathods:
 * 1) constructor to initialize instance variables
 * 2) public void printEMPinfo();
 * 3) public float findNetSalary(); that calculates the net salary of the employee.
 * Hra-20%, da-30%, itax-10% of basic salary.
 */
public class employee {
    int empno;
    String name;
    float basicSalary;
    String department;
    float netSalary;

    public employee(int empno, String name, float basicSalary, String department) {
        this.empno = empno;
        this.name = name;
        this.basicSalary = basicSalary;
        this.department = department;
    }

    public void printEMPinfo() {
        System.out.println("Employee Number: " + empno);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Basic Salary: " + basicSalary);
        System.out.println("Employee Department: " + department);
        System.out.println("Employee Net Salary: " + findNetSalary());
    }

    public float findNetSalary() {
        float hra = (20 * basicSalary) / 100;
        float da = (30 * basicSalary) / 100;
        float itax = (10 * basicSalary) / 100;
        netSalary = basicSalary + hra + da - itax;
        return netSalary;
    }

    public static void main(String[] args) {
        employee e1 = new employee(1, "Raj", 10000, "IT");
        e1.printEMPinfo();
    }
    
}
