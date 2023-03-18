package vehicle;

import java.util.Scanner;

public class Vehicle implements Comparable<Vehicle> {
    protected String soXe;
    protected String nhaSX;
    protected int namSX;
    protected String mauXe;
    protected Owner owner;
	Scanner sc = new Scanner(System.in);

    public Vehicle(String soXe, String nhaSX, int namSX, String mauXe, Owner owner) {
        this.soXe = soXe;
        this.nhaSX = nhaSX;
        this.namSX = namSX;
        this.mauXe = mauXe;
        this.owner = owner;
    }
	  
    public String getsoXe() {
        return soXe;
    }
    
    public void setsoXe(String soXe) {
        this.soXe = soXe;
    }
    
    public String getnhaSX() {
        return nhaSX;
    }
    
    public void setnhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }
    
    public int getnamSX() {
        return namSX;
    }
    
    public void setnamSX(int namSX) {
        this.namSX = namSX;
    }
    
    public String getmauXe() {
        return mauXe;
    }
    
    public void setmauXe(String mauXe) {
        this.mauXe = mauXe;
    }
    
    public Owner getOwner() {
        return owner;
    }
    
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
//
//    @Override
//    public int compareTo(Vehicle otherVehicle) {
//        return this.getsoXe().compareTo(otherVehicle.getsoXe());
//    }

	@Override
	public int compareTo(Vehicle o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
