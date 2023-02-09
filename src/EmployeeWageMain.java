public class EmployeeWageMain {
    public static int empCheck(){
        int empCheck = (int) Math.floor((Math.random() * 10) % 3);
        return empCheck;
    }
    public static void main(String[] args) {
        empCheck();
    }
}