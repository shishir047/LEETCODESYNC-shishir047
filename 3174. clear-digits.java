class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        while (true) {
            int digitIndex = findFirstDigitIndex(sb);
            if (digitIndex == -1) {
                break;
            }
            int nonDigitIndex = findClosestNonDigitToLeft(sb, digitIndex);
            sb.deleteCharAt(digitIndex);
            if (nonDigitIndex != -1) {
                sb.deleteCharAt(nonDigitIndex);
            }
        }
        return sb.toString();
    }
    
    private int findFirstDigitIndex(StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
    
    private int findClosestNonDigitToLeft(StringBuilder sb, int digitIndex) {
        for (int i = digitIndex - 1; i >= 0; i--) {
            if (!Character.isDigit(sb.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
}