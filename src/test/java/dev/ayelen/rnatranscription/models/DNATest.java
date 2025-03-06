package dev.ayelen.rnatranscription.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.ayelen.rnatranscription.enums.nucleotides;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;

public class DNATest {
    DNA dna;

    @BeforeEach
    void setUp(){
        dna = new DNA();
    }


    @Test
    void testDNA() {
        dna.setDNAstrand(nucleotides.G);
        dna.setDNAstrand(nucleotides.C);
        dna.setDNAstrand(nucleotides.T);
        dna.setDNAstrand(nucleotides.A);
        assertThat(dna.getDNAstrand(), contains(nucleotides.G, nucleotides.C, nucleotides.T, nucleotides.A));
        assertThat(dna.getDNAstrand(), hasSize (4));
    }

    @Test
    void testGetDNAstrand(){
        List<nucleotides> myDNA = dna.getDNAstrand();
        dna.setDNAstrand(nucleotides.A);
        assertThat(myDNA, hasSize (1));
    }
    
}
