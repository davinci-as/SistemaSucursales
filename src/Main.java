import vigilancia.sistema.EntidadBancaria;
import vigilancia.sistema.Sucursal;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EntidadBancaria bancoDV = new EntidadBancaria();
        bancoDV.setNombre("Banco DV");
        bancoDV.setDomicilio("Calle 123, BA");
        bancoDV.setCodigo(192);
        //Manera 1
        Sucursal sucursal = new Sucursal(bancoDV);
        bancoDV.addSucursal(sucursal);
        sucursal.setDomicilio("Calle 879, BA");
        sucursal.setCodigo(879);

        //Manera 2
        bancoDV.addSucursal(new Sucursal(bancoDV));
        ArrayList<Sucursal> sucursales = bancoDV.getSucursales();
        Sucursal sucursal1 = sucursales.get(1);
        sucursal1.setDomicilio("Calle 1122, BA");
        sucursal1.setCodigo(123);

        //Manera 3
        bancoDV.addSucursal(190, "Calle 456, BA");

        bancoDV.getSucursales();
    }
}