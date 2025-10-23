/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.pkg1evaluado.juanpaulovargas;

/**
 *
 * @author juamp
 */
public class Vendedor {

    private String nombre;
    private String cedula;
    private String codigo;
    private String sucursal;
    private String vehiculo;

    public Vendedor(String nombre, String cedula, String codigo, String sucursal, String vehiculo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public String getVehiculo() {
        return vehiculo; 
    }

}
