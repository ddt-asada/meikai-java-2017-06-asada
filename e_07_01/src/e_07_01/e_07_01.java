/*受け取ったint型引数のatainが負であれば-1を返却し、0であれば0を返却し、正であれば1を返却するメソッドを作成する。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_07_01;
import java.util.Scanner;

public class e_07_01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int x;		//符号を判定したい整数。

		//符号を判定したい整数の入力を促す。
		System.out.print("整数値：");
		x = stdIn.nextInt();

		//符号を判定するメソッドに整数を渡す。
		x = signOf(x);

		//返ってきた判定を表示する。
		System.out.println("signOf(x)は" + x + "です。");

		stdIn.close();
	}

	//符号を判定するメソッド。
	static int signOf(int n) {
		int sign = 0;	//符号の判定結果を格納する整数。

		//符号を判定するための分岐。
		if(n > 0) {
			sign = 1;

		} else if (n < 0) {
			sign = -1;
		}

		//符号を判定した結果を返す。
		return sign;
	}

}
