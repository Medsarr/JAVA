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
public class Proffesseur {
    private String grade;
    private String nci;
    
     //proprieté de navigation
    private final Proffesseur.ArrayList<Proffesseur> Proffesseur=new Proffesseur.ArrayList();
     public Proffesseur.ArrayList<Proffesseur> getProffesseur() {
         return Proffesseur;
     }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getNci() {
        return nci;
    }

    public void setNci(String nci) {
        this.nci = nci;
    }

    private static class ArrayList<T> {

        public ArrayList() {
        }
    }
}
