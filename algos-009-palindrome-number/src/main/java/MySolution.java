public class MySolution {

    public boolean isPalindrome(int x) {
        String straight = String.valueOf(x);
        String reverse = new StringBuilder(straight).reverse().toString();
        return reverse.equals(straight);
    }
}
