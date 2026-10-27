class BankAccount{
    String accountName;
    double balance;

void deposit(double amount){
    balance=balance+amount;
}

void displayAccount(){
    System.out.println("Account Name:" + accountName);
     System.out.println("Balance: KSH" + balance);

}


}
public class JAVA{
public static void main(String[] args){
    //create an object
    BankAccount account=new BankAccount();

    //Access data members using  the object

    account.accountName="John Mwangi";
account.balance=10000;

//Access method using the object
account.deposit(5000);

//display account details
account.displayAccount();

}
    
}
