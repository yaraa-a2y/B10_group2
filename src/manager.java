
public class manager extends person {


    private int id;
    private double salaray;

    public manager(int id, double salaray, String Name, int Age, int Phone, String Sex, String user_name, String pass_word) {
        super(Name, Age, Phone, Sex, user_name, pass_word);
        this.id = id;
        this.salaray = salaray;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalaray() {
        return salaray;
    }

    public void setSalaray(double salaray) {
        this.salaray = salaray;
    }


}