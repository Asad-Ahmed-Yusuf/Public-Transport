package application;

/*PreparedStatement ps = conn.prepareStatement("insert into Customer(CustomerSSN, CustomerFirst, CustomerLast, CustomerStreet, CustomerCity, CustomerZip,CustomerState, CustomerEmail) "
+ "values(?,?,?,?,?,?,?,?)");*/

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.sql.*;

public class ModelController {
	
	@FXML
	private Label LblStatus;
	
	@FXML
	private TextField UserEmail;
	
	@FXML
	private TextField UserPassword;
	
	@FXML
	private TextField RegisterEmail;
	
	@FXML
	private TextField RegisterPassword;
	
	@FXML
	private TextField RegisterFirst;
	
	@FXML
	private TextField RegisterLast;
	
	@FXML
	private TextField RegisterSSN;
	
	@FXML
	private TextField RegisterAddress;
	
	@FXML
	private TextField RegisterCity;
	
	@FXML
	private TextField RegisterState;
	
	@FXML
	private TextField RegisterZip;
	
	@FXML
	private Button LoginRegister;
		

	
	public void Login(ActionEvent event) throws Exception {
		
		
		if(UserEmail.getText().equals("User") && UserPassword.getText().equals("pass")) {
			LblStatus.setText("Login Success");
			
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		else {
			LblStatus.setText("Login Failed");
		}
		
	}
	
	public void handleButtonAction(ActionEvent event) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Register.FXML"));
			Parent root1 = (Parent) fxmlLoader.load();
			Scene Register = new Scene(root1);
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			
			window.setScene(Register);
			window.show();

		}
		catch(Exception e) {
			
		}
	}
	
	public void Register(ActionEvent event) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql//35.196.80.119:3306/FlightProject","root","MyTeam");
			PreparedStatement ps = conn.prepareStatement("insert into C(CustomerSSN, CustomerFirst, CustomerLast, CustomerStreet, CustomerCity, CustomerZip,CustomerState, CustomerEmail) "
					+ "values(?,?,?,?,?,?,?,?)");
			ps.setString(1, RegisterEmail.getText());
			ps.setString(2, RegisterPassword.getText());
			ps.setString(3, RegisterFirst.getText());
			ps.setString(4, RegisterLast.getText());
			ps.setString(5, RegisterAddress.getText());
			ps.setString(6, RegisterCity.getText());
			ps.setString(4, RegisterZip.getText());
			ps.setString(4, RegisterState.getText());
			int x = ps.executeUpdate();
			if(x > 0) {
				System.out.println("Registration done sucessfully...");
			}
			else {
				System.out.println("Registration failed");
			}
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}

