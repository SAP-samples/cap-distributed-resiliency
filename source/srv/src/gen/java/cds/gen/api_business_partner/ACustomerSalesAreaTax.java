package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;

@CdsName("API_BUSINESS_PARTNER.A_CustomerSalesAreaTax")
public interface ACustomerSalesAreaTax extends CdsData {
  String CUSTOMER = "Customer";

  String SALES_ORGANIZATION = "SalesOrganization";

  String DISTRIBUTION_CHANNEL = "DistributionChannel";

  String DIVISION = "Division";

  String DEPARTURE_COUNTRY = "DepartureCountry";

  String CUSTOMER_TAX_CATEGORY = "CustomerTaxCategory";

  String CUSTOMER_TAX_CLASSIFICATION = "CustomerTaxClassification";

  @CdsName(CUSTOMER)
  String getCustomer();

  @CdsName(CUSTOMER)
  void setCustomer(String customer);

  @CdsName(SALES_ORGANIZATION)
  String getSalesOrganization();

  @CdsName(SALES_ORGANIZATION)
  void setSalesOrganization(String salesOrganization);

  @CdsName(DISTRIBUTION_CHANNEL)
  String getDistributionChannel();

  @CdsName(DISTRIBUTION_CHANNEL)
  void setDistributionChannel(String distributionChannel);

  @CdsName(DIVISION)
  String getDivision();

  @CdsName(DIVISION)
  void setDivision(String division);

  @CdsName(DEPARTURE_COUNTRY)
  String getDepartureCountry();

  @CdsName(DEPARTURE_COUNTRY)
  void setDepartureCountry(String departureCountry);

  @CdsName(CUSTOMER_TAX_CATEGORY)
  String getCustomerTaxCategory();

  @CdsName(CUSTOMER_TAX_CATEGORY)
  void setCustomerTaxCategory(String customerTaxCategory);

  @CdsName(CUSTOMER_TAX_CLASSIFICATION)
  String getCustomerTaxClassification();

  @CdsName(CUSTOMER_TAX_CLASSIFICATION)
  void setCustomerTaxClassification(String customerTaxClassification);

  ACustomerSalesAreaTax_ ref();

  static ACustomerSalesAreaTax create() {
    return Struct.create(ACustomerSalesAreaTax.class);
  }
}
