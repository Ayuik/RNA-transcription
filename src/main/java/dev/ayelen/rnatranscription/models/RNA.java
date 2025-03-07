package dev.ayelen.rnatranscription.models;

import java.util.ArrayList;
import java.util.List;

import dev.ayelen.rnatranscription.enums.nucleotides;

public class RNA {
    List<nucleotides> rnaStrand = new ArrayList<>();
    
    public List<nucleotides> provideRNAstrand (List<nucleotides> dnaStrand){
        dnaStrand.iterator();
        if (dnaStrand.contains(nucleotides.G)){
            rnaStrand.add(nucleotides.C);
        } else if (dnaStrand.contains(nucleotides.C)){
            rnaStrand.add(nucleotides.G);
        } else if (dnaStrand.contains(nucleotides.T)){
            rnaStrand.add(nucleotides.A);
        }
        return rnaStrand;
    }
}
