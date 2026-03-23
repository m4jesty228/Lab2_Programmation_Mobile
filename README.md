# Laboratoire 2 – Application HabitationAndroid (Android Studio)

**Cours :** Programmation Mobile  
**Date :** 23 Mars 2026  

---

## 1. Introduction

Dans ce deuxième laboratoire, j'ai développé une application Android appelée **HabitationAndroid**. L'objectif était de créer une interface permettant de calculer le montant des impôts locaux d'une habitation en fonction de plusieurs critères : la surface de la maison, le nombre de pièces, et la présence ou non d'une piscine.

L'application contient deux fonctionnalités principales :
- Saisir les informations d'une habitation (nom, adresse, surface, nombre de pièces, piscine)
- Calculer et afficher le détail des impôts locaux au clic d'un bouton

---

## 2. Environnement de travail

- **IDE :** Android Studio
- **Langage :** Java
- **Gestion de version :** Git + GitHub (via Git Bash)
- **Émulateur :** Medium Phone API 36.1

---

## 3. Structure du projet

Le projet suit la structure standard d'un projet Android :

```
HabitationAndroid/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/habitationandroid/
│   │       │   └── MainActivity.java
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   │   └── activity_main.xml
│   │       │   └── values/
│   │       │       ├── strings.xml
│   │       │       └── themes.xml
│   │       └── AndroidManifest.xml
```

---

## 4. Interface graphique – activity_main.xml

Le layout de l'application est défini dans le fichier `activity_main.xml`. J'ai utilisé un `LinearLayout` vertical pour empiler les éléments de haut en bas, avec un thème de couleurs bleu professionnel.

### Explication des éléments
- **LinearLayout** : Conteneur principal avec une orientation verticale. `gravity="center"` centre tous les éléments et `padding="20dp"` ajoute un espace intérieur.
- **Titre** : Un `TextView` avec un fond bleu foncé et du texte blanc, centré en haut de l'écran.
- **input_nom** et **input_adresse** : Champs de saisie texte avec un `hint` indicatif qui disparaît lors de la saisie.
- **input_surface** et **input_pieces** : Champs de saisie numériques (`inputType="number"`) pour la surface en m² et le nombre de pièces.
- **checkbox_piscine** : Case à cocher placée à gauche, côte à côte avec le bouton Calcul dans un `LinearLayout` horizontal.
- **button_calcul** : Bouton qui déclenche le calcul au clic, placé à droite de la checkbox.
- **result** : Zone d'affichage des résultats avec un fond bleu clair, vide au départ et remplie dynamiquement après le calcul.

L'image ci-dessous montre l'aperçu du layout dans Android Studio. On peut y voir la disposition des éléments : le titre en haut, les champs de saisie au centre, la checkbox et le bouton côte à côte, et la zone de résultats en bas.

> <img width="1919" height="1131" alt="image" src="https://github.com/user-attachments/assets/86bd5a9f-9ae7-4668-a4f2-cbb26b537749" />
---

## 5. Logique de l'application – MainActivity.java

Toute la logique de l'application se trouve dans le fichier `MainActivity.java`.

### Explication des éléments clés

- **`setContentView`** : Lie le fichier Java au layout XML correspondant.
- **`findViewById`** : Permet de récupérer chaque composant XML dans le code Java grâce à son identifiant.
- **`setOnClickListener`** : Définit l'action à exécuter lorsque l'utilisateur clique sur le bouton Calcul.
- **`getText().toString()`** : Récupère la valeur saisie dans un `EditText` sous forme de chaîne de caractères.
- **`Double.parseDouble()`** et **`Integer.parseInt()`** : Convertissent les valeurs texte en nombres pour effectuer les calculs.
- **`isChecked()`** : Vérifie si la checkbox Piscine est cochée ou non.
- **`setText()`** : Met à jour le `TextView` des résultats avec les trois valeurs calculées.

Voici l'application au lancement. Les champs sont vides avec les hints visibles, la checkbox est décochée, et la zone de résultats est vide.

> <img width="959" height="568" alt="image" src="https://github.com/user-attachments/assets/948ca20f-a975-404a-9a1e-9ba83f03946e" />

Après avoir rempli les champs et cliqué sur le bouton **Calcul**, les trois résultats s'affichent dans la zone bleue en bas : l'impôt de base, l'impôt supplémentaire et l'impôt total.

> <img width="1919" height="1128" alt="image" src="https://github.com/user-attachments/assets/84f55ad9-3dc9-4a41-aee2-0840fd3ef99b" />

Voici le résultat lorsque la case **Piscine** est cochée. On peut observer que l'impôt supplémentaire augmente par rapport au calcul sans piscine.

> <img width="959" height="565" alt="image" src="https://github.com/user-attachments/assets/a30464a6-507a-43ae-8d5c-6a549a26e35c" />
---

## 6. Mise en ligne sur GitHub

Pour versionner et partager mon projet, j'ai utilisé **Git Bash** de la même façon que pour le premier laboratoire.

> <img width="907" height="275" alt="image" src="https://github.com/user-attachments/assets/25639ca4-ab89-4e02-995c-d2554289fba0" />

La capture ci-dessus montre le résultat du push dans Git Bash. On peut confirmer que le projet a bien été envoyé sur le repository GitHub sans erreur.

Le projet est accessible à l'adresse suivante :  
🔗 [https://github.com/m4jesty228/Lab2_Programmation_Mobile](https://github.com/m4jesty228/Lab2_Programmation_Mobile)

---

## 7. Résultat final

L'application fonctionne correctement :
- Les champs de saisie acceptent bien les valeurs texte et numériques.
- La checkbox Piscine influence bien le calcul de l'impôt supplémentaire.
- Le bouton **Calcul** affiche bien les trois résultats détaillés dans la zone bleue en bas de l'écran
