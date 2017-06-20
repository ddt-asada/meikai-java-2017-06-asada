/*演習7-7
 * 文字cをn個表示するメソッドとそのメソッドを内部で呼び出す目メソッド
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */

package e_07_07;
import java.util.Scanner;

public class e_07_07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;		//表示したい三角形の段数。
		
		//表示したい三角形の段数の入力を促す。
		System.out.print("三角形の段数：");
		n = stdIn.nextInt();
		
		//三角形を描写する。
		for(int i = 1; i <= n; i++) {
			//文字を表示する関数を呼び出す。
			putStars(i);
			System.out.println();
		}
		
		stdIn.close();
	}
	
	//＊を表示する関数。
	static void putStars(int n){
		putChars('*', n);
	}
	
	//文字cをn個連続表示する関数。
	static void putChars(char c, int n) {
		while (n-- > 0) {
			System.out.print(c);
		}
	}

}
