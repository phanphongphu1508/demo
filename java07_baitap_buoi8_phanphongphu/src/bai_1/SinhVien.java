package bai_1;
import java.util.Scanner;

public class SinhVien {

	String tenSinhVien;
	int maSinhVien;
	double diemTrungBinh,diemToan, diemLy, diemHoa;
	
	void nhapThongTin() {
	Scanner banPhim = new Scanner(System.in);
	// Tên sinh viên
	System.out.print("Nhập vào tên sinh viên: ");
	this.tenSinhVien = banPhim.nextLine();
	
	// Mã sinh viên
	System.out.print("Nhập vào mã sinh viên: ");
	this.maSinhVien = Integer.parseInt(banPhim.nextLine());
	
	// Điểm toán
	do {
		System.out.print("Nhập vào điểm toán: ");
		this.diemToan = Double.parseDouble(banPhim.nextLine());
		if (diemToan < 0 || diemToan > 10) {
			System.out.println("Điểm không hợp lệ! vui lòng thử lại.");
		}
	} while (diemToan < 0 || diemToan > 10);
	
	// Điểm lý
	do {
		System.out.print("Nhập vào điểm lý: ");
		this.diemLy = Double.parseDouble(banPhim.nextLine());
		if (diemLy < 0 || diemLy > 10) {
			System.out.println("Điểm không hợp lệ! vui lòng thử lại.");
		}
	} while (diemLy < 0 || diemLy > 10);
	
	// Điểm hóa
	do {
		System.out.print("Nhập vào điểm hóa: ");
		this.diemHoa = Double.parseDouble(banPhim.nextLine());
		if (diemHoa < 0 || diemHoa > 10) {
			System.out.println("Điểm không hợp lệ! vui lòng thử lại.");
		}
	} while (diemHoa < 0 || diemHoa > 10);

	banPhim.close();
}
	
	void diemTrungBinh() {
	
		this.diemTrungBinh = (diemToan + diemLy + diemHoa) / 3;
		System.out.printf("Điểm trung bình: %1.1f\n", diemTrungBinh);
	}
	
	void xepLoai() {
		
		String xepLoai = "";
		if(diemTrungBinh >= 9) {
			xepLoai = "Xuất Sắc";
		}
		if(diemTrungBinh < 9 && diemTrungBinh >= 8) {
			xepLoai = "Giỏi";
		}
		if(diemTrungBinh < 8 && diemTrungBinh >= 7) {
			xepLoai = "Khá";
		}
		if(diemTrungBinh < 7 && diemTrungBinh >= 5) {
			xepLoai = "Trung Bình";
		}
		if(diemTrungBinh < 5 ) {
			xepLoai = "Yếu";
		}
		System.out.print("Xếp loại: " + xepLoai);
	}
}
