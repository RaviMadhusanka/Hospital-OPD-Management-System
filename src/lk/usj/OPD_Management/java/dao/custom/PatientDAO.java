package lk.usj.OPD_Management.java.dao.custom;

import lk.usj.OPD_Management.java.dao.CrudDAO;
import lk.usj.OPD_Management.java.dto.PatientDTO;
import lk.usj.OPD_Management.java.entity.Patient;

public interface PatientDAO extends CrudDAO<Patient,String> {
    int countTotalPatient() throws Exception;
}
