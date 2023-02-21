package eu.mauizio90.eserciziointerfaccie;

/**
 *
 * @author mauiz
 */
public class Company {
    private Employee[] employees;
    private int numEmployees;
    private Account account;

    public Company() {
        employees = new Employee[15];
        numEmployees = 0;
    }

    public void addEmployee(Employee employee) {
        if (numEmployees >= employees.length) {
            throw new RuntimeException("Limite massimo di sviluppatori raggiunto.");
        }
        employees[numEmployees] = employee;
        numEmployees++;
    }
    

//    public String getTotalEmployee() {
//        return "l'azienda è formata da " + totalEmployee + " dipendenti. di cui " + numEmployees + " sviluppatori";
//}
    

    public String getEmployees() {
        return "l'azienda è formata da " + numEmployees + " dipendenti";
    }
    
    public void setAccount(Account account) {
        this.account = account;
    }
    
    public double payEmployees(){
        double sumPayments = 0;
        for(int i=0; i < employees.length; i++){
            if (employees[i] != null){
            Employee employee = employees[i];
            
            Account employeeAccount = employee.getAccount();
            double employeeSalary = employee.getSalary();
            
            account.transferTo(employeeAccount, employeeSalary);
            sumPayments += employeeSalary;
            }
        }
        return sumPayments;
        }
}
