<html>
<body>

<form action="contact" method="get">
    <div>
        <label for="query_nom">Entrer un nom :</label>
        <input type="text" id="query_nom" name="query_nom" />
    </div>
    <br />
    <div>
        <label for="query_prenom">Entrer un prenom :</label>
        <input type="text" id="query_prenom" name="query_prenom" />
    </div>
    <br />
    <div class="button">
        <button type="submit" name=validez">Validez votre recherche</button>
    </div>
</form>

<form action="contact" method="post">
    <div>
        <label for="ajoutenom">Entrer un nom :</label>
        <input type="text" id="ajoutenom" name="ajoutenom" />
    </div>
    <br/>
    <div>
        <label for="ajoutenumero">Entrer un prenom :</label>
        <input type="text" id="ajouteprenom" name="ajouteprenom" />
    </div>
    <br />
    <div>
        <label for="ajoutemail">Entrer une adresse mail :</label>
        <input type="text" id="ajoutemail" name="ajoutemail" />
    </div>
    <br />
    <div>
        <label for="ajoutenumero">Entrer un numero de telephone :</label>
        <input type="text" id="ajoutenumero" name="ajoutenumero" />
    </div>
    <br />
    <div class="button">
        <button type="submit" name=validez">Ajouter un contact</button>
    </div>
</form>

</body>
</html>
