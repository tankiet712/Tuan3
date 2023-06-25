package baitap6;
import java.util.Scanner;
public class main6 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner (System.in);{
	//tao doi tuong
		
			Account acc1 = new Account();
			Account acc2 = new Account();
			Account acc3 = new Account();
	//nhap vao
			acc1.Account(72354,"Ted Murphy",10256);
			acc2.Account(69713,"Jane Smith",40000);
			acc3.Account(93757,"Edward Demsey",75932);
	//In ra
			System.out.println(acc1.toString());
			System.out.println(acc2.toString());
			System.out.println(acc3.toString());
			System.out.println("Nhập số tiền cần gửi cho Account1: ");
			if(acc1.deposit(sc.nextDouble()))
				System.out.println("Gửi tiền thành công!");
			else 
				System.out.println("Gửi tiền thất bại!");
		System.out.println("Nhập số tiền cần gửi cho Account2: ");
			if(acc2.deposit(sc.nextDouble()))
				System.out.println("Gửi tiền thành công!");
			else 
				System.out.println("Gửi tiền thất bại!");
		
		System.out.println("Nhập số tiền cần rút cho Account2: ");
			if(acc2.withdraw(sc.nextDouble(), 2000))
				System.out.println("Rút tiền thành công!");
			else 
				System.out.println("Rút tiền thất bại!");
		
		
		System.out.println("Tiền lãi của Account3 là "+acc3.addInterest());

		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
		System.out.println(acc3.toString());
		
		System.out.println("Nhập số tiền cần chuyển từ Account 2 cho Account1: ");
			if(acc2.transfer(acc1, sc.nextDouble()))
				System.out.println("Chuyển tiền thành công!");
			else 
				System.out.println("Chuyển tiền thất bại!");
		
		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
			
		}
	}
}