/*演習15-3
 * 文字列探索のプログラムを書き換えて一致する部分が上下でそろうようにする。
 * 作成日：2017年6月13日
 * 作成者：浅田　知嗣
 */
package e_15_03;
import java.util.Scanner;

public class e_15_03 {

	public static void main(String[] args) {
		Scanner stdIn= new Scanner(System.in);

		//キーボードから文字列を読み込む。
		System.out.print("文字列s1：");
		String s1 = stdIn.next();

		System.out.print("文字列s2：");
		String s2 = stdIn.next();

		//s1にs2が含まれているかを調べる。
		int idx = s1.indexOf(s2);

		//含まれているかどうかにより分岐。
		if(idx ==- 1) {
			System.out.println("s1中にs2は含まれません。");

		} else {
			System.out.println(s1);

			//一致する部分が上下出そろうようにして表示する。
			for(int i = 0; i < idx; i++) {
				System.out.print(' ');
			}
			System.out.println(s2);
		}

		stdIn.close();
	}
}
