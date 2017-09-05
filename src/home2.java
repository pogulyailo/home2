import java. util.Scanner;

public class home2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("введите имя: ");
        String name = in.nextLine();
        System.out.println("введите город проживания: ");
        String town = in.nextLine();
        System.out.println("введите возраст: ");
        int age = in.nextInt();
        System.out.println("введите хобби: ");
        String hobby = in.next();


        System.out.printf(" Ваше имя: " + name + " Ваш город: " + town + " Ваш возраст: " + age + " Ваше хобби: " + hobby );
    }
}
