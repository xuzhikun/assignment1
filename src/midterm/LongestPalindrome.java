/**
 * Created by xuzhi on 10/28/2016.
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) return 0;
        int n = s.length();
        int res = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                String sub = s.substring(j, i);
                if (isVal(sub))
                    res = Math.max(res, sub.length());
            }
        }
        return res;
    }

    private boolean isVal(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
}
