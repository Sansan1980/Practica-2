# Practica-2
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
             int remainder = integer1 % integer2;

             float a = (float)( integer1 / integer2);
             float c = ( 47 / 13f);

             double b = ( integer1 / integer2);
             double d = ( 47 / 13);
             double e = ( 47 / 13f);
             int result = integer1 / integer2;

             System.out.println("В результате деления двух переменных , "
                     + "integer1 на integer2, выходит "+ result+ " и "+ remainder+ " в остатке ." );
             System.out.println(  " Или a="+a );
             System.out.println(" или b="+ b);
             System.out.println(" или c="+ c);
             System.out.println(" или d=" + d);
             System.out.println(" или e="+e );

        
              }
            }

           Вопрос что не таак с назначением переменных.? почему в каком то случае значения выводяться после
           точки в каком то  округляется . хотя типы переменных и значения те же самые.
            
C:\Users\user\.jdks\corretto-17.0.9\bin\java.exe "-javaagent:C:\Users\user\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2023.2.5\lib\idea_rt.jar=55232:C:\Users\user\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2023.2.5\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\user\IdeaProjects\Practica 2\out\production\Practica 2" Solution
В результате деления двух переменных , integer1 на integer2, выходит 3 и 8 в остатке .
 Или a=3.0
 или b=3.0
 или c=3.6153846
 или d=3.0
 или e=3.615384578704834

Process finished with exit code 0
