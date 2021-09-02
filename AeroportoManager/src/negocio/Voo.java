/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public class Voo 
{
    private int id;
    private Rota rota;
    private Aviao aviao;
    private ArrayList<Usuario> passageiros;
    
    public Voo (int id, Rota rota, Aviao aviao)
    {
        this.id = id;
        this.rota = rota;
        this.aviao = aviao;
    }
    
    public Voo (int id, Rota rota, Aviao aviao, ArrayList<Usuario> passageiros)
    {
        this.id = id;
        this.rota = rota;
        this.aviao = aviao;
        this.passageiros = passageiros;
    }
    
    public int getId ()
    {
        return id;
    }
    
    public void setId ()
    {
        this.id = id;
    }
    
    public int getRota ()
    {
        return rota.getId();
    }
    
    public int getAviao ()
    {
        return aviao.getId();
    }
    
    public ArrayList<Usuario> getPassageiros ()
    {
        return passageiros;
    }
}
