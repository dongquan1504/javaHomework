import java.util.Scanner;
public class bai7 {
  public static int nhap() {
    Scanner input = new Scanner(System.in);
    boolean check = false;
    int n = 0;
    while (!check) {
      System.out.print(" ");
      try {
        n = input.nextInt();
        check = true;
      } catch (Exception e) {
        System.out.println("Ban phai nhap so! hay nhap lai...");
        input.nextLine();
      }
    }
    return (n);
  }
  
  public static void main(String[] args) {
    System.out.println("Nhap a");
    int a = nhap();
    System.out.println("Nhap b");
    int b = nhap();
    System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la: " + UCLN(a, b));
    System.out.println("Boi chung nho nhat cua " + a + " va " + b + " la: " + ((a * b) / UCLN(a, b)));
  }
}