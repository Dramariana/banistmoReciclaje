Feature: Bancolombia sostenibilidad reciclaje

  Scenario: Descargar informe
    Given ingresa a la pagina web de bancolombia personas
    When ir acerca de nosotros
    And ir a informacion coporativa
    And ir a sostenibilidad
    And ir a reciclaje
    And selecciona la opcion ¿Por que es importante reciclar?
    Then se genera la ventana emergente correspondiente