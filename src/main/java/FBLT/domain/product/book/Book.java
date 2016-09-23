package FBLT.domain.product.book;

import FBLT.domain.product.category.Category;

/**
 * Created by kraluk01 on 9/23/2016.
 */
public class Book implements IBook {

    private Long productId;
    private Category category;
    private String description;
    private String title;
    private String isbn;
    private String genre;

    private Book()
    {

    }

    private Book(Builder value){

        this.productId = value.productId;
        this.category = value.category;
        this.description = value.description;
        this.title = value.title;
        this.isbn = value.isbn;
        this.genre = value.genre;
    }

    @Override
    public Long getProductId() {
        return productId;
    }

    @Override
    public Category getCategory() {
        return category;
    }

    @Override
    public String getProductDescription() {
        return description;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getISBN() {
        return isbn;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    public static class Builder {

        private Long productId;
        private Category category;
        private String description;
        private String title;
        private String isbn;
        private String genre;

        public Builder() {

        }

        public Book.Builder productID(Long value) {
            this.productId = value;
            return this;
        }

        public Book.Builder category(Category value) {
            this.category= value;
            return this;
        }

        public Book.Builder productDescription(String value) {
            this.description = value;
            return this;
        }

        public Book.Builder productTitle(String value) {
            this.title = value;
            return this;
        }

        public Book.Builder productISBN(String value) {
            this.isbn = value;
            return this;
        }

        public Book.Builder productGenre(String value) {
            this.genre = value;
            return this;
        }

        public Book.Builder copy(Book value) {
            this.productId = value.productId;
            this.category = value.category;
            this.description = value.description;
            this.title = value.title;
            this.isbn = value.isbn;
            this.genre = value.genre;
            return this;
        }

        public Book build() {

            return new Book(this);
        }
    }
}