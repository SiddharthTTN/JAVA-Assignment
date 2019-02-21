public class Ques1 extends BookDetails implements Action
{

    String bookName;
    String issuerName;
    int bookID;
    int issuerID;
    public void addBook(String bookName,int bookID)
    {
        this.bookName=bookName;
        this.bookID=bookID;
    }
    public void assignIssuer(String issuerName,int issuerID)
    {
        this.issuerName=issuerName;
        this.issuerID=issuerID;
    }
    public void removeIssuer()
    {
        System.out.println("Removing the issuer of book ID: " + this.bookID );
        issuerID= 0;
        issuerName=null;
    }

    @Override
    public String toString() {
        return "Ques1{" +
                " bookID=" + bookID +
                ", bookName='" + bookName + '\'' +
                ", issuerID=" + issuerID +
                ", issuerName='" + issuerName + '\'' +
                '}';
    }
}

