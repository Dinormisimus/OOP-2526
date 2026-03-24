public class Zadatak7{
    public static void main(String[] args){
        int[][] niz = {
            {-10,-5,3,2},
            {22,61,124,8},
            {9,102,11,123}
        };
        int max = niz[0][0];
        for(int i = 0; i < niz.length; i++){
            for(int j = 0; j < niz[i].length;j++ ){
                if(niz[i][j] > max){
                    max = niz[i][j];
                }

            }
        }
        System.out.println("Najveći element u 2D listi je: " + max);
    }

}