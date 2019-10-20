import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {
    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);



        saver1.modifyInterestRate(.04);
        saver2.modifyInterestRate(.04);


        for(int i = 0; i < 12; i++){
            saver1.calculateMonthlyInterest();
            System.out.printf("Saver 1 balance for %d month: %.2f\n", i + 1, saver1.getBalance());
        }

        for(int j = 0; j < 12; j++){
            saver2.calculateMonthlyInterest();
            System.out.printf("Saver 2 balance for %d month: %.2f\n", j + 1, saver2.getBalance());
        }

        saver1.modifyInterestRate(.05);
        saver1.calculateMonthlyInterest();
        System.out.printf("\nSaver 1 balance for 13th month after 4%% and 5%% last month: %.2f\n", saver1.getBalance());
        saver2.modifyInterestRate(.05);
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 2 balance for 13th month after 4%% and 5%% last month: %.2f\n", saver2.getBalance());
    }



}