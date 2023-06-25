package baitap4;


	public class Vihicle {
		private String chuXe;
		private String loaiXe;
		private double giaXe;
		private float xylanh;


		public Vihicle() {
			super();
			// TODO Auto-generated constructor stub
		}
		//khoi tao contructor co tham so
		public Vihicle(String chuXe, String loaiXe, double giaXe, float xylanh) {
			super();
			this.chuXe = chuXe;
			this.loaiXe = loaiXe;
			this.giaXe = giaXe;
			this.xylanh = xylanh;
			
		}
		//get,set
		public String getChuXe() {
			return chuXe;
		}
		public void setChuXe(String chuXe) {
			this.chuXe = chuXe;
		}
		public String getLoaiXe() {
			return loaiXe;
		}
		public void setLoaiXe(String loaiXe) {
			this.loaiXe = loaiXe;
		}
		public double getGiaXe() {
			return giaXe;
		}
		public void setGiaXe(double giaXe)throws Exception{
			if (giaXe >=0 )
			this.giaXe = giaXe;
			else
			throw new Exception("Loi tri gia xe < 0");
				
		}
		public float getXylanh() {
			return xylanh;
		}
		public void setXylanh(float xylanh)throws Exception {
			if (xylanh >= 0)
			this.xylanh = xylanh;
			else
				throw new Exception("Loi xylanh < 0");
		}
		public double thuephainop() {
			if (xylanh < 100)
				return giaXe *0.01;
			else if ( xylanh >= 100 && xylanh <= 200)
				return giaXe * 0.03;
			else
				return giaXe * 0.05;
		}
		@Override
		public String toString() {
			return  String.format( "%-20s %-15s %-12f %-15.2f %-15.2f",chuXe, loaiXe, giaXe ,xylanh, thuephainop());

		}
}
