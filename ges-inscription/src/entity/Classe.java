/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author MOUHAMED L SARR
 */
public class Classe {
    private int id;
    private String filiere;
    private String niveau;
    
    //proprieté de navigation
    private final ArrayList<Classe> classes=new ArrayList();
     public ArrayList<Classe> getClasse() {
         return classes;
     }
 public Classe (){
 }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    private static class ArrayList<T> {

        public ArrayList() {
        }
    }
    
}
