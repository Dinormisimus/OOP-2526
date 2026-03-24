public class App {

    public static void main(String[] args) {
        // Boolean does not have Boolean.SIZE, Boolean.MIN_VALUE, or Boolean.MAX_VALUE
        showMinMax(Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        showMinMax(Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        showMinMax(Character.TYPE, Character.SIZE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
        showMinMax(Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        showMinMax(Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
        showMinMax(Float.TYPE, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
        showMinMax(Double.TYPE, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
    }

    public static void showMinMax(Class<?> type, int size, Number min, Number max) {
        System.out.printf("type:%-7s size:%-2s min:%-20s max:%s\n", type, size, min, max);
    }

}

/*
Program će ispisati sve tipove primitivnih podataka, njihovu velićinu u bitovima, te
njihovu minimalnu i maximalnu vrijednost. Npr za int. najveća vrijednost iznosi 2147483647 što znaći da
ne možemo u jedan int odnosno u 32 bita spremiti astronomsko velik broj te zbog toga imamo long koji
zauzima 64 bita prostora.
 */