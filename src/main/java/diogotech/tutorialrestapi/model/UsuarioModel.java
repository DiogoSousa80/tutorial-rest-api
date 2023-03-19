package diogotech.tutorialrestapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "usuario")
public class UsuarioModel {

    @Id
    public Integer codidgo;
    @Column(nullable = false, length = 50)
    public String nome;
    @Column(nullable = false, length = 10)
    public String login;
    @Column(nullable = false, length = 10)
    public String senha;

    public Integer getCodidgo() {
        return codidgo;
    }

    public void setCodidgo(Integer codidgo) {
        this.codidgo = codidgo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
