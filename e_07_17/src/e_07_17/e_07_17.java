/*演習7-17
 * 配列から任意の値を探索するメソッドを作成。
 * 作成日：２０１７ねん6月21日
 * 作成者：浅田　知嗣
 */
package e_07_17;
import java.util.Scanner;

public class e_07_17 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n;		//配列の様子数。
		int key;	//配列の中から探す値。

		//配列の要素数の入力。
		System.out.print("配列の要素数：");
		n =stdIn.nextInt();

		//配列を生成。
		int[] array = new int[n];

		//配列の全要素に値を入れる。
		for(int i = 0; i < n; i++) {
			System.out.print("array[" + i + "] = ");
			array[i] = stdIn.nextInt();
		}

		//探したい値を入力する。
		System.out.print("その値を探しますか：");
		key = stdIn.nextInt();

		//配列の全要素から任意の値を探すメソッドに渡し、帰ってきた値を表示する。
		System.out.println("その値は[" + linearSearch(array, key) + "]にあります。");

		//配列の全要素から任意の値を探すメソッドに渡し、帰ってきた値を表示する。
		System.out.println("その値は[" + linearSearchR(array, key) + "]にあります。");

		stdIn.close();
	}

	//配列から任意の値を探すメソッド。
	static int linearSearch(int[] array,int key) {
		int dis = -1;		//発見した場所を記憶する整数。

		//文字列の探索を行う。
		for(int i = 0; i < array.length; i++) {
			//文字列を発見したらその場所を記憶させる。
			if(array[i] == key && dis == -1) {
				dis = i;
			}
		}

		//見つけた場所を返す。
		return dis;
	}

	//配列の末尾から任意の値を探すメソッド。
	static int linearSearchR(int[] array,int key) {
		int dis = -1;		//発見した場所を記憶する整数。

		//文字列の探索を行う。
		for(int i = array.length - 1; i >= 0; i--) {
			//文字列を発見したらその場所を記憶させる。
			if(array[i] == key && dis == -1) {
				dis = i;
			}
		}

		//見つけた場所を返す。
		return dis;
	}

}
