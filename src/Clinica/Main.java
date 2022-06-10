package Clinica;

public class Main {
    public static void main(String[] args) {
  paciente paciente1 = new paciente("Laura", "López", "Madrid");
  paciente paciente2 = new paciente("Martin", "González", "Sevilla");
  System.out.println (paciente1.getSurname());

  System.out.println(paciente2.getCity());
  paciente2.setCity("Sevilla");
  System.out.println(paciente2.getCity());
    }
}
