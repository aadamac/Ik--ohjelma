public class App {
    public static void main(String[] args) throws Exception {
        int ika = 45;

        if (ika >= 0 && ika < 18) {
            System.out.println("Olet alaikäinen");
            if (ika >= 15) {
                System.out.println ("Saat ajaa mopolla");
             }
             if (ika >= 16) {
                System.out.println("Saat ajaa kevarilla");
            }
        } else if (ika >= 65) {

            System.out.println("Olet eläkeläinen");

            if (ika >= 58 && ika < 65) {

                System.out.println("Voit jäädä varhaiseläkkelle");

            }

            if (ika == 65) {

                System.out.println("Hyviä eläke päiviä");
            }

        } else {
            System.out.println("Olet aikuinen");

            if (ika >= 40 && ika <= 50); {

         System.out.println("Hyvää keski-ikää");
        }

            if (ika == 100) {

            System.out.println ("Olet juuri täyttänyt 100");
            System.out.println ("Paljon onnea");
            System.out.println ("Toivotamme sinulle onnellisa tulevia vuosia");
        }

            
            if (ika == 18) {
                System.out.println("Olet juuri tullut täysi-ikäiseksi, saat ajaa autoa.");
            
            }
            if (ika % 10 == 0) {
                System.out.println("Onnittelut, olet juuri täyttänyt tasavuosia");
            }  
        }
    }
}