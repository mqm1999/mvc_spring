package Model.DTO;

public class Book {
    int id;
    String name;
    String author;
    String category;
    boolean status;
    int amount;

    public Book() {
    }

    public Book(String name) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
        this.status = status;
        this.amount = amount;
    }

    public Book(String name, String author, String category, int amount) {
        this.name = name;
        this.author = author;
        this.category = category;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", status=" + status +
                ", amount=" + amount +
                '}';
    }
}
