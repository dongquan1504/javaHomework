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

  public static String TSNT(int n) {
    int i = 2;
    if(n==1){
      return String.valueOf(n);
    } else {
      String kq = "";
      while(n!=1){
        if(n%i==0){
          kq +=  String.valueOf(i) + " x ";
          n/=i;
        } else {
          i++;
        }
      }
      return kq.substring(3);
    }
  }

  public static void main(String[] args) {
    System.out.println("Nhập 1 số nguyên");
    int n = nhap();

    System.out.println("Thừa số nguyên tố cua " + n + " la: " + TSNT(n));
  }
}
