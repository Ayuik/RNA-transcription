package dev.ayelen.rnatranscription.models;

import java.util.ArrayList;
import java.util.List;

import dev.ayelen.rnatranscription.enums.nucleotides;

public class DNA {
    protected List<nucleotides> dnaStrand = new ArrayList<>();

    public DNA() {
        this.dnaStrand = dnaStrand;
    }

    public void setDNAstrand(nucleotides nucleotide) {
        if (nucleotide == nucleotides.U){
            return;
        }
        dnaStrand.add(nucleotide);
    }

    public List<nucleotides> getDNAstrand() {
        return dnaStrand;
    }

    
}
