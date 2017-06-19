/*演習3-8
 * 読み込んだ点数に応じて成績を判定するプログラム。
 * 作成日：2017年6月19日
 * 作成者：浅田　知嗣
 */
package e_03_08;
import java.util.Scanner;

public class e_03_08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//成績を判定したい点数の入力を促す。
		System.out.print("成績を判定したい点数を入力してください。");
		int score = stdIn.nextInt();	//読み込む。

		//成績を判定するための分岐。
		if(score >= 0 && score < 60) {
			System.out.println("不可");

		} else if (score >=60 && score <70) {
			System.out.println("可");

		} else if (score >= 70 && score < 80) {
			System.out.println("良");

		} else if (score >= 80 && score <= 100) {
			System.out.println("優");

		//上記以外はエラーとみなす。
		} else {
			System.out.println("不正な点数です。");
		}

		stdIn.close();
	}

}
