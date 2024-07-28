package bai_2;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		DanhSachSinhVien danhSachSinhVien = new DanhSachSinhVien();
		
		luaChon(danhSachSinhVien);
	}
	
	public static void thongBao() {
		System.out.println("----- Vui lòng nhập lựa chọn -----");
		System.out.println("1. Nhập vào sinh viên");
		System.out.println("2. Xếp loại sinh viên");
		System.out.println("3. Sinh viên có điểm trung bình cao nhất");
		System.out.println("4. In ra tất cả sinh viên");
		System.out.println("5. Tìm sinh viên theo tên");
		System.out.println("6. Tìm sinh viên theo mã");
		System.out.println("7. Xóa 1 sinh viên");
		System.out.println("0. Thoát chương trình");
	}
	
	public static void luaChon(DanhSachSinhVien danhSachSinhVien) {
		
		
		
		int luaChon;
		boolean thoat = false;
		
		do {
			Scanner banPhim = new Scanner (System.in);
			thongBao();
			System.out.print("Lựa chọn: ");
			luaChon = Integer.parseInt(banPhim.nextLine());
			switch(luaChon) {
			case 1:
				SinhVien sinhVien = new SinhVien();
				sinhVien.nhapThongTin();
				sinhVien.diemTrungBinh();
				danhSachSinhVien.themSinhVien(sinhVien);
				break;
			case 2:
				danhSachSinhVien.xuatTatCaSinhVien();
				break;
			case 3:
				danhSachSinhVien.xuatTatCaSinhVien();
				break;
			case 4:
				danhSachSinhVien.xuatTatCaSinhVien();
				break;
			case 5:
				danhSachSinhVien.xuatTatCaSinhVien();
				break;
			case 6:
				danhSachSinhVien.xuatTatCaSinhVien();
				break;
			case 7:
				danhSachSinhVien.xuatTatCaSinhVien();
				break;
			case 0:
				thoat = true;
				System.out.print("Đã dừng chương trình.");
				return;
			default:
				System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại.\n");
				break;
			}
		} while(!thoat);
	}
}
