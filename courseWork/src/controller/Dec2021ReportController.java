package controller;

import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.MonthlyIncome;
import view.tm.MonthlyIncomeTM;

public class Dec2021ReportController {
    public TableView<MonthlyIncomeTM> tblMonthlyIncome;
    public TableColumn colHead;
    public TableColumn colCost;
    
    public void initialize(){
        colHead.setCellValueFactory(new PropertyValueFactory("head"));
        colCost.setCellValueFactory(new PropertyValueFactory("cost"));
        loadMonthlyIncome();
    }

    private void loadMonthlyIncome() {
        ObservableList<MonthlyIncomeTM> obList = FXCollections.observableArrayList();

        for (MonthlyIncome m : Database.decemberTable
             ) {
            MonthlyIncomeTM tm = new MonthlyIncomeTM(m.getHead(), m.getCost());
          obList.add(tm);
        }
        tblMonthlyIncome.setItems(obList);
    }
}
