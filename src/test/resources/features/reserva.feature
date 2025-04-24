Feature: Reserva de Carro

  Scenario: Reserva dentro da área de cobertura
    Given que o passageiro está em "Belo Horizonte" e deseja reservar um carro para o endereço "Rua A"
    Then o sistema deve retornar a mensagem "Motorista a caminho"

  Scenario: Reserva fora da área de cobertura
    Given que o passageiro está em "São Paulo" e deseja reservar um carro para o endereço "Rua B"
    Then o sistema deve retornar a mensagem "Área fora de cobertura"
