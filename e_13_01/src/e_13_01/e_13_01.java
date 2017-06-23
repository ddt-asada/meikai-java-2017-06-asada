package e_13_01;
import java.util.Scanner;

public class e_13_01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int num;		//生成したい図形の個数。
		int shape;		//生成したい図形の種類の選択。
		int length;		//生成する図形の長さ。
		int width;		//生成する図形の幅。

		//生成したい図形の個数の入力。
		System.out.print("図形は何個：");
		num = stdIn.nextInt();

		//生成したい図形の個数だけ配列を生成。
		Shape[] p = new Shape[num];

		//生成したい図形の種類を選択し、それに情報を入力して図形クラスの配列を生成する。
		for(int i = 0; i < num; i++) {
			//生成したい図形の種類の選択。
			System.out.print((i + 1) + "番の図形の種類(1…点/2…水平直線/3…垂直直線/4…長方形)：");
			shape = stdIn.nextInt();

			//生成したい図形の種類に応じて分岐。
			if(shape == 1) {
				p[i] = new Point();		//配列にインスタンスを格納。

			//水平直線の分岐。
			} else if(shape == 2) {
				//長さの入力。
				System.out.print("長さ：");
				length = stdIn.nextInt();

				//
				p[i] = new HorzLine(length);

			//垂直直線の分岐。
			} else if(shape == 3) {
				//長さの入力。
				System.out.print("長さ：");
				length = stdIn.nextInt();

				//図形を生成して配列に格納。
				p[i] = new VirtLine(length);

			} else if(shape == 4) {
				//長さの入力。
				System.out.print("長さ：");
				length = stdIn.nextInt();
				//幅の入力。
				System.out.print("幅：");
				width = stdIn.nextInt();

				//図形を生成して配列に格納。
				p[i] = new Rectangle(length, width);

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
