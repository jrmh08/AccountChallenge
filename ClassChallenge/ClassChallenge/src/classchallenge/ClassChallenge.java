/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classchallenge;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class ClassChallenge {

    public ClassChallenge(){
    }
    
    public static double deposit(double dep, double accountBal){
        System.out.printf("Your new balance is Php ");
        return accountBal + dep;
    }
    
    public static double withdraw(double with, double accountBal){
        if(with <= accountBal){
            System.out.println("Your new balance is Php ");
            return accountBal - with;
        }else{
            System.out.printf("Not Enough Balance! Can't Withdraw. \nBslance is Php ");
            return accountBal;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Account acc = new Account();
        acc.setAccountNum(12345);
        acc.setAccountBal(500.0);
        acc.setCustomertName("Jeremiah");
        acc.setEmail("jeremiah@gmail.com");
        acc.setPhoneNumber(1);
        
        System.out.printf("Hello %s\n", acc.getCustomertName());
        System.out.printf("Balance: %.2f\n\n", acc.getAccountBal());
        
        Scanner ask = new Scanner(System.in);
        System.out.println("1 - Deposit or \n2 - Withdraw? ");
        int ans =  ask.nextInt();
        
        if(ans == 1){
            System.out.println("How much would you deposit: ");
            double dep = ask.nextDouble();
            System.out.println(deposit(dep, acc.getAccountBal()));
        }else if(ans == 2){
            System.out.println("How much would you withdraw: ");
            double with = ask.nextDouble();
            System.out.println(withdraw(with, acc.getAccountBal()));
        }
    }
}
