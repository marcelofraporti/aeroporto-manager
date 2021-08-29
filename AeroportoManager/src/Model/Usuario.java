/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import sun.security.util.Password;

/**
 *
 * @author Arthur
 */

@Entity
public class Usuario {
    @Id
    @GeneratedValue
    public int id;
    public String email;
    public String nome;
    public String cpf;
    public Password password;
    public boolean isAdmin;
    public String dataNascimento;
}
