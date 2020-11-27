
Feature: US02 Ranger un vetement
  En tant que createur je veux ranger un vetement dans une armoire

  Scenario: Ranger un vetement
    Given j'ai un vetement de type "pull" et de couleur "bleu" a ranger
    And j'ai une armoire disponible
    When je range le vetement dans l'armoire
    Then l'armoire contient bien le vetement
    And le vetement est bien dans cette armoire
