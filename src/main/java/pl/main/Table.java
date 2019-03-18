package pl.main;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Tables")
public class Table {
    private static int counter = 00;
    private static String name = "020";

    public Table() {
        setNumberTable();
    }

    @DatabaseField(generatedId = true)
    private int id;

    @ForeignCollectionField(eager = true)
    private ForeignCollection<Elements_Table_020_00> eTable02000;
    @ForeignCollectionField(eager = true)
    private ForeignCollection<Elements_Table_020_10> eTable02010;
    @ForeignCollectionField(eager = true)
    private ForeignCollection<Elements_Table_020_20> eTable02020;


    @DatabaseField(columnName = "Number Table")
    private String numberTable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumberTable() {
        return numberTable;
    }

    public void setNumberTable() {

        String temp = Integer.toString(counter);
        if (counter == 0)
            this.numberTable = name + '0' + temp;
        else
            this.numberTable = name + temp;
        counter += 10;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", numberTable='" + numberTable + '\'' +
                '}';
    }
}
