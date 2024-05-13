package BuildingBlocks.initializing_variables;

public class Main {
    public static void main(String[] args) {
        final int x;
        x = 12;

        final int[] arr = new int[5];
        arr[0] = x;
        arr[1] = x;
        // arr = null hata verir çünkü final

        Person person = new Person();
        System.out.println(person.instanceVar); // null çünkü instance variable'lara java default atama yapar
        // yani initialize yapmadan da kullanabilirim

        int i
                =1;
        var k
                =1;

    }

}


class Person{
    String instanceVar;
}
