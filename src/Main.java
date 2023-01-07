public class Main {
    public static void main(String[] args) {
        System.out.println(doctor (30, -10));
        System.out.println(doctor(25,10));
        System.out.println(doctor(60,30));
        System.out.println(doctor(60,18));
        System.out.println(doctor(45,50));
    }

    public static String doctor(int age, int temp) {
        if ((age > 20 && age < 45) && (temp > -20 && temp < 30)) {
            return "Go for a walk";
        } else if (age < 20 && (temp > 0 && temp < 28)) {
            return "Go for a walk";
        } else if (age > 45 && (temp > -10 && temp < 25)) {
            return "Go for a walk";
        } else {
            return "sit at home";
        }
    }
}