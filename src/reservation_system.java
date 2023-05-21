
import java.util.Scanner;

public class reservation_system {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("----------------Welcome to Stars Hotel -----------------------");
        System.out.println("----------------Login to your account -----------------------");
        System.out.println("***************************************************************");
        System.out.println("");
        System.out.println("The Services Provided by our Hotel :- ");
        System.out.println("****************************************************************");
        System.out.println("1- browse rooms and suites  \n2- reservation    \n3- request a service    \n4- view list of reservation     \n5- exit  ");
        System.out.println("please enter the number of service from the menu : ");
        int num = input.nextInt();

        while (true) {
            if (num == 1) {

            }
            if (num == 2) {

            }
            if (num == 3) {

            }
            if (num == 4) {

            }
            if (num == 5) {
                break;

            }

        }

        booking b = null;
        Scanner s = new Scanner(System.in);
        reservation_system r = new reservation_system();
//       

        person arr[] = {
            new customer("almurjan", 2014295, "SaraAhmad", 21, 0555557555, "female", "sa1ra", "123456789"),
            new customer("alcorniche", 3018755, "ReemaAbdullah", 22, 0556557555, "female", "reema23", "363836393"),
            new customer("almuhammadya", 2015995, "ragadBuridi", 55, 0545157545, "female", "ragadalb", "ra36473873"),
            new customer("south obhur", 8071995, "AmeeraAhmad", 40, 0523557553, "female", "ameeraah", "ameera123"),
            new customer("north obhur", 8021595, "YaraAbdulaziz", 32, 0511557525, "female", "yara22", "y123456786"),
            new customer("alzahra", 7011995, "RubaMohammed", 50, 0555557735, "female", "r233b", "hello1247"),
            new customer("alshatea", 5001795, "SulafaAziz", 22, 0523456557, "female", "sulafaaziz", "098765432"),
            new customer("alhamra", 3011195, "AbdullahAbdulrahman", 44, 0523477555, "Male", "abdul6", "abdullah1"),
            new customer("aljamaa", 9011895, "MohammedAhmad", 34, 0500017555, "Male", "moha1", "12345678a"),
            new customer("alsalama", 4012995, "SaudAbdullah", 41, 0524564455, "Male", "saud367", "abc123456"),
            new customer_service(1114677, 1500, "ghadahAbdulrahman", 28, 0522225677, "female", "ghadah4as", "ghadah567"),
            new customer_service(1149303, 1500, "sultanSaud", 30, 0511212345, "male", "123sultan", "azaz12345"),
            new manager(1111695, 5000, "leenaSultan", 63, 0522552255, "female", "leenaa123", "09876134")
        };

    }

}
