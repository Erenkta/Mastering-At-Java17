package BuildingBlocks.creating_objects;

public class Bird {
    public static void main(String[] args) {
        {
            System.out.println("Inside of a method X : ");
        }
    }

    { // init block
        System.out.println("Outside of a method (initializer)");
        // buradaki çalışmadı
    }
}
