
public class AdultUser extends User implements LibraryUser{


    public AdultUser(int age, String bookType) {
        super(age, bookType);
    }

    @Override
    public void registerAccount() {
        if(super.getAge() > 12)
            System.out.println("You have successfully registered under an Adult Account");
        else
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
    }

    @Override
    public void requestBook() {
        if(super.getBookType().equals("Fiction"))
            System.out.println("Book Issued successfully, please return the book within 7 days");
        else
            System.out.println("Oops, you are allowed to take only adult Fiction books");

    }
}
