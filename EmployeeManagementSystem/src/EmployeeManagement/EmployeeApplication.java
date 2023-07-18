package EmployeeManagement;

public class EmployeeApplication 
{
    public static void main(String[] args) 
    {
          EmployeeDatabase ed=new EmployeeDatabase();
          for(;;)
          {
                System.err.println("1.addEmployee");
                System.err.println("2.removeEmployee");
                System.err.println("3.searchEmployee");
                System.err.println("4.displayEmployee");
                System.err.println("5.updateEmployee");
                System.err.println("6.EXIT");
                switch(ed.sc.nextInt())
                {
                      case 1:
                      {
                            ed.addEmp();
                            break;
                      }
                      case 2:
                      {
                            ed.removeEmp();
                            break;
                      }
                      case 3:
                      {
                            ed.searchEmp();
                            break;
                      }
                      case 4:
                      {
                            ed.displayEmp();
                            break;
                      }
                      case 5:
                      {
                            ed.updateEmp();
                            break;
                      }
                      case 6:
                      {
                            System.out.println("Application is closed");
                            return;
                      }
                }
          }
          
    }
}
