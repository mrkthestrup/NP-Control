package sample.View;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import sample.MainApp;

public class PurchaseController {

        @FXML        private TextField textFieldPircePerBarrels;
        @FXML        private TextField textFieldTransportPrice;
        @FXML        private TextField textfieldAmountOfBarrles;
        @FXML        private RadioButton radioButtonEuro;
        @FXML        private RadioButton radioButtonShip;
        @FXML        private ProgressBar progressBarCPH;
        @FXML        private Label labelFinalCost;
        @FXML        private Label labelOilAmount;
        @FXML        private Label labelTransportPrice;
        @FXML        private Button cancelButton;
        @FXML        private Label labelPricePerBarrels;
        @FXML        private TextField textFieldCurrency;
        @FXML        private RadioButton radioButtonFredericia;
        @FXML        private Label labelFinalPrice;
        @FXML        private Label labelBarrels;
        @FXML        private RadioButton radioButtonUSD;
        @FXML        private Button buyButton;
        @FXML        private Label labelPrice;
        @FXML        private TextField textFieldFinalCost;
        @FXML        private Label labelRefinery;
        @FXML        private Label labelTo;
        @FXML        private Label labelTransport;
        @FXML        private RadioButton radioButtonCopenhagen;
        @FXML        private ProgressBar progressBarFred;
        @FXML        private RadioButton radioButtonRotterdam;
        @FXML        private Label labelFrom;
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
