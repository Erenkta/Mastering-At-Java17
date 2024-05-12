package BuildingBlocks.understanding_package_and_imports.example3;

import java.util.Properties;

public class HelloWorld {
    public static void main(String[] args) {
        Properties props = System.getProperties();
        String myProp = props.getProperty("myProp");
        System.out.println(myProp);
    }
}
