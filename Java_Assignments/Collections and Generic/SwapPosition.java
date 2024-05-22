package ClassEleven;

public class SwapPosition {

	public static <T> T[] swap(T [] list, int firstPos, int secondPos) {
		if (firstPos < 0 || firstPos >= list.length || secondPos < 0 || secondPos >= list.length) {
            throw new IndexOutOfBoundsException("Invalid index. Ensure both positions are within bounds.");
        }
		T val = list[firstPos];
		list[firstPos] = list[secondPos];
		list[secondPos] = val;
		return list;
	}
	public static void main(String[] args) {


		System.out.println("*********** Integer swapping ***********");
		Integer[] intList = {10,9,11,3,7,1,73};

		System.out.println("Before swapping: ");
		for(Integer i : intList) {
			System.out.print(i + " ");
		}
		System.out.println();

		SwapPosition.swap(intList, 1, 5);

		System.out.println("After swapping: ");
		for(Number i : intList) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("*********** String swapping ***********");

		String[] stringList = {"Hello", "Welcome", "GoodMorning", "Bonjour", "Hola", "Namasthe"};

		System.out.println("Before swapping: ");
		for(String s : stringList) {
			System.out.print(s + " ");
		}
		System.out.println();

		SwapPosition.swap(stringList, 1, 5);

		System.out.println("After swapping: ");
		for(String s : stringList) {
			System.out.print(s + " ");

			System.out.println();
		}
	}
}