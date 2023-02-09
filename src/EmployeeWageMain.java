public class EmployeeWageMain {
    public static final int IS_FULL_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static int empCheck(){
        int empCheck = (int) Math.floor((Math.random() * 10) % 3);
        return empCheck;
    }

    public int dailyWageOfEmployee() {
        int empHrs = 0;
        int dailyWage = 0;
        switch (empCheck()) {
            case IS_FULL_TIME: //checking if full time or not
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }
        dailyWage = empHrs * EMP_RATE_PER_HOUR;
        return dailyWage;
    }
    public static void main(String[] args) {
        EmployeeWageMain employee = new EmployeeWageMain();
        System.out.println(employee.dailyWageOfEmployee());
    }
}