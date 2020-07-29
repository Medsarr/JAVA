<!doctype html>
<html>
	<head>
		<title> Commentaire</title>
		<meta charset="utf-8">
		<?php ?>

	</head>
	 <body>
		<?php ?>
		<form method="post" action="target.php">
 	<h1>Ajouter un commentaire</h1>
	<p>
		<label for="Votre nom"> Prenom</label>
    	<input type="text" name="prenom" id="prenom">
	</p>
	<p>
		<label for="Email">Email</label>
    	<input type="password" name="Email" id="Email">
	</p>

	<p>
		<label for="Page d'acceuil">Page d'acceuil</label>
    	<input type="text" name="Page d'acceuil" id="Page d'acceuil">
	</p>

	<p>
		<label for="Commentaire">Commentaire</label>
    	<input type="text" name="Commentaire" id="Commentaire">
	</p>


	<p>
		<input type="submit" value="Enregistrer">
		<input type="submit" value="Aperçu">
	</p>
 
</form>
	</body>


</html>
