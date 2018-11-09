package fr.iamterror.contacts;

import fr.iamterror.contacts.entities.Contact;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Projet tomcatfreemarker
 * Pour LAERCE SAS
 * <p>
 * Créé le  22/11/2017.
 *
 * @author fred
 * @author student : IAmTerror
 */
public class GestionContacts extends HttpServlet {
    List<Contact> contacts;

    @Override
    public void init(ServletConfig config) throws ServletException {
        String ficNom = config.getInitParameter("fichier");
        ServletContext context = config.getServletContext();
        String nomComplet = context.getRealPath("/WEB-INF/datas/"+ficNom);
        contacts = new ArrayList<Contact>();
        try (
                BufferedReader br = new BufferedReader(
                        new FileReader(nomComplet))) {

            br.readLine(); // sauter l'entête
            String line = br.readLine();

            while (line != null) {
                String[] values = line.split("\\|");
                Contact contact = new Contact();
                contact.setNom(values[0]);
                contact.setPrenom(values[1]);
                contact.setMail(values[2]);
                contact.setTelephone(values[3]);
                contacts.add(contact);
                System.out.println(contact.getNom());
                line = br.readLine();
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("pas de fichier");
        } catch (IOException ioe) {

        }

    }

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {
        String paramNom = httpServletRequest.getParameter("query_nom");
        String paramPrenom = httpServletRequest.getParameter("query_prenom");
        BufferedWriter bw = new BufferedWriter(httpServletResponse.getWriter());
        bw.write("<HTML><BODY>");
        bw.write("<UL>");
        bw.newLine();
        bw.write("<p>"+httpServletRequest.getRequestURI()+"</p>");
        for (Contact contact : contacts
                ) {

            boolean afficherContact = false;

            if(paramNom != null && paramPrenom != null) {
                afficherContact = contact.getNom().toLowerCase().contains(paramNom.toLowerCase()) &&
                        contact.getPrenom().toLowerCase().contains(paramPrenom.toLowerCase());
            } else if (paramNom != null && paramPrenom == null) {
                afficherContact = contact.getNom().toLowerCase().contains(paramNom.toLowerCase());
            } else if((paramNom == null && paramPrenom != null)) {
                afficherContact = contact.getPrenom().toLowerCase().contains(paramPrenom.toLowerCase());
            } else {
                afficherContact = true;
            }

            if (afficherContact) {
                bw.write("<LI>");
                bw.write(contact.toString());
                bw.write("</LI>");
                bw.newLine();
            }
        }
        bw.write("</UL></BODY></HTML>");
        bw.newLine();
        bw.flush();
    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {
        String nom = httpServletRequest.getParameter("ajoutenom");
        String prenom = httpServletRequest.getParameter("ajouteprenom");
        String mail = httpServletRequest.getParameter("ajoutemail");
        String tel = httpServletRequest.getParameter("ajoutenumero");
        Contact nouveau = new Contact();
        nouveau.setPrenom(prenom);
        nouveau.setNom(nom);
        nouveau.setMail(mail);
        nouveau.setTelephone(tel);
        contacts.add(nouveau);
        httpServletResponse.sendRedirect("http://localhost:8080/contact");
    }
}
