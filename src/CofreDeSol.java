public class CofreDeSol {

    private static CofreDeSol unico;

    private int saldo = 100;

    private CofreDeSol() {
    }

    public static CofreDeSol pegar() {
        if (unico == null) {
            unico = new CofreDeSol();
        }
        return unico;
    }

    public boolean gastar(int quantidade) {
        if (saldo >= quantidade) {
            saldo = saldo - quantidade;
            return true;
        }
        return false;
    }

    public int verSaldo() {
        return saldo;
    }
}
