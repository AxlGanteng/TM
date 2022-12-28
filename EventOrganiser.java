import java.util.ArrayList;

public class EventOrganiser {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    private String nama;
    private String addres;
    private String email;
    private int phone;
    public void PrintGuest(){
        System.out.println("ID : "+this.getId());
        System.out.println("NAME : "+this.getNama());
        System.out.println("ADDRESS : "+this.getAddres());
        System.out.println("EMAIL : "+this.getEmail());
        System.out.println("NUMBER PHONE : "+this.getPhone());
    }
    ArrayList<EventOrganiser> axl = new ArrayList<>();
    public EventOrganiser(String s, String ida, String procot, String email, String s1){
    }
    public EventOrganiser(int id, String nama, String addres, String email, int phone){
        this.id=id;
        this.nama=nama;
        this.addres=addres;
        this.email=email;
        this.phone=phone;
    }
}