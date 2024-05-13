package BuildingBlocks.understanding_data_types;

public class Main {
    public static void main(String[] args) {
        String textBlock = """
               Bu metni düzenleyen :
                   Eren Nokta
                """;
        System.out.println(textBlock);

        System.out.println("""
                  *
                 * *
                * * *
                """);
        System.out.println("""
                  *
                 * *
                * * *
         """); // soldaki boşluklar bu yüzden önemli

        String block = """
                "doe\"\"\"
                \"deer\"""
                """;
        System.out.println("*"+block+"*");
    }
}
