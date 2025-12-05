package EmpManagementSysArrayList;

import java.util.ArrayList;

public class EmployeeService implements Requirement {
//    EmployeeService employeeService2 = new EmployeeService();
    ArrayList<EmployeeData> list = new ArrayList<>();
    int count = 0;
    private final int size = 1;

    public ArrayList<EmployeeData> getList() {
        return list;
    }

    public int getSize() {

        return size;
    }

    @Override
    public void addEmployee(EmployeeData employeeData) {
        try {
            if(count >= size){
                throw new OverFlowException("Over Flow in Array");
            }
        list.add(employeeData);
            count++;
        System.out.println("Employee Added Successfully");

        }
        catch (OverFlowException e){
            System.out.println("Exception Occurred: "+e.getMessage());
        }
    }

    @Override
    public void viewEmployees() {
        list.forEach(System.out::println);
    }

    @Override
    public void viewEmployeeById(int empId) {
        list.stream()
                .filter(e -> e.getEmpId() == empId)
                .findFirst()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Employee Not Found!")
                );
    }


    @Override
    public void updateEmployee(int emp_Id, String emp_Name, String emp_Email, String job_Role, int exp, double salary) {
        list.stream()
                .filter(e -> e.getEmpId() == emp_Id)
                .findFirst()
                .ifPresentOrElse(e -> {
                            e.setEmpName(emp_Name);
                            e.setEmpEmail(emp_Email);
                            e.setJobRole(job_Role);
                            e.setExp(exp);
                            e.setSalary(salary);
                            System.out.println("Employee Updated Successfully!");
                        },
                        () -> System.out.println("Employee Not Found!"));
    }

    @Override
    public void deleteEmployee(int emp_Id) {

            boolean removed = list.removeIf(e -> e.getEmpId() == emp_Id);

            if (removed) {
                System.out.println("Employee Deleted Successfully!");
                count--;
            }
            else {
                System.out.println("Employee Not Found!");
            }
    }

}
