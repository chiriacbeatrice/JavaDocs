package ro.teamnet.zth.appl.dao.domain;

import ro.teamnet.zth.api.annotation.Id;
import ro.teamnet.zth.api.annotation.Table;

/**
 * Created by Beatrice.Chiriac on 7/12/2017.
 */

@Table(name="departments")

public class Department {
    @Id(name = "department_id")
    private Long id;

    @Id(name = "department_departmentName")
    private String departmentName;

    @Id(name = "department_location")
    private Location location;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (!id.equals(that.id)) return false;
        if (!departmentName.equals(that.departmentName)) return false;
        return location.equals(that.location);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + departmentName.hashCode();
        result = 31 * result + location.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", location=" + location +
                '}';
    }


}
