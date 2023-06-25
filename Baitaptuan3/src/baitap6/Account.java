package baitap6;
import java.text.NumberFormat;
import java.util.Locale;

public class Account {
private String name;
private long accountNumber;
private double balance;
private final double RATE=0.35;

Locale local = new Locale("vi", "vn");
NumberFormat formatter = NumberFormat.getCurrencyInstance(local);

public void Account(String string, long i, double j) {
	accountNumber=999999;
	name ="chua xac dinh";
	balance=50000;
	
	
}

public void Account(long accountNumber, String name, double balance) throws Exception{
	if (accountNumber > 0)
	this.accountNumber = accountNumber;
	else
		throw new Exception("Loi so tai khoan < 0");
	if (!name.trim().equals(""))
	this.name = name;
	if (balance >= 50000)
	this.balance = balance;

}

public void Account(long accountNumber, String name) {

	this.accountNumber = accountNumber;
	this.name = name;
}

public long getAccountNumber() {
	return accountNumber;
}

public double getBalance() {
	return balance;
}
public boolean deposit(double amount) {
	if ( amount > 0) {
		balance =balance + amount;
	return true;}
	else
		return false;}

public boolean withdraw(double amount, double fee) {
	if (amount > 0 && amount + fee <= balance) {
		balance -= (amount + fee);
		return true;}
	else 
		return false;}

public String addInterest() {
	balance = balance + balance * RATE;
	String Tienlai = formatter.format(balance);
	return Tienlai;
}
public boolean transfer(Account acc2, double amount) {
	if (amount < this.balance) {
		this.balance -= amount;
		acc2.balance += amount;
		return true;
	}

	else
		return false;}

public String toString() {
	String Tienlai = formatter.format(balance);
	return String.format("%5d %16s %10s", accountNumber, name, Tienlai);
}
}

