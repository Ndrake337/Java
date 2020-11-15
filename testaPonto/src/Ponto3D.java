/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class Ponto3D extends Ponto{
    private int z;
    public Ponto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    
    public int getZ(){
      return z;
   }
    
    public void VerificaPonto (Ponto3D p1,Ponto3D p2 ){
        if(p1.getX() == p2.getX() && p1.getY() == p2.getY()&& p1.getZ() == p2.getZ() ){
            System.out.println("Os Pontos são Iguais");
        }
        else{
            System.out.println("Os Pontos São Diferentes");
        }
        
    }
    
    public double CalculaDistanciaEntrePontos (Ponto3D p1,Ponto3D p2 ){
        double D;
        D = Math.sqrt(Math.pow((p2.getX() - p1.getX()),2)+Math.pow((p2.getY() - p1.getY()),2)+Math.pow((p2.getZ() - p1.getZ()),2));
        return D;  
    }
    
}
