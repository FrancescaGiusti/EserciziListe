package it.prova.utility;

import java.util.List;

public class Assicurato {
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private int rataPremioAssicurativo;

    public Assicurato(){}

    public Assicurato(String nome, String cognome, String codiceFiscale, int rataPremioAssicurativo){
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.rataPremioAssicurativo = rataPremioAssicurativo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return this.codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public int getRataPremioAssicurativo() {
        return this.rataPremioAssicurativo;
    }

    public void setRataPremioAssicurativo(int rataPremioAssicurativo) {
        this.rataPremioAssicurativo = rataPremioAssicurativo;
    }

    public boolean presenteInElenco(List<Assicurato> assicurati){
        for (int i = 0; i < assicurati.size(); i++){
            if(this.equals(assicurati.get(i))){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }
        Assicurato a = (Assicurato)o;
        return this.getNome().equalsIgnoreCase(a.getNome()) && this.getCognome().equalsIgnoreCase(a.getCognome()) && this.getCodiceFiscale().equalsIgnoreCase(a.getCodiceFiscale()) && this.getRataPremioAssicurativo() == a.getRataPremioAssicurativo();
    }

    @Override
    public String toString(){
        return "Nome e Cognome: " + this.nome + " " + this.cognome + ", codice fiscale: " + this.codiceFiscale + ", rata assicurativa: " + this.rataPremioAssicurativo + " euro";
    }
}
