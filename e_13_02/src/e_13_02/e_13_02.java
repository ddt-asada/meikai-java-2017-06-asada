/*演習13-2
 * 図形クラス群に対して、直角二等辺三角形を表すクラス群を追加する。
 * 作成日：2017年6月23日
 * 作成者：浅田　知嗣
 */
package e_13_02;

import java.util.Scanner;

public class e_13_02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int num;		//生成したい図形の個数。
		int shape;		//生成したい図形の種類の選択。
		int length;		//生成する図形の長さ。

		//生成したい図形の個数の入力。
		System.out.print("図形は何個：");
		num = stdIn.nextInt();

		//生成したい図形の個数だけ配列を生成。
		Triangle[] p = new Triangle[num];

		//生成したい図形の種類を選択し、それに情報を入力して図形クラスの配列を生成する。
		for(int i = 0; i < num; i++) {
			//生成したい図形の種類の選択。
			System.out.print((i + 1) + "番の図形の種類(1…左下直角三角形/2…左上直角三角形/3…右上直角三角形/4…右下直角三角形)：");
			shape = stdIn.nextInt();

			//生成したい図形の種類に応じて分岐。
			//左下直角三角形の分岐
			if(shape == 1) {
				//辺の入力。
				System.out.print("一辺当たりの長さ：");
				length = stdIn.nextInt();

				//図形を生成して配列に格納。
				p[i] = new TriangleA(length);

			//左上直角三角形の分岐
			} else if (shape == 2) {
				//辺の入力。
				System.out.print("一辺当たりの長さ：");
				length = stdIn.nextInt();

				//図形を生成して配列に格納。
				p[i] = new TriangleB(length);

			//右上直角三角形の分岐。
			} else if (shape == 3) {
				//辺の入力。
				System.out.print("一辺当たりの長さ：");
				length = stdIn.nextInt();

				//図形を生成して配列に格納。
				p[i] = new TriangleC(length);

			//右下直角三角形の分岐。
			} else if (shape == 4) {
				//辺の入力。
				System.out.print("一辺当たりの長さ：");
				length = stdIn.nextInt();

				//図形を生成して配列に格納。
				p[i] = new TriangleD(length);
			}
		}

		//生成した図形を表示。
		for(int i = 0; i < num; i++) {
			p[i].print();
			System.out.println();
		}

		stdIn.close();
	}
}
