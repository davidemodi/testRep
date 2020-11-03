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
public class ProgFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Film f1 = new Film("Tenet", "Christopher Nolan", "azione", 2020, 150);
        Film f2 = new Film("Il Buono,Il Brutto e Il Cattivo", "Sergio Leone", "western", 1966, 238);
        Film f3 = new Film(f2);
        
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        
        //test confronto Film
        if(f1.equals(f2)==true){
            System.out.println("i film sono uguali");
        } else {
            System.out.println("i film non sono uguali");
        }
        
        //test confronto durata
        if (f1.conDurata(f2)==1){
            System.out.println("il film "+f1.getTitolo()+ " è più lungo del film "+f2.getTitolo());
        }
        if (f1.conDurata(f2)==0){
            System.out.println("il film "+f1.getTitolo()+ " e il film "+f2.getTitolo()+" hanno la stessa durata");
        }
        if (f1.conDurata(f2)==-1){
            System.out.println("il film "+f1.getTitolo()+ " è più corto del film "+f2.getTitolo());
        }
        
        //test confronto regista
        String regista = "Christopher Nolan";
        if (f2.equalsregista(regista)==true){
            System.out.println("il regista del film "+f2.getTitolo()+" è "+regista);
        } else{
            System.out.println("il regista del film "+f2.getTitolo()+" non è "+regista);
        }
        
        //test confronto anno
        int anno = 2010;
        if (f2.equalsanno(anno)==true){
            System.out.println("il film "+f2.getTitolo()+" è uscito nel "+anno);
        } else{
            System.out.println("il film "+f2.titolo()+" non è uscito nel "+anno);
        }
        
    }
}

