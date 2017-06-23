/*演習14-2
 * 着せ替え可能なロボット型ペットクラスを作成。
 * 作成日：2017年6月23日
 * 作成者：浅田　知嗣
 */
package e_14_02;

public class RobotPet extends Pet implements Skinnable{
	//コンストラクタ
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}

	//自己紹介
	public void introduce() {
		System.out.println("私はロボット。名前は" + getName() + "。");
		System.out.println("ご主人様は" + getMasterName() + "。");
	}

	//家事をする
	public void work(int sw) {
		switch (sw) {
		case 0:	System.out.println("掃除します。");	break;
		case 1:	System.out.println("選択します。");	break;
		case 2:	System.out.println("炊事します。");	break;
		}
	}

	//スキンを変更する。
	public void changeSkin(int skin) {
		System.out.print("スキンを");
		switch(skin) {
		case BLACK:		System.out.print("黒");	break;
		case RED:		System.out.print("赤");	break;
		case GREEN:		System.out.print("緑");	break;
		case BLUE:		System.out.print("青");	break;
		case LEOPARD:	System.out.print("豹");	break;
		default:		System.out.print("無地");break;
		}
		System.out.println("に変更しました。");
	}
}