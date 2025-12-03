import EmpManagementSysArrayList.*;

import java.util.Scanner;

public  class Main {
    static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Requirement requirement = new employeeService();
        employeeService empService = new employeeService();
        int size = empService.getSize();

        int choice;

        do {
            System.out.println("====== EMPLOYEE MANAGEMENT SYSTEM ======");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Display Employee By Id");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            choice = scn.nextInt();

            switch (choice){
                case 1:
                    try {
                        if(requirement.getList().size() == size){
                            throw new overFlowException("Over Flow in Array");
                        }
                    System.out.print("Enter emp_Id: ");
                    int id = scn.nextInt();
                    scn.nextLine();

                    System.out.print("Enter emp_Name: ");
                    String name = scn.nextLine();

                    System.out.print("Email: ");
                    String email = scn.nextLine();

                    System.out.print("Job Role: ");
                    String jobRole = scn.nextLine();

                    System.out.print("Exp: ");
                    int exp = scn.nextInt();

                    System.out.print("Salary: ");
                    double salary = scn.nextDouble();

                    Employee emp = new Employee(id, name, email, jobRole, exp, salary);
                    requirement.addEmployee(emp);
                    }
                    catch (overFlowException e){
                        System.out.println("Exception Occurred: "+e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        if (requirement.getList().isEmpty()) {
                            throw new underFlowException("There is no Element in Array");
                        }
                     requirement.viewEmployees();
                    }
                    catch (underFlowException e){
                        System.out.println("Exception Occurred: "+e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        if (requirement.getList().isEmpty()) {
                            throw new underFlowException("There is no Element in Array");
                        }
                    System.out.print("Enter ID to View Specific Employee: ");
                    int viewId = scn.nextInt();
                    requirement.viewEmployeeById(viewId);
                    }
                    catch (underFlowException e){
                        System.out.println("Exception Occurred: "+e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        if (requirement.getList().isEmpty()) {
                            throw new underFlowException("There is no Element in Array");
                        }
                    System.out.print("Enter ID to Update: ");
                    int uid = scn.nextInt();
                    scn.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = scn.nextLine();

                    System.out.print("Enter New Email: ");
                    String newEmail = scn.nextLine();

                    System.out.print("Enter New Role: ");
                    String newRole = scn.nextLine();

                    System.out.print("Enter New Exp: ");
                    int newExp = scn.nextInt();

                    System.out.print("Enter New Salary: ");
                    double newSal = scn.nextDouble();

                    requirement.updateEmployee(uid, newName, newEmail, newRole, newExp, newSal);
                    }
                    catch (underFlowException e){
                        System.out.println("Exception Occurred: "+e.getMessage());
                    }
                    break;

                case 5:
                    try {
                        if (requirement.getList().isEmpty()) {
                            throw new underFlowException("There is no Element in Array");
                        }
                    System.out.print("Enter ID to Delete: ");
                    int deleteId = scn.nextInt();
                    requirement.deleteEmployee(deleteId);
                    }
                    catch (underFlowException e){
                        System.out.println("Exception Occurred: "+e.getMessage());
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }
        }
        while (choice != 6);

        scn.close();
    }
}