/*演習9-4
 * 人間クラスに誕生日のフィールドとtoStringメソッドを追加する。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */

public class e_09_04 {

	public static void main(String[] args) {
		//人間クラスよりオブジェクトを生成する。
		Human personal = new Human("浅田知嗣", 160, 60, 1993, 9, 11);

		//名前のゲッタを呼び出す。
		System.out.println("名前は" + personal.getName() + "です。");

		//身長のゲッタを呼び出す。
		System.out.println("身長は" + personal.getHeight() + "です。");

		//体重のゲッタを呼び出す。
		System.out.println("体重は" + personal.getWeight() + "です。");

		//誕生日の文字列表現を呼び出す。
		System.out.println("誕生日は" + personal.toString());

		//BMIを表示する。
		personal.bmi();

		//身長との差を表示する。
		personal.theight();

	}

}
