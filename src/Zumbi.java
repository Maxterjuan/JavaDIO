// É um zumbi normal com 40 de vida
public class Zumbi {

    private int vida;

    public Zumbi(int vida) {
        this.vida = vida;
    }

    public void receberDano(int dano) {
        vida = vida - dano;
    }

    public int verVida() {
        return vida;
    }

    public boolean estaMorto() {
        return vida <= 0;
    }
}