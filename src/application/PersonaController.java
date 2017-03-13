package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PersonaController {

	@FXML
	private TableView<Persona> Tabla;

	@FXML
	private TableColumn<Persona,String> ColName;

	@FXML
	private TableColumn<Persona,String> ColApellido;

	private final ObservableList<Persona> data = FXCollections.observableArrayList(
			new Persona("David", "Perez"),
			new Persona("Pedro", "Camacho"));

	public void initialize(){
		Tabla.setItems(this.data);
		ColName.setCellValueFactory(new PropertyValueFactory<Persona,String>("nombre"));
		ColApellido.setCellValueFactory(new PropertyValueFactory<Persona,String>("apellido"));
	}

}
