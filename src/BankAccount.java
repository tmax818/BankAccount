public class BankAccount {
    double checkingBalance;
    double savingsBalance;
    static int NUMBER_OF_ACCOUNTS;
    static double TOTAL_DEPOSITS;

    public BankAccount(){
        NUMBER_OF_ACCOUNTS++;
    }

    public void Deposit(String acctType, double amount){
        if(acctType == "checking"){
            this.checkingBalance += amount;
            TOTAL_DEPOSITS += amount;
        } else {
            this.savingsBalance += amount;
            TOTAL_DEPOSITS += amount;
        }
    }

    public void Withdraw(String acctType, double amount){
        if(acctType == "checking" && this.checkingBalance >= amount){
            this.checkingBalance -= amount;
            TOTAL_DEPOSITS -= amount;
        } else if(acctType == "savings" && this.savingsBalance >= amount){
            this.savingsBalance -= amount;
            TOTAL_DEPOSITS -= amount;
        }
    }

    public double TotalAmt(){
        return checkingBalance + savingsBalance;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}
