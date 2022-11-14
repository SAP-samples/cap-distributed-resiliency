package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Boolean;
import java.lang.String;
import java.util.function.Function;

@CdsName("API_BUSINESS_PARTNER.A_CustomerSalesArea")
public interface ACustomerSalesArea_ extends StructuredType<ACustomerSalesArea_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_CustomerSalesArea";

  ElementRef<String> Customer();

  ElementRef<String> SalesOrganization();

  ElementRef<String> DistributionChannel();

  ElementRef<String> Division();

  ElementRef<String> AccountByCustomer();

  ElementRef<String> AuthorizationGroup();

  ElementRef<String> BillingIsBlockedForCustomer();

  ElementRef<Boolean> CompleteDeliveryIsDefined();

  ElementRef<String> Currency();

  ElementRef<String> CustomerABCClassification();

  ElementRef<String> CustomerAccountAssignmentGroup();

  ElementRef<String> CustomerGroup();

  ElementRef<String> CustomerPaymentTerms();

  ElementRef<String> CustomerPriceGroup();

  ElementRef<String> CustomerPricingProcedure();

  ElementRef<String> DeliveryIsBlockedForCustomer();

  ElementRef<String> DeliveryPriority();

  ElementRef<String> IncotermsClassification();

  ElementRef<String> IncotermsLocation2();

  ElementRef<String> IncotermsVersion();

  ElementRef<String> IncotermsLocation1();

  ElementRef<Boolean> DeletionIndicator();

  ElementRef<String> IncotermsTransferLocation();

  ElementRef<String> InvoiceDate();

  ElementRef<String> ItemOrderProbabilityInPercent();

  ElementRef<Boolean> OrderCombinationIsAllowed();

  ElementRef<String> OrderIsBlockedForCustomer();

  ElementRef<String> PartialDeliveryIsAllowed();

  ElementRef<String> PriceListType();

  ElementRef<String> SalesGroup();

  ElementRef<String> SalesOffice();

  ElementRef<String> ShippingCondition();

  ElementRef<String> SupplyingPlant();

  ElementRef<String> SalesDistrict();

  ElementRef<String> InvoiceListSchedule();

  ElementRef<String> ExchangeRateType();

  ElementRef<String> AdditionalCustomerGroup1();

  ElementRef<String> AdditionalCustomerGroup2();

  ElementRef<String> AdditionalCustomerGroup3();

  ElementRef<String> AdditionalCustomerGroup4();

  ElementRef<String> AdditionalCustomerGroup5();

  ElementRef<String> PaymentGuaranteeProcedure();

  ElementRef<String> CustomerAccountGroup();

  ACustSalesPartnerFunc_ to_PartnerFunction();

  ACustSalesPartnerFunc_ to_PartnerFunction(Function<ACustSalesPartnerFunc_, CqnPredicate> filter);

  ElementRef<String> to_PartnerFunction_Customer();

  ElementRef<String> to_PartnerFunction_SalesOrganization();

  ElementRef<String> to_PartnerFunction_DistributionChannel();

  ElementRef<String> to_PartnerFunction_Division();

  ElementRef<String> to_PartnerFunction_PartnerCounter();

  ElementRef<String> to_PartnerFunction_PartnerFunction();

  ACustomerSalesAreaTax_ to_SalesAreaTax();

  ACustomerSalesAreaTax_ to_SalesAreaTax(Function<ACustomerSalesAreaTax_, CqnPredicate> filter);

  ElementRef<String> to_SalesAreaTax_Customer();

  ElementRef<String> to_SalesAreaTax_SalesOrganization();

  ElementRef<String> to_SalesAreaTax_DistributionChannel();

  ElementRef<String> to_SalesAreaTax_Division();

  ElementRef<String> to_SalesAreaTax_DepartureCountry();

  ElementRef<String> to_SalesAreaTax_CustomerTaxCategory();
}
