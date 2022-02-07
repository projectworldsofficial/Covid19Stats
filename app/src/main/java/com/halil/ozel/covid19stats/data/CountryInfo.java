package com.halil.ozel.covid19stats.data;

import java.util.Objects;

public class CountryInfo {


    private String flag;

    private String _id;

    private String iso2;

    private String iso3;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CountryInfo)) return false;
        CountryInfo that = (CountryInfo) o;
        return getFlag().equals(that.getFlag()) && get_id().equals(that.get_id()) && getIso2().equals(that.getIso2()) && getIso3().equals(that.getIso3());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlag(), get_id(), getIso2(), getIso3());
    }

    @Override
    public String toString() {
        return "CountryInfo{" +
                "flag='" + flag + '\'' +
                ", _id='" + _id + '\'' +
                ", iso2='" + iso2 + '\'' +
                ", iso3='" + iso3 + '\'' +
                '}';
    }
}
