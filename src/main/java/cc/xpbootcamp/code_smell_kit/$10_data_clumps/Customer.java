package cc.xpbootcamp.code_smell_kit.$10_data_clumps;

import lombok.Data;

@Data
public class Customer {
    private String firstName;

    private String lastName;

    private String title;

    // TODO：以下参数可以放在Address类中
    private String house;

    private String street;

    private String city;

    private String postcode;

    private String country;

    public String getAddressSummary() {
        return getHouse() + ", " + getStreet() + ", " + getCity() + ", " + getPostcode() + ", " + getCountry();
    }

}
