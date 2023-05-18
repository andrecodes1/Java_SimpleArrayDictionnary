public class TUT2 {

	void add(String array[], String p) {
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] == null) {
				array[i] = p;
				break;
			}
	}
	}

	String get(String array[], int i) {
		return array[i];
	}

	void set(String array[], int i, String p) {
		array[i] = p;
	}

	public static void main(String[] argz) {

		TUT2 methods = new TUT2();
		String keys[] = new String[3];
		String values[] = new String[3];

		methods.add(keys, "a");
		methods.add(keys, "o");
		methods.add(keys, "g");

		for (int i = 0; i < keys.length; i++) {

			if ((methods.get(keys, i) == "a") && methods.get(values, i) == null)
				methods.set(values, i, "alpha");

			if ((methods.get(keys, i) == "o") && methods.get(values, i) == null)
				methods.set(values, i, "omega");

			if ((methods.get(keys, i) == "g") && methods.get(values, i) == null)
				methods.set(values, i, "gamma");
		}
		for(int i=0;i<keys.length;i++) {
			System.out.print(keys[i]+"---->");
			System.out.println(values[i]);
	}
	
	
}
}