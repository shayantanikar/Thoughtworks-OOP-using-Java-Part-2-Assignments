package twAssignment;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;


    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;  // default value
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


    public String getAuthorNames() {
        StringBuilder names = new StringBuilder();
        for (Author author : authors) {
            if (names.length() > 0) {
                names.append(", ");
            }
            names.append(author.getName());
        }
        return names.toString();
    }

    @Override
    public String toString() {
        StringBuilder authorDetails = new StringBuilder();
        for (Author author : authors) {
            if (authorDetails.length() > 0) {
                authorDetails.append(", ");
            }
            authorDetails.append(author.toString());
        }
        return "Book[name=" + name + ",authors={" + authorDetails + "},price=" + price + ",qty=" + qty + "]";
    }
}

