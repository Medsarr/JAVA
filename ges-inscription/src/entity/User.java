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
public class User {
    protected int id;
    protected String nomComplet;
    //Methode
    //constructeurs
    public User(){
    
    }
    //Getters
    public int getid(){
        return this.id;
}
    public String getnomComplet(){
        return this.nomComplet;
}

    
      //Setters
    public void setid(int id){
        this.id=id;
}
    public void setnomComplet(String nomComplet){
        this.nomComplet=nomComplet;
} 
    
}
