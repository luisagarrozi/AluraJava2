public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do método 1");
        metodo2();
        System.out.println("Fim do método 1");
    }

    private static void metodo2() {
        System.out.println("Ini do método 2");
        for (int a = 1; a <= 5; a++) {
            System.out.println(a);
            try {
                int i = a / 0;
            } catch (ArithmeticException | NullPointerException ex) {
                String msg = ex.getMessage();
                System.out.println("Exception" + msg);
            }

        }
        System.out.println("Fim do método 2");
    }
}
