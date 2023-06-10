
// Первый семинар.
//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//Пункты реализовать в методе main
public class Main {
    public static void main (String[] args) {
        int i = (int) (Math.random() * 2000);
        System.out.println(i);

        String convert = Integer.toBinaryString(i);
        int leng = 0;
        int bit = 0;




        if (i == 1) {String convert1 = (new StringBuilder(convert)).insert(0, "000").toString();
            System.out.println(convert1);
            leng = convert1.length();
            bit = convert1.indexOf("1");}
        else {
        if (i == 2 || i == 3) {String convert1 = (new StringBuilder(convert)).insert(0, "00").toString();
            System.out.println(convert1);
            leng = convert1.length();
            bit = convert1.indexOf("1");}

        if (i == 4 || i == 5 || i == 6 || i == 7) {String convert1 = (new StringBuilder(convert)).insert(0, "0").toString();
            System.out.println(convert1);
            leng = convert1.length();
            bit = convert1.indexOf("1");}
        else {leng = convert.length();bit = convert.indexOf("1");System.out.println(convert);}

        }


        int n = leng - bit - 1;


        System.out.println(n);




        int len_arr1 = 32767 - i; // SHORT MAX_VALUE
        int len_arr2 = 32768 - i; // SHORT MIN_VALUE

        int k = 0;
        int[] m1 = new int[len_arr1];
        for (int j = i; j <= 32767; j++) {
        if ((j % n == 0)) {
                m1[k] = j;
                System.out.println(k + " " +m1[k]);
                k++;
                }
         }

                int r = 0;
                int t = -32768;
                int[] m2 = new int[len_arr2];
                while (t != i) {
                    if ((t % n != 0)) {
                        m2[r] = t;
                        System.out.println(r + " " +m2[r]);
                        r++;
                    }
                    t++;
                }


            }






}
   // int res = 0;.
  //while (n != 1) {
         // n >>= 1;
         // res++;
        //  }
         // return res;