


public class service {

    private String TypeOfService;
    private int price;

    public service(String TypeOfService, int price) {
        this.TypeOfService = TypeOfService;
        this.price = price;
    }

    public String getTypeOfService() {
        return TypeOfService;
    }

    public int getPrice() {
        return price;
    }


    public void setTypeOfService(String TypeOfService) {
        this.TypeOfService = TypeOfService;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Service Type : " + TypeOfService + ", Price : " + price;
    }
}
   
   
   
   

