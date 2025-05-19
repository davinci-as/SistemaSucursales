import vigilancia.sistema.EntidadBancaria;
import vigilancia.sistema.Sucursal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EntidadBancaria bancoDV = new EntidadBancaria();
        bancoDV.setNombre("Banco DV");
        bancoDV.setDomicilio("Calle 123, BA");
        bancoDV.setCodigo(192);
        //Manera 1
        Sucursal sucursal = new Sucursal();
        bancoDV.addSucursal(sucursal);
        //Manera 2
        bancoDV.addSucursal(new Sucursal());
        //Manera 3
        bancoDV.addSucursal(190, "Calle 456, BA");

        bancoDV.getSucursales();
    }
}