package dev.ayelen.rnatranscription.models;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

public class DNATest {

    @Test
    void testDNA() {
        List<nucleotides> DNAstrand = new ArrayList<>();
        DNA.setNucleotide(nucleotides.G);
        DNA.setNucleotide(nucleotides.C);
        DNA.setNucleotide(nucleotides.T);
        DNA.setNucleotide(nucleotides.A);
        assertThat(DNAstrand, contains (nucleotides.G));
        assertThat(DNAstrand, hasSize (4));
    }
    
}
