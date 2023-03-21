package gun29.Soru;

public class Hesap {
    private int toplamYatan =0;
    private int toplamCekilen=0;
    private int bakiye=0;

     public void paraYatir(int yatanPara) {
         toplamYatan +=yatanPara;
         bakiye+=yatanPara;
    }

    public void paraCek(int cekilenPara) {
         toplamCekilen+=cekilenPara;
         bakiye-=cekilenPara;
    }

    @Override
    public String toString() {
        return "Hesap{" +
                "toplamYatan=" + toplamYatan +
                ", toplamCekilen=" + toplamCekilen +
                ", bakiye=" + bakiye +
                '}';
    }
}
