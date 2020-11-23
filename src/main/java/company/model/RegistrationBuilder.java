package company.model;

public class RegistrationBuilder {
    private String gender;
    private String firstCustomerName;
    private String lastCustomerName;
    private String pass;
    private String email;
    private String day;
    private String month;
    private String year;
    private String firstName;
    private String lastName;
    private String company;
    private String adress1;
    private String adress2;
    private String city;
    private String state;
    private String postcode;
    private String country;
    private String mobilePhone;
    private String alias;

    public RegistrationBuilder withGender(String gender) {
        this.gender = gender;
        return this;
    }

    public RegistrationBuilder withFirstCustomerName(String firstCustomerName) {
        this.firstCustomerName = firstCustomerName;
        return this;
    }

    public RegistrationBuilder withLastCustomerName(String lastCustomerName) {
        this.lastCustomerName = lastCustomerName;
        return this;
    }

    public RegistrationBuilder withPass(String pass) {
        this.pass = pass;
        return this;
    }

    public RegistrationBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public RegistrationBuilder withDay(String day) {
        this.day = day;
        return this;
    }

    public RegistrationBuilder withMonth(String month) {
        this.month = month;
        return this;
    }

    public RegistrationBuilder withYear(String year) {
        this.year = year;
        return this;
    }

    public RegistrationBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public RegistrationBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public RegistrationBuilder withCompany(String company) {
        this.company = company;
        return this;
    }

    public RegistrationBuilder withAdress1(String adress1) {
        this.adress1 = adress1;
        return this;
    }

    public RegistrationBuilder withAdress2(String adress2) {
        this.adress2 = adress2;
        return this;
    }

    public RegistrationBuilder withCity(String city) {
        this.city = city;
        return this;
    }

    public RegistrationBuilder withState(String state) {
        this.state = state;
        return this;
    }

    public RegistrationBuilder withPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public RegistrationBuilder withCountry(String country) {
        this.country = country;
        return this;
    }

    public RegistrationBuilder withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public RegistrationBuilder withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public RegistrationForm build() {
        return new RegistrationForm(gender, firstCustomerName, lastCustomerName, pass, email, day, month, year, firstName, lastName, company, adress1, adress2, city, state, postcode, country, mobilePhone, alias);
    }
}
