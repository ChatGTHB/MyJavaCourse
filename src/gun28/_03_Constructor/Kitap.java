package gun28._03_Constructor;

class Kitap {
    String name;
    int publishyear;
    String author;

    public Kitap(String name, int publishyear, String author) {
        this.name = name;
        this.publishyear = publishyear;
        this.author = author;
    }

    public Kitap() {
    }

    public Kitap(String name, int publishyear) {
        this.name = name;
        this.publishyear = publishyear;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "name='" + name + '\'' +
                ", publishyear=" + publishyear +
                ", author='" + author + '\'' +
                '}';
    }
}
