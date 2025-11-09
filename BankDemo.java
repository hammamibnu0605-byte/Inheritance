package inheritance;

class BankAccount {
    String accNo;
    double balance;

    BankAccount(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    void showInfo() {
        System.out.println(accNo + " balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        balance += balance * interestRate;
        System.out.println(accNo + " got interest. New balance: " + balance);
    }
}

class CheckingAccount extends BankAccount {
    double overdraftLimit;

    CheckingAccount(String accNo, double balance, double overdraftLimit) {
        super(accNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void useOverdraft(double amount) {
        if (amount <= overdraftLimit) {
            balance -= amount;
            System.out.println(accNo + " used overdraft. New balance: " + balance);
        } else {
            System.out.println(accNo + " overdraft limit exceeded!");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("SA001", 1000, 0.05),
            new CheckingAccount("CA001", 500, 200),
            new SavingsAccount("SA002", 2000, 0.03)
        };

        for (BankAccount acc : accounts) {
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).addInterest();
            } else if (acc instanceof CheckingAccount) {
                System.out.println(acc.accNo + " is a checking account.");
            }
        }
    }
}
