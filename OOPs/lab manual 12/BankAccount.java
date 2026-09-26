public class BankAccount implements Comparable{
    double accountBalance;

   

    BankAccount(double accountBalance){
        this.accountBalance = accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

     public int compareTo(Object otherObject){
        BankAccount other = (BankAccount) otherObject;

        if(this.accountBalance < other.accountBalance){
            return -1;
        }
    
        else if(this.accountBalance > other.accountBalance){
            return 1;
        }
    
        else{
            return 0;
        }
    }  
        public String toString(){
            return "Balance " + getAccountBalance();
        }
} 