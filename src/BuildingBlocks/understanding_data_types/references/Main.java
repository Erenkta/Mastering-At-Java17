package BuildingBlocks.understanding_data_types.references;

public class Main {
    public static void main(String[] args) {
        Integer age = Integer.valueOf("1"); // age'e bir atadık
        Integer ageButNull = null; // null ataması yapabildik

        int primitive = Integer.parseInt("12"); // bu şekilde kullanımı da var

        // !! Float short ve byte tanımlarken cast yapmamız lazım
        Byte myByte = Byte.valueOf((byte) 1); // gibi

        System.out.println();
    }
}
