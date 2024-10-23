#Author Zribi Ghofranne
Feature: Page Climatiseur

  Scenario: Selectionner un produit de la page Climatiseur
    Given lutilisateur est sur Climatiseur
    When lutilisateur  clique sur le produit "Climatiseur Samsung 9000 BTU Digital Inverter"
    Then lutilisateur se dirige vers la page du produit "Climatiseur Samsung 9000 BTU Digital Inverter"