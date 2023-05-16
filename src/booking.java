
import java.util.Date;


public class booking {

private int time ; 
private Date date  ;
private room room_type ;
private int price_range ;
private int num_of_people ;
private int booking_number ;

booking (int time ,Date date ,room room_type ,int price_range ,int num_of_people ,int booking_number){
    
    this.time = time;
    this.date = date;
    this.room_type = room_type;
    this.price_range = price_range;
    this.num_of_people = num_of_people;
    this.booking_number = booking_number;
}


  public int getTime(){
        return time;
    }
    
    public void setTime(int time ){
        this.time =time ;
    }
    
    public Date getDate(){
        return date;
    }
    
    public void setDate(Date date ){
        this.date = date;
    }
    
      public room getRoom_type(){
        return room_type;
    }
    
    public void setRoom_type(room room_type ){
        this.room_type =room_type ;
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
        return booking_number;
    }
    
    public void setBooking_number(int booking_number ){
        this.booking_number = booking_number;
    }
}
