package homework._09_01_2023_Homework.soru_4;

public class Circle extends Data{
    @Override
    double getArea() {
        return pi * Math.pow(getRadius(),2);
    }
}
