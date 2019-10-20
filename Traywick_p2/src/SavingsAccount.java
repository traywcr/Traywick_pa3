public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public void calculateMonthlyInterest(){
        this.savingsBalance += (savingsBalance * annualInterestRate) / 12;
    }

    public static void modifyInterestRate(double interest){
        annualInterestRate = interest;
    }

    SavingsAccount(){
        annualInterestRate = 0.0;
        savingsBalance = 0.0;
    }

    SavingsAccount(double balance){
        this.annualInterestRate = 0.0;
        this.savingsBalance = balance;
    }

    public double getBalance(){
        return savingsBalance;
    }

}
