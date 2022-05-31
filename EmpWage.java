public class EmpWage {
    public static void empWage(){
        int EmpRatePerHour = 20;
        int emphrs=0;
        int empCheck =(int) Math.floor(Math.random() * 10) % 3;
        if (empCheck==0) {
            System.out.println("Employee is absent.");
        }
        else if (empCheck==1){
            System.out.println("Employee is present part-time.");
            emphrs=4;
        } else {
            System.out.println("Employee is present full-time.");
            emphrs=8;
        }
        int totalWage = EmpRatePerHour*emphrs;
        System.out.print("Daily wage is: "+totalWage);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation program on master branch.");
        empWage();
    }
}
