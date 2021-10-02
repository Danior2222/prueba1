# Autor: D
@stories
Feature: Reto Tecnico
  Se requiere automatizar la creacion de un usuario en Utest paso a paso
  @scenario1
  Scenario: Busqueda de los recursos necesarios para la creacino de usuario

    Given que quiero registrarme  en  la pagina de Utest!
    |Login  |
    When voy a ingresar mis datos personales es necesario usar
    | Course        |
    | <strCourse>   |

    Then voy a buscar los respectivos course para arrojar resultados
    | Course      |
    | <strCourse> |