
public class KidUsers extends User implements LibraryUser{


    public KidUsers(int age, String bookType) {
        super(age, bookType);
    }

    @Override
    public void registerAccount() {
        if(super.getAge() <= 12 )
            System.out.println("You have successfully registered under a Kids Account");
        else
            System.out.println("Sorry, Age must be less than 12 to register as a kid");

    }

    @Override
    public void requestBook() {
        if(super.getBookType().equals("Kids"))
            System.out.println("Book Issued successfully, please return the book within 10 days");
        else
            System.out.println("Oops, you are allowed to take only kids books");

    }
}
