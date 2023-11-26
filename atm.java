import Card.Card;
import java.util.ArrayList; 
import java.util.Scanner;
public class atm {
        public static void main(String[] args){
        boolean atm = true;
        int dir,indir;

        Card credit = new Card();
        


        
        System.out.println("\n\t\t\t\tSimple ATM Machine\n\n");
        
        while(atm){
        Scanner obj = new Scanner(System.in);
        System.out.println("Please choose: ");
        credit.inter();
        dir = obj.nextInt();
        switch(dir){
                case 1:;
                        System.out.println("====================================\n");
                        System.out.println("Please choose: ");
                        credit.home();
                        Scanner obj1 = new Scanner(System.in);
                        System.out.println("====================================\n");
                        System.out.println("Enter a Number: ");
                        indir = obj1.nextInt();
                        switch(indir){
                        case 1:;
                        System.out.println("====================================\n");
                                System.out.println("You Chose to Balance");
                                credit.Balance();

                        case 2:;
                        System.out.println("====================================\n");
                                System.out.println("You Chose to Withdraw");
                                credit.Withdraw();

                        case 3:;
                        System.out.println("====================================\n");
                                System.out.println("You Chose to Deposit");
                                credit.Deposit();

                        }

                case 2:;
                        atm = false;
                        break;
                
                default:;
                        System.out.println("Invalid Choice!\n\n");
                                        break;
        }
        
        
        
        
        }

        }
        }



