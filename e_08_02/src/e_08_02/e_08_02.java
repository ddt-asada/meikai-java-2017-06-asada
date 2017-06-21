/*演習8-2
 * 自動車クラスにフィールドやメソッドを追加する。
 * 作成日：2017年6月21日
 * 作成者：浅田　知嗣
 */

package e_08_02;
import java.util.Scanner;

public class e_08_02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String name;		//オブジェクトを生成するための名前。
		int width;			//オブジェクトを生成するための車幅。
		int height;			//オブジェクトを生成するための車高。
		int length;			//オブジェクトを生成するための車長。
		double fuel;		//オブジェクトを生成するための燃料。
		double gastank;	//オブジェクトを生成するための燃料容量。
		double performance;//オブジェクトを生成するための燃費。
		double charge;			//ガソリン補充の時のせいすう。

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

		System.out.print("ガソリン容量は：");
		gastank = stdIn.nextDouble();

		System.out.print("燃費：");
		performance = stdIn.nextDouble();

		//自動車クラスよりオブジェクトを生成する。
		Car myCar = new Car(name, width, height, length, fuel, gastank, performance);

		//終了を選択するまで無限ループ
		while(true) {
			//現在の情報を取得する。
			System.out.println("現在地（" + myCar.getX() + ", " + myCar.getY() + "）");

			//燃料を補給するかどうかを選択。
			System.out.print("燃料を補給しますか（のこり燃料：" + myCar.getFuel() + "/" + myCar.getGastank() + "）[0…No/1…Yes]");
			if(stdIn.nextInt() == 1) {
				System.out.print("何リットル補充しますか：");
				charge = stdIn.nextDouble();

				//燃料補充のメソッドを呼び出す。
				myCar.fuelCharge(charge);
			}

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
			if(!myCar.move(dx,  dy)) {
				System.out.println("燃料が足りません！！！");
			}
		}
		stdIn.close();
	}
}
