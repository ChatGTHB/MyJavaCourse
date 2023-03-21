package gun24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
        // Set -> HashSet, LinkedHashSet, TreeSet
        // Map -> HashMap, LinkedHashMap, TreeMap
        // Map = Anahtar + Set -> Anahtarlı Set

        // anahtarın tipi Integer, değerinin tipi String olsun

        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(1001,"Ismet Yılmaz");
        hm.put(1002,"Burhan Kaya");
        hm.put(2001,"Hilal Bayrak");
        hm.put(5001,"Cihat Duman");
        hm.put(1002,"Kerem Said Yiğit");

        System.out.println("hm = " + hm);
        //hm = {2001=Hilal Bayrak, 1001=Ismet Yılmaz, 5001=Cihat Duman, 1002=Kerem Said Yiğit}

        System.out.println("hm.get(2001) = " + hm.get(2001));//Hilal Bayrak
        System.out.println("hm.get(5001) = " + hm.get(5001));// Cihat Duman

        System.out.println("hm.containsKey(2001) = " + hm.containsKey(2001));//true
        System.out.println("hm.containsKey(12) = " + hm.containsKey(12));//false

        System.out.println("hm.keySet = " + hm.keySet());//hm = [2001, 1001, 5001, 1002]

        System.out.println("hm.values() = " + hm.values());
        //hm.values() = [Hilal Bayrak, Ismet Yılmaz, Cihat Duman, Kerem Said Yiğit]

        hm.remove(5001);
        System.out.println("hm = " + hm);
        //hm = {2001=Hilal Bayrak, 1001=Ismet Yılmaz, 1002=Kerem Said Yiğit}

        System.out.println("hm.size() = " + hm.size());//hm.size() = 3

        hm.clear();
        System.out.println("hm = " + hm);//hm = {}
    }
}
