package pl.controllers;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcPooledConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import javafx.fxml.FXML;
import pl.main.*;

import java.io.IOException;
import java.sql.SQLException;

public class BaseSelectionController {
    @FXML
    public void openCreate() throws SQLException, IOException {
       CreatDB newDB = new CreatDB();
    }

    @FXML
    public void openUse() {
        Main.set_pane(2);
    }
}
