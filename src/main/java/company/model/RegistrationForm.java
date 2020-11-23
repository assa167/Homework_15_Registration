package company.model;

public class RegistrationForm {
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

    public RegistrationForm() {

    }

    public RegistrationForm(String gender, String firstCustomerName, String lastCustomerName, String pass,
                            String email, String day, String month, String year, String firstName, String lastName,
                            String company, String adress1, String adress2, String city, String state, String postcode,
                            String country, String mobilePhone, String alias) {
        this.gender = gender;
        this.firstCustomerName = firstCustomerName;
        this.lastCustomerName = lastCustomerName;
        this.pass = pass;
        this.email = email;
        this.day = day;
        this.month = month;
        this.year = year;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.adress1 = adress1;
        this.adress2 = adress2;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.country = country;
        this.mobilePhone = mobilePhone;
        this.alias = alias;
    }

    public String getGender() { return gender; }
    public String getFirstCustomerName() { return firstCustomerName; }
    public String getLastCustomerName() { return lastCustomerName; }
    public String getPass() { return pass; }
    public String getEmail() { return email; }
    public String getDay() { return day; }
    public String getMonth() { return month; }
    public String getYear() { return year; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getCompany() { return company; }
    public String getAdress1() { return adress1; }
    public String getAdress2() { return adress2; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getPostcode() { return postcode; }
    public String getCountry() { return country; }
    public String getMobilePhone() { return mobilePhone; }
    public String getAlias() { return alias; }

}
