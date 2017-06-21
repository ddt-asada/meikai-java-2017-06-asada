/*演習7-23
 * 配列の要素の中で任意の値を指定してそれと一致する要素が含まれたインデックスを先頭から順に格納した配列を返却するメソッド
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */
package e_07_23;
import java.util.Scanner;

public class e_07_23 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int num;	//配列の要素数。
		int key;	//配列から探したい任意の値。

		//配列の要素数の入力。
		System.out.print("配列の要素数：");
		num =stdIn.nextInt();

		//配列を生成。
		int[] array = new int[num];

		//配列の全要素に値を入れる。
		for(int i = 0; i < num; i++) {
		System.out.print("array[" + i + "] = ");
		array[i] = stdIn.nextInt();
		}

		//どの値が入ったインデックスを抜き出すかを選択。
		System.out.print("どの値を探しますか：");
		key = stdIn.nextInt();

		//配列の一致する要素が含まれたインデックスを格納した配列を返却するメソッドを呼び出す。
		int[] index = arraySrchIdx(array, key);

		//一致したインデックスを表示する。
		System.out.println("その値は");
		for(int i = 0; i < index.length; i++) {
			System.out.print(" [" + index[i] + "] ");
		}

		System.out.println("\nに含まれています。");

		stdIn.close();
	}

	static int[] arraySrchIdx(int[] array,int key) {
		int count = 0;		//含まれていた要素数をカウントする整数。
		int tmp[] = new int[array.length];	//含まれていたインデックスを記憶される一時的な配列。

		for(int i = 0; i < array.length; i++) {
			if(array[i] == key) {
				//仮の配列に含まれていた場所を記憶させる。
				tmp[count++] = i;
			}
		}

		//仮の配列から返却するための配列を生成する。
		int index[] = new int[count];

		//配列の値をコピーする。
		for(int i = 0; i < count; i++) {
			index[i] = tmp[i];
		}

		//インデックスを格納した配列を返却する。
		return index;
	}

}
