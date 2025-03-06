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
        }
        return rnaStrand;
        }
            
    }
