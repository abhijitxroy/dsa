package anagram;

/**
* AnagramProg3 - Using StringBuilder
*/
public class AnagramProg3WithStringBuilder {

	public static void main(String[] args) {
		boolean result = isAnagram("Mother In Law", "Hitler Woman");
		System.out.println("isAnagram: " + result);
	}

	private static boolean isAnagram(String str1, String str2) {

		String copyOfstr1 = str1.trim().toLowerCase().replaceAll("\\s", "");
		String copyOfstr2 = str2.trim().toLowerCase().replaceAll("\\s", "");

		boolean status = true;

		System.out.println("copyOfstr1: " + copyOfstr1);
		System.out.println("copyOfstr2: " + copyOfstr2);

		if (copyOfstr1.length() != copyOfstr2.length()) {
			status = false;

		} else {

			// convert string to Array
			char[] arr1 = copyOfstr1.toCharArray();
			
			// convert string to StringBuilder
			StringBuilder sb = new StringBuilder(copyOfstr2);

			for (char ch : arr1) {

				int index = sb.indexOf(""+ch);

				if (index != -1) {
					System.out.println(ch + " = " + index);
					
					sb.deleteCharAt(index);
					//copyOfstr2 = copyOfstr2.substring(0, index) + copyOfstr2.substring(index + 1, copyOfstr2.length());

					System.out.println(copyOfstr2);
				} else {
					status = false;
					break;
				}

			}
		}

		return status;
	}
}
