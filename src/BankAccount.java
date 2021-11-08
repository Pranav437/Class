public class BankAccount {
    private String AccountNo;
    private String AccountHolderName;
    private String AccountType;
    private String BranchName;
    private String BranchAddress;
    private double AccountBalance;

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String accountNo) {
        AccountNo = accountNo;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        AccountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public String getBranchName() {
        return BranchName;
    }

    public void setBranchName(String branchName) {
        BranchName = branchName;
    }

    public String getBranchAddress() {
        return BranchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        BranchAddress = branchAddress;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        AccountBalance = accountBalance;
    }
    public void checkBalance(){
        System.out.println("Your account balance is: $" +getAccountBalance());
    }
    public void depositAmount(double amount){
        System.out.println("You have deposited: $" +amount);
        AccountBalance += amount;
    }
    public void withdrawAmount(double amount){
        if (getAccountBalance()>=amount){
            System.out.println("You have withdrawn: $" +amount);
            System.out.println("Please collect your money");
            System.out.println("Your account balance is $" +(getAccountBalance()-amount));
        }
        else {
            System.out.println("Insufficient balance");

        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "AccountNo=" + AccountNo +
                ", AccountHolderName='" + AccountHolderName + '\'' +
                ", AccountType='" + AccountType + '\'' +
                ", BranchName='" + BranchName + '\'' +
                ", BranchAddress='" + BranchAddress + '\'' +
                ", AccountBalance=" + AccountBalance +
                '}';
    }
}
