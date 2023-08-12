package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControleTela {

	@FXML
	private TextField txtNome;
	
	@FXML
	private TextField txtReferencia;
	
	@FXML
	private TextField txtNivel;
	
	@FXML
	private TextField txtTrienio;
	
	@FXML
	private Button btnCalcular;
	
	@FXML
	private Label labelResultado;
	
	@FXML
	public void onBtnCalcularAction() {
		
		String nome = txtNome.getText();
		double referencia = Double.parseDouble(txtReferencia.getText());
		double nivel = Double.parseDouble(txtNivel.getText());
		double trienio = Double.parseDouble(txtTrienio.getText());
		double calcular = nivel+(nivel*trienio);
		labelResultado.setText(String.format("%.2f", calcular));
		
	}
}
