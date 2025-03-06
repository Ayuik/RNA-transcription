package dev.ayelen.rnatranscription.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.ayelen.rnatranscription.enums.nucleotides;

public class RNATest {
    RNA rna;
    DNA dna;

    @BeforeEach
    void setUp(){
        dna = new DNA();
        rna = new RNA();
    }

    @Test
    @DisplayName ("should return C as a complement to G")
    void testProvideRNAStrand() {
        dna.setDNAstrand(nucleotides.G);
        List<nucleotides> rnaStrand = new ArrayList<>();
        rnaStrand = rna.provideRNAstrand(dna.getDNAstrand());
        assertThat(rnaStrand, contains (nucleotides.C));
    }
    
}
