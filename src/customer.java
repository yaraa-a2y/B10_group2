
public class customer extends person {

private String address ;   
private int id ;

    public customer(String address, int id, String Name, int Age, int Phone, String Sex, String user_name, String pass_word) {
        super(Name, Age, Phone, Sex, user_name, pass_word);
        this.address = address;
        this.id = id;
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
