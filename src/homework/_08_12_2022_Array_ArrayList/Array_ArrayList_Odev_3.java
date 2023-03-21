package homework._08_12_2022_Array_ArrayList;

public class Array_ArrayList_Odev_3 {
    public static void main(String[] args) {
        //  3- Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        //     [{"new jersey","atlanta","ohio"} ,
        //     {"Pittsburgh" ,"ohio","new york","ohio"} ,
        //     {"ohio","new york"}]
        //     Bütün ohio'ları Florida'yla değiştiriniz.
        //     Array'i yazdırınız.

        String[][] array3 = {{"new jersey", "atlanta", "ohio"},
                {"Pittsburgh", "ohio", "new york", "ohio"},
                {"ohio", "new york"}};

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                if (array3[i][j].equals("ohio")) {
                    array3[i][j] = "Florida";
                }
                System.out.print(array3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
