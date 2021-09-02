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
public class Aviao 
{
    private int id;
    private String companhia;
    private String modelo;
    private int ano;
    private int capacidade;
    private int kmVoados;
    
    public Aviao (int id, String companhia, String modelo, int ano, int capacidade, int kmVoados)
    {
        this.id = id;
        this.companhia = companhia;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidade = capacidade;
        this.kmVoados = kmVoados;
    }
    
    public int getId ()
    {
        return id;
    }
    
    private void setId (int id)
    {
        this.id = id;
    }
    
    private String getCompanhia ()
    {
        return companhia;
    }
    
    private void setCompanhia (String companhia)
    {
        this.companhia = companhia;
    }
    
    private String getModelo ()
    {
         return modelo;
    }
    
    private void setModelo (String modelo)
    {
        this.modelo = modelo;
    }
    
    private int getAno ()
    {
        return ano;
    }
    
    private void setAno (int ano)
    {
        this.ano = ano;
    }
    
    private int getCapacidade ()
    {
        return capacidade;
    }
    
    private void setCapacidade ()
    {
        this.capacidade = capacidade;
    }
    
    private int getKmVoados ()
    {
        return kmVoados;
    }
    
    private void setKmVoados (int kmVoados)
    {
        this.kmVoados = kmVoados;
    }
}
