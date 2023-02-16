## Tratamento de exceções

### Visão Geral
- Exceção é um evento que interrompe o fluxo normal do processamento de uma classe.
- O uso correto de exceções torna o programa mais robusto e confiavel.
- Um programa pode continuar executando depois de lidar com um problema.
- **Error**: Usado pela JVM que serve para indicar se existe algum problema de recurso do programa, tornando a  execução impossivel de continuar.
- **Unchecked (Runtime)**: Exceptions que PODEM ser evitados se forem tratados e analisados pelo desenvolvedor. Ex: Divisão por Zero, acesso a
uma posição indevida de memória. O compilador não consegue prever a exception. Capturam erros de lógica.
- **Checked Exception**: Exceptions que DEVEM ser evitados e tratados pelo desenvolvedor para o programa funcionar. Exemplo: IOException - acesso a arquivo que não existe.
- **try, catch, finally**: Cada uma dessas palavras, juntas, definem blocos para o tratamento de exceções.
- **throws**: declara que um método pode lançar uma ou várias exceções.
- **throw**: Lança explicitamente uma exception.


