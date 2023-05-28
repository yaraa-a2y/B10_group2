
import java.text.SimpleDateFormat;
import java.util.Date;


public class booking {

private int time ; 
private String date  ;
private int room_type ;
private int days ;
private int price_range ;
private int num_of_people ;
static int booking_number ;

booking (int time ,String date ,int days,int room_type ,int price_range ,int num_of_people ,int booking_number){
    
    this.time = time;
    this.date = date;
    this.room_type = room_type;
    this.days = days;
    this.price_range = price_range;
    this.num_of_people = num_of_people;
    this.booking_number = booking_number;
}

    public booking() {
    }



  public int getTime(){
        return time;
    }
    
    public void setTime(int time ){
        this.time =time ;
    }
    
    public String getDate(){
        return date;
    }
    
    public void setDate(String date ){
        this.date = date;
    }
    
      public int getRoom_type(){
        return room_type;
    }
    
    public void setRoom_type(int room_type ){
        this.room_type =room_type ;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    
    public int getPrice_range(){
        return price_range;
    }
    
    public void setPrice_range(int price_range ){
        this.price_range = price_range;
    }
    
      public int getNum_of_people(){
        return num_of_people;
    }
    
    public void setNum_of_people(int num_of_people ){
        this.num_of_people =num_of_people ;
    }
    
    public int getBooking_number(){
        
        return ++booking_number;
    }
    
    public void setBooking_number(int booking_number ){
       this.booking_number = booking_number;
    }
    


    @Override
    public String toString() {
        return "\nbooking infomation \n" + " The starting time for the booking day is " + time +" o'clock"+ "\n Date= " + date + "\n Room type= " + room_type + "\n Number of days= " + days + "\n Total price= " + price_range + "\n Number of people= " + num_of_people + "\n Booking number= " + booking_number +"\n****************************************************************";
    }
    
    
}
