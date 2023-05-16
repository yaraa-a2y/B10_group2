
public class customer extends person {

private String address ;   
private int id ;

customer ( String address , int id ){
    this.address = address ;   
    this.id= id ;
}


public String getAddress(){
        return address;
    }
    
    public void setAddress(String address ){
        this.address = address;
    }

public int getId(){
        return id;
    }
    
    public void setId(int id ){
        this.id =id ;
    }
}
