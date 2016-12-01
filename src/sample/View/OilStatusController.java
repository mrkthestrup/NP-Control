package sample.View;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import sample.MainApp;

public class OilStatusController {

    @FXML    private TableColumn<?, ?> colDatePurchase;
    @FXML    private TableColumn<?, ?> colBarrels;
    @FXML    private Button updateTableButton;
    @FXML    private TableColumn<?, ?> colFrom;
    @FXML    private TableColumn<?, ?> colETA;
    @FXML    private Tab oilStatusTab;
    @FXML    private TableView<?> tableViewServiceStation;
    @FXML    private TableColumn<?, ?> colCity;
    @FXML    private TableColumn<?, ?> colRegion;
    @FXML    private TableColumn<?, ?> colPrice;
    @FXML    private TableView<?> tableviewOilStatus;
    @FXML    private TableColumn<?, ?> colTo;
    @FXML    private TableColumn<?, ?> colID;
    @FXML    private TableColumn<?, ?> colStatus;
    @FXML    private Tab serviceStationTab;
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
