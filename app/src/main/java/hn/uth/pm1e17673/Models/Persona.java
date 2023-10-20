package hn.uth.pm1e17673.Models;

public class Persona {

    private Integer id;
    private String nombres;
    private Integer telefono;
    private String nota;

    public Persona(Integer id, String nombres, Integer telefono, String nota) {
        this.id = id;
        this.nombres = nombres;
        this.telefono = telefono;
        this.nota = nota;
    }

    public Persona() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
