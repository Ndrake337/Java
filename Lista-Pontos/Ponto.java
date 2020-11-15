/*

    ADO 1 - COLEÇÃO DE ELEMENTOS

    Aluno: Matheus Felipe Neves Campos Cardoso

    Engenharia da Computação

    4º Semestre

*/


//Declaração da Classe Ponto, contendo em si dois atributos, sendo estes X e Y como coordenadas deste ponto
public class Ponto {
   private int x,y;
   public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
   }
   
   //Metodo getX para obtenção da Coordenada X
   public int getX(){
      return x;
   }
   
   //Metodo getY para obtenção da segunda coordenada
   public int getY(){
      return y;
   }
   
   // metodo que calcula a distancia entre dois pontos
   public double distancia(Ponto p){
        double c1 = this.x-p.x;
        double c2 = this.y-p.y;
        return Math.sqrt(c1*c1+c2*c2);
   }
    

   
    @Override
    public String toString() {
        return "Ponto{" + "x=" + x + ", y=" + y + '}';
    }
    public boolean igual(Ponto p) {
        return this.x == p.x && this.y == p.y;
    }


}
   
        

