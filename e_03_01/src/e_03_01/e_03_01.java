/*演習3-1
 * 整数値を読み込んで、その絶対値を読み込んで表示する。
 * 作成日：017年6月19日
 * 作成者：浅田　知嗣
 */
package e_03_01;
import java.util.Scanner;

public class e_03_01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//整数値の入力を促す。
		System.out.print("絶対値に変換したい整数値を入力してください。");
		int num = stdIn.nextInt();

		//整数値を絶対値に変換するための分岐。
		if(num < 0) {
			num = -num;	//負の値の時は正の値に変換。
		}

		//変換した絶対値を表示。
		System.out.println("絶対値は" + num + "です。");

		stdIn.close();
	}

}
