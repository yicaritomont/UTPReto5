package controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import modelo.DAO.*;
import modelo.VO.*;
public class ControladorRequerimientos {
    
    private static final MaterialProyectoDAO materialProyectoDao = new MaterialProyectoDAO();
    private static final LideresSalarioCartagoDAO lideresSalarioCartagoDao = new LideresSalarioCartagoDAO();
    private static final LideresCostosPromDAO lideresCostosPromDao = new LideresCostosPromDAO();

    public ControladorRequerimientos(){
       // materialProyectoDao= new MaterialProyectoDao();
    }
    public static ArrayList<MaterialProyectoVO> consultarMaterialesProyecto() throws SQLException{
        return materialProyectoDao.MaterialesProyecto();
    }

    public static ArrayList<LiderSalarioCartagoVO> consultarLideresCartago() throws SQLException{
        return lideresSalarioCartagoDao.ConsultarLideresCartago();
    }

    public static ArrayList<LiderCostoPromVO> consultarLideresCostoProm() throws SQLException{
        return lideresCostosPromDao.ConsultarLideresCostoProm();
    }

    
}
