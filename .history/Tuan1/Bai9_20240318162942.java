public class Bai9 {
  package cau_truc_switch_case;
 
import java.util.Scanner;
 
public class XacDinhNamAmLich {
 
    public static void main(String[] args) {
        int year;
        String can = "", chi = "";
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào năm dương lịch: ");
        year = scanner.nextInt();
         
        // Xác định Can
        switch (year % 10) {
            case 0:
                can = "Canh";
                break;
            case 1:
                can = "Tân";
                break;
            case 2:
                can = "Nhâm";
                break;
            case 3:
                can = "Quý";
                break;
            case 4:
                can = "Giáp";
                break;
            case 5:
                can = "Ất";
                break;
            case 6:
                can = "Bính";
                break;
            case 7:
                can = "Đinh";
                break;
            case 8:
                can = "Mậu";
                break;
            case 9:
                can = "Kỷ";
                break;
        }
         
        // Xác định Chi
        switch (year % 12) {
            case 0:
                chi = "Thân";
                break;
            case 1:
                chi = "Dậu";
                break;
            case 2:
                chi = "Tuất";
                break;
            case 3:
                chi = "Hợi";
                break;
            case 4:
                chi = "Tý";
                break;
            case 5:
                chi = "Sửu";
                break;
            case 6:
                chi = "Dần";
                break;
            case 7:
                chi = "Mẹo";
                break;
            case 8:
                chi = "Thìn";
                break;
            case 9:
                chi = "Tỵ";
                break;
            case 10:
                chi = "Ngọ";
                break;
            case 11:
                chi = "Mùi";
                break;
        }
         
        System.out.println("Năm âm lịch tương ứng với năm dương lịch = " + 
                year + " là " + (can + " " + chi));
    }
 
}
