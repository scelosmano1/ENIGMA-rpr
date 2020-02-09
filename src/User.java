public class User extends Person {
    private String name, surname, mail, degOfEducation;

    public User(String name, String surname, String mail, String degOfEducation, String password) {
        super(password);
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.degOfEducation = degOfEducation;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDegOfEducation() {
        return degOfEducation;
    }

    public void setDegOfEducation(String degOfEducation) {
        this.degOfEducation = degOfEducation;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                ", degOfEducation='" + degOfEducation + '\'' +
                '}';
    }
}
