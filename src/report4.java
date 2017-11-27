public class report4 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        }
        catch(NullPointerException empty) {
            System.out.println("NullPointExceptinが発生!");
            System.out.println(empty.getMessage());
        }
    }
}
