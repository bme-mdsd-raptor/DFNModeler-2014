package application;

import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import GreenhouseDFNPackage.DayPhaseToken;
import GreenhouseDFNPackage.TemperatureToken;
import GreenhouseDFNPackage.WaterTempToken;
import controller.GreenhouseDFNController;
import controller.GreenhouseDFNController.HeatingNodeState;
import controller.GreenhouseDFNController.LightingNodeState;

public class GreenhouseController implements Observer, Initializable, AutoCloseable {

	GreenhouseDFNController gdfn;

	@FXML
	RadioButton rbNight;
	@FXML
	RadioButton rbDay;
	@FXML
	Slider sHouseTemp;
	@FXML
	Label lHouseTemp;
	@FXML
	Slider sWaterTemp;
	@FXML
	Label lWaterTemp;
	@FXML
	ImageView iHouse;
	@FXML
	Label title;
	@FXML
	ToggleGroup dayPhase;

	@FXML
	public void handleRBNight(MouseEvent event) {
		rbDay.setSelected(false);
		rbNight.setSelected(true);
		gdfn.setInputOnHouseAtLightSensorInPort(DayPhaseToken.DayPhaseNight);

	}

	@FXML
	public void handleRBDay(MouseEvent event) {
		rbDay.setSelected(true);
		rbNight.setSelected(false);
		gdfn.setInputOnHouseAtLightSensorInPort(DayPhaseToken.DayPhaseDay);
	}

	private void updateHImage() {

		iHouse.setImage(new Image("file:resources\\sh_" + day() + "_l"
				+ light() + "_h" + heat() + "_a" + water() + ".png"));
		iHouse.setFitHeight(300);
		iHouse.setFitWidth(300);
	}

	private String day() {
		return rbDay.isSelected() ? "d" : "n";
	}

	private String light() {
		return gdfn.getLightingNodestate().equals(
				LightingNodeState.LightingAtOn) ? "on" : "off";
	}

	private String heat() {
		return gdfn.getHeatingNodestate().equals(HeatingNodeState.HeatingAtOn) ? "on"
				: "off";
	}

	private String water() {
		return gdfn
				.getAquariumDFNController()
				.getHeatingNodestate()
				.equals(controller.AquariumDFNController.HeatingNodeState.AquariumAtHeatingAtOn) ? "on"
				: "off";
	}

	@FXML
	public void handleSHouseTemp(MouseEvent event) {
		lHouseTemp.setText("House temperature: "
				+ (int) (sHouseTemp.getValue()));
		sHouseTemp.setValue((int) (sHouseTemp.getValue()));
		gdfn.setInputOnHouseAtTempSensorInPort(new TemperatureToken(
				(int) sHouseTemp.getValue()));
		;
	}

	@FXML
	public void handleSWaterTemp(MouseEvent event) {
		lWaterTemp.setText("Water temperature: "
				+ (int) (sWaterTemp.getValue()));
		sWaterTemp.setValue((int) (sWaterTemp.getValue()));

		gdfn.getAquariumDFNController().setInputOnAquariumTempInInPort(
				new WaterTempToken((int) sWaterTemp.getValue()));
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		updateHImage();

	}

	public GreenhouseController() {
		gdfn = new GreenhouseDFNController();
		gdfn.addObserver(this);
		gdfn.getAquariumDFNController().addObserver(this);


	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		gdfn.start();
		gdfn.getAquariumDFNController().start();
		gdfn.setInputOnHouseAtLightSensorInPort(DayPhaseToken.DayPhaseDay);
		gdfn.setInputOnHouseAtTempSensorInPort(new TemperatureToken(21));
		gdfn.getAquariumDFNController().setInputOnAquariumTempInInPort(
				new WaterTempToken(28));

	}

	@Override
	public void close() {
		gdfn.close();
		
	}
	


}
