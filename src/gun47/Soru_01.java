package gun47;

public class Soru_01 {
    public static void main(String[] args) {
        String[][] chs=new String[2][];
        chs[0]=new String[2]; // 2
        chs[1]=new String[5]; // 5
        int i=97;

        for (String[] ca:chs){
            for (String c:ca){
                System.out.print(c+" ");
            }
            System.out.println();
        }

        for (int a=0;a< chs.length;a++){  // 2  a: 0,1
            for (int b=0; b< chs.length;b++){  // 2 b:0,1
                chs[a][b]=""+i; // i'yi otomatik Stringe çeviriyor
                // chs[0][0]-> 97, chs[0][1]->98, chs[1][0]->99, chs[1][1]->100
                i++;
            }
        }

        for (String[] ca:chs){
            for (String c:ca){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
