package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Boolean;
import java.lang.String;
import java.time.LocalDate;
import java.util.function.Function;

@CdsName("API_BUSINESS_PARTNER.A_Customer")
public interface ACustomer_ extends StructuredType<ACustomer_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_Customer";

  ElementRef<String> Customer();

  ElementRef<String> AuthorizationGroup();

  ElementRef<String> BillingIsBlockedForCustomer();

  ElementRef<String> CreatedByUser();

  ElementRef<LocalDate> CreationDate();

  ElementRef<String> CustomerAccountGroup();

  ElementRef<String> CustomerClassification();

  ElementRef<String> CustomerFullName();

  ElementRef<String> CustomerName();

  ElementRef<String> DeliveryIsBlocked();

  ElementRef<String> NFPartnerIsNaturalPerson();

  ElementRef<String> OrderIsBlockedForCustomer();

  ElementRef<Boolean> PostingIsBlocked();

  ElementRef<String> Supplier();

  ElementRef<String> CustomerCorporateGroup();

  ElementRef<String> FiscalAddress();

  ElementRef<String> Industry();

  ElementRef<String> IndustryCode1();

  ElementRef<String> IndustryCode2();

  ElementRef<String> IndustryCode3();

  ElementRef<String> IndustryCode4();

  ElementRef<String> IndustryCode5();

  ElementRef<String> InternationalLocationNumber1();

  ElementRef<String> NielsenRegion();

  ElementRef<String> ResponsibleType();

  ElementRef<String> TaxNumber1();

  ElementRef<String> TaxNumber2();

  ElementRef<String> TaxNumber3();

  ElementRef<String> TaxNumber4();

  ElementRef<String> TaxNumber5();

  ElementRef<String> TaxNumberType();

  ElementRef<String> VATRegistration();

  ElementRef<Boolean> DeletionIndicator();

  ACustomerCompany_ to_CustomerCompany();

  ACustomerCompany_ to_CustomerCompany(Function<ACustomerCompany_, CqnPredicate> filter);

  ElementRef<String> to_CustomerCompany_Customer();

  ElementRef<String> to_CustomerCompany_CompanyCode();

  ACustomerSalesArea_ to_CustomerSalesArea();

  ACustomerSalesArea_ to_CustomerSalesArea(Function<ACustomerSalesArea_, CqnPredicate> filter);

  ElementRef<String> to_CustomerSalesArea_Customer();

  ElementRef<String> to_CustomerSalesArea_SalesOrganization();

  ElementRef<String> to_CustomerSalesArea_DistributionChannel();

  ElementRef<String> to_CustomerSalesArea_Division();
}
