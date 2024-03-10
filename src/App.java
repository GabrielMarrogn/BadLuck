import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();

        if(a.contains("13")) System.out.println(a +" es de Mala Suerte");
        else System.out.println(a +" NO es de Mala Suerte");

        sc.close();
    }
}
