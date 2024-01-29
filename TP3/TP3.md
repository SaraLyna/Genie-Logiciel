### TP de GL en JAVA
Sara Lyna OUYAHIA


## Contexte :

Reprise du projet de COO de Thibault Tisserand :

`https://gitlab-etu.fil.univ-lille.fr/thibault.tisserand.etu/projet-coo`


## Présentation Globale du projet :

# Utilité du projet

Ce dépot contient le code source du projet de COO de L3S5. Il s'agit d'un système de gestion de vélos en libre-service,
en appliquant les patrons de conception vus en cours.
le projet est sous Java 11, avec Maven 3.1.0, JUnit 5.10.0 et JaCoCo 0.8.4.
Le Main présent dans le package fil.l3.coo permet de montrer l'application du Centre de Contrôle et de sa stratégie de répartition,
avec le temps pris en compte.


# Description du projet :

Le readme est pertinent, il y a l'UML, les différents patterns utilisés, les commandes essentielles pour faire marcher le projet telle la compilation et l'exécution.

Sauf qu'en soi le projet n'est pas vraiment décrit dans le readme, on ne sait pas exactement ce qu'il fait , ni qui a fait quoi.
Il manque des choses.


## Historique du logiciel :

# Analyse du git :
contributeurs : 2
Mohamed Zidani
59 commits (mohamed.zidani.etu@univ-lille.fr)


Thibault Tisserand
47 commits (thibault.tisserand.etu@univ-lille.fr) 

on peut remarquer que Thibault Tisserand a moins de commit mais rien de méchant,
il serait plus pertinent de voir le contenu de ces commit avant d'en juger.

Le projet n'est plus actif à l'heure d'aujourd'hui, mais lors de sa conception on peut dire que les commit étaient réguliers de la part de Thibualt Tisserand, il était à jour sur l'avancement du projet contrairement à Mohamed Zidani qui avait des commit inutiles"" vers la fin.



Au total il y a six branches distinctes, une pour chaque pattern utilisé et la dernière pour le main,
on peut remarquer sur les différentes branches que le contributeur qui avait le plus de commit était Thibault Tisserand, on voit son implication.



## Architecture logicielle :

# Utilisation de bibliothèques extérieures :

le nombre de bibliothèques extérieures référencées : 

la différence entre les bibliothèques référencées et celles utilisées :

les bibliothèques réellement utilisées :
 
 
# Organisation en paquetages :

le nombre de paquetages :

les liens entre les paquetages :

les noms des paquetages :




# Répartition des classes dans les paquetages :

 le nombre de classes par paquetage :
 
 la répartition des classes dans les différents paquetages : 
 
 le couplage et la cohésion au sein des paquetages de quelques uns en
particulier :




# Organisation des classes :

la hiérarchie des classes :

la profondeur de l’arbre d’héritage (DIT ) :

le nombre d’enfants par classes (min, max ou moyenne) (NOC ) :
 
la stabilité des classes en général ou de quelques unes en particulier :

la cohésion des classes au sein d’un paquetage en particulier :





## Analyse approfondie :

# Tests :

le nombre de tests : 83 

la couverture de tests : 85.2% (SonarQube) , il y avait 216 lignes à couvrir, 24 n'ont pas été couvertes.


le type de tests : unitaires


les tests passent : 100% des tests passennt avec succès.







# Commentaires :

le nombre de lignes de commentaires :

le type de commentaire: Javadoc, code commenté, licence, commentaire
pertinent :


les parties sans commentaires :




# Dépréciation :

les bouts de code dépréciés (classes, méthodes) :

les appels à du code déprécié :



# Duplication du code :
 
le code dupliqué : 0% Duplications on 648 Lines (SonarQube)
C'est intéressant de remarquer qu'il n y a pas de code dupliqué, 
c'est une bonne chose.
 
 
# God Classes :

le nombre de méthodes par classe (min, max, moyenne, médiane) :

le nombre de variables d’instances par classe (min, max, moyenne, médi-
ane). Comparaison avec les résultats trouvés à la question précédente :


le nombre de lignes de code par classe (min, max, moyenne, médiane),
Comparaison avec les résultats trouvés à la question précédente :


les gods classes :


# Analyse des méthodes :

la complexité cyclomatique des méthodes en général ou de quelques unes
en particulier (avec min, max, moyenne, médiane) :


les commentaires. Les commentaires sont-ils bien placés (les méthodes
avec une plus grande complexité cyclomatique ont elles également le plus grand
nombre de lignes de commentaire) :


le nombre de lignes de codes des méthodes (avec min, max, moyenne,
médiane) :












