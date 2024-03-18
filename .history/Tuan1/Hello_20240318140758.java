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
