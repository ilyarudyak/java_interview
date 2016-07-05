package oreilly;

/**
 * Created by ilyarudyak on 7/5/16.
 */
public class SimpleStringWorker implements CharSequence {

    private char[] chars = new char[0];

    public int length() {
        return 0;
    }

    public char charAt(int index) {
        return 0;
    }

    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public String toString() {
        return new String(chars);
    }

    public CharSequence append(CharSequence s) {
        int current = chars.length;
        int more = s.length();
        char[] newChars = new char[current + more];

        // copy chars to newChars
        System.arraycopy(chars, 0, newChars, 0, current);

        // copy s to newChars starting from current position
        System.arraycopy(s.toString().toCharArray(), 0, newChars, current, more);
        chars = newChars;

        return this;
    }
}
