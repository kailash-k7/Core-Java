package EmpManagementSysArrayList;

import java.util.ArrayList;

public class employeeService implements Requirement {
    ArrayList<Employee> list = new ArrayList<>();
    int count = 0;
    private final int size = 1;

    public ArrayList<Employee> getList() {
        return list;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void addEmployee(Employee employee) {
        try {
            if(count >= size){
                throw new overFlowException("Over Flow in Array");
            }
        list.add(employee);
            count++;
        System.out.println("Employee Added Successfully");

        }
        catch (overFlowException e){
            System.out.println("Exception Occurred: "+e.getMessage());
        }
    }

    @Override
    public void viewEmployees() {
        for(Employee e : list){
            System.out.println("Id: " + e.getEmp_Id() + ", Name: " + e.getEmp_Name() + ", Email: "
                    + e.getEmp_Email() + ", Job_Role: " + e.getJob_Role() + ", Exp: " + e.getExp() +
                    ", Salary: " + e.getSalary());
            System.out.println();
        }
    }

    @Override
    public void viewEmployeeById(int emp_id) {
        for(Employee e : list){
            if (e.getEmp_Id() == emp_id) {
                System.out.println("Id: " + e.getEmp_Id()+ ", Name: " + e.getEmp_Name() + ", Email: "
                        + e.getEmp_Email() + ", Job_Role: " + e.getJob_Role() + ", Exp: " + e.getExp() +
                        ", Salary: "+e.getSalary());

                System.out.println();
            }
        }
    }

    @Override
    public void updateEmployee(int emp_Id, String emp_Name, String emp_Email, String job_Role, int exp, double salary) {
        for(Employee e : list){
            if (e.getEmp_Id() == emp_Id){
                e.setEmp_Name(emp_Name);
                e.setEmp_Email(emp_Email);
                e.setJob_Role(job_Role);
                e.setExp(exp);
                e.setSalary(salary);
                System.out.println("Employee Updated Successfully!");
                return;
            }
        }
        System.out.println("Employee Not Found!");
    }

    @Override
    public void deleteEmployee(int emp_Id) {

            boolean removed = list.removeIf(e -> e.getEmp_Id() == emp_Id);

            if (removed) {
                System.out.println("Employee Deleted Successfully!");
                count--;
            }
            else {
                System.out.println("Employee Not Found!");
            }
    }

}
