/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Usuario;
import Model.UsuarioDAO;
import Utils.CriptografiaSenha;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arthur
 */
public class AutenticacaoController {
    
    String email;
    String senha;
    
    public void comLogin(String email){
        this.email = email;
    }
    
    public void comSenha(String senha){
        this.senha = senha;
    }
    
    public boolean autenticar(){
        Usuario usuario = new Usuario();
        
        CriptografiaSenha cripto = new CriptografiaSenha();
        cripto.comSenha(this.senha);
        String senhaHex = cripto.criptografar();
        
        UsuarioDAO uDao = new UsuarioDAO();
        List<Usuario> userList = uDao.obterUsuarioPorEmail(this.email);
        
        for (Usuario user : userList) {
            if(user.getSenha().equals(senhaHex)){
                return true;
            }
            return false;
        }
        
        return false;
    }
    
    public boolean isAdmin(){
        UsuarioDAO uDao = new UsuarioDAO();
        List<Usuario> userList = uDao.obterUsuarioPorEmail(this.email);
        
        for (Usuario user : userList) {
            if(user.isIsAdmin()){
                return true;
            }
            return false;
        }
        
        return false;
    }
    
    
}
