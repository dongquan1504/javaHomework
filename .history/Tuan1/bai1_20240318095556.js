import java.io.*;

public class Hello {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Your name is: ");
        String str;
        str = in.readLine();
        System.out.println("Welcome " + str + " to Java");
    }
}
