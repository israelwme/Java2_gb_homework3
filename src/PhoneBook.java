import java.util.ArrayList;
import java.util.List;

public class PhoneBook implements ContactBook {

    List<Contact> book;

    public PhoneBook() {
        this.book = new ArrayList<>();
    }

    @Override
    public void add(Contact contact) {
        book.add(contact);
    }

    @Override
    public List<Contact> get(String name) {
        List<Contact> filteredBook = new ArrayList<>();

        for (Contact contact : book) {
            if (contact.getName().contains(name)) {
                filteredBook.add(contact);
            }
        }

        return filteredBook;
    }
}