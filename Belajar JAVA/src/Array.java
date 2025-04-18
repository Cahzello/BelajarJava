public class Array {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        String[] stringArray2 = new String[3];

        stringArray[0] = "Rizky";
        stringArray[1] = "Rasya";
        stringArray[2] = "Maheswara";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Mobil";

        System.out.println(stringArray[0]);

        String[] namaNama = {
            "Rizky", "Rasya", "Maheswara"
        };

        namaNama[0] = null;

        int[] arrayInt = new int[]{
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        System.out.println(arrayLong.length);

        arrayLong[0] = 0;

        String[][] bandMate = {
                {"Rizky", "Rasya", "Maheswara"},
                {"Toyama", "Kasumi"},
                {"Yukina", "Minato"}
        };

        System.out.println(bandMate[1][0]);


    }
}
