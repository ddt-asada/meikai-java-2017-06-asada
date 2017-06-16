/*演習2-12
 * キーボードから読み込んだ値のプラスマイナス10の乱数を生成する。
 */
package e_02_12;
import java.util.Random;
import java.util.Scanner;

public class e_02_12 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		//整数値の入力を促す。
		System.out.print("整数値を入力してください。");
		int x = stdIn.nextInt();	//整数値を読み込む。

		//入力された整数値プラスマイナス5の乱数を生成して表示する。
		System.out.println("生成された乱数は" + (x - 5 + rand.nextInt(10)) + "です。");
	}

}
