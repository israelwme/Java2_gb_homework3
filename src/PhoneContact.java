import java.util.Objects;

public class PhoneContact implements Contact {
    private String name;
    private String phone;

    public PhoneContact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }

    @Override
    public String toString() {
        return "PhoneContact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}