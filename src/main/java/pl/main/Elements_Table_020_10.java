package pl.main;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@DatabaseTable(tableName = "ElementsTable02010")
public class Elements_Table_020_10 {
    private static int counter = 100;
    private static String name = "00000";
    public Elements_Table_020_10() {
        Date currentDate = new Date();
        setNumberElements();
        setServiceDate(currentDate);
        setMaintenanceDate();
        setComingService();
    }
    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "NumberElements", unique = true)
    private String numberElements;

    @DatabaseField(columnName = "ServiceDate", dataType = DataType.DATE_STRING, format = "yyyy-MM-DD")
    private Date serviceDate;

    @DatabaseField(columnName = "ComingService", dataType = DataType.DATE_STRING, format = "yyyy-MM-DD")
    private Date comingService;

    @DatabaseField(columnName = "MaintenanceDate", dataType = DataType.DATE_STRING, format = "yyyy-MM-DD")
    private Date maintenanceDate;
    @DatabaseField(columnName = "Table_ID", foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    private Table table;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumberElements() {
        return numberElements;
    }

    public void setNumberElements() {
        String temp = Integer.toString(counter);
        if (counter == 0)
            this.numberElements = name + '0' + temp;
        else
            this.numberElements = name + temp;
        counter += 10;
    }

    public Date getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 6);
        Date DD = cal.getTime();
        this.maintenanceDate = DD;
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }
    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }
    public Date getComingService() {
        return comingService;
    }

    public void setComingService() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, 2);
        Date DD = cal.getTime();
        this.comingService = DD;
    }
}
