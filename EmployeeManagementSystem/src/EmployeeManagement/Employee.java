package EmployeeManagement;

public class Employee
{
    int id;
    String name;
    int age;
    int deptno;
    double sal;
    String job;
    public Employee(int id, String name, int age, int deptno, double sal, String job) 
    {
          super();
          this.id = id;
          this.name = name;
          this.age = age;
          this.deptno = deptno;
          this.sal = sal;
          this.job = job;
    }
    public String toString() 
    {
          return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", deptno=" + deptno + ", sal=" + sal
                      + ", job=" + job + "]";
    }
}

