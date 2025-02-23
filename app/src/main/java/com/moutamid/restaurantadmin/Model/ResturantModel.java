package com.moutamid.restaurantadmin.Model;

public class ResturantModel {
    String image_url, name, short_description, phone, address, key;
    double lat, lng;

    public ResturantModel() {
    }

    public ResturantModel(String image_url, String name, String short_description, String phone, String address, String key, double lat, double lng) {
        this.image_url = image_url;
        this.name = name;
        this.short_description = short_description;
        this.phone = phone;
        this.address = address;
        this.key = key;
        this.lat = lat;
        this.lng = lng;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}
