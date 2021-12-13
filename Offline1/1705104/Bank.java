package Offline1;
import java.util.Scanner;

public class Bank {
    private double internalFund;
    private Accounts[] accounts=new Accounts[100];
    private Employees[] employees=new Employees[20];
    private int numberOfEmployees;
    private int numberOfAccounts;
    private double pendingLoan;

    public Bank() {
        employees[0]=new ManagingDirector();
        employees[0].setName("MD");
        employees[1]=new Officer();
        employees[1].setName("S1");
        employees[2]=new Officer();
        employees[2].setName("S2");
        for(int i=3;i<8;i++){
            employees[i]=new Cashier();
            employees[i].setName("C"+Integer.toString(i-2));
        }
        numberOfEmployees=8;
        numberOfAccounts=0;
        System.out.println("Bank Created; MD, S1, S2, C1, C2, C3, C4, C5 created");
        internalFund=1000000;
        pendingLoan=0;
    }

    public double getPendingLoan() {
        return pendingLoan;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void setNumberOfAccounts(int numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
    }

    public double getInternalFund() {
        return internalFund;
    }

    public void setInternalFund(int internalFund) {
        this.internalFund = internalFund;
    }

    public Accounts[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts[] accounts) {
        this.accounts = accounts;
    }

    public Employees[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employees[] employees) {
        this.employees = employees;
    }

    public void setAccountAtIndex(int index,Accounts a){
        if(a.getAccountType().equals("SavingsAccount")){
            accounts[index]=new SavingsAccount();
            //accounts[index].initInterestRate();
        }
        else if(a.getAccountType().equals("StudentsAccount")){
            accounts[index]=new StudentsAccount();
            //accounts[index].initInterestRate();
        }
        else{
            accounts[index]=new FixedDepositAccount();
        }
        accounts[index].setName(a.getName());
        accounts[index].setAccountType(a.getAccountType());
        accounts[index].setTotalDeposit(a.getTotalDeposit());
        accounts[index].initInterestRate();
        numberOfAccounts++;
        for(int i=0;i<numberOfEmployees;i++){
            employees[i].setAccountAtIndex(index,a);
        }
    }

    public int NameCheck(String name){
        int check=0;
        for(int i=0;i<numberOfAccounts;i++){
            if(accounts[i].getName().equals(name)){
                check=1;
            }
        }
        return check;
    }

    public void setAccountDeposit(int index,double money){
        accounts[index].Deposit(money);
        for(int i=0;i<numberOfEmployees;i++){
            employees[i].AccountDeposit(index,money);
        }
        internalFund=internalFund+money;
    }

    public void setAccountWithdraw(int index,double money){
        //System.out.println("Entered");
        accounts[index].Withdraw(money);
        for(int i=0;i<numberOfEmployees;i++){
            employees[i].Withdraw(index,money);
        }
        internalFund=internalFund-money;
    }

    public void setAccountQuery(int index){
        accounts[index].QueryDeposit();
    }

    public void setAccountRequestLoan(int index,double money){
        accounts[index].RequestLoan(money);
        for(int i=0;i<numberOfEmployees;i++){
            employees[i].RequestLoan(index,money);
        }
        pendingLoan=pendingLoan+money;
    }

    public int findAccount(String name){
        int index=-1;
        for(int i=0;i<numberOfAccounts;i++){
            if(accounts[i].getName().equals(name)){
                index=i;
            }
        }
        return index;
    }

    public int findEmployee(String name){
        int index=-1;
        for(int i=0;i<numberOfEmployees;i++){
            if(employees[i].getName().equals(name)){
                index=i;
            }
        }
        return index;
    }

    public void ApproveLoan(int index){
        int[] arr=employees[index].ApproveLoan();
        for(int i=0;i<arr.length;i++){
            accounts[arr[i]].ApprovedLoan();
        }
        if(employees[index].getEmployeeType().equals("ManagingDirector") || employees[index].getEmployeeType().equals("Officer")){
            internalFund=internalFund-pendingLoan;
            pendingLoan=0;
            for(int i=0;i<numberOfEmployees;i++){
                if(employees[i].getEmployeeType().equals("Cashier")){
                    for(int j=0;j<arr.length;j++){
                        employees[i].getAccountsList()[arr[j]].ApprovedLoan();
                    }
                }
            }
        }
    }

    public void LookupAccount(int index,String n){
        int idx=this.findAccount(n);
        //System.out.println(idx);
        //System.out.println(n);
        employees[index].Lookup(idx);
    }

    public void setInterestRate(String accType,double newRate,int index){
        if(employees[index].getEmployeeType().equals("ManagingDirector")){
            for(int i=0;i<numberOfAccounts;i++){
                if(accounts[i].getAccountType().equals(accType)){
                    accounts[i].setInterestRate(newRate);
                }
            }
            for(int i=0;i<numberOfEmployees;i++){
                employees[i].setInterestRate(newRate,accType);
            }
            System.out.println("Interest rate changed for "+accType);
        }
        else{
            System.out.println("You don’t have permission for this operation");
        }
    }

    public void seeInternalFund(int index){
        if(employees[index].getEmployeeType().equals("ManagingDirector")){
            System.out.println("Internal fund: "+internalFund);
        }
        else{
            System.out.println("No access");
        }
    }

    public void IncreaseYear(){
        for(int i=0;i<numberOfAccounts;i++){
            //accounts[i].setYear(accounts[i].getYear()+1);
            accounts[i].YearlyCutAndIncrease();
        }
        for(int i=0;i<numberOfEmployees;i++){
            employees[i].IncreaseYear();
        }
        System.out.println("1 year passed");
    }

    public static void main(String[] args) {
        Bank bank=new Bank();
        Scanner scanner=new Scanner(System.in);
        //String runningName=new String();
        int running;
        running=1;
        //int running2;
        int runningIndex=0;
        int loopBreak=0;
        while (loopBreak==0){
            //int running;
            /*System.out.println("Are you an user or employee?");
            System.out.println("1.User        2.Employee");
            running=scanner.nextInt();*/
            String s=new String();
            Scanner scanner1=new Scanner(System.in);
            s=scanner1.nextLine();
            //System.out.println(running2);
            String[] commands=new String[4];
            commands=s.split(" ");
            //System.out.println(commands[0]);
            if(commands[0].equals("exit")){
                loopBreak=1;
            }
            else if(commands[0].equals("INC")){
                bank.IncreaseYear();
            }
            else if(commands[0].equals("Open")){
                String n=commands[1];
                int c=bank.NameCheck(n);
                if(c==1){
                    running=1;
                    int num=bank.findAccount(n);
                    if(num==-1){
                        System.out.println("No such account");
                    }
                    else{
                        runningIndex=num;
                        System.out.println("Welcome back, "+n);
                    }
                }
                else{
                    //String n1=commands[1];
                    running=2;
                    int num=bank.findEmployee(n);
                    if(num==-1){
                        System.out.println("No such account");
                    }
                    else{
                        runningIndex=num;
                        System.out.println(n+" active");
                        if(bank.getPendingLoan()!=0){
                            System.out.println("There are loan approvals pending");
                        }
                    }
                }
            }
            else{
                int commandLength;
                commandLength=commands.length;
                if(commandLength==4){
                    String name=commands[1];
                    String accType=commands[2];
                    double initDep=Double.parseDouble(commands[3]);
                    if(accType.equals("Student")){
                        Accounts a=new StudentsAccount();
                        a.setName(name);
                        accType="StudentsAccount";
                        a.setAccountType(accType);
                        a.setTotalDeposit(initDep);
                        if (bank.NameCheck(name) == 0) {
                            bank.setAccountAtIndex(bank.getNumberOfAccounts(),a);
                            //runningName=name;
                            runningIndex=bank.getNumberOfAccounts()-1;
                            running=1;
                            //System.out.println(runningIndex);
                            System.out.println("Student account for " +name+" Created; initial balance " + initDep);
                        }
                        else{
                            System.out.println("This name already exists");
                        }
                    }
                    else if(accType.equals("Savings")){
                        Accounts a=new SavingsAccount();
                        a.setName(name);
                        accType="SavingsAccount";
                        a.setAccountType(accType);
                        a.setTotalDeposit(initDep);
                        if (bank.NameCheck(name) == 0) {
                            bank.setAccountAtIndex(bank.getNumberOfAccounts(),a);
                            //runningName=name;
                            runningIndex=bank.getNumberOfAccounts()-1;
                            running=1;
                            //System.out.println(runningIndex);
                            System.out.println("Savings account for " +name+" Created; initial balance " + initDep);
                        }
                        else{
                            System.out.println("This name already exists");
                        }
                    }
                    else{
                        Accounts a=new FixedDepositAccount();
                        a.setName(name);
                        accType="FixedDepositAccount";
                        a.setAccountType(accType);
                        a.setTotalDeposit(initDep);
                        if (bank.NameCheck(name) == 0) {
                            bank.setAccountAtIndex(bank.getNumberOfAccounts(),a);
                            //runningName=name;
                            runningIndex=bank.getNumberOfAccounts()-1;
                            running=1;
                            //System.out.println(runningIndex);
                            System.out.println("Fixed deposit account for " +name+" Created; initial balance " + initDep);
                        }
                        else{
                            System.out.println("This name already exists");
                        }
                    }
                }
                else if(running==1){
                    if(commands[0].equals("Deposit")){
                        //System.out.println(commands[1]);
                        double money=Double.parseDouble(commands[1]);
                        bank.setAccountDeposit(runningIndex,money);
                    }
                    else if(commands[0].equals("Withdraw")){
                        //System.out.println(commands[1]);
                        double money=Double.parseDouble(commands[1]);
                        bank.setAccountWithdraw(runningIndex,money);
                    }
                    else if(commands[0].equals("Query")){
                        bank.setAccountQuery(runningIndex);
                    }
                    else if(commands[0].equals("Request")){
                        double money=Double.parseDouble(commands[1]);
                        bank.setAccountRequestLoan(runningIndex,money);
                    }
                    else if(commands[0].equals("Close")){
                        System.out.println("Transaction Closed");
                        runningIndex=-1;
                    }
                }
                else if(running==2){
                    if(commands[0].equals("Approve")){
                        bank.ApproveLoan(runningIndex);
                    }
                    else if(commands[0].equals("Lookup")){
                        String n=commands[1];
                        bank.LookupAccount(runningIndex,n);
                    }
                    else if(commands[0].equals("Close")){
                        runningIndex=-1;
                        System.out.println("Transaction closed");
                    }
                    else if(commands[0].equals("Change")){
                        double newRate=Double.parseDouble(commands[2]);
                        String accType=commands[1];
                        if(accType.equals("Student")){
                            accType="StudentsAccount";
                        }
                        else if(accType.equals("Savings")){
                            accType="SavingsAccount";
                        }
                        else{
                            accType="FixedDepositAccount";
                        }
                        bank.setInterestRate(accType,newRate,runningIndex);
                    }
                    else if(commands[0].equals("See")){
                        bank.seeInternalFund(runningIndex);
                    }
                }
            }
        }
    }
}
