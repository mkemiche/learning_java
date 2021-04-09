
public  class Monster {

    private String name;

    public Monster() {
        System.out.println("I don't know this attack !");
    }

    public Monster(String name) {
        this.name = name;
    }

    public  String attack(){
        return "I don't know this attack !";
    }
}
