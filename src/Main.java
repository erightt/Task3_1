import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите имя первого пользователя");
        String name1 = sc.nextLine();
        System.out.println("Введите возраст первого пользователя");
        int age1 = sc.nextInt();
        sc.nextLine();

        User user1 = new User(name1, age1);

        System.out.println(" Введите имя второго пользователя");
        String name2 = sc.nextLine();
        System.out.println("Введите возраст второго пользователя");
        int age2 = sc.nextInt();

        User user2 = new User(name2, age2);

        if (user1.getAge() < user2.getAge()) {
            System.out.println(user1.toString());
        }
        else
        {
            System.out.println(user2.toString());
        }
        sc.close();

    }
}