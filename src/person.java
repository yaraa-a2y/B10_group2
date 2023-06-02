
public class person {

    private String Name;
    private int Age;
    private int Phone;
    private String Sex;
    private String user_name;
    private String pass_word;

    public person(String Name, int Age, int Phone, String Sex, String user_name, String pass_word) {
        this.Name = Name;
        this.Age = Age;
        this.Phone = Phone;
        this.Sex = Sex;
        this.user_name = user_name;
        this.pass_word = pass_word;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPass_word() {
        return pass_word;
    }

    public void setPass_word(String pass_word) {
        this.pass_word = pass_word;
    }


}
