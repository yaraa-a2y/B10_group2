
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;


public class reservation_system {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("----------------Welcome to Stars Hotel -----------------------");
        System.out.println("----------------Login to your account -----------------------");
        System.out.println("***************************************************************");
        int f = 0;
        customer []cus = new customer [30];
        booking []res = new booking [30];
        service []ser = new service [30];
        
        service[] services = {
                new service("Massage", 100),
                new service("Extra Bed", 50),
                new service("Breakfast", 50),
                new service("Parking", 30),
                new service("Spa", 150),
                new service("Flowers", 50),

        };

        while (true) {
            System.out.println("");
            System.out.println("The Services Provided by our Hotel :- ");
            System.out.println("****************************************************************");
            System.out.println("1- browse rooms and suites  \n2- reservation    \n3- request a service    \n4- view list of reservation     \n5- exit  ");
            System.out.println("please enter the number of service from the menu : ");
            int num = input.nextInt();


            if (num == 1) {
                System.out.println("Enter number of people:");
                int people = input.nextInt();
                System.out.println(DisplayRoom(people).toString());


            }
            if (num == 2) {

                cutomerInfo(res ,cus, f, ser);
                f++;
            }
            if (num == 3) {
                System.out.println("Request a service :- \n-------------------------------------------------------------------\n");
//                ser[f] = requestService();
                  DisplayService(services);
            }
            if (num == 4) {
                System.out.println("List of Reservation :- \n-------------------------------------------------------------------\n");
                ViewListOfReservation(res);
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


       public static room DisplayRoom(int people){
        room rooms = null;
        room roomArr []= {
                new room(1,"Studio with Sofa Bed","1 king bed " ,500,2)
                , new room(2,"Deluxe Suite","Bedroom1: 1 king bed, Bedroom2: 1 twin bed, Living room: 1 sofa bed ",1500,4)
                , new room(3,"King Suite","Bedroom1: 1 king bed, Bedroom2: 1 king bed, Bedroom3: 1 twin bed, Living room: 2 sofa beds",5000,8)
        };
        
        for (int i = 0; i < roomArr.length; i++){ 
            if(people == roomArr[i].getNumOfcustomer())
             rooms = roomArr[i];
        }
       return rooms;
    }
       public static void DisplayService(service[] services){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the service you want to request: ");
        for (int i = 0; i < services.length; i++) {
            System.out.println((i + 1) + "- " + services[i].getTypeOfService() + " " + services[i].getPrice() + " SR");
        }
        int num = input.nextInt();
        requestService(num,services);
       
       }
       
       public static void requestService(int num,service[] services){
           Scanner input = new Scanner(System.in);
           if (num < 1 || num > services.length) {
            System.out.println("Invalid number, please enter a valid number: ");
            num = input.nextInt();
            requestService(num,services);
        }else
           System.out.println("Requested, thanks");    
       }
       
       

//    public static service requestService(){
//        service[] services = {
//                new service("Massage", 100),
//                new service("Extra Bed", 50),
//                new service("Breakfast", 50),
//                new service("Parking", 30),
//                new service("Spa", 150),
//                new service("Flowers", 50),
//
//        };
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of the service you want to request: ");
//        for (int i = 0; i < services.length; i++) {
//            System.out.println((i + 1) + "- " + services[i].getTypeOfService() + " " + services[i].getPrice() + " SR");
//        }
//        int num = input.nextInt();
//        while (num < 1 || num > services.length) {
//            System.out.println("Invalid number, please enter a valid number: ");
//            num = input.nextInt();
//        }
//        return services[num - 1];
//    }
    public static customer cutomerInfo(booking []res,customer []cus,int f,service []ser){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter customer information:");
        System.out.println("Name:");
        String Name = input.next();
        System.out.println("id:");
        int id = input.nextInt();
        System.out.println("address:");
        String address = input.next();
        System.out.println("phone:");
        int Phone = input.nextInt();
        System.out.println("age:");
        int Age = input.nextInt();
        System.out.println("sex:");
        String Sex = input.next();
        System.out.println("user_name:");
        String user_name = input.next();
        System.out.println("pass_word:");
        String pass_word = input.next();
        cus[f]=new customer ( address, id, Name, Age, Phone, Sex, user_name, pass_word) ;
        ReservationDue(res ,cus, f, ser);
        return cus[f];
    }
    
     public static void ReservationDue(booking []res,customer []cus,int f,service []ser){
         Scanner input = new Scanner(System.in);
         
         System.out.print("The starting time for the booking day is:");
        int time = 14;
        System.out.println(time+"o'clock");
        //Date
        System.out.println("Enter the entry date:");
        System.out.println("day:");
        int day = input.nextInt();
        System.out.println("month:");
        int month = input.nextInt();
        System.out.println("year:");
        int year = input.nextInt();
        Date date= new Date();
        SimpleDateFormat DateFormat=new SimpleDateFormat(day+"/"+month+"/"+year);
        String formattedDate = DateFormat.format(date);
        reservationType(formattedDate,cus,res,ser,time,f);
         
     }
     public static void reservationType(String formattedDate,customer []cus,booking []res,service []ser,int time,int f){
         Scanner input = new Scanner(System.in);
         System.out.println("chose room type 1,2,3:");
        room roomArr []= {
                new room(1,"Studio with Sofa Bed","1 king bed " ,500,2)
                , new room(2,"Deluxe Suite","Bedroom 1: 1 king bed Bedroom 2: 1 twin bed Living room: 1 sofa bed ",1500,4)
                , new room(3,"King Suite","Bedroom 1: 1 king bed Bedroom 2: 1 king bed Bedroom 3: 1 twin bed  Living room: 2 sofa beds",5000,8)};
        for (int i = 0; i < roomArr.length; i++) {
            System.out.println(roomArr[i].toString()); }
        int room_type = input.nextInt();
        int room_num = (int)(Math.random()*100);
        int price = 0;//price
        for (int j = 0; j < roomArr.length; j++) {
            if(room_type==roomArr[j].getRoom_id()){
                price= roomArr[j].getRoom_price(); } }
        System.out.println("Enter the number of sitting days:");//Sitting days
        int days = input.nextInt();
        int totalPrice= days*price;
        System.out.println("Enter number of people:");//Nomber of people
        int people = input.nextInt();
        booking b = new booking();//Booking Number
        //Booking
        res[f]= new booking(room_num ,time, formattedDate, days, room_type, totalPrice, people, b.getBooking_number(),
                cus[f].getName() , cus[f].getId(),ser[f]);
                 System.out.println("\n            ***Great booking successfully, see you soon "+cus[f].getName()+":) ***");

        System.out.println(res[f].toString());
     }
//    public static void reservation(booking []res, customer []cus ,int f,service []ser) {
//
////        Scanner s = new Scanner(System.in);
////
////        System.out.println("Enter customer information:");
////        System.out.println("Name:");
////        String Name = s.next();
////        System.out.println("id:");
////        int id = s.nextInt();
////        System.out.println("address:");
////        String address = s.next();
////        System.out.println("phone:");
////        int Phone = s.nextInt();
////        System.out.println("age:");
////        int Age = s.nextInt();
////        System.out.println("sex:");
////        String Sex = s.next();
////        System.out.println("user_name:");
////        String user_name = s.next();
////        System.out.println("pass_word:");
////        String pass_word = s.next();
////        cus[f]=new customer ( address, id, Name, Age, Phone, Sex, user_name, pass_word) ;
//
////        //Time
////        System.out.print("The starting time for the booking day is:");
////        int time = 14;
////        System.out.println(time+"o'clock");
////        //Date
////        int room_num = (int)(Math.random()*100);
////        System.out.println("Enter the entry date:");
////        System.out.println("day:");
////        int day = s.nextInt();
////        System.out.println("month:");
////        int month = s.nextInt();
////        System.out.println("year:");
////        int year = s.nextInt();
////        Date date= new Date();
////        SimpleDateFormat DateFormat=new SimpleDateFormat(day+"/"+month+"/"+year);
////        String formattedDate = DateFormat.format(date);
////        //Sitting days
////        System.out.println("Enter the number of sitting days:");
////        int days = s.nextInt();
//        //Rooom type
////        System.out.println("chose room type 1,2,3:");
////        room roomArr []= {
////                new room(1,"Studio with Sofa Bed","1 king bed " ,500,2)
////                , new room(2,"Deluxe Suite","Bedroom 1: 1 king bed Bedroom 2: 1 twin bed Living room: 1 sofa bed ",1500,4)
////                , new room(3,"King Suite","Bedroom 1: 1 king bed Bedroom 2: 1 king bed Bedroom 3: 1 twin bed  Living room: 2 sofa beds",5000,8)
////        };
////        for (int i = 0; i < roomArr.length; i++) {
////            System.out.println(roomArr[i].toString());
////        }
////        int room_type = s.nextInt();
////        //price
////        int price = 0;
////        for (int j = 0; j < roomArr.length; j++) {
////            if(room_type==roomArr[j].getRoom_id()){
////                price= roomArr[j].getRoom_price();
////            }
////        }
////        int totalPrice= days*price;
////        //Nomber of people
////        System.out.println("Enter number of people:");
////        int people = s.nextInt();
//        //Booking Number
////        booking b = new booking();
////        //Booking
////        
////        res[f]= new booking(room_num ,time, formattedDate, days, room_type, totalPrice, people, b.getBooking_number(), Name , id,ser[f]);
////        System.out.println(res[f].toString());
//    }


    public static void ViewListOfReservation(booking [] res){

        for (int i = 0; i < res.length; i++) {
            if(res[i] != null){

                System.out.println(i +"- "+res[i].list());
            }
        }



    }



}
