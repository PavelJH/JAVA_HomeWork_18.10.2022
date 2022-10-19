import java.util.Scanner;

public class HW {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ekspresso -1 " +
                "Americano -2 " +
                "Capuchino -3 " +
                "Tea -4 : ");
        String phrase1 = sc.nextLine();

        int kafe = Integer.parseInt(phrase1);

        String result = switch (kafe) {
            case 1 -> "эспрессо: минимально неразделимый процесс";
            case 2 -> "американо: эспрессо + добавление воды";
            case 3 -> "капучино: эспрессо + добавление вспененного молока";
            case 4 -> "чай: выбор чайного пакетика + добавление воды";
            default -> "error";
        };

        System.out.println(result);

    }
}
