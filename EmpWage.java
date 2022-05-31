public class EmpWage {
    public static void empWage(){
        int empCheck =(int) Math.floor(Math.random() * 10) % 2;
        if (empCheck==0) {
            System.out.println("Employee is absent.");
        }
        else {
            System.out.println("Employee is present.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation program on master branch.");
        empWage();
    }
}
