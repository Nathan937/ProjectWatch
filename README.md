# ProjectWatch:

Mitglieder: Hollet Nathan, Jean Fues, Luka Aude, Dantoing Nicolas

## Inhaltsverzeichnis

  1. [Einleitung](#einleitung)
1. [Ziele](#ziele)
1. [Randbedingungen](#randbedingungen)
1. [Build-Anleitung](#build-anleitung)
1. [Kurze Bedienungsanleitung](#kurze-bedienungsanleitung)
1. [User Stories](#user-stories)
1. [Releaseplan](#releaseplan)
1. [Dokumentation Sprint 1](#dokumentation-sprint-1)
    + [Taskliste der User Stories](#taskliste-der-user-stories)
    + [UML Klassen- und Sequenzdiagramme](#uml-klassen-und-sequenzdiagramme)
    + [Dokumentation wichtiger Code Snippets](#dokumentation-wichtiger-code-snippets)
    + [Testfaelle bedingt durch Akzeptanzkritierium](#testfaelle-bedingt-durch-akzeptanzkritierium)
    
1. [Dokumentation Sprint 2](#dokumentation-sprint-2)
    + [Taskliste der User Stories](#taskliste-der-user-stories)
    + [UML Klassen- und Sequenzdiagramme](#uml-klassen-und-sequenzdiagramme)
    + [Dokumentation wichtiger Code Snippets](#dokumentation-wichtiger-code-snippets)
    + [Testfaelle bedingt durch Akzeptanzkritierium](#testfaelle-bedingt-durch-akzeptanzkritierium)
    
1. [Dokumentation Sprint 3](#dokumentation-sprint-3)
    + [Taskliste der User Stories](#taskliste-der-user-stories)
    + [UML Klassen- und Sequenzdiagramme](#uml-klassen-und-sequenzdiagramme)
    + [Dokumentation wichtiger Code Snippets](#dokumentation-wichtiger-code-snippets)
    + [Testfaelle bedingt durch Akzeptanzkritierium](#testfaelle-bedingt-durch-akzeptanzkritierium)
    
  
## Einleitung

Dieses Git- Repository enstand im Rahmen der Kurse Software Engieering und Programmieren mit Java.

## Ziele

Ziel ist es die in den Kursen erlenten Fähigkeiten und Kompetenzen innerhalb eines einzig Projektes zu beweisen. Dazu sollen wir in einem Team eine Uhr mit verschiedenen Funktionen und Eigenschaften programmieren.

## Randbedingungen

Zum Nachbauen:

Java: JDK 8.0 Eclipse Oxygen

Die Umgebungsvariable JAVA_HOME muss korrekt eingestellt sein und java muss im Datei-Pfad gefunden werden.

Einfaches Ausführen:

Java: JRE

## Build-Anleitung

    -Laden Sie sich die Dateien .java auf ihren Pc runter. 
    -N'oubliez pas d'avoir un JRE d'installé sur votre ordinateur
    -Lancer le fichier .jar
    

## Kurze Bedienungsanleitung

Afin de lancer la montre lancer le fichier mainUhr puis ouvrer la barre de tâche, sélectionnez ensuite le format et le
nombre de montre afin d'avoir un résultat s'affichant dans la fenêtre.


## User Stories

![image](https://user-images.githubusercontent.com/26046475/34837925-9db59e5e-f6fc-11e7-8206-2f2061cda5c4.png)

## Releaseplan

![image](https://user-images.githubusercontent.com/26046475/34837889-85b48c3e-f6fc-11e7-818d-b15430d4c8a0.png)

## Informations annexes

Certains fichiers tels que DigitalWatch n'ont plus subis de mofification depuis le Sprint1 ils n'apparaitront qu'une fois en capture d'écran dans le "résumé" qui va suivre.

## Documentation Sprint 1

### - Taskliste der User Stories
    
![image](https://user-images.githubusercontent.com/26046475/34837900-8f198716-f6fc-11e7-9a3d-d1dcd339de73.png)

### - UML Klassen- und Sequenzdiagramme
   
   ![image](https://user-images.githubusercontent.com/26046475/34830996-e83f001c-f6e5-11e7-82ed-2a33bcf2f8e0.png)
   
### - Dokumentation wichtiger Code Snippets

  Ci-dessous une capture d'écran du code de la première DigitalWatch 
  
![image](https://user-images.githubusercontent.com/26046475/34828402-bf6bc77c-f6dd-11e7-9ecf-a921d2fcd1d1.png)
![image](https://user-images.githubusercontent.com/26046475/34828407-c37903de-f6dd-11e7-8933-496a2311baa5.png)
Le code permet d'avoir une montre sur un bouton. On peut afficher jusqu'à 4 bouton afin d'arreter la montre.

  Ci-dessous une capture d'écran du code du MenuBar qui faisait, à ce moment, office de main program

![image](https://user-images.githubusercontent.com/26046475/34828411-c67af628-f6dd-11e7-82c3-897a7ec73eb8.png)
![image](https://user-images.githubusercontent.com/26046475/34828415-c9562aca-f6dd-11e7-8ab1-991ed3f8bbb1.png)
Une fenetre pour choisir ses options.

### - Testfaelle bedingt durch Akzeptanzkritierium

Tout les tests ont été effectué et le programme fonctionne.

## Documentation Sprint 2

### - Taskliste der User Stories
    
![image](https://user-images.githubusercontent.com/26046475/34837903-93735ecc-f6fc-11e7-8d48-5f79acf268bd.png)

### - UML Klassen- und Sequenzdiagramme
   
![image](https://user-images.githubusercontent.com/26046475/34837289-a232369c-f6fa-11e7-802a-77a8abcd29a7.png)

### - Dokumentation wichtiger Code Snippets
   
   Ci-dessous une capture d'écran du code de la AnalogWatch
   
![image](https://user-images.githubusercontent.com/26046475/34828745-cf3164f4-f6de-11e7-8dd6-57d917693792.png)
![image](https://user-images.githubusercontent.com/26046475/34828751-d2ef8f6c-f6de-11e7-801b-728c90cb7f3c.png)
Une montre analogue s'ouvrant sur une fenetre suplémentaire. Elle est sur l'heure courante du systeme d'exploitation.

Ci-dessous une capture d'écran du code du fichier main

![image](https://user-images.githubusercontent.com/26046475/34828766-dc0e435e-f6de-11e7-83c8-b4e0e816678f.png)
![image](https://user-images.githubusercontent.com/26046475/34828770-de0c88dc-f6de-11e7-9838-ad565dd937b4.png)
Le main donne acces a la montre analogue et la montre digitale qui s'affiche egalement sur une autre fenetre en heure
courante.
   
### - Testfaelle bedingt durch Akzeptanzkritierium

Tout les tests ont été effectué et le programme fonctionne.

## Documentation Sprint 3

### - Taskliste der User Stories
  
![image](https://user-images.githubusercontent.com/26046475/34837913-9877aa2c-f6fc-11e7-9320-a14f9a99bc55.png)

### - UML Klassen- und Sequenzdiagramme
   
![image](https://user-images.githubusercontent.com/26046475/34837301-a9eb68ea-f6fa-11e7-924c-041aa461decb.png)

### - Dokumentation wichtiger Code Snippets
   
Ci-dessous une capture d'écran du code du main program mis à jour
 
![image](https://user-images.githubusercontent.com/26046475/34830625-c560007e-f6e4-11e7-8383-821951e2d306.png)
![image](https://user-images.githubusercontent.com/26046475/34830635-c8924cb6-f6e4-11e7-8bff-2e3c575c3a64.png)
![image](https://user-images.githubusercontent.com/26046475/34830641-cb96b974-f6e4-11e7-8fd8-eba5c0bbb84f.png)
![image](https://user-images.githubusercontent.com/26046475/34830643-ce464716-f6e4-11e7-9460-435e5270bbfa.png)
![image](https://user-images.githubusercontent.com/26046475/34830649-d0ac548c-f6e4-11e7-86b4-6e6134326749.png)
![image](https://user-images.githubusercontent.com/26046475/34830654-d3a07dc6-f6e4-11e7-85dc-e9e9beed893e.png)
Le choix des différentes "TimeZone" est possible, défini sur les montres Analog et Digital. La première classe
DigitalWatch est reimplementée. Tout est appelé sur la même fenetre.

Ci-dessous une capture d'écran du code de la DigitalWatch3 

![image](https://user-images.githubusercontent.com/26046475/34830675-e4855cd8-f6e4-11e7-85c2-4077d465d084.png)
![image](https://user-images.githubusercontent.com/26046475/34830676-e72ceee2-f6e4-11e7-825b-7e69f6a6c55c.png)
Correction de l'objet "Time"(TimeZone) et un appel de la fenetre de MainUhr. Affichage modifié.

Ci-dessous une capture d'écran du code de la AnalogWatch mise à jour

![image](https://user-images.githubusercontent.com/26046475/34830693-f478839a-f6e4-11e7-9e90-418f563feb4c.png)
![image](https://user-images.githubusercontent.com/26046475/34830698-f6ed5f60-f6e4-11e7-9100-4c307e36ad68.png)
![image](https://user-images.githubusercontent.com/26046475/34832066-1f730fda-f6e9-11e7-8f4f-f92860951b86.png)
Un nouveau "Thread"(TimeZone) et un appel de la fenetre de MainUhr.
 
### - Testfaelle bedingt durch Akzeptanzkritierium

Tout les tests ont été effectué et le programme fonctionne.
