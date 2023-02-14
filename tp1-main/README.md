# TP1

## Démarrer

Depuis le dépôt, cliquez sur “fork” et créez votre propre dépôt avec le
nom `r402-tp1-nom-prenom`, sur lequel vous travaillerez. Assurez-vous que
ce dépôt est accessible à l’enseignant chargé de TP.

Une fois le nouveau dépôt cloné sur votre machine, vous pouvez lancer
le projet dans IntelliJ en ouvrant le fichier `pom.xml`

## Fichiers

Le ficher `src/test/java/TP1Tests.java` est celui où vous placerez les
tests à écrire dans les exercices 1 et 4. Il contient quelques
exemples de tests simples.

Le fichier `src/main/java/TP1.java` contient les méthodes à
tester. Vous pouvez modifier la méthode `main` pour utiliser le
débogueur, ainsi que les méthodes `sort`, `sortSegment`,
`mergeSortedSubarrays` pour l'exercice 4. Les autres méthodes ne
doivent pas être modifiées.

Le dossier `src/main/java/ecommerce` contient une petite application
que vous pourrez découvrir avec le débogueur (exercice 3). Les classes
de ce dossier ne doivent pas être modifiées.



## Réponses

### 1 Défauts, erreurs et défaillances



- indexOfLastOccurrence: `La boucle ne passe jamais par dessus le premier élément du tableau`


- countOddElements : `Un nombre impaire négatif modulo 2 renvoie -1 et n'est donc pas compté dans la somme`


- average : `la variable SUM n'étant pas définie comme double, la fonction renvoie toujours un entier même si la moyenne est flottante`



### 2 Débogueur pour l’analyse des états d’exécution


##### 1

- i=18
- i=18
- i=6
- i=2
- i=1

##### 2

- j=22


##### 3

- 114


### 3  Débogueur pour l’analyser d’une application complexe

##### 1

accountCreation = LocalDate
-	day = 8
-	month = 2
-	year = 2023

firstname = "Jean"

id = 0

lastname = "Dupont"

preferredDeliveryAdress = null

premiumAccount = false

shoppingCart = Multiset<T> (vide)



- Multiset<T>.add(T)
----- HashMap<K,V>.get(Object) 
--------HashMap<K,V>.getNode(Object)
----- Integer.valueOf(int)

