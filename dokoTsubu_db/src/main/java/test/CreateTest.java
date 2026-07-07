package test;

import dao.MuttersDAO;
import model.Mutter;

public class CreateTest {

	public static void main(String[] args) {
		Mutter m = new Mutter("菅原", "給料泥棒め");
		MuttersDAO dao = new MuttersDAO();
		boolean result = dao.create(m);
		if (result) {
			System.out.println("成功");
		} else {
			System.out.println("失敗");
		}
	}

}
