package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.String;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@CdsName("API_BUSINESS_PARTNER.A_Customer")
public interface ACustomer extends CdsData {
  String CUSTOMER = "Customer";

  String AUTHORIZATION_GROUP = "AuthorizationGroup";

  String BILLING_IS_BLOCKED_FOR_CUSTOMER = "BillingIsBlockedForCustomer";

  String CREATED_BY_USER = "CreatedByUser";

  String CREATION_DATE = "CreationDate";

  String CUSTOMER_ACCOUNT_GROUP = "CustomerAccountGroup";

  String CUSTOMER_CLASSIFICATION = "CustomerClassification";

  String CUSTOMER_FULL_NAME = "CustomerFullName";

  String CUSTOMER_NAME = "CustomerName";

  String DELIVERY_IS_BLOCKED = "DeliveryIsBlocked";

  String NFPARTNER_IS_NATURAL_PERSON = "NFPartnerIsNaturalPerson";

  String ORDER_IS_BLOCKED_FOR_CUSTOMER = "OrderIsBlockedForCustomer";

  String POSTING_IS_BLOCKED = "PostingIsBlocked";

  String SUPPLIER = "Supplier";

  String CUSTOMER_CORPORATE_GROUP = "CustomerCorporateGroup";

  String FISCAL_ADDRESS = "FiscalAddress";

  String INDUSTRY = "Industry";

  String INDUSTRY_CODE1 = "IndustryCode1";

  String INDUSTRY_CODE2 = "IndustryCode2";

  String INDUSTRY_CODE3 = "IndustryCode3";

  String INDUSTRY_CODE4 = "IndustryCode4";

  String INDUSTRY_CODE5 = "IndustryCode5";

  String INTERNATIONAL_LOCATION_NUMBER1 = "InternationalLocationNumber1";

  String NIELSEN_REGION = "NielsenRegion";

  String RESPONSIBLE_TYPE = "ResponsibleType";

  String TAX_NUMBER1 = "TaxNumber1";

  String TAX_NUMBER2 = "TaxNumber2";

  String TAX_NUMBER3 = "TaxNumber3";

  String TAX_NUMBER4 = "TaxNumber4";

  String TAX_NUMBER5 = "TaxNumber5";

  String TAX_NUMBER_TYPE = "TaxNumberType";

  String VATREGISTRATION = "VATRegistration";

  String DELETION_INDICATOR = "DeletionIndicator";

  String TO_CUSTOMER_COMPANY = "to_CustomerCompany";

  String TO_CUSTOMER_COMPANY_CUSTOMER = "to_CustomerCompany_Customer";

  String TO_CUSTOMER_COMPANY_COMPANY_CODE = "to_CustomerCompany_CompanyCode";

  String TO_CUSTOMER_SALES_AREA = "to_CustomerSalesArea";

  String TO_CUSTOMER_SALES_AREA_CUSTOMER = "to_CustomerSalesArea_Customer";

  String TO_CUSTOMER_SALES_AREA_SALES_ORGANIZATION = "to_CustomerSalesArea_SalesOrganization";

  String TO_CUSTOMER_SALES_AREA_DISTRIBUTION_CHANNEL = "to_CustomerSalesArea_DistributionChannel";

  String TO_CUSTOMER_SALES_AREA_DIVISION = "to_CustomerSalesArea_Division";

  @CdsName(CUSTOMER)
  String getCustomer();

  @CdsName(CUSTOMER)
  void setCustomer(String customer);

  @CdsName(AUTHORIZATION_GROUP)
  String getAuthorizationGroup();

  @CdsName(AUTHORIZATION_GROUP)
  void setAuthorizationGroup(String authorizationGroup);

  @CdsName(BILLING_IS_BLOCKED_FOR_CUSTOMER)
  String getBillingIsBlockedForCustomer();

  @CdsName(BILLING_IS_BLOCKED_FOR_CUSTOMER)
  void setBillingIsBlockedForCustomer(String billingIsBlockedForCustomer);

  @CdsName(CREATED_BY_USER)
  String getCreatedByUser();

  @CdsName(CREATED_BY_USER)
  void setCreatedByUser(String createdByUser);

  @CdsName(CREATION_DATE)
  LocalDate getCreationDate();

