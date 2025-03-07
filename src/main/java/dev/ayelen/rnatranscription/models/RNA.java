package dev.ayelen.rnatranscription.models;

import java.util.ArrayList;
import java.util.List;

import dev.ayelen.rnatranscription.enums.nucleotides;

public class RNA {
    List<nucleotides> rnaStrand = new ArrayList<>();
    
    public List<nucleotides> provideRNAstrand (List<nucleotides> dnaStrand){
        for (nucleotides nucleotide : dnaStrand) {
            switch (nucleotide) {
                case G:
                    rnaStrand.add(nucleotides.C);
                    break;
                case C:
                    rnaStrand.add(nucleotides.G);
                    break;
                case T:
                    rnaStrand.add(nucleotides.A);
                    break;
                case A:
                    rnaStrand.add(nucleotides.U);
                    break;
            }
        }
        return rnaStrand;
    }
}
