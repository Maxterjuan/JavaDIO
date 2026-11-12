public class Main {
    public static void main(String[] args) {
        DefesaFacade defesa = new DefesaFacade();
        Zumbi zumbi = new Zumbi(40);

        defesa.plantarEAtacar("Disparaervilha", 30, new TiroDeErvilha(), zumbi);
        defesa.plantarEAtacar("Duplaervilha", 40, new TiroDuploDeErvilha(), zumbi);
        defesa.plantarEAtacar("PimentaJalapeno", 50, new ExplosaoDePimenta(), zumbi);
    }
}