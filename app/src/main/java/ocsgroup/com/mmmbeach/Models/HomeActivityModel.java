package ocsgroup.com.mmmbeach.Models;

/**
 * Created by sanju on 8/29/2017.
 */
public class HomeActivityModel {

    String massager_name;
    String time;
    int id_;
    int rating;
    String review;
    String activity_info;
    String activity_desc;
    int massager_image;
    int activity_icon;

    public HomeActivityModel(int id_,String massager_name, String time, int rating, String review, String activity_info, String activity_desc,int massager_image,int activity_icon) {
        this.massager_name = massager_name;
        this.time = time;
        this.id_ = id_;
        this.rating=rating;
        this.review = review;
        this.activity_info = activity_info;
        this.activity_desc = activity_desc;
        this.massager_image=massager_image;
        this.activity_icon=activity_icon;
    }

    public String getName() {
        return massager_name;
    }

    public String gettime() {
        return time;
    }
    public String getreview() {
        return review;
    }

    public String getinfo() {
        return activity_info;
    }
    public String getdesc() {
        return activity_desc;
    }
    public int getImage() {
        return massager_image;
    }
    public int getrating() {
        return rating;
    }
    public int geticon() {
        return activity_icon;
    }
    public int getId() {
        return id_;
    }
}