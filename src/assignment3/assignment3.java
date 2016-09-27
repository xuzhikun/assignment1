/**
 * Finish assignments, try bonus. Deadline: Before the next class.
 *
 * @author Jia
 */
public class Assignment3 {
    // assignments
    /**
     * Write a method to find N numbers which are power of three. e.g. n=4,
     * return {1,3,9,27}
     */
    public int[] findPowerOfThree(int n) {
        if (n < 1) {
            return null;
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = Math.pow(3, i);
        }
        return res;
    }

    /**
     * Given a integer 'n', return n%count, count is the number of digits of n
     * For example, n = 100, return 1
     */
    public int countDigits(int n) {
        int k = n, digit = 1;
        while (k / 10 != 0) {
            k /= 10;
            digit++;
        }
        return n % digit;
    }

    /**
     * Given a integer 'n', if n is odd, print n odd numbers, if n is even,
     * print n even numbers. For example, n = 3, print 1 3 5 n = 4, print 0 2 4
     * 6
     */
    public void printNumbers(int n) {
        if (n <= 0) {
            System.out.println("illegal");
        }
        int e = 0, o = 1;
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                System.out.print(e + " ");
                e += 2;
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                System.out.print(o + " ");
                o += 2;
            }
        }
    }

    /**
     * Given numRows, generate the first numRows of Pascal's triangle. For
     * example, given numRows = 5, return: [1] [1,1] [1,2,1] [1,3,3,1]
     * [1,4,6,4,1]
     */
    public List<List<Integer>> generatePascalsTriangle(int n) {
        List<List<Integer>> res = new ArrayList<>();
        if (n < 1) {
            return res;
        }
        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        res.add(pre);

        for (int i = 2; i < n + 1; i++) {
            List<Integer> curt = new ArrayList<>();
            curt.add(1);
            for (int j = 0; j < pre.size() - 1; j++) {
                curt.add(pre.get(j) + pre.get(j + 1));
            }
            curt.add(1);
            res.add(curt);
            pre = curt;
        }

        return res;
    }

    /**
     * Write a function that takes a string as input and reverse only the vowels
     * of a string. For example: Given s = "hello", return "holle".
     */
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        int start = 0, end = s.length() - 1;
        char[] chars = s.toCharArray();
        while (start < end) {
            String v = "aeiouAEIOU";
            if (v.contains(String.valueOf(chars[start])) && v.contains(String.valueOf(chars[end]))) {
                char tmp = chars[start];
                chars[start] = chars[end];
                chars[end] = tmp;
                start++;
                end--;
            }
            else if (!v.contains(String.valueOf(chars[start]))) {
                start++;
            }
            else if (!v.contains(String.valueOf(chars[end]))) {
                end--;
            }
        }
        s = "";
        for (char aChar : chars) {
            s += aChar;
        }
        return s;
    }

    /**
     * Given a string s consists of upper/lower-case alphabets and empty space
     * characters ' ', return the length of last word in the string. If the last
     * word does not exist, return 0. Note: A word is defined as a character
     * sequence consists of non-space characters only.
     */
    public int lengthOfLastWord(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int lastSpace = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                lastSpace = i;
            }
        }
        return str.substring(lastSpace + 1, str.length()).length();
    }

    /**
     * Reverse a string by words. Do not use 'split' function. e.g. "I like
     * soccer" --> "soccer like I"
     */
    public String reverseString2(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }

        ArrayList<String> list = new ArrayList<>();
        str += " ";
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                list.add(str.substring(k, i));
                k = i + 1;
            }
        }
        str = "";
        for (int j = list.size() - 1; j >= 0; j--) {
            str = str + list.get(j) + " ";
        }
        return str;
    }

    // Bonus
    /**
     * A robot from Mars send a long message to Earth which only contains many
     * "SOS", like "SOSSOS", "SOSSOSSOSSOSSOS" But the radiation from universe
     * changed some characters of the massage. Write a method to count how many
     * characters were changed. For example, "SOSSOSSOS" might be changed to
     * "SOSSUSSOP", then your method should return 2. The message was consisted
     * by "SOS" so its length will be multiple of 3. You could assume the
     * message only contains upper letter.
     */
    public int checkMessage(String message) {
        if (message == null || message.length() == 0 || message.length() % 3 != 0) {
            return -1;
        }
        int res = 0;
        for (int i = 0; i < message.length() - 2; i += 3) {
            if (message.substring(i, i + 2).equals("SOS")) {
                continue;
            }
            if (message.charAt(i) != 'S') {
                res++;
            }
            if (message.charAt(i + 1) != 'O') {
                res++;
            }
            if (message.charAt(i + 2) != 'S') {
                res++;
            }
        }
        return res;
    }
}