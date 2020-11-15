/*

    ADO 1 - COLEÇÃO DE ELEMENTOS

    Aluno: Matheus Felipe Neves Campos Cardoso

    Engenharia da Computação

    4º Semestre

*/


import java.util.Scanner;  // Importação da Classe Scanner para obter Inputs do Usuário
//Importação da Classe testaCirculo que será usada como cliente 
public class testaCirculo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);//Criação do primeiro scanner para o usuário
        System.out.println("Olá, Seja Bem Vindo ao programa Coleção de Pontos: \n\n Insira a seguir o tamanho da Lista Desejada");
        
        //Definindo variavel N que será usada para obter o tamanho da Lista a ser criada
        int N = obj.nextInt();
        
        //Chamando a Classe Lista Ponto para Criação da Lista
        ListaPonto L1 = new ListaPonto(N);
        int stop = -1;//Definindo Variavel stop que será usada na condição de parada de execução do programa
        while(stop != 1){
            System.out.println("Selecione uma das opções abaixo escolhendo seu numero para prosseguir:\n0-Mostrar todos os elementos da lista\n1-Adicionar um elemento ao final da lista\n2-Adicionar um elemento a uma determinada posição\n3-Retornar o indicie de um elemento especifico\n4-Remover um elemento de uma determinada posição\n5-Calcula a distancia entre os dois maiores pontos na Coleção\n OU DIGITE 10 PARA SAIR.");
            
            //Input de dados do usuário para o Menú
            int Menu = obj.nextInt();
            
            //Condicional para Opção 0 Criada fora do escopo do projeto para exibir a qualquer momento a coleção de registros do usuário
            if(Menu == 0){
              L1.MostraTodosOsPontos(N);  
            }
            
            //Condicional para opção 1 onde o usuário irá adicionar em ordem os registros que deseja inputar sempre ao final do Vetor SE O MESMO PUDER ARMAZENAR O REGISTRO
            else if(Menu == 1){
              int x,y;
              String valida = "";
              System.out.println("Informe quais são os pontos que serão Adicionados ao Final da Lista: ");
              for(int i = 0; i<N; i++){
                  System.out.println("Insira a Primeira Coordenada: ");
                  x = obj.nextInt();//Obtendo Coordenada de X
                  System.out.println("Insira a Segunda Coordenada: ");
                  y = obj.nextInt();//Obtendo Coordenada de Y
                  Ponto p = new Ponto (x,y);//Criando Variavel Ponto que irá inserir dentro da Lista de Pontos Criado pelo usuário
                  L1.AddPontoFinal(p, N);//Chamando metodo AddPontoFinal que irá adicionar o Ponto solicitado pelo usuário.
                  System.out.println("O ponto ja foi adicionado a lista.\nDeseja Inserir mais algum Ponto ? Sim (S) / Não (N): ");
                  valida = obj.next();//Validando se é de Interesse do usuário seguir inputando dados
                    if(valida.equalsIgnoreCase("n")){
                        break;//Saindo do Loop For e retornando ao menu caso não seja mais nescessário a inserção de dados do usuário
                    }
                  }
              }  
            }
        
            //Condicional para entrar na segunda opção disponivel ao usuário onde o mesmo irá inserir um ponto em um determinado indicie do vetor
            else if(Menu == 2){
                int x,y;
                System.out.println("Informe A Posição onde quer inserir o Ponto");
                int Pos = obj.nextInt();//Obtendo Indicie do Vetor onde se deseja Inserir o Dado
                System.out.println("Insira a Primeira Coordenada: ");
                x = obj.nextInt();//Obtendo Primeira Coordenada de Inserção
                System.out.println("Insira a Segunda Coordenada: ");
                y = obj.nextInt();//Obtendo Segunda Coordenada de Inserção
                Ponto p = new Ponto (x,y);//Criando variavel Ponto que será armazenada no Vetor
                L1.InserePonto(p, N, Pos);//Chamando metodo para Inserção de Ponto dentro do Registro passando como argumentos o Ponto, Tamanho da Lista e Posição onde será inserido o ponto solicitado
            }
                    
            //Condicional para terceira opção disponivel onde será retornado se existir no vetor em que indicie está localizado o ponto solicitado
            else if(Menu == 3){
                int x,y;
                System.out.println("Informe as coordenadas do Ponto que você deseja Saber o Indicie");
                System.out.println("Insira a Primeira Coordenada: ");
                x = obj.nextInt();//Obtendo Primeira Coordenada do Pont a ser buscado 
                System.out.println("Insira a Segunda Coordenada: ");
                y = obj.nextInt();//Obtendo Segunda Coordenada do Ponto a ser buscado 
                Ponto p = new Ponto (x,y);//Criando variavel Ponto que será armazenada no Vetor
                L1.IndicaIndicieDoPonto(p, N);//Chamando metodo que será responsavel pela busca do Indicie do Ponto no Vetor
            }
                    
            //Condicional para Quarta opção disponivel 
            else if(Menu == 4){
                System.out.println("Indique de qual posição deseja remover o elemento da Lista: ");
                int Pos = obj.nextInt();
                L1.RemovePonto(Pos, N);
                System.out.println("Segue Abaixo Lista Após exclusão do Ponto Selecionado:");
                L1.MostraTodosOsPontos(N);
            }
                    
            //Condicional para a Quinta opção do Men 
            else if(Menu == 5){
                L1.CalculaDistancia(N);//Chamada do método  para cálcular a distancia entre os dois Pontos mais distantes
            }
            
            //Condicional para saída do Cliente Finalizando a execução do Programa
            else if(Menu == 10){
                System.out.println("Obrigado Por testar meu sistema, qualquer duvida entre em contato comigo pelo email: matheus.felipe337@gmail.com");
                stop = 1;
            }
        }
        /*Ponto p1 = new  Ponto(1,1);
        Ponto p2 = new  Ponto(2,2);
        Ponto p3 = new  Ponto(1,2);
        Ponto p4 = new  Ponto(3,2);
        Ponto p5 = new  Ponto(5,6);
        Ponto p6 = new  Ponto(0,0);
        
        
        System.out.println("\nAddPontos\n");
        L1.AddPontoFinal(p1,5);
        L1.AddPontoFinal(p2,5);
        L1.AddPontoFinal(p3,5);
       
        System.out.println("\nShowAllPontos\n");
        L1.MostraTodosOsPontos(5);
        System.out.println("\nGet Vet Pos\n");
        L1.IndicaIndicieDoPonto(p6, 5);
        System.out.println("\nInsere Ponto\n");
        L1.InserePonto(p4, 5, 0);
        System.out.println("\nShowAllPontos\n");
        L1.MostraTodosOsPontos(5);
        System.out.println("\nInsere Ponto\n");
        L1.InserePonto(p5, 5, 3);
        System.out.println("\nShowAllPontos\n");
        L1.MostraTodosOsPontos(5);
        System.out.println("\nInsere Ponto\n");
        L1.InserePonto(p6, 5, 3);
        System.out.println("\nRemove Ponto\n");
        L1.RemovePonto(2, 5);
        System.out.println("\nShowAllPontos\n");
        L1.MostraTodosOsPontos(5);
        
        System.out.println("\nDistancia\n");
        Double CalculaDistancia;
        CalculaDistancia = L1.CalculaDistancia(5);
        System.out.println(CalculaDistancia);
        */
        
    }
    
}
