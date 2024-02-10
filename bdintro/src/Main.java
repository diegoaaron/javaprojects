public class Main {
    public static void main(String[] args) {

        Personaje p1 = new Personaje();
        p1.recibirDano(50);
        System.out.println(p1.estaVivo());

        Item casco = new Item();
        casco.setDefensa(5);

        Item escudo = new Item();
        escudo.setDefensa(30);

        Item botas = new Item();
        botas.setDefensa(2);

        Item espada = new Item();
        espada.setAtaque(60);

        p1.getItems().add(casco);
        p1.getItems().add(escudo);
        p1.getItems().add(botas);
        p1.getItems().add(espada);

        Personaje p2 = new Personaje();
        Item escudoDeMadera = new Item();
        escudoDeMadera.setDefensa(15);
        p2.getItems().add(escudoDeMadera);

        int ataque = p1.getAtaqueTotal();
        int puntosDeDano = p2.getDefensaTOtal() - ataque;
        p2.recibirDano(puntosDeDano);

    }
}