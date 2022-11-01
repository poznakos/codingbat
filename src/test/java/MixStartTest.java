import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MixStartTest {

    @Test
    void mixStart_when_mix_snacks_make_true() {
        MixStart systemUnderTest = new MixStart();
        assertEquals(true, systemUnderTest.mixStart("mix snakc"));
    }
    @Test
    void mixStart_when_pix_snacks_make_true() {
        MixStart systemUnderTest = new MixStart();
        assertEquals(true, systemUnderTest.mixStart("pix snakc"));
    }
    @Test
    void mixStart_when_piz_snacks_make_false() {
        MixStart systemUnderTest = new MixStart();
        assertEquals(false, systemUnderTest.mixStart("piz snakc"));
    }
    @Test
    void mixStart_when_nix_make_true() {
        MixStart systemUnderTest = new MixStart();
        assertEquals(true, systemUnderTest.mixStart("nix"));
    }
    @Test
    void mixStart_when_ni_make_false() {
        MixStart systemUnderTest = new MixStart();
        assertEquals(false, systemUnderTest.mixStart("ni"));
    }
    @Test
    void mixStart_when_n_make_false() {
        MixStart systemUnderTest = new MixStart();
        assertEquals(false, systemUnderTest.mixStart("n"));
    }
    @Test
    void mixStart_when_empty_make_false() {
        MixStart systemUnderTest = new MixStart();
        assertEquals(false, systemUnderTest.mixStart(""));
    }

}