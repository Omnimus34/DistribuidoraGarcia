package model;

public class Empleado {
    private int id;
    private String nombre;
    private String email;
    private String telefono;

    public Empleado() {}

    public Empleado(int id, String nombre, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        setEmail(email);
        setTelefono(telefono);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email inválido.");
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.matches("^\\d{8}$")) {
            this.telefono = telefono;
        } else {
            throw new IllegalArgumentException("Teléfono debe tener 8 dígitos.");
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Email: " + email + ", Teléfono: " + telefono;
    }

}
