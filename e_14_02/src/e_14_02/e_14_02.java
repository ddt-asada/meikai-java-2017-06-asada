/*演習14-2
 * 着せ替え可能なロボット型ペットクラスを作成。
 * 作成日：2017年6月23日
 * 作成者：浅田　知嗣
 */
package e_14_02;

public class e_14_02 {

	public static void main(String[] args) {
		Pet kurt = new Pet("Kurt", "アイ");
		kurt.introduce();
		System.out.println();

		RobotPet r2d2 = new RobotPet("R2D2", "ルーク");
		r2d2.changeSkin(0);
		r2d2.introduce();
		System.out.println();
	}

}
