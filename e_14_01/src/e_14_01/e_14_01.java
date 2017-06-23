/*演習14-1
 * 図形クラス群を利用するプログラムを作成。
 * 作成日：2017年6月23日
 * 作成者：浅田　知嗣
 */
package e_14_01;

import java.util.Scanner;

public class e_14_01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int length;		//生成する図形の長さ。
		int width;		//生成する図形の幅。

		//生成したい図形の個数の入力。
		System.out.print("図形を生成します：");
		//長方形の生成。
		//長さの入力。
		System.out.print("長さ：");
		length = stdIn.nextInt();
		//幅の入力。
		System.out.print("幅：");
		width = stdIn.nextInt();

		//図形を生成。
		Rectangle Rec = new Rectangle(length, width);

		//平行四辺形の生成。
		//長さの入力。
		System.out.print("底辺：");
		length = stdIn.nextInt();
		//幅の入力。
		System.out.print("高さ：");
		width = stdIn.nextInt();

		//図形を生成。
		Parallelogram para = new Parallelogram(length, width);


		//生成した図形を表示。
		Rec.print();
		System.out.println("面積" + Rec.getArea());

		para.print();
		System.out.println("面積" + para.getArea());

		stdIn.close();
	}

}
