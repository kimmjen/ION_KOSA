package homework.day08.Customer;

public class Customer {
    public static int cid = 0;
    private int id;
    private String name, addrss, phone;

    public Customer() {
        this.id = cid++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddrss() {
        return addrss;
    }

    public void setAddrss(String addrss) {
        this.addrss = addrss;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
