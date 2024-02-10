import java.util.ArrayList;
import java.util.List;

public class Personaje {

    private int experiencia;
    private int level;
    private int hp;
    private int mana;
    private int x;
    private int y;
    private String map;
    private List<Item> items;

    public Personaje(){
        hp = 100;
        mana = 100;
        items = new ArrayList<>();
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    // otras funciones
    public void recibirDano(int puntosDeDano) {
        hp -= puntosDeDano;
        if (hp < 0){
            hp = 0;
        }
    }

    public void agregarExperiencia(int puntosDeExperiencia){
        experiencia += puntosDeExperiencia;
    }

    public boolean estaVivo(){
        if(hp <= 0) {
            return false;
        }
        return true;
    }

    public int getDefensaTOtal(){
        int defensaTotal = 0;
        for(Item item: items){
            defensaTotal += item.getDefensa();
        }
        return defensaTotal;
    }

    public int getAtaqueTotal(){
        int ataqueTotal = 0;
        for(Item item: items){
            ataqueTotal += item.getAtaque();
        }
        return ataqueTotal;
    }
}
