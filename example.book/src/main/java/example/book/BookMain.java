package example.book;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class BookMain {

    private static final String BOOKSTORE_XML = "./bookstore-jaxb.xml";

    public static void main(String[] args) throws JAXBException, IOException {

        var bookList = new ArrayList<Book>();

        // create books
        var book1 = new Book("978-0060554736","The Game","Neil Strauss","Harpercollins");
        bookList.add(book1);

        var book2 = new Book("978-3832180577","Feuchtgebiete","Charlotte Roche","Dumont Buchverlag");
        bookList.add(book2);

        // create bookstore, assigning book
        var bookstore = new Bookstore("Fraport Bookstore","Frankfurt Airport",bookList);

        // create JAXB context and instantiate marshaller
        JAXBContext context = JAXBContext.newInstance(Bookstore.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        // Write to System.out
        m.marshal(bookstore, System.out);

        // Write to File
        m.marshal(bookstore, new File(BOOKSTORE_XML));

        // get variables from our xml file, created before
        System.out.println();
        System.out.println("Output from our XML File: ");
        Unmarshaller um = context.createUnmarshaller();
        Bookstore bookstore2 = (Bookstore) um.unmarshal(new FileReader(
                BOOKSTORE_XML));
        List<Book> list = bookstore2.bookList();
        for (Book book : list) {
            System.out.println("Book: " + book.name() + " from "
                    + book.author());
        }
    }
}