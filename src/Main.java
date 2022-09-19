public class Main {
    private static String productFormatter(String product_name, String date) {
        String string = product_name.replace(" ", "_") + "_" + date;
        return string.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(productFormatter("tenemos un producto aqui", "16/09/1982"));
    }

}
