public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        a.setAccountHolderName("Pranav");
        a.setAccountNo("123456789");
        a.setBranchAddress("120 Queen street, Brampton, Canada");
        a.setAccountType("Checking");
        a.setAccountBalance(1000);
        System.out.println("Account Holder Name: " +a.getAccountHolderName());
        System.out.println("Account Number: " +a.getAccountNo());
        System.out.println("Branch Address: " +a.getBranchAddress());
        System.out.println("Account Balance: $" +a.getAccountBalance());
        System.out.println("Account Type: " +a.getAccountType());
        a.checkBalance();
        a.depositAmount(250);
        a.withdrawAmount(100);
    }
}
