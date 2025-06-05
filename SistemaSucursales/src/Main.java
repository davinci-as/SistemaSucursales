import dv.torneo.Match;
import dv.torneo.Player;
import dv.torneo.Season;
import dv.torneo.Team;
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

        EntidadBancaria bancoSM = new EntidadBancaria();
        bancoSM.setNombre("Banco SM");
        bancoSM.setDomicilio("Calle 456, BA");
        bancoSM.setCodigo(191);

        // Carga de vigilantes
        ArrayList<Vigilante> vigilantes = new ArrayList<>();
        vigilantes.add(new Vigilante(0, 35, "Juan Pablo"));
        vigilantes.add(new Vigilante(1, 40, "Mario"));

        // Carga de las sucursales
        ArrayList<Sucursal> sucursalesDB = new ArrayList<>();
        sucursalesDB.add(new Sucursal(bancoDV, 879, "Calle 879, BA"));
        sucursalesDB.add(new Sucursal(bancoDV, 123, "Calle 1122, BA"));
        sucursalesDB.add(new Sucursal(bancoDV, 190, "Calle 456, BA"));

        ArrayList<Sucursal> sucursalesSM = new ArrayList<>();
        sucursalesSM.add(new Sucursal(bancoSM, 199, "Calle 14A, BA"));

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

        bancoDV.getSucursales(); //TODO: vincular sucursales con banco
        bancoSM.getSucursales();


        //Comienzo del Torneo
        Date fechaInicio = new Date(125, 5, 4);
        Date fechaCierre = new Date(125, 8, 1);

        //Creacion de Torneo
        Season season = new Season("Temporada 2025-26",fechaInicio,fechaCierre);

        //Creacion de Jugadores
        ArrayList<Player> riverPlate = new ArrayList<>();
        riverPlate.add(new Player(1,"Franco Armani","Arquero",0));
        riverPlate.add(new Player(2,"Paulo Diaz","Defensor",0));
        riverPlate.add(new Player(3,"Milton Casco","Defensor",0));
        riverPlate.add(new Player(4,"Gonzalo Montiel","Defensor",0));
        riverPlate.add(new Player(5,"Enzo Perez","Defensor",0));
        riverPlate.add(new Player(6,"German Pezzella","Mediocampista",0));
        riverPlate.add(new Player(7,"Nacho Fernandez","Mediocampista",0));
        riverPlate.add(new Player(8,"Exequiel Palacios","Mediocampista",0));
        riverPlate.add(new Player(9,"Sebastian Driussi","Delantero",0));
        riverPlate.add(new Player(10,"Franco Mastantuono","Delantero",0));
        riverPlate.add(new Player(11,"Facundo Colidio","Delantero",0));

        ArrayList<Player> argentina = new ArrayList<>();
        argentina.add(new Player(1,"Emiliano Martinez","Arquero",0));
        argentina.add(new Player(2,"Nicolas Otamendi","Defensor",0));
        argentina.add(new Player(3,"Nicolas Tagliafico","Defensor",0));
        argentina.add(new Player(4,"Nahuel Molina","Defensor",0));
        argentina.add(new Player(5,"Enzo Fernandez","Defensor",0));
        argentina.add(new Player(6,"Cuti Romero","Mediocampista",0));
        argentina.add(new Player(7,"Alexis Macallister","Mediocampista",0));
        argentina.add(new Player(8,"Rodrigo DePaul","Mediocampista",0));
        argentina.add(new Player(9,"Julian Alvarez","Delantero",0));
        argentina.add(new Player(10,"Lionel Messi","Delantero",0));
        argentina.add(new Player(11,"Nicolas Dominguez","Delantero",0));

        //Creacion de Equipos
        Team teamA = new Team("River Plate", riverPlate);
        Team teamB = new Team("Argentina", argentina);

        Date partido1 = new Date(125,5, 8);
        Match match1 = new Match("Monumental",partido1,teamA,teamB,2,3);
    }
}