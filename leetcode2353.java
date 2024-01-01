public class leetcode2353 {
    public static void main(String[] args) {
        minOperations("0100");
    }


    public static int minOperations(String s) {
        int changesStartingWithZero = countChanges(s, '0');
        int changesStartingWithOne = countChanges(s, '1');
        return Math.min(changesStartingWithZero, changesStartingWithOne);
    }

    public static int countChanges(String s, char startChar) {
        int changes = 0;
        char currentChar = startChar;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != currentChar) {
                changes++;
            }
            currentChar = (currentChar == '0') ? '1' : '0';
        }

        return changes;
    }
}
