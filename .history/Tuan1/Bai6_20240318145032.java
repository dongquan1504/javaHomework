import java.util.Scanner;
public class Bai6 {
  

  public static void main(String[] args) {
    System.out.println("Nhap a");
    int n = nhap();
    System.out.println("Nhap b");
    int b = nhap();
    System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la: " + UCLN(a, b));
    System.out.println("Boi chung nho nhat cua " + a + " va " + b + " la: " + ((a * b) / UCLN(a, b)));
  }
}
