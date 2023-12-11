
    public class Solution {
            public static void main(String[] args) {
                // цикл while
                //String solution =  "Хочешь - решай задачи, не хочешь - решай нехотя";
                /*int a = 16;
                while (a >= 0) {
                    System.out.println(solution);
                    a --;
                }*/
               /* int count = 1;
                while (true) {
                    System.out.println("Строка №" + count);
                    System.out.println(solution);
                    if (count > 16) {
                        break;
                    }
                    count = count + 1; // Без наращивания цикл будет выполняться вечно
                }
               */
              //  Цикл do..while
               /* int a = 1;
                do {
                    System.out.println("Строка №" + a);
                    System.out.println(solution);
                    a ++;
                } while (a <= 16); */

              //  Цикл for

                   /* for (int a = 1; a <= 25; a++) {
                        System.out.println("Строка №" + a );
                        System.out.println(solution);
                    */

               /* String[] daysOfWeek =
                        { "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье" };


                for (String dayOfWeek : daysOfWeek) {
                   System.out.println(dayOfWeek);
                }
               */


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
             //int remainder = 47%13;
             float remainder ( 47/100 )*13f;
             double result = integer1 / integer2;
             System.out.println("В результате деления двух переменных , integer1 на integer2, выходит "+ result+ " и "+ remainder+ " в остатке ." );


                }
            }










