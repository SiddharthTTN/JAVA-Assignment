import com.hibernate.demo.Address;
import com.hibernate.demo.Author;
import com.hibernate.demo.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author();
        Author author2 = new Author();
        Author author3 = new Author();
        Author author4 = new Author();
        author1.setFirstName("Siddharth");
        author2.setFirstName("Gaurav");
        author3.setFirstName("Vishakha");
        author4.setFirstName("Yatin");
        author1.setLastName("Gupta");
        author2.setLastName("Gandhi");
        author3.setLastName("Sharma");
        author4.setLastName("Ajmani");
        author1.setAge(21);
        author2.setAge(22);
        author3.setAge(24);
        author4.setAge(23);
        author1.setDob(new Date());
        author2.setDob(new Date());
        author3.setDob(new Date());
        author4.setDob(new Date());

        Address address1 = new Address();
        Address address2 = new Address();
        Address address3 = new Address();

        address1.setStreetNumber(112);
        address1.setLocation("Noida");
        address1.setState("UP");
        address2.setStreetNumber(11);
        address2.setLocation("Faridabad");
        address2.setState("Haryana");
        address3.setStreetNumber(101);
        address3.setLocation("Gurugram");
        address3.setState("Haryana");

        author1.setAddress(address1);
        author2.setAddress(address2);
        author3.setAddress(address2);
        author4.setAddress(address3);

        List<String> subject1 = Arrays.asList("Java", "PHP", "Python", "Spring");
        List<String> subject2 = Arrays.asList("Java", "Python", "Spring");
        author1.setSubjects(subject1);
        author2.setSubjects(subject2);
        author3.setSubjects(subject2);
        author4.setSubjects(subject2);

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        Book book5 = new Book();
        Book book6 = new Book();
        Book book7 = new Book();
        Book book8 = new Book();

        book1.setBookName("Book 1");
        book2.setBookName("Book 2");
        book3.setBookName("Book 3");
        book4.setBookName("Book 4");
        book5.setBookName("Book 5");
        book6.setBookName("Book 6");
        book7.setBookName("Book 7");
        book8.setBookName("Book 8");


     /*   author1.setBook(book1);
        author2.setBook(book2);
        author3.setBook(book3);
        author4.setBook(book4);*/

        List<Book> bookList= new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        author1.setBookList(bookList);
        author2.setBookList(bookList);

/*        author1.setBookList(bookList);
        author2.setBookList(bookList);
        author3.setBookList(bookList);
        author4.setBookList(bookList);*/

/*        book1.setAuthor(author1);
        book2.setAuthor(author1);
        book3.setAuthor(author1);*/

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        //Inserting Data
//        session.persist(author1);
        session.save(author1);
        session.save(author2);
        session.save(author3);
        session.save(author4);
        session.save(book1);
        session.save(book2);
        session.save(book3);
        session.save(book4);


/*        //Reading Data
        Author authorToRead = session.get(Author.class, 2);
        System.out.println(authorToRead);

        //Updating Data
        Author authorToUpdate = session.get(Author.class, 2);
        authorToUpdate.setFirstName("Updated Name");
        System.out.println(authorToUpdate);

        //Deleting Data
        Author authorToDelete = session.get(Author.class, 3);
        session.delete(authorToDelete);*/

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}
