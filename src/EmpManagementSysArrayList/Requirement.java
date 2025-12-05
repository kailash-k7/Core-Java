package EmpManagementSysArrayList;

import java.util.ArrayList;

public interface Requirement {
    public ArrayList<EmployeeData> getList();
    public void addEmployee(EmployeeData employeeData);
    public void viewEmployees();
    public void viewEmployeeById(int emp_id);
    public void updateEmployee(int emp_Id, String emp_Name, String emp_Email, String job_Role, int exp, double salary);
    public void deleteEmployee(int emp_Id);
}
