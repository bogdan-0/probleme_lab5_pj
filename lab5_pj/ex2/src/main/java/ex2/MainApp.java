package main.java.ex2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class MainApp {

    public static void scriere(List<PerecheNumere> lista) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("src/main/resources/perechi.json");
            mapper.writeValue(file, lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static List<PerecheNumere> citire() {
        try {
            File file = new File("src/main/resources/perechi.json");
            ObjectMapper mapper = new ObjectMapper();
            List<PerecheNumere> perechi = mapper
                    .readValue(file, new TypeReference<List<PerecheNumere>>() {});
            return perechi;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        List<PerecheNumere> lista = new ArrayList<PerecheNumere>();
        lista.add(new PerecheNumere(5, 8));
        lista.add(new PerecheNumere(12, 21));
        lista.add(new PerecheNumere(24, 68));

        scriere(lista);

        List<PerecheNumere> perechiCitite = citire();
        System.out.println("Lista citita din fisierul JSON: " + perechiCitite);

        for (PerecheNumere p : perechiCitite) {
            System.out.println("\nPerechea: " + p);
            System.out.println("Consecutive in sirul lui Fibonacci: " + p.suntConsecutiveFibonacci());
            System.out.println("Cel mai mic multiplu comun: " + p.cmmmc());
            System.out.println("Au suma cifrelor egala: " + p.auSumaCifrelorEgala());
            System.out.println("Au acelasi numar de cifre pare: " + p.auAcelasiNumarCifrePare());
        }
    }
}