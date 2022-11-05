import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true){

            System.out.println("Sıra bende, ...( T, K, M) giriniz: veya oyundan çıkmak isterseniz X yazınız");
            String ben = in.nextLine().toUpperCase();

            if (ben.equals("X")){
                break;
            }


            if (!ben.equals("T") && !ben.equals("K") && !ben.equals("M")) {
                System.out.println("Girdiğiniz harf doğru değildir");
            }else {

                System.out.println("Sıra sende, ...( T, K, M) giriniz: ");
                String sen = in.nextLine().toUpperCase();

                if (ben.equals(sen)) {
                    System.out.println("BERABERE");
                } else if (((ben.equals("T")) && (sen.equals("M"))) || ((ben.equals("M")) && (sen.equals("K"))) || ((ben.equals("K")) && (sen.equals("T")))) {
                    System.out.println("Ben KAZANDIM");
                }else {
                    System.out.println("Sen KAZANDIN");
                }

            }


        }

        System.out.println("Oyun için Teşekkürler, Yine bekleriz");

    }
}
