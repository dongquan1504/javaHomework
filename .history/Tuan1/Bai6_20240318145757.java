import java.util.Scanner;
public class Bai6 {
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

  public static int TSNT(int n) {
    int i = 2;
    if(n==1){
      return n;
    } else {
      while(n!=1){
        n\=i;
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("Nhập 1 số nguyên");
    int n = nhap();

    System.out.println("Thừa số nguyên tố cua " + n + " la: " + TSNT(n));
  }
}
