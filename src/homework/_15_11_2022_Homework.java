package homework;

import java.util.Scanner;

public class _15_11_2022_Homework {
    public static void main(String[] args) {


// 1)- **I love java** olan bir String oluşturun. Bu cümlenin toplam karakter sayısını yazdırın.

        String love = "I love java";
        System.out.println("love.length() = " + love.length());

// 2)- **Sprint planning** olan bir String oluşturun. Bu dizenin _toplam karakter sayısını_ yazdırın.

        String plan = "Sprint planning";
        System.out.println("plan.length() = " + plan.length());

// 3)-  **apple** olan bir String oluşturun. String'in _içinde_ **app** olup olmadığını **doğrula**.

        String apple = "apple";
        System.out.println("apple.contains(app) = " + apple.contains("app"));

// 4)- **orange** kelimesinden oluşan bir String oluşturun. String'in **Apple**'a _eşit_ olup olmadığını doğrulayın.

        String orange = "orange";
        System.out.println("orange.equals(\"Apple\") = " + orange.equals("Apple"));

/* 5)- **apple**  olan  bir String oluşturun. String'in **apple**'a _eşit_ olup olmadığını doğrulayın.
       Büyük harf veya küçük harf önemli değildir._*/

        String apple2 = "apple";
        System.out.println("apple2.equalsIgnoreCase(\"apple\") = " + apple2.equalsIgnoreCase("apple"));

/* 6)- **Florida** kelimesinden bir String oluşturun.
       Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın.*/

        String florida = "Florida";
        System.out.println("florida.indexOf(\"o\") = " + florida.indexOf("o"));

/* 7)- **Thank you** olan bir String oluşturun.
       Thank you içindeki, sadece  **'y'** harfinin bulunduğu _konumu_ yazdırın.*/

        String thanks = "Thank you";
        System.out.println("thanks.indexOf(\"y\") = " + thanks.indexOf("y"));

        /* 8)- **Main method** oluşturun.
         **Mouse** değerinde bir String oluştur. Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.*/

        // public static void main(String[] args) {}
        String mouse = "Mouse";
        System.out.println("mouse.charAt(2) = " + mouse.charAt(2));

// 9)- **paper** olan bir String oluşturun. String'i _büyük harfe_ çevirin ve yazdırın. örn: apple > APPLE*/

        String paper = "paper";
        System.out.println("paper.toUpperCase() = " + paper.toUpperCase());

// 10)- **OraNge** olan bir String oluşturun. String'i _küçük harfe_ çevirin ve yazdırın. örn: APPLE > apple

        String orange2 = "OraNge";
        System.out.println("orange2.toLowerCase() = " + orange2.toLowerCase());

// 11- **New Jersey** olan bir String oluşturun. String'i _büyük harfe_ çevirin ve yazdırın

        String jersey = "New Jersey";
        System.out.println("jersey.toUpperCase() = " + jersey.toUpperCase());

// 12- **New York** olan bir String oluşturun.String'i _küçük harfe_ çevirin ve yazdırın.

        String york = "New York";
        System.out.println("york.toLowerCase() = " + york.toLowerCase());

// 13- **PADDLE** olan bir String oluşturun. String'i _küçük harfe_ çevirin ve yazdırın.

        String paddle = "PADDLE";
        System.out.println("paddle.toLowerCase() = " + paddle.toLowerCase());

// 14- **apple** olan bir String oluşturun. String'in _içinde_ **app** olup olmadığını **doğrula**.

        String apple3 = "apple";
        System.out.println("apple3.contains(\"app\") = " + apple3.contains("app"));

// ----------------------------------

// Özel sorular

// 1)- Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = input.nextLine();

        System.out.print("Enter your surname : ");
        String surname = input.nextLine();

        String nameSurname = name + " " + surname;
        System.out.println("nameSurname = " + nameSurname);

// 2- Girilen bir kelimenin boş(Blank) olup olmadığını yazdırınız

        Scanner input1 = new Scanner(System.in);

        System.out.print("Enter a word : ");
        String word = input1.nextLine();

        System.out.println("word.isEmpty() = " + word.isEmpty());

// 3- girilen bir cümledeki A harfi sayısını bulunuz.(Büyük küçük harf ayırımı olmadan)

        Scanner input2 = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String _sentence = input2.nextLine();

        int lenght = _sentence.length();

        String _sentenceWithoutA = _sentence.replaceAll("[Aa]", "");

        int _lenghtWithoutA = _sentenceWithoutA.length();

        int numberOfA = (lenght - _lenghtWithoutA);
        System.out.println("Number of A in Sentence (without case distinction) : " + numberOfA);


// 4- girilen bir kelimenin ilk ve son harfini bulunuz.

        Scanner input3 = new Scanner(System.in);

        System.out.print("Enter a vocable : ");
        String vocable = input3.nextLine();

        char firstLetter = vocable.charAt(0);

        char lastLetter = vocable.charAt(vocable.length() - 1);

        System.out.println("firstLetter = " + firstLetter);
        System.out.println("lastLetter = " + lastLetter);

// 5- girilen bir cümledeki ilk kelimeyi yazdırınız

        Scanner input4 = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence2 = input4.nextLine();

        int boslukIndex = sentence2.indexOf(" ");

        String firstWord = sentence2.substring(0, boslukIndex);
        System.out.println("firstWord = " + firstWord);

// 6- girilen en az 3 kelimelik bir cümledeki ilk iki kelimeyi yazdırınız

        Scanner input5 = new Scanner(System.in);

        System.out.print("Enter a sentence with at least three words : ");
        String sentence1 = input5.nextLine();

        int firstSpaceIndex = sentence1.indexOf(" ");

        String sentence1a = sentence1.replaceFirst(" ", "X");

        int secondSpace = sentence1a.indexOf(" ");

        String firstTwoWords = sentence1.substring(0, secondSpace);
        System.out.println("firstTwoWords = " + firstTwoWords);

// 7- Girilen bir cümlede kaç kelime olduğunuz bulunuz.

        Scanner input6 = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String _sentence_ = input6.nextLine();

        int lenght_ = _sentence_.length();

        String _sentence_WithoutSpace = _sentence_.replace(" ", "");

        int lenghtWithoutSpace = _sentence_WithoutSpace.length();

        int numberOfSpace = (lenght_ - lenghtWithoutSpace);

        int numberOfWord = (numberOfSpace + 1);

        System.out.println("Number of words in the sentence : " + numberOfWord);

// 8- Girilen bir cumledeki kelimelerin ilk harflerini yazdırınız ???

        Scanner input7 = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence = input.nextLine();

        System.out.println("The first letters of the words : " + sentence.replaceAll("\\B\\S", ""));


// 9- 3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.

        Scanner input8 = new Scanner(System.in);

        System.out.print("Enter your name and surname consisting of three words : ");
        String name_Surname = input8.nextLine();

        int ilkBoslukIndex = name_Surname.indexOf(" ");

        int sonBoslukIndexx = name_Surname.lastIndexOf(" ");

        String shortening = name_Surname.substring(0, 1) + "."
                + name_Surname.substring(ilkBoslukIndex + 1, ilkBoslukIndex + 2) + "."
                + name_Surname.substring(sonBoslukIndexx + 1, sonBoslukIndexx + 2) + ".";

        System.out.println("shortening = " + shortening);


    }
}
