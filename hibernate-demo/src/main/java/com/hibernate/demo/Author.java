package com.hibernate.demo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Author {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy = GenerationType.TABLE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UID")
    private Integer id;

    @Column(name = "First_Name")
    private String firstName;

    @Transient
    private String lastName;

    @Column(name = "Age")
    private Integer age;

    @Temporal(TemporalType.DATE)
    @Column(name = "DOB")
    private Date dob;

    @Embedded
    private Address address;

    @ElementCollection
    List<String> subjects = new ArrayList<>();

/*    @OneToOne
    @JoinColumn(name = "Book_Author_Join_Column")
  Book book;
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }*/

    //    @OneToMany
//    @JoinTable(joinColumns = @JoinColumn(name = "Author_ID")
//            , inverseJoinColumns = @JoinColumn(name = "Book_ID"))


//    @OneToMany(cascade = CascadeType.PERSIST)
    @ManyToMany
    List<Book> bookList = new ArrayList<Book>();

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", address=" + address +
                '}';
    }
}
