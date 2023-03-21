package gun30._01_StaticVariables.Ornek2;

public class School {
    public static void main(String[] args) {

        Student student1=new Student(1,"Kerem Bahadıroğlu");
        Student student2=new Student(2,"Said Bahadıroğlu");
        Student student3=new Student(3,"Mustafa Bahadıroğlu");
        // Problem : hem id'yi takip etmek zorundayım
        // hem de hata olasılığı yüksek
        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);
        System.out.println();

        Student student10=new Student("Kerem Bahadıroğlu");
        Student student11=new Student("Said Bahadıroğlu");
        Student student12=new Student("Mustafa Bahadıroğlu");

        System.out.println();
        System.out.println("student10 = " + student10);
        System.out.println("student11 = " + student11);
        System.out.println("student12 = " + student12);


    }
}
