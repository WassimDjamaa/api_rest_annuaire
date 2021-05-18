# api_rest_annuaire

##  Table des matières

- [Membres de l'équipe](#teamMembers)
- [Le projet](#project)
- [Les échanges questions/réponses](#poll/res)


## <a name="teamMembers"> Membres de l'équipe

- "Djamaa Wassim"
- "Caruyer Claire"
- "Goguillon Olivia"

##  <a name="project"> Le projet
  
  Le but est de faire une api REST an java à l'aide de SpringBoot avec maven et de faire des tests unitaires et des tests automatisés de l'interface.
  Pour cela nous devons utiliser Junit pour les test unitaires, les test d'API avec Cucumber et enfin sonarqub.
  L'API est un annuraire, elle contient des personnes ayant pour informtions : un id, un nom, un prenom, la date de naissance, l'adresse postale , l'email et son numéro de téléphone
  
  
 ##  <a name="poll/res"> Les questions et réponses échangées.
  
  * "Questions:"
    * 1: Combien faut-il de tests pour tester correctement ce programme ? 
        Soit le programme suivant :
        Exigence 1. Lecture de 3 entiers entrées par un utilisateur sur la console
        Exigence 2. Les trois entiers représentent la longueur des côtés d’un triangle
        Exigence 3. Le programme affiche si le triangle est : 
        E3.1 Scalène  (cotés différents)
        E3.2 Isocèle
        E3.3 Equilatéral
    * 2: Par rapport à l’activité du test , quel est pour vous une phrase correcte , liant les effets de cause à conséquence autour de ces 3 mots : 
        Défaut
        Erreur
        Anomalie
    * 3: Est ce suffisant comme partitions ? 
      ![image](https://user-images.githubusercontent.com/48274610/118645082-c7f0c580-b7de-11eb-91c2-c11858e24862.png)
        Supposons que l’on ait à tester une fonction Lendemain qui calcule le lendemain d’une date passée en paramètre et définie par trois entiers : Jour, Mois, et Année. 
      On considère (arbitrairement) que l’année doit être plus grande que 1000 et plus petite que 3000. On doit prendre en compte les années bissextiles. 
      Pour cela on commence par prendre en compte les contraintes élémentaires sur les paramètres en entrées. 
    * 4: Que doit-on séléctionner pour la création du projet avec Mongodb ? (Question par mail)

* Les réponses:
  * Pour Wassim :
  
  * Pour Claire:
    * Réponse 1 :
      3 entrées => 

        on doit vérifier si on a bien trois entrées
        on doit vérifier si les entrées sont conformes aux types d'entrée attendues (ex: double pour les longueurs )
        on doit vérifier qu'ils ne soient pas null ou >0 

        on doit vérifier si il est possible que cela soit un triangle 
        (ex: si un coté fait 1 m et que les autres font 10 cm ce n'est pas possible que cela soit un triangle)
         Il faut que la somme des 2 autres côtés soit supérieure à la longueur du plus grand côté.
        il faut trouvé le coté le plus long ! 
            on test si coté1>coté2 ||coté2>coté3 || coté3>coté1 
            on compare le coté le plus long a la somme des deux autres cotés 
            si il peut être un triangle alors on continue les tests

        on test si tout les cotés sont égaux :
        coté1==coté2==coté3
        si deux cotés sont égaux :
        coté1 == coté2 || coté2 == coté3 || coté 3 == coté1
        sinon
        coté1 != coté2 || coté2 != coté3 || coté 3 != coté1

        au moins 7-8 tests
  
    * Réponse 2: L'erreur humaine de rentrer une donnée non conforme peut entraîner un défaut  qui peut retourner une anomalie
    * Réponse 3:
  
  * Pour Olivia:
  * Réponse 4:"Bonjour,
               Vous pouvez prendre la troisième option, c'est une des implémentations les plus basiques d'un connecteur mongo.
               J'ai peur qu'avec le premier module l'aspect réactif ne vous pose des soucis.
               Donc Spring Data MongoDB fera l'affaire.
               Merci
               Vincent."
  
  
