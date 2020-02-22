package phamthanhhuong.com.test;

import phamthanhhuong.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		SinhVien teo=new SinhVien(1,"Nguyễn Văn Tèo",9);
		teo.xetTotNghiep();
		teo.xetTotnghiep(4);
		teo.xetTotNghiep(9, 1);
	}

}
