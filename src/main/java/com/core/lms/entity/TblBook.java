package com.core.lms.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tblBook")
public class TblBook extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookID;
    private String bookCode;
    private String bookName;
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "authorTypeDetailID", referencedColumnName = "typeDetailID")
    private MstTypeDetail authorTypeDetailID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bookCategoryTypeDetailID", referencedColumnName = "typeDetailID")
    private MstTypeDetail bookCategoryTypeDetailID;
    private Boolean isBookAvailable;
    private Integer totalBook;
    private Integer availableBook;
    private Double rentCharge;
    private Double sellCharge;

    public Integer getBookID() {
        return bookID;
    }

    public void setBookID(Integer bookID) {
        this.bookID = bookID;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MstTypeDetail getAuthorTypeDetailID() {
        return authorTypeDetailID;
    }

    public void setAuthorTypeDetailID(MstTypeDetail authorTypeDetailID) {
        this.authorTypeDetailID = authorTypeDetailID;
    }

    public MstTypeDetail getBookCategoryTypeDetailID() {
        return bookCategoryTypeDetailID;
    }

    public void setBookCategoryTypeDetailID(MstTypeDetail bookCategoryTypeDetailID) {
        this.bookCategoryTypeDetailID = bookCategoryTypeDetailID;
    }

    public Boolean getBookAvailable() {
        return isBookAvailable;
    }

    public void setBookAvailable(Boolean bookAvailable) {
        isBookAvailable = bookAvailable;
    }

    public Integer getTotalBook() {
        return totalBook;
    }

    public void setTotalBook(Integer totalBook) {
        this.totalBook = totalBook;
    }

    public Integer getAvailableBook() {
        return availableBook;
    }

    public void setAvailableBook(Integer availableBook) {
        this.availableBook = availableBook;
    }

    public Double getRentCharge() {
        return rentCharge;
    }

    public void setRentCharge(Double rentCharge) {
        this.rentCharge = rentCharge;
    }

    public Double getSellCharge() {
        return sellCharge;
    }

    public void setSellCharge(Double sellCharge) {
        this.sellCharge = sellCharge;
    }
}
