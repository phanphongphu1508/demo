package bai_2;
import java.util.ArrayList;
import java.util.List;

public class DanhSachSinhVien {
	
	List<SinhVien> danhSachSinhVien;
	
	DanhSachSinhVien() {
		this.danhSachSinhVien = new ArrayList<SinhVien>();
	}
	void themSinhVien(SinhVien sinhVien) {
		this.danhSachSinhVien.add(sinhVien);
	}
	void xuatTatCaSinhVien() {
		int soThuTu = 0;
		header();
		gachNgang();
		for (SinhVien sinhVien: this.danhSachSinhVien) {
			soThuTu++;
			sinhVien.xuatThongTin(soThuTu);
		}
	}
	void header() {
		System.out.println("---------------------------------------------------------- THÔNG TIN SINH VIÊN ----------------------------------------------------------");
		System.out.print("STT |\t");
		System.out.print("Tên sinh Viên\t|\t");
		System.out.print("Mã sinh viên\t|\t");
		System.out.print("Điểm toán\t|\t");
		System.out.print("Điểm lý\t|\t");
		System.out.print("Điểm hóa\t|\t");
		System.out.println("Điểm trung bình\t|");
		gachNgang();
	}
	void gachNgang() {
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
	}
	
}
