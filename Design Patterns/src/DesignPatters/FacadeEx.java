package DesignPatters;

public class FacadeEx {
    public static void main(String[] args){
        CardHolder cardHolder = new CardHolder();
        cardHolder.sendToRicardoRmz(200);
        cardHolder.sendToErikaMedina(500);
        cardHolder.sendToIdaliaNuncio(1000);
    }
}
// Class CardHolder is the facade class
class CardHolder{
    private Transaction ricardormz;
    private Transaction erikamedina;
    private Transaction idalianuncio;
    private int qty = 0;

    public CardHolder(){
        ricardormz = new RicardoRmz();
        erikamedina = new ErikaMedina();
        idalianuncio = new IdaliaNuncio();
    }
    public void sendToRicardoRmz(int qty){
        this.qty = qty;
        ricardormz.send(qty);
    }
    public void sendToErikaMedina(int qty){
        this.qty = qty;
        erikamedina.send(qty);
    }
    public void sendToIdaliaNuncio(int qty){
        this.qty = qty;
        idalianuncio.send(qty);
    }
}
interface Transaction{
    public void send(int qty);
}
class RicardoRmz implements Transaction{
    @Override
    public void send(int qty) {
        System.out.println("You send " + qty + " to Ricardo Rmz");
    }
}
class ErikaMedina implements Transaction{
    @Override
    public void send(int qty) {
        System.out.println("You send " + qty + " to Erika Medina");
    }
}
class IdaliaNuncio implements Transaction{
    @Override
    public void send(int qty) {
        System.out.println("You send " + qty + " to Idalia Nuncio");
    }
}