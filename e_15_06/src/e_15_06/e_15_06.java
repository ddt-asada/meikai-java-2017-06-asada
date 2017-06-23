/*演習15-6
 * コマンドライン引数で与えられた半径をもつ円の演習の長さと面積を求めて表示するプログラム。
 * 作成日：2017年6月23日
 * 作成者：浅田　知嗣
 */
package e_15_06;

public class e_15_06 {

	public static void main(String[] args) {
		//コマンドライン引数より受けとった文字列をdouble型に変換して受け取る。
		double r = Double.parseDouble(args[0]);

		//円の円周を求めて表示。
		System.out.println("円周：" + (2 * r * 3.14));

		//円の面積を求めて表示。
		System.out.println("面積：" + (r * r * 3.14));
	}

}
