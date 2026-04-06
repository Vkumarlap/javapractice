public class WrapperClassAutoBoxing {
    public static void main(String[] args) {
        Integer a = new Integer(3); // this is called boxing

        Integer b = 3; // this is called auto-Boxing we no need to write new Integer() to wrape element

        int c = b.getInteger("3"); // this is called UnBoxing
        int d = b; // this is called auto-UnBoxing

    }
}
