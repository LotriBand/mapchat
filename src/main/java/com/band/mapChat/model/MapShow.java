package com.band.mapChat.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mapshow")
public class MapShow implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String content;
    //private List<Photo> photos;
    private double latitude;
    private double longitude;
   // private List<Tag> tags;
   @ManyToOne(cascade = CascadeType.ALL,optional = true)
   @JoinColumn(name = "user_id")
    private User user;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

//    public List<Photo> getPhotos() {
//        return photos;
//    }
//
//    public void setPhotos(List<Photo> photos) {
//        this.photos = photos;
//    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    //    public List<Tag> getTags() {
//        return tags;
//    }
//
//    public void setTags(List<Tag> tags) {
//        this.tags = tags;
//    }

    @Override
    public String toString() {
        return "MapShow{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                //", photos=" + photos +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                //", tags=" + tags +
                '}';
    }
}
