package baitap8;
public class CD {
	private int maCD;
    private String tenCD;
    private String caSy;
    private int soBH;
    private float giaThanh;
	
    
    public CD(int maCD, String tenCD, String caSy, int soBH, float giaThanh) {
		super();
		this.maCD = maCD;
		this.tenCD = tenCD;
		this.caSy = caSy;
		this.soBH = soBH;
		this.giaThanh = giaThanh;
	}


	public int getMaCD() {
		return maCD;
	}


	public void setMaCD(int maCD) {
		this.maCD = maCD;
	}


	public String getTenCD() {
		return tenCD;
	}


	public void setTenCD(String tenCD) {
		this.tenCD = tenCD;
	}


	public String getCaSy() {
		return caSy;
	}


	public void setCaSy(String caSy) {
		this.caSy = caSy;
	}


	public int getSoBH() {
		return soBH;
	}


	public void setSoBH(int soBH) {
		this.soBH = soBH;
	}


	public float getGiaThanh() {
		return giaThanh;
	}


	public void setGiaThanh(float giaThanh) {
		this.giaThanh = giaThanh;
	}


	@Override
	public String toString() {
		return "CD [maCD=" + maCD + ", tenCD=" + tenCD + ", caSy=" + caSy + ", soBH=" + soBH + ", giaThanh=" + giaThanh
				+ "]";
	}
}
