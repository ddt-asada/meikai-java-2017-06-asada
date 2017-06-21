/*演習7-13
 * 整数の指定したビットを1にした値を返すメソッド、0にした値を返すメソッド、反転した値を返すメソッドを作成。
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_13;
import java.util.Scanner;

public class e_07_13 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int x;		//中身を変更する任意の整数。
		int pos;	//操作するビットを指定する整数。

		//変更したい整数の入力。
		System.out.print("変更したい整数：");
		x = stdIn.nextInt();

		//何ビット目を変更するか。
		System.out.print("何ビット目を：");
		pos = stdIn.nextInt();
		System.out.println();

		//変更前の整数を表示。
		System.out.println("変更前：" + x);
		//ビット表記で表示。
		System.out.println("ビット：");
		printBits(x);
		System.out.println();

		//任意のビット数を0にした値を表示。
		System.out.println("0ビットに変更：" + reset(x, pos));
		//ビット表記で表示。
		System.out.println("ビット：");
		printBits(reset(x, pos));
		System.out.println();

		//任意のビットを1にした値を表示。
		System.out.println("1ビットに変更：" + set(x, pos));
		//ビット表記で表示。
		System.out.println("ビット：");
		printBits(set(x, pos));
		System.out.println();

		//任意のビットを反転した値を表示。
		System.out.println("反転した値：" + inverse(x, pos));
		//ビット表記で表示。
		System.out.println("ビット：");
		printBits(inverse(x, pos));
		System.out.println();

		stdIn.close();
	}

	//整数のビット構成を表示する関数。
	static void printBits(int x) {

		//ビット構成を表示。
		for(int i= 31; i >= 0; i--) {
			System.out.print(((x >> i & 1) == 1) ?'1' : '0');
		}
	}

	//整数の任意のビットを0に変更する関数。
	static int reset(int x, int pos) {
		return x & ~(1 << pos);
	}

	//整数の任意のビットを1に変更する関数。
	static int set(int x, int pos) {
		return x | (1 << pos);
	}

	//整数の任意のビットを反転して返す関数。
	static int inverse(int x, int pos) {
		return x ^ (1 << pos);
	}
}
