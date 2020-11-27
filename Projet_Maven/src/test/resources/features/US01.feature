
Feature: US01 Concevoir un vetement
  En tant que createur je veux creer et transformer des vetements
	
  Scenario: Creer un vetement
    Given j'ai une idee de vetement a creer
    When je cree le vetement avec pour type "pull" et pour couleur "bleu"
    Then j'obtiens un vetement de type "pull" et de couleur "bleu"

  Scenario Outline: Transformer un vetement
    Given j'ai cree un vetement de type "pull" et de couleur "bleu"
    When je transforme son/sa "<caracteristique>" pour "<valeur>"
    Then le vetement a bien pour "<caracteristique>" "<valeur>"

    Examples: 
      | caracteristique  | valeur |
      | couleur 				 | vert   |
      | type             | veste  |
