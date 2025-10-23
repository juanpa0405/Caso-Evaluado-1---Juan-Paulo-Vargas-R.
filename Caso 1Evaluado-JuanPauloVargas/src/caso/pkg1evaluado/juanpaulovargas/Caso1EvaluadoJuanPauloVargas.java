/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.pkg1evaluado.juanpaulovargas;
import javax.swing.JOptionPane;

/**
 *
 * @author juamp
 */

public class Caso1EvaluadoJuanPauloVargas {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Nombre del vendedor:");
        String cedula = JOptionPane.showInputDialog("Cédula:");
        String codigo = JOptionPane.showInputDialog("Código de empleado:");
        String sucursal = JOptionPane.showInputDialog("Sucursal:");
        String tieneVehiculo = JOptionPane.showInputDialog("¿Tiene vehículo propio? (si/no)");

        Vendedor vendedor = new Vendedor(nombre, cedula, codigo, sucursal, tieneVehiculo);

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas facturas desea registrar?"));

        Factura[] facturas = new Factura[cantidad];
        double totalFacturado = 0;
        double totalComisiones = 0;
        int totalPuntos = 0;

        for (int i = 0; i < cantidad; i++) {
            JOptionPane.showMessageDialog(null, "Factura #" + (i + 1));
            String nombreCliente = JOptionPane.showInputDialog("Nombre del cliente:");
            String cedulaCliente = JOptionPane.showInputDialog("Cédula del cliente:");
            String codigoFactura = JOptionPane.showInputDialog("Código de factura:");
            double monto = Double.parseDouble(JOptionPane.showInputDialog("Monto de la factura:"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Número de mes (1 a 12):"));

            int productosElectricos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad productos eléctricos:"));
            int productosAutomotrices = Integer.parseInt(JOptionPane.showInputDialog("Cantidad productos automotrices:"));
            int productosConstruccion = Integer.parseInt(JOptionPane.showInputDialog("Cantidad productos construcción:"));

            Factura f = new Factura(nombreCliente, cedulaCliente, codigoFactura, monto, mes, productosElectricos, productosAutomotrices, productosConstruccion);
            facturas[i] = f;

            totalFacturado += monto;
            totalComisiones += f.calcularComision();
            totalPuntos += f.calcularPuntos();
        }

        boolean bonoExtra = false;
        if (cantidad > 3 || totalFacturado > 300000) {
            bonoExtra = true;
            totalComisiones += 20000;
        }

        JOptionPane.showMessageDialog(null, "El Agente Vendedor \"" + vendedor.getNombre() + "\" código: " + vendedor.getCodigo()
                + " en el mes de " + facturas[0].getMesNombre() + ".\n\n"
                + "Vendió un total de ₡" + totalFacturado + " en facturas.\n"
                + "Obtuvo un total en comisiones de ₡" + totalComisiones + ".\n"
                + (bonoExtra ? "El agente vendedor sí logró el BONO EXTRA.\n" : "El agente vendedor no logró el BONO EXTRA.\n")
                + "Puntos obtenidos por el vendedor: " + totalPuntos + ".\n"
                + "El Agente Vendedor " + vendedor.getVehiculo() + " cuenta con vehículo propio.\n"
                + "Sucursal: " + vendedor.getSucursal() + ".");
    }
}
