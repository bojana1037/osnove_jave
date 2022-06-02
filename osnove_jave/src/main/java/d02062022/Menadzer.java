package d02062022;

//Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
// override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
public class Menadzer extends Radnik {


    @Override
    public double plata() {
        double plata = 0;
        for (int i = 0; i < nizSektora.size(); i++) {
            plata = plata + nizSektora.get(i).getPlataZaSektor();

            }
            return plata;
        }
    }
