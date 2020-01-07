package leaningjava.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int count = 0;
        for (int index = post.length-1; index >=0;index--) {

            if (post[index]!=word[word.length - 1 - count]) {
                result = false;
                break;
            }
            count++;


        }
        return result;
    }
}

