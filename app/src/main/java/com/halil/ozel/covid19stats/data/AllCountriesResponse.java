package com.halil.ozel.covid19stats.data;

import java.util.Objects;

public class AllCountriesResponse {

    private String continent;

    private String cases;

    private String critical;

    private String active;

    private String testsPerOneMillion;

    private String affectedCountries;

    private String recovered;

    private String tests;

    private String deathsPerOneMillion;

    private String casesPerOneMillion;

    private String updated;

    private String deaths;

    private String todayCases;

    private String todayDeaths;

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
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

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getTestsPerOneMillion() {
        return testsPerOneMillion;
    }

    public void setTestsPerOneMillion(String testsPerOneMillion) {
        this.testsPerOneMillion = testsPerOneMillion;
    }

    public String getAffectedCountries() {
        return affectedCountries;
    }

    public void setAffectedCountries(String affectedCountries) {
        this.affectedCountries = affectedCountries;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getTests() {
        return tests;
    }

    public void setTests(String tests) {
        this.tests = tests;
    }

    public String getDeathsPerOneMillion() {
        return deathsPerOneMillion;
    }

    public void setDeathsPerOneMillion(String deathsPerOneMillion) {
        this.deathsPerOneMillion = deathsPerOneMillion;
    }

    public String getCasesPerOneMillion() {
        return casesPerOneMillion;
    }

    public void setCasesPerOneMillion(String casesPerOneMillion) {
        this.casesPerOneMillion = casesPerOneMillion;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(String todayCases) {
        this.todayCases = todayCases;
    }

    public String getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(String todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AllCountriesResponse)) return false;
        AllCountriesResponse that = (AllCountriesResponse) o;
        return getContinent().equals(that.getContinent()) && getCases().equals(that.getCases()) && getCritical().equals(that.getCritical()) && getActive().equals(that.getActive()) && getTestsPerOneMillion().equals(that.getTestsPerOneMillion()) && getAffectedCountries().equals(that.getAffectedCountries()) && getRecovered().equals(that.getRecovered()) && getTests().equals(that.getTests()) && getDeathsPerOneMillion().equals(that.getDeathsPerOneMillion()) && getCasesPerOneMillion().equals(that.getCasesPerOneMillion()) && getUpdated().equals(that.getUpdated()) && getDeaths().equals(that.getDeaths()) && getTodayCases().equals(that.getTodayCases()) && getTodayDeaths().equals(that.getTodayDeaths());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getContinent(), getCases(), getCritical(), getActive(), getTestsPerOneMillion(), getAffectedCountries(), getRecovered(), getTests(), getDeathsPerOneMillion(), getCasesPerOneMillion(), getUpdated(), getDeaths(), getTodayCases(), getTodayDeaths());
    }

    @Override
    public String toString() {
        return "AllCountriesResponse{" +
                "continent='" + continent + '\'' +
                ", cases='" + cases + '\'' +
                ", critical='" + critical + '\'' +
                ", active='" + active + '\'' +
                ", testsPerOneMillion='" + testsPerOneMillion + '\'' +
                ", affectedCountries='" + affectedCountries + '\'' +
                ", recovered='" + recovered + '\'' +
                ", tests='" + tests + '\'' +
                ", deathsPerOneMillion='" + deathsPerOneMillion + '\'' +
                ", casesPerOneMillion='" + casesPerOneMillion + '\'' +
                ", updated='" + updated + '\'' +
                ", deaths='" + deaths + '\'' +
                ", todayCases='" + todayCases + '\'' +
                ", todayDeaths='" + todayDeaths + '\'' +
                '}';
    }
}
