/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author natha
 */
public class CadastroUsuario {
    
    private int id;
    private String nomecompleto;
    private String usuario;
    private String senha;
    private String confsenha;
    private String email;

    public CadastroUsuario() {
    }

    public CadastroUsuario(String nomecompleto, String usuario, String senha, String confsenha, String email) {
        
        this.nomecompleto = nomecompleto;
        this.usuario = usuario;
        this.senha = senha;
        this.confsenha = confsenha;
        this.email = email;
    }
    
  

    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nomecompleto
     */
    public String getNomecompleto() {
        return nomecompleto;
    }

    /**
     * @param nomecompleto the nomecompleto to set
     */
    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the confsenha
     */
    public String getConfsenha() {
        return confsenha;
    }

    /**
     * @param confsenha the confsenha to set
     */
    public void setConfsenha(String confsenha) {
        this.confsenha = confsenha;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
