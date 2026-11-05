package test.java.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import ex2.PerecheNumere;

public class TestePerecheNumere {

    @Test
    void test1_fibonacci() {
        PerecheNumere p = new PerecheNumere(5, 8);
        assertEquals(true, p.suntConsecutiveFibonacci());
    }

    @Test
    void test2_fibonacci() {
        PerecheNumere p = new PerecheNumere(13, 8);
        assertTrue(p.suntConsecutiveFibonacci());
    }

    @Test
    void test3_fibonacci() {
        PerecheNumere p = new PerecheNumere(4, 6);
        assertFalse(p.suntConsecutiveFibonacci());
    }

    // 2. Minim 3 teste pentru metoda cmmmc()
    @Test
    void test1_cmmmc() {
        PerecheNumere p = new PerecheNumere(4, 6);
        assertEquals(12, p.cmmmc());
    }

    @Test
    void test2_cmmmc() {
        PerecheNumere p = new PerecheNumere(12, 18);
        assertTrue(p.cmmmc() == 36);
    }

    @Test
    void test3_cmmmc() {
        PerecheNumere p = new PerecheNumere(5, 7);
        assertFalse(p.cmmmc() != 35);
    }

    // 3. Minim 3 teste pentru metoda auSumaCifrelorEgala()
    @Test
    void test1_sumaCifre() {
        PerecheNumere p = new PerecheNumere(12, 21);
        assertEquals(true, p.auSumaCifrelorEgala());
    }

    @Test
    void test2_sumaCifre() {
        PerecheNumere p = new PerecheNumere(15, 60);
        assertTrue(p.auSumaCifrelorEgala());
    }

    @Test
    void test3_sumaCifre() {
        PerecheNumere p = new PerecheNumere(24, 13);
        assertFalse(p.auSumaCifrelorEgala());
    }

    @Test
    void test1_cifrePare() {
        PerecheNumere p = new PerecheNumere(24, 68);
        assertEquals(true, p.auAcelasiNumarCifrePare());
    }

    @Test
    void test2_cifrePare() {
        PerecheNumere p = new PerecheNumere(23, 45);
        assertTrue(p.auAcelasiNumarCifrePare());
    }

    @Test
    void test3_cifrePare() {
        PerecheNumere p = new PerecheNumere(246, 12);
        assertFalse(p.auAcelasiNumarCifrePare());
    }
}