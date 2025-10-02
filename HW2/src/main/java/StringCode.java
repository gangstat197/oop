import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
        int max = 1;
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max; // YOUR CODE HERE
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
        char[] arr = str.toCharArray();

        StringBuilder result = new StringBuilder();
        int count = 0;
        for (char c : arr) {
            if (c >= '0' && c <= '9') {
                count = c - '0';
                continue;
            }

            if (count > 0) {
                for (int j = 0; j < count + 1; j++) {
                    result.append(c);
                }
                count = 0;
            }
        }

        return result.toString();
	}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i <= a.length() - len; i++) {
            String sub =  a.substring(i, i + len);

            set.add(sub);
        }

        for (int i = 0; i <= b.length() - len; i++) {
            String sub =  b.substring(i, i + len);

            if (set.contains(sub)) {
                return true;
            }
        }
		return false;
	}
}
