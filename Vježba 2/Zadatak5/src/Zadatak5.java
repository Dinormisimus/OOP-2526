public class Zadatak5{
  public static void main(String[] args){
      int[][] niz = {
              {1, 125855, 105625},
              {2, 284569, 155748},
              {3, 324152, 198455},
              {4, 204563, 195251},
              {5, 452198, 257654},
              {6, 471326, 322188},
              {7, 505169, 355748},
              {8, 498569, 315782},
              {9, 367163, 389455},
              {10, 289568, 302369},
              {11, 115255, 109854},
              {12, 98544, 85223}
      };

      int sum = 0;
      int counter = 0;
      for(int i = 0;i < niz.length; i++){
          int profit = niz[i][1] - niz[i][2];
          System.out.println("Profit za " + (i+1) + ". mjesec je: " + profit);
          sum += profit; counter++;
      }

      double prosjek = sum/counter;

      System.out.println("Prosječna dobit tvrtke je: " + prosjek);
  }
}