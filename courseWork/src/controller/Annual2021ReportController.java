package controller;

import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.AnnualIncome;
import view.tm.AnnualIncomeTM;

public class Annual2021ReportController {
    public Label lbl2021Annual;

    public TableView<AnnualIncomeTM> tblAnnualIncome;

    public TableColumn colHead;
    public TableColumn colJan;
    public TableColumn colFeb;
    public TableColumn colMarch;
    public TableColumn colApril;
    public TableColumn colMay;
    public TableColumn colJune;
    public TableColumn colJuly;
    public TableColumn colAug;
    public TableColumn colSept;
    public TableColumn colOct;
    public TableColumn colNov;
    public TableColumn colDec;

    public void initialize(){
        colHead.setCellValueFactory(new PropertyValueFactory("head"));
        colJan.setCellValueFactory(new PropertyValueFactory("january"));
        colFeb.setCellValueFactory(new PropertyValueFactory("february"));
        colMarch.setCellValueFactory(new PropertyValueFactory("march"));
        colApril.setCellValueFactory(new PropertyValueFactory("april"));
        colMay.setCellValueFactory(new PropertyValueFactory("may"));
        colJune.setCellValueFactory(new PropertyValueFactory("june"));
        colJuly.setCellValueFactory(new PropertyValueFactory("july"));
        colAug.setCellValueFactory(new PropertyValueFactory("august"));
        colSept.setCellValueFactory(new PropertyValueFactory("september"));
        colOct.setCellValueFactory(new PropertyValueFactory("october"));
        colNov.setCellValueFactory(new PropertyValueFactory("november"));
        colDec.setCellValueFactory(new PropertyValueFactory("december"));
        loadAnnualIncome();
    }

    private void loadAnnualIncome() {
        ObservableList<AnnualIncomeTM> obList = FXCollections.observableArrayList();

        for (AnnualIncome a: Database.table21
             ) {
            AnnualIncomeTM tm = new AnnualIncomeTM(a.getHead(), a.getJanuary(), a.getFebruary(),a.getMarch(),a.getApril(),a.getMay(),a.getJune(),a.getJuly(),a.getAugust(),a.getSeptember(),a.getOctober(),a.getNovember(),a.getDecember());
            obList.add(tm);

        }
        tblAnnualIncome.setItems(obList);
    }
}
