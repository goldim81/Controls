package ru.innopolis;

public class Learner {
    private final int id;
    private final int id_user;
    private final String lastname;
    private final String firstname;
    private final String patronymic;
    private int id_class;
    private final int id_school;

    public Learner(int id, int id_user, String lastname, String firstname, String patronymic, int id_class, int id_school) {
        this.id = id;
        this.id_user = id_user;
        this.lastname = lastname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.id_class = id_class;
        this.id_school = id_school;
    }

    public int getId() {
        return id;
    }

    public int getId_user() {
        return id_user;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getId_class() {
        return id_class;
    }

    public void setId_class(int id_class) {
        this.id_class = id_class;
    }

    public int getId_school() {
        return id_school;
    }
}
