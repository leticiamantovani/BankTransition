package application;

import java.util.Locale;
import java.util.Scanner;
import entities.bank;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        bank bankone;


        System.out.print("Enter Accout number: ");
        int account = sc.nextInt();
        System.out.print("Enter Account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println();
        System.out.print("Is there an initial deposit value (y/n)? ");
        char response = sc.next().charAt(0); 
        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
                double balance = sc.nextDouble();
            bankone = new bank(name, account, balance);
        }
        else{
            bankone = new bank(name, account);
        }
        System.out.println("Account data: ");
        System.out.println(bankone);

        System.out.print("Enter a deposit value: ");
        double value = sc.nextDouble();
        bankone.deposit(value);

        System.out.println("Updated data: ");
        System.out.println(bankone);

        System.out.print("Enter a withdraw value: ");
        double valuetwo = sc.nextDouble();
        bankone.withdrawn(valuetwo);

        System.out.println("Updated data: ");
        System.out.println(bankone);

        sc.close();

    }
}
