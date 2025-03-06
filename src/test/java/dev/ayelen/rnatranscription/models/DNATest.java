package dev.ayelen.rnatranscription.models;

import org.junit.jupiter.api.Test;

import dev.ayelen.rnatranscription.enums.nucleotides;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

public class DNATest {

    @Test
    void testDNA() {
        DNA dna = new DNA();
        dna.setDNAstrand(nucleotides.G);
        dna.setDNAstrand(nucleotides.C);
        dna.setDNAstrand(nucleotides.T);
        dna.setDNAstrand(nucleotides.A);
        assertThat(dna.dnaStrand, contains(nucleotides.G, nucleotides.C, nucleotides.T, nucleotides.A));
        assertThat(dna.dnaStrand, hasSize (4));
    }
    
}
