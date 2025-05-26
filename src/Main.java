import vigilancia.sistema.Contrato;
import vigilancia.sistema.EntidadBancaria;
import vigilancia.sistema.Sucursal;
import vigilancia.sistema.Vigilante;

import javax.naming.ldap.Control;
import java.util.ArrayList;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EntidadBancaria bancoDV = new EntidadBancaria();
        bancoDV.setNombre("Banco DV");
        bancoDV.setDomicilio("Calle 123, BA");
        bancoDV.setCodigo(192);

        // Carga de vigilantes
        ArrayList<Vigilante> vigilantes = new ArrayList<>();
        vigilantes.add(new Vigilante(0, 35, "Juan Pablo"));
        vigilantes.add(new Vigilante(1, 40, "Mario"));

        // Carga de las sucursales
        ArrayList<Sucursal> sucursalesDB = new ArrayList<>();
        sucursalesDB.add(new Sucursal(bancoDV, 879, "Calle 879, BA"));
        sucursalesDB.add(new Sucursal(bancoDV, 123, "Calle 1122, BA"));
        sucursalesDB.add(new Sucursal(bancoDV, 190, "Calle 456, BA"));

        // Carga de los contratos
        ArrayList<Contrato> contratos = new ArrayList<>();
        contratos.add(new Contrato(
                vigilantes.get(1),
                new Date(2025, 7, 1),
                new Date(2025, 11, 31)
        ));
        contratos.add(new Contrato(
                vigilantes.get(0),
                new Date(2025, 7, 1),
                new Date(2025, 11, 31)
        ));

        // Dar de alta los contratos
        contratos.get(0).setActivo(true);
        sucursalesDB.get(0).addContrato(contratos.get(0));
        contratos.get(1).setActivo(true);
        sucursalesDB.get(0).addContrato(contratos.get(1));

        //Manera 3

        ArrayList<Vigilante> vigilantesDeSucursal = sucursalesDB.get(0).getVigilantes();

        bancoDV.getSucursales();
    }
}