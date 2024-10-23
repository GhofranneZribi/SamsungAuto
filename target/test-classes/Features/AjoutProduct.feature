#Author Zribi Ghofranne
Feature: Page Climatiseur

  Scenario: Selectionner un produit de la page Climatiseur
    Given lutilisateur est sur la page du produit 
    When lutilisateur  clique sur le bouton "ACHETER" et clique sur "CONTINUER MES ACHATS"
    Then Le produit est ajouter au panier "Climatiseur Samsung 9000 BTU Digital Inverter"