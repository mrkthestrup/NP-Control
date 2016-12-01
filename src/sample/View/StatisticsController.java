package sample.View;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.*;
import sample.MainApp;

public class StatisticsController {

    @FXML    private CheckBox checkboxCost;
    @FXML    private TableColumn<?, ?> colBarrels;
    @FXML    private ComboBox<?> comboxAllTime;
    @FXML    private ComboBox<?> combox1;
    @FXML    private Tab graphTab;
    @FXML    private Tab tableTab;
    @FXML    private ComboBox<?> comboxSubject;
    @FXML    private ComboBox<?> combox2;
    @FXML    private RadioButton radioButtonShip;
    @FXML    private TableColumn<?, ?> colDate;
    @FXML    private CheckBox checkboxLitresSold;
    @FXML    private CheckBox checkboxTotalRevnue;
    @FXML    private TableView<?> tableviewTable;
    @FXML    private ComboBox<?> comboxCity;
    @FXML    private LineChart<?, ?> graph1;
    @FXML    private ComboBox<?> comboxTime;
    @FXML    private TableColumn<?, ?> colPrice;
    @FXML    private TableColumn<?, ?> colTransportCost;
    @FXML    private CheckBox checkboxPrice;
    @FXML    private RadioButton radioButtonRotterdam;
    @FXML    private TableColumn<?, ?> colCurrency;
    @FXML    private ToggleButton oilStatusButton;
    @FXML    private ToggleButton StatisticsButton;
    @FXML    private ToggleButton purchaseFromButton;

    MainApp mainApp = new MainApp();

    public void setMain(MainApp main){
        this.mainApp = main;

    }
    @FXML
    public void clickedOilStatus(){
        mainApp.showOilStatus();
    }
    @FXML
    public void clickedStatistics(){
        mainApp.showStatistisc();
    }
    @FXML
    public void clickedPurchase(){
        mainApp.showPurchase();
    }

}
