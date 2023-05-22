
import java.sql.Time;


public class service {
  
   private String TypeOfService ;
   private int price ;
   private Time time ;

    public service(String TypeOfService, int price, Time time) {
        this.TypeOfService = TypeOfService;
        this.price = price;
        this.time = time;
    }


    public String getTypeOfService() {
        return TypeOfService;
    }

    public int getPrice() {
        return price;
    }

    public Time getTime() {
        return time;
    }

    public void setTypeOfService(String TypeOfService) {
        this.TypeOfService = TypeOfService;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTime(Time time) {
        this.time = time;
    }
   
   
    
}
