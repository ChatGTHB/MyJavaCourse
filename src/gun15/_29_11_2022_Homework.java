package gun15;

import java.util.Scanner;

public class _29_11_2022_Homework {
    public static void main(String[] args) {

// 1- 0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız.
// _Not: 0 ve 100 dahildir._

        int total = 0;
        for (int i = 0; i <= 100; i += 2) {
            total += i;
        }
        System.out.println("Total = " + total);


// 2- 0 ile 100 arasındaki bütün tek sayıları yazdırabileceğiniz bir kod yazınız.

        int total2 = 0;
        for (int i = 1; i < 100; i += 2) {
            total2 += i;
        }
        System.out.println("Total = " + total2);


// 3- # 100'den 0'a kadar bütün tek sayıları yazdırınız.
//`100 ve 0 dahil değildir.`

        int total3 = 0;
        for (int i = 99; i > 0; i -= 2) {
            total3 += i;
        }
        System.out.println("Total = " + total3);


// 4- #  İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.
//`İlk 10 doğal sayı: 1,2,3,4,5,6,7,8,9,10`

        int total4 = 0;
        for (int i = 1; i <= 10; i++) {
            total4 += i;
        }
        System.out.println("Total = " + total4);

/* 5- **0 ile 100** arasındaki sayıları kapsayan bir kod yazınız.

Bu kod bu sayıların tek mi çift mi olduğunu belirleyebilecek bir kod olmalı.

Eğer sayı çift sayıysa; **This number is even and number is 0**

Eğer sayı tek sayıysa; **This number is odd and number is 1** yazdırmalıdır.

`Sonuç böyle olmalıdır.`
```
This number is even and number is 0
This number is odd and number is 1
This number is even and number is 2
This number is odd and number is 3
```*/
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println("This number is odd and number is " + i);
            } else {
                System.out.println("This number is even and number is " + i);
            }
        }

/* 6- # 0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.
   `Sonuç bu şekilde olmalıdır.`
```
0
20
40
60
80
100
```*/

        for (int i = 0; i <= 100; i++) {
            if (i % 4 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }


/* 7- #  Uzunluk ve genişliğini yazan kişinin belirlediği,
      # bütünü oluşturabileceğiniz bir kod yazınız.

_örn:

_length(uzunluk): 7_

_width(genişlik): 5_

_Output:_

#####

#####

#####

#####

#####

#####

#####
*/

        Scanner input = new Scanner(System.in);

        System.out.print("Enter length : ");
        int length = input.nextInt();

        System.out.print("Enter width : ");
        int width = input.nextInt();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println();

        }

/* 8- # _Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız._
Sonuç böyle olmalıdır.

        * 4  1
      * * 3  2
    * * * 2  3
  * * * * 1  4
* * * * * 0  5

*/
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


/* 9- # _Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız._
  Sonuç böyle olmalıdır;

       *
      * *
     * * *
    * * * *
   * * * * *

*/
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

// 10 - # do while loop kullanınız.
// > 0 ile 30 arasındaki bütün çift sayıları yazdırınız.

        int number = 0;
        do {
            System.out.println(number);
            number += 2;
        } while (number <= 30);


    }
}