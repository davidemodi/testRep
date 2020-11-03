/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmmodigliani;

/**
 *
 * @author 4BIA
 */
public class Film {
    private String titolo;
    private String regista;
    private String genere;
    private int anno;
    private int durata;

    //costruttori
    public Film(String titolo, String regista, String genere, int anno, int durata){
    this.titolo=titolo;
    this.regista=regista;
    this.genere=genere;
    this.anno=anno;
    this.durata=durata;
}   
    public Film(){
        titolo = "null";
        regista = "null";
        genere = "null";
        anno = 0000;
        durata = 00;
        
    }
    public void setFilm(String titolo, String regista, String genere, int anno, int durata){
    this.titolo=titolo;
    this.regista=regista;
    this.genere=genere;
    this.anno=anno;
    this.durata=durata;
}
    public Film(Film f){
        titolo=f.getTitolo();
        regista=f.getRegista();
        genere=f.getGenere();
        anno=f.getAnno();
        durata=f.getDurata();
    }
   
    //metodi get
    public String getTitolo(){
     return titolo;   
    }
    public String getRegista(){
     return regista;   
    }
    public String getGenere(){
     return genere;   
    }
    public int getAnno(){
     return anno;   
    }
    public int getDurata(){
     return durata;   
    }
    
    //metodo toString
    public String toString(){
        String ret="titolo: "+titolo+" regista: "+regista+" genere: "+genere+" anno di produzione: "+anno+" durata: "+durata;
        return ret;
    }
    
    //metodo per il confronto di due oggetti
    public boolean equals(Film f){
        boolean ret=false;
        if (toString().equals(f.toString())){
            ret=true;
        }
        return ret;
    }
    
    //metodo per il confronto della durata del film
    public int conDurata(Film f){
        int ret = 2;
        if (durata == f.getDurata()){
            ret = 0;
        }
        if (durata > f.getDurata()){
            ret = 1;
        }
        if (durata < f.getDurata()){
            ret = -1;
        }
        return ret;
    }
    
    //metodo per il confronto dei registi
    public boolean equalsregista(String reg){
        boolean ret=false;
        if (regista.equals(reg)){
            ret=true;
        }
        return ret;
    }
    
    public boolean equalsanno(int annocon){
        boolean ret=false;
        if (anno == annocon){
            ret=true;
        }
        return ret;
    }    
}


 /*
  * public boolean equals(Film f){
  *      boolean ret = false;
  *      if (titolo.equals(f.getTitolo())){
  *          if (regista.equals(f.getRegista())){
  *            if (genere.equals(f.getGenere())){
  *              if (anno==f.getAnno()){
  *                  if (durata==f.getDurata()){
  *                      ret = true;
  *                      }
  *                  }
  *              }  
  *          }
  *      }
  *      return ret;
  *  }
  */