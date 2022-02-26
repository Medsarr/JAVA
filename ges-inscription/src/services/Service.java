/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.DaoAdmin;
import dao.DaoClasse;
import dao.DaoClasseProffesseur;
import dao.DaoProffesseur;
import entity.Admin;
import entity.Classe;
import entity.Proffesseur;
import java.util.ArrayList;

/**
 *
 * @author Utilisateur
 */
public class Service extends IService{
    private final DaoClasse daoClasse=new DaoClasse();
    private final DaoProffesseur daoProfesseur=new DaoProffesseur();
    private final DaoClasseProffesseur daoClasseProfesseur=new DaoClasseProffesseur();
    private final DaoAdmin daoAdmin=new DaoAdmin();

    /**
     *
     * @param classe
     * @return
     */
    @Override
    public boolean ajoutClasse(Classe classe) {
        return daoClasse.insert(classe)!=0;
    }

    @Override
    public boolean modifierClasse(Classe classe) {
         return daoClasse.update(classe)!=0;
    }

    public boolean supprimerClasse(int id) {
        return daoClasse.delete(id)!=0;
    }

    @Override
    public ArrayList<Classe> listerClasse() {
        return daoClasse.selectAll();
    }
    
    public boolean ajouterProfesseur(Proffesseur professeur) {
        return daoProfesseur.insert(professeur)!=0;
    }

    public boolean affecterClasse(Proffesseur professeur, ArrayList<Proffesseur> classes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Proffesseur> listerProfesseur() {
        return daoProfesseur.selectAll();
    }

    public ArrayList<Classe> filtrerClasseProfesseur(Proffesseur professeur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Admin seConnecter(String login, String password) {
        return daoAdmin.selectAdminByLoginAndPassword(login,password);
    }
    
}
