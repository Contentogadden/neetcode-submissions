public class Solution {
    public static String sorter(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    public boolean isAnagram(String s, String t) {
        return sorter(s).equals(sorter(t));
    }

}
