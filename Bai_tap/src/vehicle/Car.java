package vehicle;

public class Car extends Vehicle{
	private int soChoNgoi;
    private String kieuDongCo;
    
    public Car(String soXe, String nhaSX, int namSX, String mauXe, Owner owner, int soChoNgoi, String kieuDongCo) {
        super(soXe, nhaSX, namSX, mauXe, owner);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }
    public int getsoChoNgoi() {
        return soChoNgoi;
    }
    
    public void setsoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }
    
    public String getkieuDongCo() {
        return kieuDongCo;
    }
    
    public void setkieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }
} 


