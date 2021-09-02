/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package negocio;

/**
 *
 * @author Marcelo
 */
public class Passagem 
{
    private Double preco;
    private int quantidade;
    private int rota;
    private int poltrona;
    
    public Passagem (double preco, int quantidade, int rota, int poltrona)
    {
        this.preco = preco;
        this.quantidade = quantidade;
        this.rota = rota;
        this.poltrona = poltrona;
    }
    
    public Double getPreco ()
    {
        return preco;
    }
    
    public void setPreco (double preco)
    {
        this.preco = preco;
    }
    
    public int getQuantidade ()
    {
        return quantidade;
    }
    
    public void setQuantidade (int quantidade)
    {
        this.quantidade = quantidade;
    }
    
    public int getRota ()
    {
        return rota;
    }
    
    public void setRota (int rota)
    {
        this.rota = rota;
    }
    
    public int getPoltrona ()
    {
        return poltrona;
    }
    
    public void setPoltrona (int poltrona)
    {
        this.poltrona = poltrona;
    }
    
}
