/*

    ADO 1 - COLEÇÃO DE ELEMENTOS

    Aluno: Matheus Felipe Neves Campos Cardoso

    Engenharia da Computação

    4º Semestre

*/

//Declaração da Classe Lista Ponto que criará o Vetor de Pontos Pretendido
public class ListaPonto{
   private Ponto pontos[];
   private int validos;
   
   //Metodo ListaPonto para Gerar a Lista de Pontos 
   public ListaPonto( int N ){
       this.pontos =new Ponto[N];
       this.validos = 0;
   }
   
   //Criação do método AddPontoFinal que irá popular o Vetor sempre no ultimo elemento disponivel 
   public void AddPontoFinal(Ponto p, int N){
       for (int i = 0; i< N; i++){
           if(pontos[i] == null){
               pontos[i] = p;
               break;
       }
      }
   }
   
   //Criação do metodo InserePonto que irá 
   public void InserePonto (Ponto p, int N, int pos){
       int contador =0;
       Ponto aux;
       //Loop for para verificar quantidade de Registros preenchidos no Vetor
       for (int i = 0; i< N; i++){
           if(pontos[i] != null){
              contador ++;
           }
       }
       //Loop For para Ordenar ordenação de Dados do Vetor
       if(contador < (N)){
          for (int i = 0; i< N; i++){
              if(i >= pos){
                  aux = pontos[i];
                  pontos[i] = p;
                  p = aux;
              }
          }
       }
       //Caso Já preenchido Impede a Inserção de Novos Pontos no Vetor
       else{
           System.out.println("O vetor não pode ter mais nenhum ponto preenchido");
       }
   }
   
   //Metodo para printar todos os elementos existentes no Vetor
   public void MostraTodosOsPontos(int N){
       for (int i = 0; i< N; i++){
           System.out.println("Ponto na Posição "+i+": "+ pontos[i]);
       }
   }
   
   //Metodo para trazer Indicie baseado no Ponto informado pelo usuario
   public void IndicaIndicieDoPonto (Ponto p, int N){
       int i;
       for (i = 0; i < N; i++) {
           if(pontos[i] == p){
               System.out.println("O ponto se Encontra na Posição: "+ i);
               break;
            }
        }
       if(i == N){
           System.out.println("-1");
       }
   }
   
   //Metodo para remoção de Ponto e re-ordenação do vetor
   public void RemovePonto (int pos, int N){
       pontos[pos] = null;
       Ponto aux1;
       for (int i = 0; i < N; i++) {
           if(i == pos + 1){
             pontos[pos] = pontos[i];
             pontos[i] = null;
             pos = i;
           }
           
       }
    }
   
   //Metodo para cálculo da distancia verificando quais os pontos estão mais distantes entre sí e cálculando a distancia entre eles
   public double CalculaDistancia(int N){
       Ponto A = null,B = null;
       double aux = 0, DIST = 0;
       for (int i = 0; i < N; i++) {
           for (int j = 0; j < N; j++) {
               if(pontos[i] != null && pontos[j]!= null){
                   
                    int x1 = pontos[i].getX(),y1 = pontos[i].getY(),x2 = pontos[j].getX(),y2 = pontos[j].getY();
                    double Conta = (((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
                    aux = Math.sqrt(Conta); 
                    if(aux >= DIST){
                        DIST = aux;
                        A = pontos[i];
                        B = pontos[j];
                    }
               }
           }
       }
       System.out.println("A maior distancia encontrada foi entre os pontos A: "+A+", E o ponto B: "+B+" Sendo esta de: "+ DIST);
       return DIST;
   }
 }  

   
   