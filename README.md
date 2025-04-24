# Reserva Carro

Este projeto tem como objetivo oferecer uma plataforma para a reserva de carros. A aplicação permite a interação com usuários, gerenciamento de reservas e possíveis verificações de disponibilidade de veículos.

## Estrutura do Projeto

- **src**: Contém o código fonte da aplicação, incluindo arquivos Java, classes e lógicas de negócio.
- **target**: Diretório gerado automaticamente pelo Maven, contendo arquivos compilados e artefatos de construção.
- **pom.xml**: Arquivo de configuração do Maven para o gerenciamento de dependências e build da aplicação.

## Tecnologias Utilizadas

- **Java**: Linguagem principal para o desenvolvimento da aplicação.
- **Maven**: Ferramenta de automação de build e gerenciamento de dependências.
- **JUnit**: Framework de testes utilizado para garantir a qualidade do código.

## Como Executar

### Requisitos

- **JDK 11 ou superior**
- **Maven 3.x ou superior**

### Passos

1. Clone o repositório para sua máquina local:
   ```bash
   git clone https://github.com/LucasRialx/reserva_carro.git
   ```
Navegue até o diretório do projeto:

```bash
cd reserva_carro
```

Compile e execute o projeto com o Maven:

```bash
mvn clean install
mvn exec:java
```

Acesse a aplicação em seu navegador, se aplicável, ou siga os passos descritos na documentação para interagir com a aplicação.

Testes
O projeto inclui testes automatizados utilizando JUnit. Para rodar os testes, use o seguinte comando Maven:

```bash
mvn test
```

![image](https://github.com/user-attachments/assets/506b2b75-8282-4748-9843-a86100a8e160)

Contribuindo
Se você deseja contribuir com melhorias ou correções, fique à vontade para abrir uma pull request. Siga as boas práticas de commit e forneça uma descrição clara do que foi alterado.

Licença
Este projeto está licenciado sob a licença MIT - veja o arquivo LICENSE para mais detalhes.
