package com.halil.ozel.covid19stats.data;

import java.util.Objects;

public class CountriesResponse implements Comparable<CountriesResponse> {

    private String country;
    private String recovered;
    private String cases;
    private String critical;
    private String deathsPerOneMillion;
    private String active;
    private String casesPerOneMillion;
    private CountryInfo countryInfo;
    private int deaths;
    private int todayCases;
    private int todayDeaths;
    private String tests;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getCases() {
        return cases;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }

    public String getCritical() {
        return critical;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }

    public String getDeathsPerOneMillion() {
        return deathsPerOneMillion;
    }

    public void setDeathsPerOneMillion(String deathsPerOneMillion) {
        this.deathsPerOneMillion = deathsPerOneMillion;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getCasesPerOneMillion() {
        return casesPerOneMillion;
    }

    public void setCasesPerOneMillion(String casesPerOneMillion) {
        this.casesPerOneMillion = casesPerOneMillion;
    }

    public CountryInfo getCountryInfo() {
        return countryInfo;
    }

    public void setCountryInfo(CountryInfo countryInfo) {
        this.countryInfo = countryInfo;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(int todayCases) {
        this.todayCases = todayCases;
    }

    public int getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(int todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public String getTests() {
        return tests;
    }

    public void setTests(String tests) {
        this.tests = tests;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CountriesResponse)) return false;
        CountriesResponse that = (CountriesResponse) o;
        return getTodayCases() == that.getTodayCases() && getTodayDeaths() == that.getTodayDeaths() && getCountry().equals(that.getCountry()) && getRecovered().equals(that.getRecovered()) && getCases().equals(that.getCases()) && getCritical().equals(that.getCritical()) && getDeathsPerOneMillion().equals(that.getDeathsPerOneMillion()) && getActive().equals(that.getActive()) && getCasesPerOneMillion().equals(that.getCasesPerOneMillion()) && getCountryInfo().equals(that.getCountryInfo()) && getDeaths() == that.getDeaths() && getTests().equals(that.getTests());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountry(), getRecovered(), getCases(), getCritical(), getDeathsPerOneMillion(), getActive(), getCasesPerOneMillion(), getCountryInfo(), getDeaths(), getTodayCases(), getTodayDeaths(), getTests());
    }

    @Override
    public String toString() {
        return "CountriesResponse{" +
                "country='" + country + '\'' +
                ", recovered='" + recovered + '\'' +
                ", cases='" + cases + '\'' +
                ", critical='" + critical + '\'' +
                ", deathsPerOneMillion='" + deathsPerOneMillion + '\'' +
                ", active='" + active + '\'' +
                ", casesPerOneMillion='" + casesPerOneMillion + '\'' +
                ", countryInfo=" + countryInfo +
                ", deaths='" + deaths + '\'' +
                ", todayCases=" + todayCases +
                ", todayDeaths=" + todayDeaths +
                ", tests='" + tests + '\'' +
                '}';
    }

    @Override
    public int compareTo(CountriesResponse countriesResponse) {
        return countriesResponse.deaths - deaths;
    }
}
