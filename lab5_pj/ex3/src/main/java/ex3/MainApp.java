package main.java.ex3;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class MainApp {


    public static List<Mobilier> citire() {
        try {
            File file = new File("src/main/resources/mobilier.json");
            ObjectMapper mapper = new ObjectMapper();
            List<Mobilier> lista = mapper.readValue(file, new TypeReference<List<Mobilier>>() {});
            return lista;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
        List<Mobilier> pieseMobilier = citire();
        if (pieseMobilier == null) {
            System.out.println("Nu s-au putut citi datele din fisierul mobilier.json.");
            return;
        }

        System.out.println("--- a) Lista pieselor de mobilier citite din JSON ---");
        for (Mobilier m : pieseMobilier) {
            System.out.println(m);
        }

        System.out.println("\n--- b) Elementele de mobilier si placile componente ---");
        for (Mobilier m : pieseMobilier) {
            System.out.println("Piesa de mobilier: " + m.getNume());
            for (Placa p : m.getPlaci()) {
                System.out.println("   " + p);
            }
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n--- c) Introduceti numele piesei de mobilier pentru afisarea placilor: ");
        String numeCautat = scanner.nextLine();
        boolean gasit = false;

        for (Mobilier m : pieseMobilier) {
            if (m.getNume().equalsIgnoreCase(numeCautat)) {
                gasit = true;
                System.out.println("Placile care compun piesa '" + m.getNume() + "' sunt:");
                for (Placa p : m.getPlaci()) {
                    System.out.println("   " + p);
                }
            }
        }
        if (!gasit) {
            System.out.println("Piesa de mobilier '" + numeCautat + "' nu a fost gasita.");
        }

        System.out.print("\n--- d) Introduceti numele corpului de mobila pentru calculul colilor de pal: ");
        String corpCautat = scanner.nextLine();
        boolean corpGasit = false;

        for (Mobilier m : pieseMobilier) {
            if (m.getNume().equalsIgnoreCase(corpCautat)) {
                corpGasit = true;
                int nrColi = m.numarColiPalNecesare();
                System.out.println("Numarul estimativ de coli de pal (2800x2070 mm) necesare pentru '"
                        + m.getNume() + "' este: " + nrColi);
            }
        }
        if (!corpGasit) {
            System.out.println("Corpul de mobila '" + corpCautat + "' nu a fost gasit.");
        }

        scanner.close();
    }
}