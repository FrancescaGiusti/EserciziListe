package it.prova.test;

import it.prova.utility.Assicurato;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAssicurato {
    public static void main(String[] args){
        //Test per vedere se un assicurato è presente nella lista
        List<Assicurato> assicurati = new ArrayList<>(Arrays.asList(new Assicurato("Mario", "Rossi", "MSGET543MN745", 158), new Assicurato("Gaia", "Bianchi", "SAFSG63523SFGT6", 200)));
        Assicurato cliente = new Assicurato("Mario", "Rossi", "MSGET543MN745", 158);
        Assicurato cliente2 = new Assicurato("Matteo", "Ricci", "FASDJSFY53427F", 130);
        boolean result1 = cliente2.presenteInElenco(assicurati);
        System.out.println("La persona cercata è presente in elenco? " + result1);

        //Test per vedere quanti assicurati hanno il cognome che inizia una certa lettera
        List<Assicurato> assicurati2 = new ArrayList<>(Arrays.asList(new Assicurato("Mario", "Rossi", "MSGET543MN745", 158), new Assicurato("Gaia", "Bianchi", "SAFSG63523SFGT6", 200)));
        assicurati2.add(new Assicurato("Matteo", "Ricci", "FASDJSFY53427F", 130));
        int result2 = quantiConInizialeNelCognome(assicurati2, 'R');
        System.out.println("Quanti assicurati hanno il cognome che inizia con la stessa lettera? " + result2);

        //Test per estrapolare la lista di cognomi degli assicurati
        List<Assicurato> assicurati3 = new ArrayList<>(Arrays.asList(new Assicurato("Mario", "Rossi", "MSGET543MN745", 158), new Assicurato("Gaia", "Bianchi", "SAFSG63523SFGT6", 200), new Assicurato("Matteo", "Ricci", "FASDJSFY53427F", 130)));
        List<String> cognomi = estraiSoloICognomi(assicurati3);
        System.out.println("Ecco la lista di cognomi: " + cognomi);

        //Test per estrarre gli assicurati con rata maggiore di un certo input
        List<Assicurato> assicurati4 = new ArrayList<>(Arrays.asList(new Assicurato("Mario", "Rossi", "MSGET543MN745", 158), new Assicurato("Gaia", "Bianchi", "SAFSG63523SFGT6", 200), new Assicurato("Matteo", "Ricci", "FASDJSFY53427F", 130)));
        List<Assicurato> assicuratiConRataMaggiore = estraiQuelliConRataMaggioreDi(assicurati4, 80);
        System.out.println("Ecco la lista degli assicurati con rata maggiore di quella indicata: " + assicuratiConRataMaggiore.toString());
    }


    static int quantiConInizialeNelCognome(List<Assicurato> assicurati, char iniziale){
        int result = 0;
        for (int i = 0; i < assicurati.size(); i++){
            if (assicurati.get(i).getCognome().charAt(0) == iniziale){
                result++;
            }
        }
        return result;
    }

    public static List<String> estraiSoloICognomi(List<Assicurato> assicurati){
        List<String> cognomi = new ArrayList<>();
        for (int i = 0; i < assicurati.size(); i++){
            cognomi.add(assicurati.get(i).getCognome());
        }
        return cognomi;
    }

    public static List<Assicurato> estraiQuelliConRataMaggioreDi(List<Assicurato> assicurati, int sogliaRata){
        List<Assicurato> result = new ArrayList<>();
        for(int i = 0; i < assicurati.size(); i++){
            if (assicurati.get(i).getRataPremioAssicurativo() > sogliaRata){
                result.add(assicurati.get(i));
            }
        }
        return result;
    }


}
