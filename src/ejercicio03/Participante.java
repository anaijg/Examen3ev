package ejercicio03;

import java.time.LocalDate;

public abstract class Participante {
    protected String dni;
    protected LocalDate fechaDeNacimiento;

    public Participante(String dni, LocalDate fechaDeNacimiento) {
        this.dni = dni;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
