package lk.usj.OPD_Management.java.dao;

import lk.usj.OPD_Management.java.dao.custom.Impl.*;

public class DAOFactory {
    private static DAOFactory dAOFactory;

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        if (dAOFactory == null) {
            dAOFactory = new DAOFactory();
        }

        return dAOFactory;
    }

    public <T extends SuperDAO> T getDAO(DAOFactory.DAOTypes daoType) {
        switch (daoType) {
            case ADMIN:
                return (T) new AdminDAOImpl();
            case RECEPTIONIST:
                return (T) new ReceptionistDAOImpl();
            case PATIENT:
                return (T) new PatientDAOImpl();
            case DOCTOR:
                return (T) new DoctorDAOImpl();
            case VISITOR:
                return (T) new VisitorDAOImpl();
            case POSTAL:
                return (T) new PostalDAOImpl();
            case APPOINTMENT:
                return (T) new AppointmentDAOImpl();
            case LOGIN:
                return (T) new LoginDAOImpl();
            case COMPLAINT:
                return (T) new ComplaintDAOImpl();
            default:
                return null;
        }
    }

    public static enum DAOTypes {
        ADMIN,
        RECEPTIONIST,
        PATIENT,
        DOCTOR,
        VISITOR,
        POSTAL,
        APPOINTMENT,
        LOGIN,
        COMPLAINT;

        private DAOTypes() {
        }
    }
}