  @CdsName(CREATION_DATE)
  void setCreationDate(LocalDate creationDate);

  @CdsName(CUSTOMER_ACCOUNT_GROUP)
  String getCustomerAccountGroup();

  @CdsName(CUSTOMER_ACCOUNT_GROUP)
  void setCustomerAccountGroup(String customerAccountGroup);

  @CdsName(CUSTOMER_CLASSIFICATION)
  String getCustomerClassification();

  @CdsName(CUSTOMER_CLASSIFICATION)
  void setCustomerClassification(String customerClassification);

  @CdsName(CUSTOMER_FULL_NAME)
  String getCustomerFullName();

  @CdsName(CUSTOMER_FULL_NAME)
  void setCustomerFullName(String customerFullName);

  @CdsName(CUSTOMER_NAME)
  String getCustomerName();

  @CdsName(CUSTOMER_NAME)
  void setCustomerName(String customerName);

  @CdsName(DELIVERY_IS_BLOCKED)
  String getDeliveryIsBlocked();

  @CdsName(DELIVERY_IS_BLOCKED)
  void setDeliveryIsBlocked(String deliveryIsBlocked);

  @CdsName(NFPARTNER_IS_NATURAL_PERSON)
  String getNFPartnerIsNaturalPerson();

  @CdsName(NFPARTNER_IS_NATURAL_PERSON)
  void setNFPartnerIsNaturalPerson(String nFPartnerIsNaturalPerson);

  @CdsName(ORDER_IS_BLOCKED_FOR_CUSTOMER)
  String getOrderIsBlockedForCustomer();

  @CdsName(ORDER_IS_BLOCKED_FOR_CUSTOMER)
  void setOrderIsBlockedForCustomer(String orderIsBlockedForCustomer);

  @CdsName(POSTING_IS_BLOCKED)
  Boolean getPostingIsBlocked();

  @CdsName(POSTING_IS_BLOCKED)
  void setPostingIsBlocked(Boolean postingIsBlocked);

  @CdsName(SUPPLIER)
  String getSupplier();

  @CdsName(SUPPLIER)
  void setSupplier(String supplier);

  @CdsName(CUSTOMER_CORPORATE_GROUP)
  String getCustomerCorporateGroup();

  @CdsName(CUSTOMER_CORPORATE_GROUP)
  void setCustomerCorporateGroup(String customerCorporateGroup);

  @CdsName(FISCAL_ADDRESS)
  String getFiscalAddress();

  @CdsName(FISCAL_ADDRESS)
  void setFiscalAddress(String fiscalAddress);

  @CdsName(INDUSTRY)
  String getIndustry();

  @CdsName(INDUSTRY)
  void setIndustry(String industry);

  @CdsName(INDUSTRY_CODE1)
  String getIndustryCode1();

  @CdsName(INDUSTRY_CODE1)
  void setIndustryCode1(String industryCode1);

  @CdsName(INDUSTRY_CODE2)
  String getIndustryCode2();

  @CdsName(INDUSTRY_CODE2)
  void setIndustryCode2(String industryCode2);

  @CdsName(INDUSTRY_CODE3)
  String getIndustryCode3();

  @CdsName(INDUSTRY_CODE3)
  void setIndustryCode3(String industryCode3);

  @CdsName(INDUSTRY_CODE4)
  String getIndustryCode4();

  @CdsName(INDUSTRY_CODE4)
  void setIndustryCode4(String industryCode4);

  @CdsName(INDUSTRY_CODE5)
  String getIndustryCode5();

  @CdsName(INDUSTRY_CODE5)
  void setIndustryCode5(String industryCode5);

  @CdsName(INTERNATIONAL_LOCATION_NUMBER1)
  String getInternationalLocationNumber1();

  @CdsName(INTERNATIONAL_LOCATION_NUMBER1)
  void setInternationalLocationNumber1(String internationalLocationNumber1);

  @CdsName(NIELSEN_REGION)
  String getNielsenRegion();

  @CdsName(NIELSEN_REGION)
  void setNielsenRegion(String nielsenRegion);

  @CdsName(RESPONSIBLE_TYPE)
  String getResponsibleType();

