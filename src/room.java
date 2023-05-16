
public class room {
  
    
    private int room_id ;
    private String room_type ;
    private String room_description ;
    private int room_number ;
    
    
    room(int room_id , String room_type , String room_description ,int room_number ){
        
    this.room_id= room_id ;
    this.room_type= room_type ;
    this.room_description= room_description ;
    this.room_number= room_number ;
    }
    
    public int getRoom_id(){
        return room_id;
    }
    
    public void setRoom_id(int room_id ){
        this.room_id =room_id ;
    }
    
    public String getRoom_type(){
        return room_type;
    }
    
    public void setRoom_type(String room_type ){
        this.room_type = room_type;
    }
    
   public String getRoom_description(){
        return room_description;
    }
    
    public void setRoom_description(String room_description ){
        this.room_description = room_description;
    }
    
    public int getRoom_number(){
        return room_number;
    }
    
    public void setRoom_number(int room_number ){
        this.room_number =room_number ;
    }
}
