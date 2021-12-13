package Offline1;

public class Accounts {
    private String name;
    private String accountType;
    private double totalDeposit;
    private int year;
    private double loan;
    private double loan2;
    private double loan3;
    private double InterestRate;
    private int count;

    public Accounts() {
        totalDeposit=0;
        year=0;
        count=1;
        loan=0;
        loan2=0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void initInterestRate(){
        if(accountType.equals("SavingsAccount")){
            InterestRate=10;
        }
        else if(accountType.equals("StudentsAccount")){
            InterestRate=5;
        }
        else{
            InterestRate=15;
        }
    }

    public double getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(double interestRate) {
        InterestRate = interestRate;
        //System.out.println(interestRate);
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getTotalDeposit() {
        return totalDeposit;
    }

    public void setTotalDeposit(double totalDeposit) {
        this.totalDeposit = totalDeposit;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    void Deposit(double money){
        //System.out.println("Entered");
        if(accountType.equals("FixedDepositAccount")){
            if(money>=50000){
                this.setTotalDeposit(this.getTotalDeposit()+money);
                if(count==1)
                    System.out.println(money+"$ deposited; current balance "+totalDeposit+"$");
                count=1;
            }
            else{
                if(count==1)
                    System.out.println("You have to deposit at least 50000$");
                count=1;
            }
        }
        else{
            this.setTotalDeposit(this.getTotalDeposit()+money);
            if(count==1)
                System.out.println(money+"$ deposited; current balance "+totalDeposit+"$");
            count=1;
        }
    }

    void ApprovedLoan(){
        totalDeposit=totalDeposit+loan;
        loan=0;
    }

    void Withdraw(double money){
        //System.out.println(accountType);
        if(accountType.equals("SavingsAccount")){
            if(this.getTotalDeposit()>1000+money){
                this.setTotalDeposit(this.getTotalDeposit()-money);
                if (count==1)
                    System.out.println(money+"$ Withdrawn successfully");
                count=1;
            }
            else{
                if(count==1)
                    System.out.println("Invalid transaction.Current balance "+totalDeposit+"$");
                count=1;
            }
        }
        else if(accountType.equals("StudentsAccount")){
            //System.out.println("entered");
            if(this.getTotalDeposit()>money && money<=10000){
                this.setTotalDeposit(this.getTotalDeposit()-money);
                if (count==1)
                    System.out.println(money+"$ Withdrawn successfully");
                count=1;
            }
            else{
                if(count==1)
                    System.out.println("Invalid transaction.Current balance "+totalDeposit+"$");
                count=1;
            }
        }
        else{
            if(this.getTotalDeposit()>money && this.getYear()>=1){
                this.setTotalDeposit(this.getTotalDeposit()-money);
                if (count==1)
                    System.out.println(money+"$ Withdrawn successfully");
                count=1;
            }
            else{
                if(count==1)
                    System.out.println("Invalid transaction.Current balance "+totalDeposit+"$");
                count=1;
            }
        }
    }

    void RequestLoan(double money){
        if(accountType.equals("SavingsAccount")){
            if(money<=10000){
                loan=money;
                loan2=loan2+money;
            }
            else{
                System.out.println("Maximum allowable loan 10000$");
            }
            this.setLoan(loan);
            if(count==1)
                System.out.println("Loan request successful, sent for approval");
            count=1;
        }
        else if(accountType.equals("StudentsAccount")){
            if(money<=1000){
                loan=money;
                loan2=loan2+money;
            }
            else{
                System.out.println("Maximum allowable loan 1000$");
            }
            this.setLoan(loan);
            if(count==1)
                System.out.println("Loan request successful, sent for approval");
            count=1;
        }
        else{
            if(money<=100000) {
                loan = money;
                loan2=loan2+money;
            }
            else{
                System.out.println("Maximum allowable loan 100000$");
            }
            this.setLoan(loan);
            if(count==1)
                System.out.println("Loan request successful, sent for approval");
            count=1;
        }
        loan3=loan3+loan2;
    }

    void QueryDeposit(){
        System.out.println("Current balance "+(totalDeposit));
        System.out.println("Loan "+loan2);
    }

    void YearlyCutAndIncrease(){
        if(accountType.equals("SavingsAccount")){
            double currentMoney=this.getTotalDeposit()-loan2;
            currentMoney=currentMoney+currentMoney*InterestRate/100;
            double loanInt=loan2+loan2/10;
            this.setTotalDeposit(currentMoney-loanInt+loan2+loan2-500);
            this.setYear(this.getYear()+1);
            loan3=loanInt;
            //loan2=0;
        }
        else if(accountType.equals("StudentsAccount")){
            double currentMoney=this.getTotalDeposit()-loan2;
            currentMoney=currentMoney+currentMoney*InterestRate/100;
            double loanInt=loan2+loan2/10;
            this.setTotalDeposit(currentMoney-loanInt+loan2+loan2);
            this.setYear(this.getYear()+1);
            loan3=loanInt;
            //loan2=0;
        }
        else{
            double currentMoney=this.getTotalDeposit()-loan2;
            //System.out.println(InterestRate);
            currentMoney=currentMoney+currentMoney*InterestRate/100;
            double loanInt=loan2+loan2/10;
            this.setTotalDeposit(currentMoney-loanInt+loan2+loan2-500);
            this.setYear(this.getYear()+1);
            loan3=loanInt;
            //loan2=0;
        }
    }

    public static void main(String[] args) {
        Accounts a=new SavingsAccount();
    }
}

class SavingsAccount extends Accounts{
    private int loan;

    public SavingsAccount() {
        this.loan = 0;
        this.setAccountType("SavingsAccount");
    }


}

class StudentsAccount extends Accounts{
    private int loan;

    public StudentsAccount() {
        this.loan = 0;
        this.setAccountType("StudentsAccount");
    }


}

class FixedDepositAccount extends Accounts{
    private int loan;

    public FixedDepositAccount() {
        this.loan = 0;
        this.setAccountType("FixedDepositAccount");
    }


}
