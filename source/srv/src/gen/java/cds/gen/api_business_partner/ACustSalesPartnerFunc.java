package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.String;

@CdsName("API_BUSINESS_PARTNER.A_CustSalesPartnerFunc")
public interface ACustSalesPartnerFunc extends CdsData {
  String CUSTOMER = "Customer";

  String SALES_ORGANIZATION = "SalesOrganization";

  String DISTRIBUTION_CHANNEL = "DistributionChannel";

  String DIVISION = "Division";

  String PARTNER_COUNTER = "PartnerCounter";

  String PARTNER_FUNCTION = "PartnerFunction";

  String BPCUSTOMER_NUMBER = "BPCustomerNumber";

  String CUSTOMER_PARTNER_DESCRIPTION = "CustomerPartnerDescription";

  String DEFAULT_PARTNER = "DefaultPartner";

  String AUTHORIZATION_GROUP = "AuthorizationGroup";

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

  @CdsName(PARTNER_COUNTER)
  String getPartnerCounter();

  @CdsName(PARTNER_COUNTER)
  void setPartnerCounter(String partnerCounter);

  @CdsName(PARTNER_FUNCTION)
  String getPartnerFunction();

  @CdsName(PARTNER_FUNCTION)
  void setPartnerFunction(String partnerFunction);

  @CdsName(BPCUSTOMER_NUMBER)
  String getBPCustomerNumber();

  @CdsName(BPCUSTOMER_NUMBER)
  void setBPCustomerNumber(String bPCustomerNumber);

  @CdsName(CUSTOMER_PARTNER_DESCRIPTION)
  String getCustomerPartnerDescription();

  @CdsName(CUSTOMER_PARTNER_DESCRIPTION)
  void setCustomerPartnerDescription(String customerPartnerDescription);

  @CdsName(DEFAULT_PARTNER)
  Boolean getDefaultPartner();

  @CdsName(DEFAULT_PARTNER)
  void setDefaultPartner(Boolean defaultPartner);

  @CdsName(AUTHORIZATION_GROUP)
  String getAuthorizationGroup();

  @CdsName(AUTHORIZATION_GROUP)
  void setAuthorizationGroup(String authorizationGroup);

  ACustSalesPartnerFunc_ ref();

  static ACustSalesPartnerFunc create() {
    return Struct.create(ACustSalesPartnerFunc.class);
  }
}
