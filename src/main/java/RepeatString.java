//        There is a string, , of lowercase English letters that is repeated infinitely many times. Given an integer, , find and print the number of letter a's in the first  letters of the infinite string.
//
//        Example
//
//
//        The substring we consider is , the first  characters of the infinite string. There are  occurrences of a in the substring.
//
//        Function Description
//
//        Complete the repeatedString function in the editor below.
//
//        repeatedString has the following parameter(s):
//
//        s: a string to repeat
//        n: the number of characters to consider
//        Returns
//
//        int: the frequency of a in the substring
//        Input Format
//
//        The first line contains a single string, .
//        The second line contains an integer, .
//
//        Constraints
//
//        For  of the test cases, .
//        Sample Input
//
//        Sample Input 0
//
//        aba
//        10
//        Sample Output 0
//
//        7
//        Explanation 0
//        The first  letters of the infinite string are abaabaabaa. Because there are  a's, we return .
//
//        Sample Input 1
//
//        a
//        1000000000000
//        Sample Output 1
//
//        1000000000000
//        Explanation 1
//        Because all of the first  letters of the infinite string are a, we return 1000000000000.
public class RepeatString {

    public static void main(String[] args) {
        String s = "abac";
        int n = 3;
        System.out.println(repeatString(s, n));
    }

    public static long repeatString(String s, long n) {
        long count = 0;
        long len = s.length();
        long times = (n / len);

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        count = count * times;

        int remain = (int) (n % len);
        for (int i = 0; i < remain; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }

    // Find the repeated character in a string = s.
    // The string s will be repeated, and it has to be <= n.
    // For example, if the string is "abac", the repeated character is "a".
    // The function to return the number of times the repeated character appears in the string.
//    public static long my_repeatString(String s, long n) {
//        char repeatedchar = 'a';
//        if (s.length() == 1 && s.charAt(0) == repeatedchar) {
//            return n;
//        }
//        long s_length = s.length();
//        long num_repeated = 0;
//        StringBuffer final_sb = new StringBuffer();
//
//        while(final_sb.length() <= n) {
//                final_sb.append(s);
//        }
//        final_sb.setLength(10);
//        System.out.println(final_sb);
//
//        long count = 0;
//        for (int i = 0; i < final_sb.length(); i++) {
//            if (final_sb.charAt(i) == repeatedchar) {
//                count++;
//            }
//        }
//        return count;
//    }
}