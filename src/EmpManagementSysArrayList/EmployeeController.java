package EmpManagementSysArrayList;

import java.util.Scanner;

public class EmployeeController {

    private final Requirement requirement = new EmployeeService();
    private final EmployeeService employeeService = new EmployeeService();
    private final int size = employeeService.getSize();
    private Scanner scn = new Scanner(System.in);

    public void start() {
        int choice;

        do {
            display();
            choice = getChoice();

            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> displayAllEmployees();
                case 3 -> displayEmployeeById();
                case 4 -> updateEmployee();
                case 5 -> deleteEmployee();
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        scn.close();
    }

    public int getChoice() {
        return scn.nextInt();
    }

        public void display () {
            System.out.println("""
                    ====== EMPLOYEE MANAGEMENT SYSTEM ======
                    1. Add Employee
                    2. Display All Employees
                    3. Display Employee By Id
                    4. Update Employee
                    5. Delete Employee
                    6. Exit
                    Enter Choice:
                    """);
        }


        // ---------------- ADD EMPLOYEE ----------------
        public void addEmployee () {
            try {
                if (requirement.getList().size() == size) {
                    throw new OverFlowException("Over Flow in Array");
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

                EmployeeData emp = new EmployeeData(id, name, email, jobRole, exp, salary);
                requirement.addEmployee(emp);

            } catch (Exception e) {
                System.out.println("Exception Occurred: " + e.getMessage());
                scn.nextLine();
            }
        }


        // ---------------- VIEW ALL EMPLOYEES ----------------
        public void displayAllEmployees () {
            try {
                if (requirement.getList().isEmpty()) {
                    throw new UnderFlowException("There is no Element in Array");
                }
                requirement.viewEmployees();

            } catch (UnderFlowException e) {
                System.out.println("Exception Occurred: " + e.getMessage());
            }
        }


        // ---------------- VIEW EMPLOYEE BY ID ----------------
        public void displayEmployeeById () {
            try {
                if (requirement.getList().isEmpty()) {
                    throw new UnderFlowException("There is no Element in Array");
                }

                System.out.print("Enter ID: ");
                int id = scn.nextInt();
                requirement.viewEmployeeById(id);

            } catch (UnderFlowException e) {
                System.out.println("Exception Occurred: " + e.getMessage());
            }
        }


        // ---------------- UPDATE EMPLOYEE ----------------
        public void updateEmployee () {
            try {
                if (requirement.getList().isEmpty()) {
                    throw new UnderFlowException("There is no Element in Array");
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

            } catch (UnderFlowException e) {
                System.out.println("Exception Occurred: " + e.getMessage());
            }
        }


        // ---------------- DELETE EMPLOYEE ----------------
        public void deleteEmployee () {
            try {
                if (requirement.getList().isEmpty()) {
                    throw new UnderFlowException("There is no Element in Array");
                }

                System.out.print("Enter ID to Delete: ");
                int id = scn.nextInt();
                requirement.deleteEmployee(id);

            } catch (UnderFlowException e) {
                System.out.println("Exception Occurred: " + e.getMessage());
            }
        }
    }