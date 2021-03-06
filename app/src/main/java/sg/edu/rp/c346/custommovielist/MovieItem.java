package sg.edu.rp.c346.custommovielist;

/**
 * Created by 17010144 on 17/7/2018.
 */

public class MovieItem {
    private String Name;
    private String Date;

    public MovieItem(String name, String date) {
        this.Name = name;
        this.Date = date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }

    @Override
    public String toString() {
        return "MovieItem{" +
                "Name='" + Name + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }
}
