package fr.iamterror.contacts.entities;

/**
 * Projet tomcatfreemarker
 * Pour LAERCE SAS
 * <p>
 * Créé le  22/11/2017.
 *
 * @author fred
 * @author student : IAmTerror
 */
public class Contact {
    private String nom;
    private String prenom;
    private String mail;
    private String telephone;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return this.nom + " " + this.prenom + " " + this.mail + " " + this.telephone;
    }
}
