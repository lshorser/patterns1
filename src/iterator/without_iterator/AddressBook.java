package iterator.without_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * An address book: a list of contacts.
 */
public class AddressBook {

    /** This AddressBook's list of contacts. */
    private List<Contact> contacts;

    /**
     * Constructs a new AddressBook.
     */
    public AddressBook() {
        contacts = new ArrayList<>();
    }


    // This method returns the list of contacts in the address book.
    public List <Contact> getContacts ()
    {
        return this.contacts;
    }


    public void remove (Contact contact)
    {
        this.contacts.remove(contact);
    }

    /**
     * Adds a new contact with last name lastName, first name firstName, email
     * address email, phone number phone, and address address.
     * @param lastName the last name
     * @param firstName the first name
     * @param email the email address
     * @param phone the phone number
     * @param address the address
     */
    public void addContact(String lastName, String firstName,
                           String email, String phone, String address) {
        Contact c = new Contact(lastName, firstName, email, phone, address);
        contacts.add(c);
    }

    /**
     * Returns the number of contacts in this book.
     * @return the number of contacts in this book.
     */
    public int getSize() {
        return contacts.size();
    }

    @Override
    public String toString() {
        String res = "";
        for (Contact c : contacts) {
            res += c;
        }
        return res;
    }

    // Iterator iter = contacts.iterator();
    // while(iter.hasNext())
    // res += iter.next().toString();

}