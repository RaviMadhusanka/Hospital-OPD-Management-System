package lk.usj.OPD_Management.java.controller.admin;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import lk.usj.OPD_Management.java.dto.DoctorDTO;
import lk.usj.OPD_Management.java.service.custom.DoctorBO;
import lk.usj.OPD_Management.java.service.custom.PatientBO;
import lk.usj.OPD_Management.java.service.custom.impl.DoctorBOImpl;
import lk.usj.OPD_Management.java.service.custom.impl.PatientBOImpl;

public class AdminUsersDoctorTableController implements Initializable {
    private DoctorBO doctorBO= new DoctorBOImpl();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<DoctorDTO> doctorTable;

    @FXML
    void doctorTable_MouseEvent(MouseEvent event) {

    }

    private void loadDoctorTable() throws Exception {
        doctorTable.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("staffID"));
        doctorTable.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        doctorTable.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("idCard"));
        doctorTable.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        doctorTable.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("staffEmail"));
        doctorTable.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>("specialistArea"));
        doctorTable.setItems(FXCollections.observableArrayList(doctorBO.getAllDoctors()));
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            loadDoctorTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}