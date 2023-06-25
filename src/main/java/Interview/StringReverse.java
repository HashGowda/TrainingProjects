public class StringReverse {
        public void reverse(String s) {
            String r = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                r = r + s.charAt(i);
            }
            System.out.println(r);
        }

    public static void main(String[] args) {
        StringReverse r = new StringReverse();
        String s = "Harish Gowda";
        r.reverse(s);
    }
}
