import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static List<Integer> alreadyInput = new ArrayList<>();
    static List<Integer> allNumb = new ArrayList<>();
    static  boolean isWin = true;
    public static void main(String[] args) {
            for(int i = 1; i <10; i++){
                allNumb.add(i);
            }
        char[][] gameField = {{' ', '|', ' ', '|', ' '},
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '},
                              {'-', '+', '-', '+', '-'},
                               {' ', '|', ' ', '|', ' '}
        };
        printTheGameField(gameField);

        while (isWin ) {
            System.out.print("Input your number from 1-9 : ");
            Scanner scan = new Scanner(System.in);
            int userInput = scan.nextInt();
               while (!allNumb.contains(userInput)){
                   System.out.println("wrong number, try again");
                   userInput = scan.nextInt();
               }
            inputs(gameField, userInput, 'X');  // user input option
            inputs(gameField, compInput(), 'O');//CPU input option
            printTheGameField(gameField);
            printWinner(gameField);

        }

    }

    // method which print the gameField
    public static void printTheGameField(char[][] arr) {
        for (char[] c : arr) {
            for (char t : c) {
                // System.out.print(t);
            }
            System.out.println(c);
        }
    }

    // here we are input a symbol into the field, according to a input number
    public static void inputs(char[][] arr, int usrInpt, char in) {
        if (!alreadyInput.contains(usrInpt)) {                //add number to a list, only if number absent there
            alreadyInput.add(usrInpt);
        }
        switch (usrInpt) {
            case (1):
                if (arr[0][0] == 'X' || arr[0][0] == 'O') break;
                arr[0][0] = in;
                break;
            case (2):
                if (arr[0][2] == 'X' || arr[0][2] == 'O') break;
                arr[0][2] = in;
                break;
            case (3):
                if (arr[0][4] == 'X' || arr[0][4] == 'O') break;
                arr[0][4] = in;
                break;
            case (4):
                if (arr[2][0] == 'X' || arr[2][0] == 'O') break;
                arr[2][0] = in;
                break;
            case (5):
                if (arr[2][2] == 'X' || arr[2][2] == 'O') break;
                arr[2][2] = in;
                break;
            case (6):
                if (arr[2][4] == 'X' || arr[2][4] == 'O') break;
                arr[2][4] = in;
                break;
            case (7):
                if (arr[4][0] == 'X' || arr[4][0] == 'O') break;
                arr[4][0] = in;
                break;
            case (8):
                if (arr[4][2] == 'X' || arr[4][2] == 'O') break;
                arr[4][2] = in;
                break;
            case (9):
                if (arr[4][4] == 'X' || arr[4][4] == 'O') break;
                arr[4][4] = in;
                break;
        }

    }

    // generate CPU move
    public static int compInput() {
        Random random = new Random(); //not sure about range of 1-9
        int rnd = random.nextInt(8)+1;
        while (alreadyInput.contains(rnd)) {
            rnd = random.nextInt(8)+1;
        }
        return rnd;
    }

    //check winnig conditions to User and CPU separatly
    public static boolean winConditionUSer(char[][] arr) {
        if (arr[0][0] == 'X' && arr[0][2] == 'X' && arr[0][4] == 'X') return true;
        if (arr[0][0] == 'X' && arr[2][0] == 'X' && arr[4][0] == 'X') return true;
        if (arr[0][2] == 'X' && arr[2][2] == 'X' && arr[4][2] == 'X') return true;
        if (arr[0][4] == 'X' && arr[2][4] == 'X' && arr[4][4] == 'X') return true;
        if (arr[2][0] == 'X' && arr[2][2] == 'X' && arr[2][4] == 'X') return true;
        if (arr[4][0] == 'X' && arr[4][2] == 'X' && arr[4][4] == 'X') return true;
        if (arr[0][0] == 'X' && arr[2][2] == 'X' && arr[4][4] == 'X') return true;
        if (arr[0][4] == 'X' && arr[2][2] == 'X' && arr[4][0] == 'X') return true;
        return false;
    }

    public static boolean winConditionCPU(char[][] arr) {
        if (arr[0][2] == 'O' && arr[2][2] == 'O' && arr[4][2] == 'O') return true;
        if (arr[0][0] == 'O' && arr[0][2] == 'O' && arr[0][4] == 'O') return true;
        if (arr[0][0] == 'O' && arr[2][0] == 'O' && arr[4][0] == 'O') return true;
        if (arr[0][4] == 'O' && arr[2][4] == 'O' && arr[4][4] == 'O') return true;
        if (arr[2][2] == 'O' && arr[2][4] == 'O' && arr[4][4] == 'O') return true;
        if (arr[4][0] == 'O' && arr[4][2] == 'O' && arr[4][4] == 'O') return true;
        if (arr[0][0] == 'O' && arr[2][2] == 'O' && arr[4][4] == 'O') return true;
        if (arr[0][4] == 'O' && arr[2][2] == 'O' && arr[4][0] == 'O') return true;
        return false;
    }

    public  static  boolean printWinner ( char[][] arr){
        if (winConditionUSer(arr)) {
            System.out.println("You win!");
           return isWin = false;
        }
        if (winConditionCPU(arr)) {
            System.out.println("CPU win!");
           return isWin = false;
        }
        if (alreadyInput.containsAll(allNumb)) {
            System.out.println("No one can win");
           return isWin = false;
        }
        return true;
    }
}

