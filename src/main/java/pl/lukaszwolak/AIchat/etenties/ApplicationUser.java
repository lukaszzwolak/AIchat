package pl.lukaszwolak.AIchat.etenties;


import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ApplicationUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;

    public ApplicationUser() {
    }

    public ApplicationUser(Long id) {
        this.id = id;
    }

    public ApplicationUser(String login) {
        this.login = login;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public static ApplicationUser createAssistant() {
        return new ApplicationUser(1L);
    }

    public static ApplicationUser createUser() {
        return new ApplicationUser(2L);
    }
}
