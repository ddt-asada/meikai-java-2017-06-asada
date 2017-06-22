/*演習12-1
 * 自動車クラスを派生させ、フィールドとメソッドを追加した自動車クラスを作成する。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */
package e_12_01;

import java.util.Scanner;

public class e_12_01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		Day d = new Day(2010, 10, 15);	//購入日情報。
		String name;		//オブジェクトを生成するための名前。
		int width;			//オブジェクトを生成するための車幅。
		int height;			//オブジェクトを生成するための車高。
		int length;			//オブジェクトを生成するための車長。
		double fuel;		//オブジェクトを生成するための燃料。

		System.out.println("車のデータを入力せよ。");
		System.out.print("名前は：");
		name = stdIn.nextLine();

		System.out.print("車幅は：");
		width = stdIn.nextInt();

		System.out.print("高さは：");
		height = stdIn.nextInt();

		System.out.print("長さは：");
		length = stdIn.nextInt();

		System.out.print("ガソリン量は：");
		fuel = stdIn.nextDouble();

		//自動車クラスよりオブジェクトを生成する。
		Carver2 myCar = new Carver2(name, width, height, length, fuel, d);

		//終了を選択するまで無限ループ
		while(true) {
			//現在の情報を取得する。
			System.out.println("現在地（" + myCar.getX() + ", " + myCar.getY() + "）総移動距離（"  + myCar.getTravelDistance() + "）");

			//移動するかどうかを選択する。しない場合はループを抜けて終了。
			System.out.print("移動しますか[0…No/1…Yes]：");
			if(stdIn.nextInt() == 0) {
				break;
			}

			//移動距離を入力する。
			System.out.print("X方向の移動距離：");
			double dx = stdIn.nextDouble();

			System.out.print("Y方向の移動距離：");
			double dy = stdIn.nextDouble();

			//燃料が足りない場合は警告を表示。
			if(!myCar.totalmove(dx,  dy)) {
				System.out.println("燃料が足りません！！！");
			}
		}
		stdIn.close();
	}

}
