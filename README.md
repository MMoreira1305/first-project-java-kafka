Projeto Java com Spring e Kafka para Consumo de JSON com uma Classe Modelo "Produto"
-------------------------------------------------------------------------------------------------------------------
Descrição do Projeto
Este projeto é uma aplicação Spring Boot em Java que consome mensagens JSON de um tópico Kafka e converte essas mensagens em objetos da classe modelo Produto. Ele demonstra como configurar um consumidor Kafka, mapear mensagens JSON para uma classe Java e processar esses objetos.

Tecnologias Utilizadas
- Java 17
- Spring Boot 3.3.0
- Spring Kafka
- Apache Kafka
- Lombok

Estrutura do Projeto
- src/main/java/com/exemplo/kafka/
- KafkaConsumerConfig.java - Configurações do consumidor Kafka.
- Produto.java - Classe modelo do produto.
- ProdutoConsumer.java - Classe de serviço que consome mensagens do Kafka.
- src/main/resources/
- application.properties - Arquivo de configuração do Spring Boot.

Classe Modelo Produto
- Defina uma classe modelo Produto com atributos como name, message. Inclua os métodos getters e setters, além de um método toString() para facilitar a exibição das informações do produto.

Configuração do Consumidor Kafka
- Configure o consumidor Kafka para conectar-se ao servidor Kafka, especificar o grupo de consumidores e definir os deserializadores para converter as mensagens JSON em objetos Produto.

Consumidor de Mensagens Kafka
- Implemente um serviço que consome mensagens do Kafka usando a anotação @KafkaListener, processando os objetos Produto recebidos.

Configurações no application.properties
- Adicione as propriedades necessárias no arquivo application.properties para configurar a conexão com o servidor Kafka e definir os deserializadores apropriados.

Introdução ao Apache Kafka
- O Apache Kafka é uma plataforma de streaming distribuída usada para construir pipelines de dados em tempo real e aplicativos de streaming. Ele é projetado para alta taxa de transferência, baixa latência e tolerância a falhas. O Kafka é composto por alguns conceitos principais:

Tópicos: Um fluxo de dados categorizado.
Produtores: Publicam dados em tópicos.
Consumidores: Leem dados de tópicos.
Brokers: Servidores Kafka que armazenam os dados e gerenciam os consumidores/produtores.
O Kafka é altamente escalável e permite o processamento de grandes volumes de dados em tempo real, tornando-se uma ferramenta essencial para arquiteturas de microserviços e sistemas de big data.

Executando o Projeto
-------------------------------------------------------------------------------------------
- Inicie um servidor Kafka localmente.
- Configure o application.properties com as propriedades corretas do seu servidor Kafka.
- Execute a aplicação Spring Boot.
- Envie mensagens JSON para o tópico Kafka "produtos" para que elas sejam consumidas pelo ProdutoConsumer.

Conclusão
--------------------------------------------------------------------------------------------
- Este README cobre a configuração básica e o consumo de mensagens JSON usando Spring Kafka em um projeto Java. O Kafka facilita o manuseio de grandes volumes de dados em tempo real, permitindo a construção de sistemas escaláveis e eficientes.
