#Author Zribi Ghofranne
Feature: Page dacceuil Samsung

  Scenario: Selectionner un menu de la page dacceuil
    Given lutilisateur est sur la page dacceuil
    When lutilisateur survole sur le menu "Électroménager" et clique sur le sous menu "Climatiseur"
    Then lutilisateur se dirige vers la page de sous menu "Climatiseur"
    
