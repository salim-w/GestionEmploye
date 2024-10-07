Description du projet :
Ce projet simule la gestion des employés dans une petite entreprise avec une hiérarchie définie : un directeur général, un manager, et plusieurs développeurs. 
L'application permet de créer, gérer et afficher les employés et leurs salaires, en respectant la structure hiérarchique.
Fonctionnalités :
Créer et gérer des employés (Directeur, Manager, Développeurs)
Afficher les noms et salaires dans un ordre hiérarchique (du directeur aux développeurs)
Structure du projet:
Connexion à la base de données : Configuration dans un fichier base.properties et une classe Connexion pour gérer les connexions à MySQL.
Classes d'employés : Personne, Manager, Developpeur définissant les employés.
Services CRUD : Implémentation dans ManagerService et DeveloppeurService pour les opérations sur les employés.
Test : La classe Entreprise permet de tester la gestion des employés, comme l'affichage des noms et salaires dans l'ordre hiérarchique.
