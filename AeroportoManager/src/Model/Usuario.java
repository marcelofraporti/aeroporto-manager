package Model;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author Arthur
 */

@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue
    @Column(name="id")
    
    private int id;
    @Column(name="email")
    
    private String email;
    @Column(name="nome")
    
    private String nome;
    @Column(name="cpf")
    
    private String cpf;
    @Column(name="senha")
    
    private String senha;
    @Column(name="isAdmin")
    private boolean isAdmin;
    
    @Column(name="dataNascimento")
    private Date dataNascimento;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String password) {
        this.senha = password;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
