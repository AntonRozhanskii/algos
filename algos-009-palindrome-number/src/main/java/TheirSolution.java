public class TheirSolution {

    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int halfReverse = 0;
        while (x > halfReverse) {
            halfReverse = halfReverse * 10 + x % 10;
            x /= 10;
        }
        return ( x == halfReverse || x == halfReverse / 10);
    }
}
