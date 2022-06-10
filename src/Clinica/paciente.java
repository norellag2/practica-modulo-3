package Clinica;

public class paciente {
    protected String name;
    protected String surname;
    protected String city;

    paciente(String name, String surname, String city){
        this.name = name;
        this.surname = surname;
        this.city = city;
     }

     public String getName() {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname (String surname) {
        this.surname = surname;
    }


    public String getCity() {
        return this.city;
    }

    public void setCity (String city) {
        this.city = city;
    }
}
