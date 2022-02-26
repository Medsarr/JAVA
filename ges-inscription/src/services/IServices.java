/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entity.Classe;
import entity.Proffesseur;
import java.util.ArrayList;

/**
 *
 * @author MOUHAMED L SARR
 */
public class IService {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entity.Classe;
import entity.Proffesseur;
import java.util.ArrayList;

/**
 *
 * @author MOUHAMED L SARR
 */
public class IService {
    
    //use case classe
    boolean ajoutClasse (Classe classe);
    boolean modifierClasse (Classe classe);
    boolean supprimerClasse (Classe classe);
    ArrayList<Classe> listerClasse();
 
    //affecter classe
  boolean ajouterPoffesseur (Proffesseur proffesseur);
    boolean affecterClasse (Proffesseur proffesseur) ArrayList<Classe> classe ;
}

}
