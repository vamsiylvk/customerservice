package com.prokarma.customerservice.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Customer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-11T08:19:39.491Z[GMT]")


public class Customer   {
  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("birthDate")
  private String birthDate = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("mobileNumber")
  private String mobileNumber = null;

  /**
   * Customer Status
   */
  public enum CustomerStatusEnum {
    OPEN("Open"),
    
    CLOSE("Close"),
    
    SUSPENDED("Suspended"),
    
    RESTORED("restored");

    private String value;

    CustomerStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CustomerStatusEnum fromValue(String text) {
      for (CustomerStatusEnum b : CustomerStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("customerStatus")
  private CustomerStatusEnum customerStatus = null;

  @JsonProperty("address")
  private Address address = null;

  public Customer customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * customerID of format:C000000001
   * @return customerId
   **/
  @Schema(required = true, description = "customerID of format:C000000001")
      @NotNull

  @Size(max=10)   public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Customer firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * firstName of customer
   * @return firstName
   **/
  @Schema(required = true, description = "firstName of customer")
      @NotNull

  @Size(min=10,max=50)   public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Customer lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * lastName of customer
   * @return lastName
   **/
  @Schema(required = true, description = "lastName of customer")
      @NotNull

  @Size(min=10,max=50)   public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Customer birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Date of Birth of customer of format DD-MM-YYYY
   * @return birthDate
   **/
  @Schema(required = true, description = "Date of Birth of customer of format DD-MM-YYYY")
      @NotNull

  @Pattern(regexp="^(3[01]|[12][0-9]|0[1-9])-(1[0-2]|0[1-9])-[0-9]{4}$")   public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public Customer country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country Name of customer
   * @return country
   **/
  @Schema(required = true, description = "Country Name of customer")
      @NotNull

    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Customer countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Country Code of customer
   * @return countryCode
   **/
  @Schema(required = true, description = "Country Code of customer")
      @NotNull

  @Size(max=2)   public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Customer email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Must be Email ID of customer
   * @return email
   **/
  @Schema(required = true, description = "Must be Email ID of customer")
      @NotNull

    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Customer mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * Valid mobile Number
   * @return mobileNumber
   **/
  @Schema(description = "Valid mobile Number")
  
  @Size(max=10)   public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public Customer customerStatus(CustomerStatusEnum customerStatus) {
    this.customerStatus = customerStatus;
    return this;
  }

  /**
   * Customer Status
   * @return customerStatus
   **/
  @Schema(required = true, description = "Customer Status")
      @NotNull

    public CustomerStatusEnum getCustomerStatus() {
    return customerStatus;
  }

  public void setCustomerStatus(CustomerStatusEnum customerStatus) {
    this.customerStatus = customerStatus;
  }

  public Customer address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.customerId, customer.customerId) &&
        Objects.equals(this.firstName, customer.firstName) &&
        Objects.equals(this.lastName, customer.lastName) &&
        Objects.equals(this.birthDate, customer.birthDate) &&
        Objects.equals(this.country, customer.country) &&
        Objects.equals(this.countryCode, customer.countryCode) &&
        Objects.equals(this.email, customer.email) &&
        Objects.equals(this.mobileNumber, customer.mobileNumber) &&
        Objects.equals(this.customerStatus, customer.customerStatus) &&
        Objects.equals(this.address, customer.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, firstName, lastName, birthDate, country, countryCode, email, mobileNumber, customerStatus, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    customerStatus: ").append(toIndentedString(customerStatus)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
