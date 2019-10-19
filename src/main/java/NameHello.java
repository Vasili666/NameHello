import java.util.Scanner;
// 1.     Приветствовать любого пользователя при вводе его имени через командную строку.
public class NameHello {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Say your name: ");
        String var2 = var1.nextLine();
        System.out.println("Hi,  " + var2 + "!");
        var1.close();
    }
}
