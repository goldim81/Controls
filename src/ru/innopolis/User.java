package ru.innopolis;

import java.time.LocalDate;

public class User {
    private final int id;
    private final String login;
    private String password;
    private final int id_role;
    private final LocalDate date_reg;
    private LocalDate date_last_login;

    public User(int id, String login, int id_role, LocalDate date_reg) {
        this.id = id;
        this.login = login;
        this.id_role = id_role;
        this.date_reg = date_reg;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId_role() {
        return id_role;
    }

    public LocalDate getDate_reg() {
        return date_reg;
    }

    public LocalDate getDate_last_login() {
        return date_last_login;
    }

    public void setDate_last_login(LocalDate date_last_login) {
        this.date_last_login = date_last_login;
    }
}
