import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int jogo[][] = new int[2][2];

        int n = 0;

        for(int i = 0; i <= jogo.length; i++){
            for(int j = 0; j <= jogo.length; j++){
                jogo[i][j] = n;
                n ++;
            }
        }
        


        sc.close();
    }
}
