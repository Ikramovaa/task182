public class Main {
    public static void main(String[] args) {

        Capitals [] capitals=Capitals.values();
        for (Capitals capitals1:capitals){
            System.out.println(capitals1.getCountry());
        }
        System.out.println(Capitals.WASHINGTON);


       
    }
}