import java.io.*;
 
public class Hello {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nhap a: ");
        int a = Integer.parseInt(in.readLine());
        System.out.print("Nhap b: ");
        int b = Integer.parseInt(in.readLine());
        int ketqua;
        ketqua = a + b;
        System.out.println("Ket qua bai toan a+b la: " + ketqua);
    }
}
import java.util.Scanner;
public class Main {
    public static int nhap()
    {
        Scanner input = new Scanner(System.in);
        boolean check= false;
		int n=0;
		while(!check){
			System.out.print(" ");
			try{
				n= input.nextInt();
				check= true;
			}catch(Exception e){
				System.out.println("Ban phai nhap so! hay nhap lai...");
				input.nextLine();
			}
		}
		return (n);
    }
    public static int UCLN(int a, int b){
		while(a!= b){
			if(a>b) a= a-b;
			else b= b-a;
		}
		return (a);
	}
    public static void main(String[] args) {
        System.out.println("Nhap a");
		int a = nhap();
		System.out.println("Nhap b");
		int b= nhap();
		System.out.println("Uoc chung lon nhat cua "+a+" va "+b+" la: "+UCLN(a,b));
		System.out.println("Boi chung nho nhat cua "+a+" va "+b+" la: "+((a*b)/UCLN(a,b)));
    }
}
