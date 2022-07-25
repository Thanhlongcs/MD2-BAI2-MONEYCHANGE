import java.sql.SQLOutput;
import java.util.Scanner;

public class MoneyConvert {
    public static void main(String[] args) {
        int choose;
        double money;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lua chon 1: Doi tu VND ra USD" + "\nLua chon 2: Doi tu USD sang VND");
        choose = scanner.nextInt();
        System.out.println("Nhap vao so tien can doi: ");
        money = scanner.nextDouble();
        switch (choose){
            case 1:
                System.out.println(money + "VND doi sang USD la " + money/23000 + " USD");
                break;
            case 2:
                System.out.println(money + "USD doi sang VND la " + money*23000 + " VND");
                break;
        }
    }
}
