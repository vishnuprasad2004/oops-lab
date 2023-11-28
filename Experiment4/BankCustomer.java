import java.util.Scanner;

public class BankCustomer {
    String name;
    int IFSCcode;
    int accountNo;
    int totalMoney;
    void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== Insert Bank Customer Record ====");
        System.out.print("Enter your Name:");
        this.name = sc.next();
        System.out.print("Enter your IFSC code:");
        this.IFSCcode = sc.nextInt();       
        System.out.print("Enter your Account number:");
        this.accountNo = sc.nextInt();
        System.out.println("==== Bank Customer Inserted ====");
    }
    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter money amount for withdrawal:");
        int withdrawedMoney = sc.nextInt();
        if(withdrawedMoney >= 15000) {
            System.out.println("Saale, paisa hai tere pas");
            return;
        }
        if(this.totalMoney <= 1000) {
            System.out.println("chindi hai kya...");
            return;
        }
        int money = this.totalMoney - withdrawedMoney;
        this.totalMoney = this.totalMoney - withdrawedMoney;
        System.out.println("Balance:" + money);
        int note500 = withdrawedMoney / 500;
        int note100 = (withdrawedMoney - (note500 * 500)) / 100;
        System.out.println("-$500$- x" + note500);
        System.out.println("-$100$- x" + note100);
        
    }
    
    void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter money to be deposited:");
        int depositMoney = sc.nextInt();
        this.totalMoney  = this.totalMoney + depositMoney;
        System.out.println("=== Money Deposited === ");
        
    }

    void checkBalance() {
        System.out.println("=== Balance: "+ this.totalMoney + "===");
    }

    void init() {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO BANK");
        this.insert();
        while(true) {
            System.out.println("1. Deposit money\n2. Check Balance\n3. Withdraw money\n4. Exit");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            if(choice == 1) {
                this.deposit();
            }else if(choice == 2) {
                this.checkBalance();
            }else if(choice == 3) {
                this.withdraw();
            }else if(choice == 4) {
                System.out.println("=== Thank You ===");
                break;
            }else {
                System.out.println("Invalid Choice");
            }

        }
    }
}
