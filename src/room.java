
public class room {
  
    
    private int room_id ;
    private String room_type ;
    private String room_description ;
    private int room_price ;
    private int NumOfcustomer; 

    public room(int room_id, String room_type, String room_description, int room_price, int NumOfcustomer) {
        this.room_id = room_id;
        this.room_type = room_type;
        this.room_description = room_description;
        this.room_price = room_price;
        this.NumOfcustomer = NumOfcustomer;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public String getRoom_description() {
        return room_description;
    }

    public void setRoom_description(String room_description) {
        this.room_description = room_description;
    }

    public int getRoom_price() {
        return room_price;
    }

    public void setRoom_price(int room_price) {
        this.room_price = room_price;
    }

    public int getNumOfcustomer() {
        return NumOfcustomer;
    }

    public void setNumOfcustomer(int NumOfcustomer) {
        this.NumOfcustomer = NumOfcustomer;
    }
    
    
    @Override
    public String toString() {
        return " \n-------------------------------------------------------------------\n"+"room_id : " + room_id + "\n room_type : " + room_type + 
                "\n room_description : " + room_description + "\n room_price : " + room_price + "\n NumOfcustomer :"+NumOfcustomer ;
    }
}
