package EmpManagementSysArrayList;

public class EmployeeData {
    private int empId;
    private String empName;
    private String empEmail;
    private String jobRole;
    private int Exp;
    private double Salary;

//    public EmployeeData() {
//
//    }

    public double getSalary() {

        return Salary;
    }

    public void setSalary(double salary) {

        Salary = salary;
    }

    public int getExp() {
        return Exp;
    }

    public void setExp(int exp) {
        Exp = exp;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String job_Role) {
        this.jobRole = job_Role;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String emp_Email) {
        this.empEmail = emp_Email;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String emp_Name) {
        this.empName = emp_Name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int emp_Id) {
        this.empId = emp_Id;
    }


    public EmployeeData(int emp_Id, String emp_Name, String emp_Email, String job_Role, int exp, double salary) {
        this.empId = emp_Id;
        this.empName = emp_Name;
        this.empEmail = emp_Email;
        this.jobRole = job_Role;
        Exp = exp;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", jobRole='" + jobRole + '\'' +
                ", Exp=" + Exp +
                ", Salary=" + Salary +
                '}';
    }
}
