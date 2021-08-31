/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Usuario;
import Model.UsuarioDAO;
import Utils.CriptografiaSenha;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Arthur
 */
public class RegistroUsuarioController {
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private String dataNascimento;
    
    public void comNome(String nome){
        this.nome = nome;
    }
    
    public void comEmail(String email){
        this.email = email;
    }
    
    public void comSenha(String senha){
        this.senha = senha;
    }
    
    public void comCpf(String cpf){
        this.cpf = cpf;
    }
    
    public void comDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
   public String executar() throws ParseException{
       String campoObrigatorio = this.validarObrigatorios();
       
       if(campoObrigatorio.isEmpty()){
           System.out.println(this.nome);
           Usuario usuario = new Usuario();
           usuario.setNome(this.nome);
           usuario.setEmail(this.email);
           usuario.setCpf(this.cpf);
           
           CriptografiaSenha criptografia = new CriptografiaSenha();
           criptografia.comSenha(this.senha);
           String senhaHex = criptografia.criptografar();
           
           usuario.setSenha(senhaHex);
           
           if(this.dataNascimento.trim().length() < 10){
               usuario.setDataNascimento(null);
           }else{ 
               Date dataNascimento = null;
               String data = this.dataNascimento;   
               dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(data); 
               usuario.setDataNascimento(dataNascimento);
           }
           
           UsuarioDAO uDao = new UsuarioDAO();
           uDao.registrar(usuario);
           
       }
       
       System.err.println(campoObrigatorio);
       return campoObrigatorio;
   }
   
   
   public String validarObrigatorios(){
       
       if(this.nome.isEmpty()){
           return "nome";
       }
       
       else if(this.email.isEmpty()){
           return "email";
       }
       
       else if(this.senha.isEmpty()){
           return "senha";
       }
       
       else if(this.cpf.isEmpty() || this.cpf.trim().length() < 14){
           return "cpf";
       }
  
    return "";
    
   }
   
  
    
}
