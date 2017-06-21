/*演習7-9
 * 正の整数値を読み込んで、その値を返却するメソッド
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_09;
import java.util.Scanner;

public class e_07_09 {

	public static void main(String[] args) {
		//関数から読み込んだ整数値を表示する。
		System.out.println("入力された整数値は" + readPlusInt() + "です。");
	
	}
	
	static int readPlusInt() {
		Scanner stdIn = new Scanner(System.in);
		
		int num;		//キーボードから読み込んだ整数を格納する。
		
		//任意の整数の入力を促す。
		//0以下の数字が入力された場合再入力。
		do {
			System.out.print("正の整数値：");
			num = stdIn.nextInt();
		
		} while (num <= 0);
		
		stdIn.close();
		
		//読み込んだ整数値を返却する。
		return num;
	}

}
