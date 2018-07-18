package sg.edu.rp.c346.employeeinfo;

public class EmployeeInfo {
    private String employeeName;
    private String employeeJob;
    private String employeePrice;

    public EmployeeInfo(String employeeName, String employeeJob, String employeePrice) {
        this.employeeName = employeeName;
        this.employeeJob = employeeJob;
        this.employeePrice = employeePrice;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeJob() {
        return employeeJob;
    }

    public String getEmployeePrice() {
        return employeePrice;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeJob(String employeeJob) {
        this.employeeJob = employeeJob;
    }

    public void setEmployeePrice(String employeePrice) {
        this.employeePrice = employeePrice;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeJob='" + employeeJob + '\'' +
                ", employeePrice='" + employeePrice + '\'' +
                '}';
    }
}
