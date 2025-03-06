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
        List<nucleotides> DNAstrand = new ArrayList<>();
        dna.setRNAstrand(nucleotides.G);
        dna.setRNAstrand(nucleotides.C);
        dna.setRNAstrand(nucleotides.T);
        dna.setRNAstrand(nucleotides.A);
        assertThat(DNAstrand, contains (nucleotides.G));
        assertThat(DNAstrand, hasSize (4));
    }
    
}
