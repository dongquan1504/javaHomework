import java.util.Scanner;
public class bai7 {
  public static string nhap() {
    Scanner input = new Scanner(System.in);
    boolean check = false;
    int n = "";
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
    System.out.println("Nhập chuỗi ký tự bao gồm khoảng trắng");
    String s = nhap();
    System.out.println("Kết quả sau khi xóa khoảng trắng là: " + s);
  }
}
