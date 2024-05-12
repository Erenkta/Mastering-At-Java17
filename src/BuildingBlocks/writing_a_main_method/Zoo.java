package BuildingBlocks.writing_a_main_method;

public class Zoo {

    public static void main(String[] args){
        System.out.println("Zoo class'ı derlendi ve çalıştırıldı");
        for(String s : args){
            System.out.println(s);
        }
    }
}

