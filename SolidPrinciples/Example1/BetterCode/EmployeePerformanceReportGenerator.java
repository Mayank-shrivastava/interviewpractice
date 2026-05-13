package SolidPrinciples.Example1.BetterCode;

public class EmployeePerformanceReportGenerator {
    public void printPerformanceReport(Employee e) {
        // Code to print performance report
        System.out.println("Performance report of employee: " + e.getEmployeeName());
    }
}


// This class only responsible for printing performance 

// We have segregated the classes in a way such that their is one core responsibility every class has, hence there is only one reason to change logic in a class 