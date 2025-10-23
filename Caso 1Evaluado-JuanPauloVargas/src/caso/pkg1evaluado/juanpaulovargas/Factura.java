/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.pkg1evaluado.juanpaulovargas;

/**
 *
 * @author juamp
 */
public class Factura {

    private String nombreCliente;
    private String cedulaCliente;
    private String codigoFactura;
    private double monto;
    private int mes;
    private int electricos;
    private int automotrices;
    private int construccion;

    public Factura(String nombreCliente, String cedulaCliente, String codigoFactura,
            double monto, int mes, int electricos, int automotrices, int construccion) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.monto = monto;
        this.mes = mes;
        this.electricos = electricos;
        this.automotrices = automotrices;
        this.construccion = construccion;
    }

    public String getMesNombre() {
        switch (mes) {
            case 1:
                return "enero";
            case 2:
                return "febrero";
            case 3:
                return "marzo";
            case 4:
                return "abril";
            case 5:
                return "mayo";
            case 6:
                return "junio";
            case 7:
                return "julio";
            case 8:
                return "agosto";
            case 9:
                return "septiembre";
            case 10:
                return "octubre";
            case 11:
                return "noviembre";
            case 12:
                return "diciembre";
            default:
                return "mes";
        }
    }

    public double calcularComision() {
        double comision = 0;
        boolean tresTipos = (electricos > 0 && automotrices > 0 && construccion > 0);

        if (tresTipos) {
            comision = monto * 0.10;
        } else {
            if (electricos >= 3) {
                comision += monto * 0.04;
            } else if (electricos > 0) {
                comision += monto * 0.02;
            }
            if (automotrices >= 4) {
                comision += monto * 0.04; 
            } else if (automotrices > 0){
                comision += monto * 0.02;
            }
        }
        if (monto > 50000) {
            comision += monto * 0.05;
        }
        return comision;
    }

    public int calcularPuntos() {
        int puntos = 0;
        boolean tresTipos = (electricos > 0 && automotrices > 0 && construccion > 0);

        if (tresTipos) {
            puntos += 3;
        } else {
            if (electricos >= 3) {
                puntos += 1;
            }
            if (automotrices > 4) {
                puntos += 1;
            }
            if (construccion > 0) {
                puntos += 2;
            }
        }
        
        if (monto > 50000 ); {
            puntos += 1;
            return puntos; 
        }
    }
}
