package poglavlje3nizovi;

//Ručno dodjeljivanje različitog broja elemenata u drugoj dimenziji
public class DvodimenzionalniNiz2 {

    public static void main(String[] args) {

        int dvoD[][] = new int[4][];
        dvoD[0] = new int[1];
        dvoD[1] = new int[2];
        dvoD[2] = new int[3];
        dvoD[3] = new int[4];

        int i, j, k = 0;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                dvoD[i][j] = k;
                k++;
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(dvoD[i][j] + " ");
            }
            System.out.println();

        }
    }
}
