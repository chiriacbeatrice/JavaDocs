package ro.teamnet.zth.appl.dao.domain;

import ro.teamnet.zth.api.annotation.Id;

/**
 * Created by Beatrice.Chiriac on 7/12/2017.
 */
public class Location {

    @Id(name = "location_id")
    private Long id;

    @Id(name = "location_stinAdress")
    private String stringAdress;

    @Id(name = "location_postalCode")
    private String postalCode;

    @Id(name = "location_city")
    private String city;

    @Id(name = "location_stateProvince")
    private String stateProvince;






    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        if (!id.equals(location.id)) return false;
        if (!stringAdress.equals(location.stringAdress)) return false;
        if (!postalCode.equals(location.postalCode)) return false;
        if (!city.equals(location.city)) return false;
        return stateProvince.equals(location.stateProvince);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + stringAdress.hashCode();
        result = 31 * result + postalCode.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + stateProvince.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", stringAdress='" + stringAdress + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", stateProvince='" + stateProvince + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStringAdress() {
        return stringAdress;
    }

    public void setStringAdress(String stringAdress) {
        this.stringAdress = stringAdress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }
}
