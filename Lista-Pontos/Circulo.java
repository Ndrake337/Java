// Classe A (Circulo)
public class Circulo{
   // atributos para definir o circulo
   private double raio;
   private Ponto centro;  // Classe B  
   // associacao por agregacao
   public Circulo ( double raio, Ponto centro){
      this.raio = raio;
      this.centro = centro;
   }
   // associa��o por composicao
   public Circulo ( double raio, int x, int y){
      this.raio = raio;
      this.centro = new Ponto(x,y);
   }

    Circulo(double d, Ponto p1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}