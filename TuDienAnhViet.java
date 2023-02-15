import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDienAnhViet {
	private Map<String, String> dataMap = new TreeMap<String, String>();
	
	public TuDienAnhViet() {
		
	}

	public String themTuMoi(String key, String value) {
		return this.dataMap.put(key, value);
	}
	public String xoaTu(String key) {
		return this.dataMap.remove(key);
	}
	public String timNghia(String key) {
		return this.dataMap.get(key);
	}
	public void inDanhSachTuKhoa() {
		Set danhSachTuKhoa = this.dataMap.keySet();
		System.out.println("danh sach tu khoa: " + Arrays.toString(danhSachTuKhoa.toArray()));
	}
	public int soLuongTu() {
		return this.dataMap.size();
	}
	public void xoaTuDien() {
		 this.dataMap.clear();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TuDienAnhViet tuDien = new TuDienAnhViet();
		int luaChon = 0;
		do {
			System.out.println("------MENU-------"+
					" 1. Thêm từ \n"
					+ "2. Xóa từ\n"
					+ "3. Tìm nghĩa của từ khóa ⇒ Tra từ\n"
					+ "4. In danh sách từ khóa\n"
					+ "5.Số lượng từ\n"
					+ "6. Xóa tất cả các từ khóa\n"
					+ "0. Thoát khỏi chương trình\n");
			
			System.out.println("Nhập phím chức năng : "); luaChon = sc.nextInt();
			sc.nextLine();
			if(luaChon == 1) {
				System.out.println("Nhập từ mới : "); String tuMoi = sc.nextLine();
				System.out.println("Nhập nghĩa của từ : "); String nghia = sc.nextLine();
				
				tuDien.themTuMoi(tuMoi, nghia);
			}else if(luaChon == 2) {
				System.out.println("Nhập từ cần xoá : "); String tuXoa = sc.nextLine();
				tuDien.xoaTu(tuXoa);
			}else if(luaChon == 3) {
				System.out.println("Nhập từ cần tìm nghĩa : "); String tuKhoa = sc.nextLine();
				System.out.println("Nghĩa của từ là : "+tuDien.timNghia(tuKhoa));
			}else if(luaChon == 4) {
				tuDien.inDanhSachTuKhoa();
			}else if(luaChon == 5) {
				System.out.println("Số lượng từ  : " + tuDien.soLuongTu());
			}else if(luaChon == 6) {
				
				tuDien.xoaTuDien();
				System.out.println("Bạn đã xoá tất cả từ khoá !");
			}
		} while (luaChon != 0);
		
	}
}
