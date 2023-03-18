package vehicle;

public class Truck extends Vehicle {
    private int trongTai;
    
    public Truck(String soXe, String nhaSX, int namSX, String mauXe, Owner owner, int trongTai) {
        super(soXe, nhaSX, namSX, mauXe, owner);
        this.trongTai = trongTai;
    }
    
    // getter and setter
    public int gettrongTai() {
        return trongTai;
    }
    
    public void settrongTai(int trongTai) {
        this.trongTai = trongTai;
    }
}
