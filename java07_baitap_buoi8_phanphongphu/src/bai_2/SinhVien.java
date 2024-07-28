package bai_2;
import java.util.Scanner;

public class SinhVien {
	String tenSinhVien;
	int maSinhVien;
	double diemTrungBinh = 0, diemToan, diemLy, diemHoa;
	
	void nhapThongTin() {
		Scanner banPhim = new Scanner(System.in);
		
		System.out.print("Nhập tên sinh viên: ");
		this.tenSinhVien = banPhim.nextLine();
		
		System.out.print("Nhập mã sinh viên: ");
		this.maSinhVien = banPhim.nextInt();
		
		// Nhập điểm toán
		do {
			System.out.print("Nhập điểm toán: ");
			this.diemToan = banPhim.nextDouble();
			if(diemToan < 0 || diemToan > 10) {
				System.out.println("Điểm không hợp lệ!");
			}
		} while (diemToan < 0 || diemToan > 10);
		
		// Nhập điểm lý
		do {
			System.out.print("Nhập điểm lý: ");
			this.diemLy = banPhim.nextDouble();
			if(diemLy < 0 || diemLy > 10) {
				System.out.println("Điểm không hợp lệ!");
			}
		} while (diemLy < 0 || diemLy > 10);
		
		// Nhập điểm hóa
		do {
			System.out.print("Nhập điểm hóa: ");
			this.diemHoa = banPhim.nextDouble();
			if(diemHoa < 0 || diemHoa > 10) {
				System.out.println("Điểm không hợp lệ!");
			}
		} while (diemHoa < 0 || diemHoa > 10);
		banPhim.close();
	}
	void diemTrungBinh() {
		this.diemTrungBinh = (this.diemToan + this.diemLy + this.diemHoa) / 3;
		
	}
	void xuatThongTin(int soThuTu) {
		DanhSachSinhVien danhSachSinhVien = new DanhSachSinhVien();
		System.out.print(soThuTu + "\t");
		System.out.print(this.tenSinhVien + "\t");
		System.out.print(this.maSinhVien + "\t");
		System.out.print(this.diemToan + "\t");
		System.out.print(this.diemLy + "\t");
		System.out.print(this.diemHoa + "\t");
		System.out.println(this.diemTrungBinh + "\t");
		danhSachSinhVien.gachNgang();
	}
}
