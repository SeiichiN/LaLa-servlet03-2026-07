package model;

import dao.MuttersDAO;

public class PostMutterLogic {
	public void execute(Mutter mutter) {
		MuttersDAO dao = new MuttersDAO();
		if (dao.create(mutter)) {
			System.out.println("保存成功");
		} else {
			System.out.println("保存失敗");
		}
	}
}
