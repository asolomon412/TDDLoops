
public class Loops {

	public static void main(String[] args) {
		// consolePrint();
	}

	public static String makeShapeA() {
		String result = "";
		for (int i = 1; i <= 8; i++) {
			result += printHash(i) + "\n";
			// System.out.println(printHash(i));
		}
		// System.out.println(printHash(1));
		// System.out.println(printHash(2));
		// System.out.println(printHash(3));
		// System.out.println(printHash(4));
		// System.out.println(printHash(5));
		// System.out.println(printHash(6));
		// System.out.println(printHash(7));
		// System.out.println(printHash(8));

		return result;
	}

	public static String printHash(final int count) {
		String hashResult = "";

		for (int i = 0; i < count; i++) {
			hashResult += "#";
		}
		return hashResult;
		/*
		 * if(i==1){
		 * 
		 * return "#" ; } else if (i==2){ return "##"; }
		 * 
		 * return null;
		 */
	}
}