  @CdsName(RESPONSIBLE_TYPE)
  void setResponsibleType(String responsibleType);

  @CdsName(TAX_NUMBER1)
  String getTaxNumber1();

  @CdsName(TAX_NUMBER1)
  void setTaxNumber1(String taxNumber1);

  @CdsName(TAX_NUMBER2)
  String getTaxNumber2();

  @CdsName(TAX_NUMBER2)
  void setTaxNumber2(String taxNumber2);

  @CdsName(TAX_NUMBER3)
  String getTaxNumber3();

  @CdsName(TAX_NUMBER3)
  void setTaxNumber3(String taxNumber3);

  @CdsName(TAX_NUMBER4)
  String getTaxNumber4();

  @CdsName(TAX_NUMBER4)
  void setTaxNumber4(String taxNumber4);

  @CdsName(TAX_NUMBER5)
  String getTaxNumber5();

  @CdsName(TAX_NUMBER5)
  void setTaxNumber5(String taxNumber5);

  @CdsName(TAX_NUMBER_TYPE)
  String getTaxNumberType();

  @CdsName(TAX_NUMBER_TYPE)
  void setTaxNumberType(String taxNumberType);

  @CdsName(VATREGISTRATION)
  String getVATRegistration();

  @CdsName(VATREGISTRATION)
  void setVATRegistration(String vATRegistration);

  @CdsName(DELETION_INDICATOR)
  Boolean getDeletionIndicator();

  @CdsName(DELETION_INDICATOR)
  void setDeletionIndicator(Boolean deletionIndicator);

  @CdsName(TO_CUSTOMER_COMPANY)
  List<ACustomerCompany> getToCustomerCompany();

  @CdsName(TO_CUSTOMER_COMPANY)
  void setToCustomerCompany(List<? extends Map<String, ?>> toCustomerCompany);

  @CdsName(TO_CUSTOMER_COMPANY_CUSTOMER)
  String getToCustomerCompanyCustomer();

  @CdsName(TO_CUSTOMER_COMPANY_CUSTOMER)
  void setToCustomerCompanyCustomer(String toCustomerCompanyCustomer);

  @CdsName(TO_CUSTOMER_COMPANY_COMPANY_CODE)
  String getToCustomerCompanyCompanyCode();

  @CdsName(TO_CUSTOMER_COMPANY_COMPANY_CODE)
  void setToCustomerCompanyCompanyCode(String toCustomerCompanyCompanyCode);

  @CdsName(TO_CUSTOMER_SALES_AREA)
  List<ACustomerSalesArea> getToCustomerSalesArea();

  @CdsName(TO_CUSTOMER_SALES_AREA)
  void setToCustomerSalesArea(List<? extends Map<String, ?>> toCustomerSalesArea);

  @CdsName(TO_CUSTOMER_SALES_AREA_CUSTOMER)
  String getToCustomerSalesAreaCustomer();

  @CdsName(TO_CUSTOMER_SALES_AREA_CUSTOMER)
  void setToCustomerSalesAreaCustomer(String toCustomerSalesAreaCustomer);

  @CdsName(TO_CUSTOMER_SALES_AREA_SALES_ORGANIZATION)
  String getToCustomerSalesAreaSalesOrganization();

  @CdsName(TO_CUSTOMER_SALES_AREA_SALES_ORGANIZATION)
  void setToCustomerSalesAreaSalesOrganization(String toCustomerSalesAreaSalesOrganization);

  @CdsName(TO_CUSTOMER_SALES_AREA_DISTRIBUTION_CHANNEL)
  String getToCustomerSalesAreaDistributionChannel();

  @CdsName(TO_CUSTOMER_SALES_AREA_DISTRIBUTION_CHANNEL)
  void setToCustomerSalesAreaDistributionChannel(String toCustomerSalesAreaDistributionChannel);

  @CdsName(TO_CUSTOMER_SALES_AREA_DIVISION)
  String getToCustomerSalesAreaDivision();

  @CdsName(TO_CUSTOMER_SALES_AREA_DIVISION)
  void setToCustomerSalesAreaDivision(String toCustomerSalesAreaDivision);

  ACustomer_ ref();

  static ACustomer create() {
    return Struct.create(ACustomer.class);
  }
}
