package Card;
import java.util.Scanner;

public class Card {
    public String name;
    public int password,Home;
    public double deposit, withdraw, balance = 0,newBalance;

        String [] home = {"1.Balance, 2.Withdraw, 3.Deposit"};
        String [] inter = {"1. Continue :: 2. Exit"};


public void home(){
    for(int i=0; i < home.length; i++){
        System.out.println(home[i]);
    }
}

public void inter(){
    for(int i=0; i < inter.length; i++){
        System.out.println(inter[i]);
    }
}

public void Balance(){
    System.out.println("Your balance is: " + balance);
}

public void Deposit(){


    Scanner obj2 = new Scanner(System.in);
    System.out.println("How Much do you want to Deposit: ");
    deposit = obj2.nextDouble();
    newBalance = deposit + balance;
    balance = newBalance;
    System.out.println("\nYour balance is: " + balance);
}

public void Withdraw(){
    Scanner obj3 = new Scanner(System.in);
    System.out.println("How much do you want to Withdraw: ");
    withdraw = obj3.nextDouble();
    newBalance = withdraw - balance;
    balance = newBalance;
    System.out.println("\nYour new Balance is: " + balance);
}


}

