import java.util.Calendar;

public class Card extends Student{
    private String code;
    private int bookstoreNumber;
    private String borrowedDay;
    private Calendar payDay;


    public Card(String name, int age, String class_, String code, int bookstoreNumber, String borrowedDay,
            Calendar payDay) {
        super(name, age, class_);
        this.code = code;
        this.bookstoreNumber = bookstoreNumber;
        this.borrowedDay = borrowedDay;
        this.payDay = payDay;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    
    public int getBookstoreNumber() {
        return bookstoreNumber;
    }
    public void setBookstoreNumber(int bookstoreNumber) {
        this.bookstoreNumber = bookstoreNumber;
    }
    public String getBorrowedDay() {
        return borrowedDay;
    }
    public void setBorrowedDay(String borrowedDay) {
        this.borrowedDay = borrowedDay;
    }
    public Calendar getPayDay() {
        return payDay;
    }
    public void setPayDay(Calendar payDay) {
        this.payDay = payDay;
    }

    @Override
    public String toString() {
        return  "information of card [ Borrowed day: " + borrowedDay + ", Pay day: " + payDay + ", Bookstore number: " + bookstoreNumber + super.toString();
    }

}
