package d02062022;

//Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
// ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
// suma plata svih sektor / broj sektora * 0.5
// override uje metodu za platu, tako da se plata racuna po formuli:
//(prosecna plata za sve sektore u kojima radi) * (broj sektora).
public class Magacioner extends Radnik {


    private double prosecnaPlata() {
        double plata = 0;
        for (int i = 0; i < nizSektora.size(); i++) {
            plata = plata + nizSektora.get(i).getPlataZaSektor();

            }
            return plata;
    }

        @Override
        public double plata () {
            double plata = 0;
            for (int i = 0; i < nizSektora.size(); i++) {
                plata = plata + nizSektora.get(i).getPlataZaSektor();

                }
                return plata;
            }
        }
