
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

                String[] daysOfWeek =
                        { "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье" };


                for (String dayOfWeek : daysOfWeek) {
                    System.out.println(dayOfWeek);
                }

                }
            }










