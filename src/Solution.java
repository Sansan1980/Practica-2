
    public class Solution {
            public static void main(String[] args) {
           /* 1.2 Переменные
            1 задание
               У вас есть две переменных, в которых хранятся два целочисленных числа. Напишите программу,
               которая выводит в консоль результат деления первого числа на второе с остатком.
               В качестве исходных данных используйте значения для первого числа *– 47, для второго – 13):*
               В результате деления 47 / 13
               Выходит 3 и 8 в остатке
             */
             int integer1 = 47;
             int integer2 = 13;
             double fractionalNumber1 = integer1 + 0.0;
             double fractionalNumber2 = integer2 + 0.0;
             int remainder = integer1 % integer2;

             float a = ( (float) integer1 / integer2);
             float c = ( 47 / 13f);

             double b = ( (float)integer1 / integer2);
             double d = 47.0 / 13.0;
             double e = ( 47 / 13f);
             int result = integer1 / integer2;

             System.out.println("В результате деления двух переменных , "
                     + "integer1 на integer2, выходит "+ result+ " и "+ remainder+ " в остатке ." );
             System.out.println(  " Или a="+a );
             System.out.println(" или b="+ b);
             System.out.println(" или c="+ c);
             System.out.println(" или d=" + d);
             System.out.println(" или e="+e );
                System.out.println(fractionalNumber1 );
                System.out.println(fractionalNumber2 );


                }
            }










