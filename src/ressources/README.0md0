# TomcatFirstContact #

Accès aux contacts en lecture seule.

Ce projet comporte deux points d'entrée depuis le client:

**GET** `http://localhost:8080/` qui correspond au contenu de la page HTML

**GET** `http://localhost:8080/contact` qui correspond à l'appel de la méthode doGet de GestionContacts

**GET** `http://localhost:8080/contact?toto=NAN` qui illustre le passage de paramètre par une requête GET, 'NAN' peut être changé par d'autres valeurs

### Travaux pratiques

###### Faire en sorte que la méthode doGet retourne en les noms et autres informations liées à un contact depuis la méthode toString de l'objet Contact

###### Faire en sorte que l'appel à doGet gère différents scénarios:

**GET** `http://localhost:8080/contact?query_nom=toto` renvoie uniquement la liste avec les personnes ayant pour nom 'toto'

**GET** `http://localhost:8080/contact?query_prenom=tartempion` renvoie uniquement les liste des personnes ayant pour prénom 'tartempion'

**GET** `http://localhost:8080/contact?query_prenom='VAL1'&query_nom='VAL2'` renvoie le résultat pour les personnes ayant le nom et le mail correspondant

Astuce, utiliser:
 ```request.getParameter('NOM_DU_PARAMETRE')```
 
Se référer au bout de code du paramètre 'toto' dans la méthode doGet.

###### Faire en sorte que les critères de recherche ne soient pas sensibles à la casse (aux majuscules et minuscules) et qu'ils constituent une partie du résultat

Par exemple, la recherche du prénom sur 'ma' pourra renvoyer des résultats comme 'Marie', 'Amandine', etc.

Trouver la méthode dans la documentation de l'objet String: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
 
 
###### Créer des formulaires pour lancer les recherches avec les critères précédents

Même fonctionnement que pour POST sauf qu'il faut préciser method='GET'.

Il faudra plusieurs enchaînements de <form>
        
###### Créer la méthode doPost permettant depuis cette requête HTTP:

  **POST** `http://localhost:8080/contact` qui correspond à l'appel doPost de GestionContacts

  1. ajouter un nouveau contact dans la liste des contacts
 
  2. depuis le formulaire que vous allez créer dans index.jsp, envoyer la requête
 
  3. rediriger la requête vers doGet pour afficher la liste

