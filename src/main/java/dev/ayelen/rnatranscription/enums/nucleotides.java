package dev.ayelen.rnatranscription.enums;

public enum nucleotides {
    A("ADENINE"),
    C("CYTOSINE"),
    G("GUANINE"),
    T("THYMINE");

    public final String nuc;

    private nucleotides (String nuc){
        this.nuc = nuc;
    }

}
