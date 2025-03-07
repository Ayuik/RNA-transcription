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
    List<nucleotides> rnaStrand;


    @BeforeEach
    void setUp(){
        dna = new DNA();
        rna = new RNA();
        rnaStrand = new ArrayList<>();
    }

    @Test
    @DisplayName ("should return C as a complement to G")
    void testProvideRNAStrandReturnsC() {
        dna.setDNAstrand(nucleotides.G);
        rnaStrand = rna.provideRNAstrand(dna.getDNAstrand());
        assertThat(rnaStrand, contains (nucleotides.C));
    }

    @Test
    @DisplayName ("should return G as a complement to C")
    void testProvideRNAStrandReturnsG() {
        dna.setDNAstrand(nucleotides.C);
        rnaStrand = rna.provideRNAstrand(dna.getDNAstrand());
        assertThat(rnaStrand, contains (nucleotides.G));
    }

    @Test
    @DisplayName ("should return A as a complement to T")
    void testProvideRNAStrandReturnsA() {
        dna.setDNAstrand(nucleotides.T);
        rnaStrand = rna.provideRNAstrand(dna.getDNAstrand());
        assertThat(rnaStrand, contains (nucleotides.A));
    }

    @Test
    @DisplayName ("should return U as a complement to A")
    void testProvideRNAStrandReturnsU() {
        dna.setDNAstrand(nucleotides.A);
        rnaStrand = rna.provideRNAstrand(dna.getDNAstrand());
        assertThat(rnaStrand, contains (nucleotides.U));
    }
    
}
