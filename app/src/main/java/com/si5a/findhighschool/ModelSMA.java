package com.si5a.findhighschool;

public class ModelSMA {
    private String nama;
    private String tentang;
    private String foto;
    private String latitude, longitude;

    public String getNama() {return nama;}

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTentang() {
        return tentang;
    }

    public void setTentang(String tentang) {
        this.tentang = tentang;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
