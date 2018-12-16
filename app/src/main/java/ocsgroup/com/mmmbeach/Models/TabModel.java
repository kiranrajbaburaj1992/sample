package ocsgroup.com.mmmbeach.Models;


/**
 * Created by sanju on 8/31/2017.
 */

public class TabModel {
    String beach_name;
    String beach_dist;
    int beach_photo;
    int beach_rate;

    public TabModel(String beach_name, String beach_dist, int beach_photo, int beach_rate){
        this.beach_name=beach_name;
        this.beach_dist=beach_dist;
        this.beach_photo=beach_photo;
        this.beach_rate=beach_rate;

    }
    public String getdist() {
        return beach_dist;
    }
    public int getImage() {
        return beach_photo;
    }
    public int getrating() {
        return beach_rate;
    }
    public String getName() {
        return beach_name;
    }
}
