package EmpManagementSysArrayList;

public class Employee {
    private int emp_Id;
    private String emp_Name;
    private String emp_Email;
    private String job_Role;
    private int Exp;
    private double Salary;

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

    public String getJob_Role() {
        return job_Role;
    }

    public void setJob_Role(String job_Role) {
        this.job_Role = job_Role;
    }

    public String getEmp_Email() {
        return emp_Email;
    }

    public void setEmp_Email(String emp_Email) {
        this.emp_Email = emp_Email;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public int getEmp_Id() {
        return emp_Id;
    }

    public void setEmp_Id(int emp_Id) {
        this.emp_Id = emp_Id;
    }


    public Employee(int emp_Id, String emp_Name, String emp_Email, String job_Role, int exp, double salary) {
        this.emp_Id = emp_Id;
        this.emp_Name = emp_Name;
        this.emp_Email = emp_Email;
        this.job_Role = job_Role;
        Exp = exp;
        Salary = salary;
    }
}
