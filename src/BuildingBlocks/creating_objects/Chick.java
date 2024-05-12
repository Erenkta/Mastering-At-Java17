package BuildingBlocks.creating_objects;

public class Chick {
    String name = "Fluffy";
    {
        System.out.println(name);
        name = "outer block has changed the name";
        System.out.println(name);
    };
    public Chick(){
        name = "Name has changed";
        System.out.println(name);
    }
    public static void main(String[] args) {
        Chick chick = new Chick();

    }
}
