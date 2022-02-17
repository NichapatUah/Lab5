package lab5;

public class MainAccount {
    public static void main(String[] args){

        Account account = new Account(1122, 20000, 4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("ID : " + account.getId());
        System.out.println("Balance : " + account.getBalance() + "$");
        System.out.println("Annuallnterest Rate : " + account.getAnnualInterestRate() + "%");
        System.out.println("Monthly interest : " + account.getMonthlyInterestRate() + "%");
        System.out.println("Date : " + account.getDateCreated());

    }
}
