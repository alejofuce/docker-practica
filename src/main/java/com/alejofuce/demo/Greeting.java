package com.alejofuce.demo;

public class Greeting {
    private Long id;
    private String Universidad;
    private String Curso;
    private String Alumno;
    private String Periodo;
    private String Lenguaje;
    private String Aspiración;

    public Greeting(Long id, String universidad, String curso, String alumno, String periodo, String lenguaje, String aspiración) {
        this.id = id;
        Universidad = universidad;
        Curso = curso;
        Alumno = alumno;
        Periodo = periodo;
        Lenguaje = lenguaje;
        Aspiración = aspiración;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String universidad) {
        Universidad = universidad;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public String getAlumno() {
        return Alumno;
    }

    public void setAlumno(String alumno) {
        Alumno = alumno;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String periodo) {
        Periodo = periodo;
    }

    public String getLenguaje() {
        return Lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        Lenguaje = lenguaje;
    }

    public String getAspiración() {
        return Aspiración;
    }

    public void setAspiración(String aspiración) {
        Aspiración = aspiración;
    }
}
