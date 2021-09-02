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
public class Rota 
{
    private int id;
    private int distancia;
    private String hora;
    private String data;
    private String inicio;
    private String fim;
    
    public Rota (int id, int distancia, String hora, String data, String inicio, String fim)
    {
        this.id = id;
        this.distancia = distancia;
        this.hora = hora;
        this.data = data;
        this.inicio = inicio;
        this.fim = fim;
    }
    
    public int getId ()
    {
        return id;
    }
    
    public void setId (int id)
    {
        this.id = id;
    }
    
    public int getDistancia ()
    {
        return distancia;
    }
    
    public void setDistancia (int distancia)
    {
        this.distancia = distancia;
    }
    
    public String getHora ()
    {
        return hora;
    }
    
    public void setHora (String hora)
    {
        this.hora = hora;
    }
    
    public String getData ()
    {
        return data;
    }
    
    public void setData (String data)
    {
        this.data = data;
    }
    
    public String getInicio ()
    {
        return inicio;
    }
    
    public void setInicio (String inicio)
    {
        this.inicio = inicio;
    }
    
    public String getFim ()
    {
        return fim;
    }
    
    public void setFim (String fim)
    {
        this.fim = fim;
    }
    
}
