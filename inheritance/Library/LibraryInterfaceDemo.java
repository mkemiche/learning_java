
public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        KidUsers kid =  new KidUsers(10, "Kids");
        KidUsers kid2 =  new KidUsers(18, "Fiction");

        AdultUser adult =  new AdultUser(5, "Kids");
        AdultUser adult2 =  new AdultUser(23, "Fiction");

        System.out.println(kid);
        System.out.println(kid2);
        System.out.println(adult);
        System.out.println(adult2);
        System.out.println("\n");

        kid.registerAccount();
        kid.requestBook();
        System.out.println("\n");

        kid2.registerAccount();
        kid2.requestBook();
        System.out.println("\n");

        adult.registerAccount();
        adult.requestBook();
        System.out.println("\n");

        adult2.registerAccount();
        adult2.requestBook();


    }
}
