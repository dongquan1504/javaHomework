import java.util.Scanner;
public class Bai5 {
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
        // TODO code application logic here
        int tong=0;
        System.out.println("nhap vao so nguyen:");
        int n=nhap();
        int m=n;
        while (m>0) {
            tong+=m%10;
            m= m/10;
        }
        System.out.println("tong cac chu so cua " + n + " la: " + tong);
    }
}
