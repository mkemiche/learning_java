
public class User {

    private int age;
    private String bookType;

    public User(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    public int getAge() {
        return age;
    }

    public String getBookType() {
        return bookType;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", bookType='" + bookType + '\'' +
                '}';
    }
}
