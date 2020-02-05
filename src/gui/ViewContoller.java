package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import entidades.Pessoa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class ViewContoller implements Initializable {

	@FXML
	private ComboBox<Pessoa> comboPessoa;

	private ObservableList<Pessoa> obsPessoa;
	
	public void onComboActoin () {
		Pessoa pessoa = comboPessoa.getSelectionModel().getSelectedItem();
		System.out.println(pessoa);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		List<Pessoa> lista = new ArrayList<>();
		lista.add(new Pessoa("Nathalia", "tataia@gmail.com", 1));
		lista.add(new Pessoa("Ingrid", "tataiaIngr@gmail.com", 2));
		lista.add(new Pessoa("Nayron", "nayron@gmail.com", 3));
		lista.add(new Pessoa("Nayara", "nayara@gmail.com", 4));
		lista.add(new Pessoa("Mãe", "mae@gmail.com", 5));

		obsPessoa = FXCollections.observableArrayList(lista);
		comboPessoa.setItems(obsPessoa);

		Callback<ListView<Pessoa>, ListCell<Pessoa>> factory = lv -> new ListCell<Pessoa>() {
			@Override
			protected void updateItem(Pessoa item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getNome());
			}
		};

		comboPessoa.setCellFactory(factory);
		comboPessoa.setButtonCell(factory.call(null));
	}

}
