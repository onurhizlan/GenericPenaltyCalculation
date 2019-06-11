/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericpenaltycalculation;

/**
 *
 * @author onur_
 */
public class BookDetails {
    
    private String bookName;
    private String bookRentDate;

    public BookDetails(String bookName, String bookRentDate) {
        this.bookName = bookName;
        this.bookRentDate = bookRentDate;
    }
 
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookRentDate() {
        return bookRentDate;
    }

    public void setBookRentDate(String bookRentDate) {
        this.bookRentDate = bookRentDate;
    }
}
