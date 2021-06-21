import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        CalcHimself calculator = new CalcHimself();

        System.out.println("Hi! insert a number, math operation sign, and second number. Also this calculator has two cells " +
                "of memory.\n Typing the M1 or M2 you previous number can me memorized. If you done yor job, just type \"exit\". " +
                "I hope you enjoed it. ");


        Scanner scanner = new Scanner(System.in);       // get the user's input;

            while (true){
                String str = scanner.nextLine();

                if(str.equals("exit")){                     //exit condition;
                    System.out.println("Logout....");
                    return;
                }

                if(str.equalsIgnoreCase("m1")){
                    calculator.setM1(calculator.getResult());
                    System.out.println(calculator.getM1());
                    continue;
                }

                if(str.equalsIgnoreCase("m2")){
                    calculator.setM2(calculator.getResult());
                    System.out.println(calculator.getM2());
                    continue;
                }

                calculator.calculate(str);

                System.out.println(calculator.getResult());
            }

    }
}
