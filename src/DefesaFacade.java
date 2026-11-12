public class DefesaFacade {

    public void plantarEAtacar(String planta, int custo, Ataque ataque, Zumbi zumbi) {
    System.out.println("--- " + planta + " ---");

    boolean pagou = CofreDeSol.pegar().gastar(custo);
    if (!pagou) {
        System.out.println("Sol insuficiente! Saldo: " + CofreDeSol.pegar().verSaldo());
        System.out.println();
        return;
    }

    int dano = ataque.causarDano();
    zumbi.receberDano(dano);

    System.out.println("Usou " + ataque.nome() + " e causou " + dano + " de dano.");
    if (zumbi.estaMorto()) {
        System.out.println("Zumbi derrotado!");
    } else {
        System.out.println("Zumbi ainda tem " + zumbi.verVida() + " de vida.");
    }
    System.out.println("Sol restante: " + CofreDeSol.pegar().verSaldo());
    System.out.println();
}
}
