import java.util.List;

public interface ContactBook {
    void add(Contact contact);
    List<Contact> get(String name);
}