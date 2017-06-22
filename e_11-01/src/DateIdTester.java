/*演習11-1
 * パッケージの所属場所を変更する。
 * 作成日：2017年6月22日
 * 作成者：浅田　知嗣
 */
import Id.DateId;

public class DateIdTester {

	public static void main(String[] args) {
		DateId a = new DateId();
		DateId b = new DateId();
		DateId c = new DateId();

		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());
		System.out.println("cの識別番号：" + c.getId());
	}
}