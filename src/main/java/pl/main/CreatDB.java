package pl.main;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcPooledConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.io.IOException;
import java.sql.SQLException;

public class CreatDB {


    public CreatDB() throws SQLException, IOException {


        String databaseUr1 = "jdbc:sqlite:database.db";
        ConnectionSource connectionSource = new JdbcPooledConnectionSource(databaseUr1);

        TableUtils.dropTable(connectionSource, Table.class, true);
        TableUtils.createTableIfNotExists(connectionSource, Table.class);
        TableUtils.dropTable(connectionSource, Elements_Table_020_00.class, true);
        TableUtils.createTableIfNotExists(connectionSource, Elements_Table_020_00.class);
        TableUtils.dropTable(connectionSource, Elements_Table_020_10.class, true);
        TableUtils.createTableIfNotExists(connectionSource, Elements_Table_020_10.class);
        TableUtils.dropTable(connectionSource, Elements_Table_020_20.class, true);
        TableUtils.createTableIfNotExists(connectionSource, Elements_Table_020_20.class);
        Table table = new Table();
        Table table1 = new Table();
        Table table2 = new Table();

        Elements_Table_020_00 ETable02000_0 = new Elements_Table_020_00();
        Elements_Table_020_00 ETable02000_1= new Elements_Table_020_00();
        Elements_Table_020_00 ETable02000_2 = new Elements_Table_020_00();
        Elements_Table_020_00 ETable02000_3 = new Elements_Table_020_00();

        Elements_Table_020_10 ETable02010_0 = new Elements_Table_020_10();
        Elements_Table_020_10 ETable02010_1 = new Elements_Table_020_10();
        Elements_Table_020_10 ETable02010_2 = new Elements_Table_020_10();
        Elements_Table_020_10 ETable02010_3 = new Elements_Table_020_10();

        Elements_Table_020_20 ETable02020_0 = new Elements_Table_020_20();
        Elements_Table_020_20 ETable02020_1 = new Elements_Table_020_20();
        Elements_Table_020_20 ETable02020_2 = new Elements_Table_020_20();
        Elements_Table_020_20 ETable02020_3 = new Elements_Table_020_20();


        Dao<Elements_Table_020_00, Integer> daoETable02000 = DaoManager.createDao(connectionSource, Elements_Table_020_00.class);
        ETable02000_0.setTable(table);
        daoETable02000.create(ETable02000_0);
        ETable02000_1.setTable(table);
        daoETable02000.create(ETable02000_1);
        ETable02000_2.setTable(table);
        daoETable02000.create(ETable02000_2);
        ETable02000_3.setTable(table);
        daoETable02000.create(ETable02000_3);
        Dao<Elements_Table_020_10, Integer> daoETable02010 = DaoManager.createDao(connectionSource, Elements_Table_020_10.class);
        ETable02010_0.setTable(table1);
        daoETable02010.create(ETable02010_0);
        ETable02010_1.setTable(table1);
        daoETable02010.create(ETable02010_1);
        ETable02010_2.setTable(table1);
        daoETable02010.create(ETable02010_2);
        ETable02010_3.setTable(table1);
        daoETable02010.create(ETable02010_3);
        Dao<Elements_Table_020_20, Integer> daoETable02020= DaoManager.createDao(connectionSource, Elements_Table_020_20.class);
        ETable02020_0.setTable(table2);
        daoETable02020.create(ETable02020_0);
        ETable02020_1.setTable(table2);
        daoETable02020.create(ETable02020_1);
        ETable02020_2.setTable(table2);
        daoETable02020.create(ETable02020_2);
        ETable02020_3.setTable(table2);
        daoETable02020.create(ETable02020_3);




        connectionSource.close();

    }

}
