class ATM {
    public synchronized void checkBalance(String name) {
        System.out.println(name + " Checking ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Balance");
    }

    public synchronized void withdraw(String name, int amt) {
        System.out.println(name + " withdrawing ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(amt);
    }
}

class Customer extends Thread {
    ATM atm;
    String name;
    int amt;

    Customer(String n, ATM a, int amt) {
        this.name = n;
        this.atm = a;
        this.amt = amt; // Corrected this line
    }

    public void useATM() {
        atm.checkBalance(name);
        atm.withdraw(name, amt);
    }

    public void run() {
        useATM();
    }
}

public class StudentChallenge192 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1 = new Customer("Smith", atm, 100);
        Customer c2 = new Customer("John", atm, 200);

        c1.start();
        c2.start();
    }
}
