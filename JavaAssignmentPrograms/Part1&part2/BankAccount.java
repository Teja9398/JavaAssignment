
import java.util.Scanner;

class InsufficientFundsException extends Exception{
}


public class BankAccount {
    private double balance;
    String name;
    private int AcNo;
    BankAccount(String s,int n){
        this.name=s;
        this.AcNo=n;
    }

    void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount you want to deposit: ");
        double amount=sc.nextDouble();
        balance+=amount;
    }

    void withdraw()throws InsufficientFundsException{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount to withdraw: ");
        double amount=sc.nextDouble();
        if(balance<amount){
            throw new InsufficientFundsException();
        }else{
            balance-=amount;
        }

    }

    double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        BankAccount Ac1 = new BankAccount("John Cena", 001);
        Scanner sc= new Scanner(System.in);
        int choice;
        do{
            System.out.println(":::enter operarion to be performed:::\n\t1.check balance\n\t2.WithDraw\n\t3.Deposit\n\t4.exit");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                        System.out.println("Balance in your account : "+Ac1.getBalance()); 
                        System.out.println(":::::::::::::::::::::::::::::::::::::");
                        break;
                case 2:
                        try{
                            Ac1.withdraw();
                        }
                        catch(InsufficientFundsException I){
                            System.out.println("INSUFFICIENT FUNDS!!!\nenter lower amount. ");
                            I.printStackTrace();
                        }finally{
                            System.out.println("Current balance : "+ Ac1.getBalance());
                            System.out.println(":::::::::::::::::::::::::::::::::::::");
                        }
                        break;
                case 3: 
                        Ac1.deposit();
                        System.out.println("Balance after depositing: "+Ac1.getBalance());
                        break;
                case 4:
                        sc.close();
                        System.exit(0);
            }
            
        }while(true);
        
    }
}
