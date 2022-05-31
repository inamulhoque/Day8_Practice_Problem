public class EmpWage {
    public static void empWage(){
        int Max_Working_Day = 20;
        int Total_Working_Hour = 0;
        int EmpRatePerHour = 20;
        int emphrs=0;
        int day = 1;
        int totalWage = 0;

        while (day<=Max_Working_Day) {
            day++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3+1;
            switch (empCheck) {
                case 1:
                    System.out.println("Employee is present full time");
                    emphrs = 8;
                    break;
                case 2:
                    System.out.println("Employee is present part time");
                    emphrs = 4;
                    break;
                case 3:
                    System.out.println("Employee is absent");
                    emphrs = 0;
                    break;
            }
            Total_Working_Hour=Total_Working_Hour+emphrs;
            totalWage = EmpRatePerHour*Total_Working_Hour;
        }
        System.out.print("Monthly wage of the employee is: "+totalWage);

    }
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation program on master branch.");
        empWage();
    }
}
