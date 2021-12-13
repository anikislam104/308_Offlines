package Offline1;

public class Employees {
    private String name;
    private String employeeType;
    int numberOfAccounts;
    private Accounts[] accountsList=new Accounts[100];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employees() {
        //this.employeeType = employeeType;
        //this.accountsList = accountsList;
        numberOfAccounts=0;
    }

    public Accounts[] getAccountsList() {
        return accountsList;
    }

    public void setAccountsList(Accounts[] accountsList) {
        this.accountsList = accountsList;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void setNumberOfAccounts(int numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
    }

    public void setAccountAtIndex(int index,Accounts a){
        if(a.getAccountType().equals("SavingsAccount")){
            accountsList[index]=new SavingsAccount();
        }
        else if(a.getAccountType().equals("StudentsAccount")){
            accountsList[index]=new StudentsAccount();
        }
        else{
            accountsList[index]=new FixedDepositAccount();
        }
        accountsList[index].setName(a.getName());
        accountsList[index].setAccountType(a.getAccountType());
        accountsList[index].setTotalDeposit(a.getTotalDeposit());
        accountsList[index].initInterestRate();
        this.setNumberOfAccounts(this.getNumberOfAccounts()+1);
    }

    public void setInterestRate(double interestRate,String acc) {
        for(int i=0;i<numberOfAccounts;i++){
            if(accountsList[i].getAccountType().equals(acc))
                accountsList[i].setInterestRate(interestRate);
        }
        System.out.println(interestRate);
    }

    Accounts getAccountAtIndex(int index){
        return accountsList[index];
    }

    void RequestLoan(int index,double money){
        accountsList[index].setCount(2);
        accountsList[index].RequestLoan(money);
    }

    int[] ApproveLoan(){
        int arr[]=new int[numberOfAccounts];
        int count=0;
        if(employeeType.equals("Cashier")){
            System.out.println("No access");
        }
        else{
            //Accounts[] a = this.getAccountsList();
            for (int i = 0; i < this.getNumberOfAccounts(); i++) {
                //System.out.println(accountsList[i].getLoan());
                if (accountsList[i].getLoan() > 0) {
                    accountsList[i].setTotalDeposit(accountsList[i].getTotalDeposit() + accountsList[i].getLoan());
                    System.out.println("Loan Approved for "+accountsList[i].getName());
                    accountsList[i].setLoan(0);
                    arr[count]=i;
                    count++;
                }
            }
        }
        return arr;
    }

    void Lookup(int index){
        accountsList[index].QueryDeposit();
        System.out.println(accountsList[index].getName()+"'s current balance is "+accountsList[index].getTotalDeposit());
    }

    void AccountDeposit(int index,double money){
        accountsList[index].setCount(2);
        accountsList[index].Deposit(money);
    }

    void Withdraw(int index,double money){
        accountsList[index].setCount(2);
        accountsList[index].Withdraw(money);
    }

    void IncreaseYear(){
        for(int i=0;i<numberOfAccounts;i++){
            //accountsList[i].setYear(accountsList[i].getYear()+1);
            accountsList[i].YearlyCutAndIncrease();
        }
    }

    public static void main(String[] args) {

    }
}

class ManagingDirector extends Employees{
    private int BankInternalFund;

    public ManagingDirector() {
        this.setEmployeeType("ManagingDirector");
        BankInternalFund=1000000;
    }
}

class Officer extends Employees{
    public Officer() {
        this.setEmployeeType("Officer");
    }


}

class Cashier extends Employees{
    public Cashier() {
        this.setEmployeeType("Cashier");
    }
}
