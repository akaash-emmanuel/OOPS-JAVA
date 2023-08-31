import java.util.Scanner;

class Account {
    String name;
    Long number;
    String type;
    Double balance=0.0;
    Boolean isFirstDeposit = true;
    void choice(){
        Scanner in = new Scanner(System.in);
        System.out.println("What would you like to do today:\n1. Initialize your values. \n2. Deposit.\n3. Withdraw.\n4. Display your name and account balance");
        int input = in.nextInt();
        if (input == 1){
            assign();

        }
        else if (input == 2){
            deposit();
        }
        else if (input == 3){
            wacb();
        }
        else if (input == 4){
            dnb();
        }
        else {
            System.out.println("Invalid input");
        }

    }
    void assign() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Name of Account Holder");
         name = in.nextLine();
        System.out.println("Enter Account Number");
         number = in.nextLong();
        in.nextLine(); 
        System.out.println("Enter Type of Account");
         type = in.nextLine();
        System.out.println("Enter Balance in your account");
        balance = in.nextDouble();

        System.out.println("Your Details are as follows :\t" + name + "\t" + number + "\t" + type + "\t1" + balance);
    }

    void deposit() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter amount to deposit\t");
        double newDep = inp.nextDouble();

        balance = balance + newDep;

       if (isFirstDeposit) {
           System.out.println("Your new balance, i.e your initial balance is\t" + balance);

          isFirstDeposit = false;
       }
       else {
           System.out.println("Your new balance is\t" + balance);
       }
    }

    void wacb() {
        System.out.println("Your balance is " + balance);
        Scanner inp1 = new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
       Double newWith = inp1.nextDouble();
        balance = balance - newWith;
        if (balance<0.0){
            System.out.println("You withdrew\t" +newWith+ "\tfrom the bank and now you are in debt of:\t" + -balance);
        }
        else {
            System.out.println("Your new balance is\t" + balance);
        }
    }

    void dnb() {
        System.out.println("Your Details:\t" + name + "\tand you have\t" + balance + "\trupees");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.choice();
    }
}
