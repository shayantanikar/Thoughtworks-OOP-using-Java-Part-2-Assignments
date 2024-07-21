package twAssignment;

public class TestBook {
    public static void main(String[] args) {
        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        // Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()


        // Test Getters and Setters
        javaDummy.setPrice(29.95);
        javaDummy.setQty(28);
        System.out.println("name is: " + javaDummy.getName());
        System.out.println("price is: " + javaDummy.getPrice());
        System.out.println("qty is: " + javaDummy.getQty());


        System.out.println("Authors are: " + javaDummy.getAuthorNames());
        for (Author author : javaDummy.getAuthors()) {
            System.out.println("Author: " + author);
        }

    }
}

