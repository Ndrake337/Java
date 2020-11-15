import java.util.Scanner;  // Importação da Classe Scanner para obter Inputs do Usuário1

public class testaPonto {
    public static void main(String[] args) {
  
        Scanner obj = new Scanner(System.in);//Criação do primeiro scanner para o usuário
        
        System.out.println("Insira os Valores do Ponto 1");
        int x1 = obj.nextInt(),y1 = obj.nextInt(),z1 = obj.nextInt();

        Ponto3D p1 = new Ponto3D (x1,y1,z1);
        System.out.println("Insira os Valores do Ponto 2");
        int x2 = obj.nextInt(),y2 = obj.nextInt() ,z2 = obj.nextInt();
        Ponto3D p2 = new Ponto3D (x2,y2,z2);
        
        p1.VerificaPonto(p1, p2);
        
        double a = p2.CalculaDistanciaEntrePontos(p1, p2);
        
        System.out.println("A distancia entre os dois Pontos Escolhidos é: " + a);
 
    }
    
}
