# Gerenciador de Projetos ⚙️

Este é um projeto de gerenciamento de tasks e foi desenvolvido em **Java**, utilizando conceitos de Programação Orientada a Objetos (POO) e o **padrão de projeto State** para gerenciar estados das tarefas. O sistema possui uma interface gráfica desenvolvida com **Swing** para facilitar a interação do usuário.

---

## Participantes do Projeto 👤
- **Kaio Nóbrega**  
- **Ester Medeiros**  
- **Iago Dutra**  
- **George Garcia**  

---

## Funcionalidades Principais 📜
1. **Gerenciamento de Tarefas**
   - Adicionar novas tarefas.
   - Alterar o estado de uma tarefa para:
     - **Em andamento**
     - **Atraso**
     - **Concluído**
   - Listar tarefas com seus estados atuais.

2. **Interface Gráfica**
   - Uso de **Swing** para criar uma interface amigável.
   - Tela inicial para gerenciar tarefas.
   - Tela para criar e gerenciar projetos.


## Contexto - Problema - Solução

## Requisitos ✅
1. **Requisitos funcionais:**
   - O sistema deve permitir a criação de tarefas com um estado inicial definido como "Criado".
   - A tarefa deve ser capaz de transitar entre os estados: Criado, Em atraso e Concluído.
   - Os estados das tarefas devem refletir o progresso ou o atraso com base nas atualizações feitas pelos membros do time.
   - O sistema deve exibir claramente o estado atual de uma tarefa para os usuários.
     
2. **Requisitos não funcionais:**
   - Desempenho: As mudanças de estado devem ocorrer instantaneamente para garantir uma experiência de usuário fluida.
   - Usabilidade: A interface de exibição de tarefas e estados deve ser intuitiva e fácil de navegar.
   - Escalabilidade: O sistema deve ser capaz de gerenciar centenas de tarefas sem perda significativa de desempenho.

## Caso de uso: 
![image](https://github.com/user-attachments/assets/653fb489-f85d-4387-98f3-ac0e4e4208ac)

## Diagrama de classes:
![image](https://github.com/user-attachments/assets/9caa66ff-31d8-42c0-9bff-45c46176a08f)

## Diagrama de atividades:

## Padrão utilizado: ⛔
   - O padrão **State** foi utilizado no projeto de gerenciador de tasks para representar e gerenciar os diferentes estados de uma tarefa (Task). Esse padrão permite que o comportamento de uma tarefa varie dinamicamente dependendo do seu estado atual.
   - Utilizado para gerenciar os estados das tarefas de forma flexível.
   - Classes como `Andamento`, `Atraso` e `Concluido` representam os diferentes estados das tarefas.

## Testes: ✔️
   - **Teste de Unidade:** O foco é testar individualmente a lógica de mudança de estado dentro da classe Task. Este tipo de teste isola o comportamento da classe e verifica se ela responde corretamente às mudanças de estado.

   - **Teste de Integração:** O teste de integração verifica como as diferentes partes do sistema (no caso, a criação e transição de estados) interagem entre si. Ele verifica se, ao integrar as partes, o sistema ainda funciona como esperado.


## Mecânicas de refatoração: ♻️

## Frameworks e tecnologias utilizadas: 
   - **JUnit** - Teste de Unidade e de Integração
   - **Maven**
   - **Swing**





