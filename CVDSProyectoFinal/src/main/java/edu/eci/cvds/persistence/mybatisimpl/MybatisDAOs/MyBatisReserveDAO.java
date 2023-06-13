package edu.eci.cvds.persistence.mybatisimpl.MybatisDAOs;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Reserve;
import edu.eci.cvds.persistence.ExceptionReport.ReportFile;
import edu.eci.cvds.persistence.mybatisimpl.DAOs.ReserveDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.ReserveMapper;


import java.util.List;

public class MyBatisReserveDAO implements ReserveDAO {

    @Inject
    ReserveMapper reserveMapper;

    @Override
    public List<Reserve> getListReserves() {
        try {
            return reserveMapper.getListReserves();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            ReportFile.loadReport(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Reserve> getListReserves1() {
        try {
            return reserveMapper.getListReserves1();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            ReportFile.loadReport(e.getMessage());
            return null;
        }
    }

    @Override
    public void createReserve(Reserve reserve) {
        try {
            reserveMapper.createReserve(reserve);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            ReportFile.loadReport(e.getMessage());
        }
    }

    @Override
    public void deleteReserve(Reserve reserve) {
        try {
            reserveMapper.deleteReserve(reserve);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            ReportFile.loadReport(e.getMessage());
        }
    }
}
