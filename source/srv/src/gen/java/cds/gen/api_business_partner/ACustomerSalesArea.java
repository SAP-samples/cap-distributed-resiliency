package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;

@CdsName("API_BUSINESS_PARTNER.A_CustomerSalesArea")
public interface ACustomerSalesArea extends CdsData {
  String CUSTOMER = "Customer";

  String SALES_ORGANIZATION = "SalesOrganization";

  String DISTRIBUTION_CHANNEL = "DistributionChannel";

  String DIVISION = "Division";

  String ACCOUNT_BY_CUSTOMER = "AccountByCustomer";

  String AUTHORIZATION_GROUP = "AuthorizationGroup";

  String BILLING_IS_BLOCKED_FOR_CUSTOMER = "BillingIsBlockedForCustomer";

  String COMPLETE_DELIVERY_IS_DEFINED = "CompleteDeliveryIsDefined";

  String CURRENCY = "Currency";

  String CUSTOMER_ABCCLASSIFICATION = "CustomerABCClassification";

  String CUSTOMER_ACCOUNT_ASSIGNMENT_GROUP = "CustomerAccountAssignmentGroup";

  String CUSTOMER_GROUP = "CustomerGroup";

  String CUSTOMER_PAYMENT_TERMS = "CustomerPaymentTerms";

  String CUSTOMER_PRICE_GROUP = "CustomerPriceGroup";

  String CUSTOMER_PRICING_PROCEDURE = "CustomerPricingProcedure";

  String DELIVERY_IS_BLOCKED_FOR_CUSTOMER = "DeliveryIsBlockedForCustomer";

  String DELIVERY_PRIORITY = "DeliveryPriority";

  String INCOTERMS_CLASSIFICATION = "IncotermsClassification";

  String INCOTERMS_LOCATION2 = "IncotermsLocation2";

  String INCOTERMS_VERSION = "IncotermsVersion";

  String INCOTERMS_LOCATION1 = "IncotermsLocation1";

  String DELETION_INDICATOR = "DeletionIndicator";

  String INCOTERMS_TRANSFER_LOCATION = "IncotermsTransferLocation";

  String INVOICE_DATE = "InvoiceDate";

  String ITEM_ORDER_PROBABILITY_IN_PERCENT = "ItemOrderProbabilityInPercent";

  String ORDER_COMBINATION_IS_ALLOWED = "OrderCombinationIsAllowed";

  String ORDER_IS_BLOCKED_FOR_CUSTOMER = "OrderIsBlockedForCustomer";

  String PARTIAL_DELIVERY_IS_ALLOWED = "PartialDeliveryIsAllowed";

  String PRICE_LIST_TYPE = "PriceListType";

  String SALES_GROUP = "SalesGroup";

  String SALES_OFFICE = "SalesOffice";

  String SHIPPING_CONDITION = "ShippingCondition";

  String SUPPLYING_PLANT = "SupplyingPlant";

  String SALES_DISTRICT = "SalesDistrict";

  String INVOICE_LIST_SCHEDULE = "InvoiceListSchedule";

  String EXCHANGE_RATE_TYPE = "ExchangeRateType";

  String ADDITIONAL_CUSTOMER_GROUP1 = "AdditionalCustomerGroup1";

  String ADDITIONAL_CUSTOMER_GROUP2 = "AdditionalCustomerGroup2";

  String ADDITIONAL_CUSTOMER_GROUP3 = "AdditionalCustomerGroup3";

  String ADDITIONAL_CUSTOMER_GROUP4 = "AdditionalCustomerGroup4";

  String ADDITIONAL_CUSTOMER_GROUP5 = "AdditionalCustomerGroup5";

  String PAYMENT_GUARANTEE_PROCEDURE = "PaymentGuaranteeProcedure";

  String CUSTOMER_ACCOUNT_GROUP = "CustomerAccountGroup";

  String TO_PARTNER_FUNCTION = "to_PartnerFunction";

  String TO_PARTNER_FUNCTION_CUSTOMER = "to_PartnerFunction_Customer";

  String TO_PARTNER_FUNCTION_SALES_ORGANIZATION = "to_PartnerFunction_SalesOrganization";

  String TO_PARTNER_FUNCTION_DISTRIBUTION_CHANNEL = "to_PartnerFunction_DistributionChannel";

  String TO_PARTNER_FUNCTION_DIVISION = "to_PartnerFunction_Division";

  String TO_PARTNER_FUNCTION_PARTNER_COUNTER = "to_PartnerFunction_PartnerCounter";

  String TO_PARTNER_FUNCTION_PARTNER_FUNCTION = "to_PartnerFunction_PartnerFunction";

  String TO_SALES_AREA_TAX = "to_SalesAreaTax";

  String TO_SALES_AREA_TAX_CUSTOMER = "to_SalesAreaTax_Customer";

  String TO_SALES_AREA_TAX_SALES_ORGANIZATION = "to_SalesAreaTax_SalesOrganization";

  String TO_SALES_AREA_TAX_DISTRIBUTION_CHANNEL = "to_SalesAreaTax_DistributionChannel";

  String TO_SALES_AREA_TAX_DIVISION = "to_SalesAreaTax_Division";

  String TO_SALES_AREA_TAX_DEPARTURE_COUNTRY = "to_SalesAreaTax_DepartureCountry";

  String TO_SALES_AREA_TAX_CUSTOMER_TAX_CATEGORY = "to_SalesAreaTax_CustomerTaxCategory";

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

  @CdsName(ACCOUNT_BY_CUSTOMER)
  String getAccountByCustomer();

  @CdsName(ACCOUNT_BY_CUSTOMER)
  void setAccountByCustomer(String accountByCustomer);

  @CdsName(AUTHORIZATION_GROUP)
  String getAuthorizationGroup();

  @CdsName(AUTHORIZATION_GROUP)
  void setAuthorizationGroup(String authorizationGroup);

  @CdsName(BILLING_IS_BLOCKED_FOR_CUSTOMER)
  String getBillingIsBlockedForCustomer();

  @CdsName(BILLING_IS_BLOCKED_FOR_CUSTOMER)
  void setBillingIsBlockedForCustomer(String billingIsBlockedForCustomer);

  @CdsName(COMPLETE_DELIVERY_IS_DEFINED)
  Boolean getCompleteDeliveryIsDefined();

  @CdsName(COMPLETE_DELIVERY_IS_DEFINED)
  void setCompleteDeliveryIsDefined(Boolean completeDeliveryIsDefined);

  @CdsName(CURRENCY)
  String getCurrency();

  @CdsName(CURRENCY)
  void setCurrency(String currency);

  @CdsName(CUSTOMER_ABCCLASSIFICATION)
  String getCustomerABCClassification();

  @CdsName(CUSTOMER_ABCCLASSIFICATION)
  void setCustomerABCClassification(String customerABCClassification);

  @CdsName(CUSTOMER_ACCOUNT_ASSIGNMENT_GROUP)
  String getCustomerAccountAssignmentGroup();

  @CdsName(CUSTOMER_ACCOUNT_ASSIGNMENT_GROUP)
  void setCustomerAccountAssignmentGroup(String customerAccountAssignmentGroup);

  @CdsName(CUSTOMER_GROUP)
  String getCustomerGroup();

  @CdsName(CUSTOMER_GROUP)
  void setCustomerGroup(String customerGroup);

  @CdsName(CUSTOMER_PAYMENT_TERMS)
  String getCustomerPaymentTerms();

  @CdsName(CUSTOMER_PAYMENT_TERMS)
  void setCustomerPaymentTerms(String customerPaymentTerms);

  @CdsName(CUSTOMER_PRICE_GROUP)
  String getCustomerPriceGroup();

  @CdsName(CUSTOMER_PRICE_GROUP)
  void setCustomerPriceGroup(String customerPriceGroup);

  @CdsName(CUSTOMER_PRICING_PROCEDURE)
  String getCustomerPricingProcedure();

  @CdsName(CUSTOMER_PRICING_PROCEDURE)
  void setCustomerPricingProcedure(String customerPricingProcedure);

  @CdsName(DELIVERY_IS_BLOCKED_FOR_CUSTOMER)
  String getDeliveryIsBlockedForCustomer();

  @CdsName(DELIVERY_IS_BLOCKED_FOR_CUSTOMER)
  void setDeliveryIsBlockedForCustomer(String deliveryIsBlockedForCustomer);

  @CdsName(DELIVERY_PRIORITY)
  String getDeliveryPriority();

  @CdsName(DELIVERY_PRIORITY)
  void setDeliveryPriority(String deliveryPriority);

  @CdsName(INCOTERMS_CLASSIFICATION)
  String getIncotermsClassification();

  @CdsName(INCOTERMS_CLASSIFICATION)
  void setIncotermsClassification(String incotermsClassification);

  @CdsName(INCOTERMS_LOCATION2)
  String getIncotermsLocation2();

  @CdsName(INCOTERMS_LOCATION2)
  void setIncotermsLocation2(String incotermsLocation2);

  @CdsName(INCOTERMS_VERSION)
  String getIncotermsVersion();

  @CdsName(INCOTERMS_VERSION)
  void setIncotermsVersion(String incotermsVersion);

  @CdsName(INCOTERMS_LOCATION1)
  String getIncotermsLocation1();

  @CdsName(INCOTERMS_LOCATION1)
  void setIncotermsLocation1(String incotermsLocation1);

  @CdsName(DELETION_INDICATOR)
  Boolean getDeletionIndicator();

  @CdsName(DELETION_INDICATOR)
  void setDeletionIndicator(Boolean deletionIndicator);

  @CdsName(INCOTERMS_TRANSFER_LOCATION)
  String getIncotermsTransferLocation();

  @CdsName(INCOTERMS_TRANSFER_LOCATION)
  void setIncotermsTransferLocation(String incotermsTransferLocation);

  @CdsName(INVOICE_DATE)
  String getInvoiceDate();

  @CdsName(INVOICE_DATE)
  void setInvoiceDate(String invoiceDate);

  @CdsName(ITEM_ORDER_PROBABILITY_IN_PERCENT)
  String getItemOrderProbabilityInPercent();

  @CdsName(ITEM_ORDER_PROBABILITY_IN_PERCENT)
  void setItemOrderProbabilityInPercent(String itemOrderProbabilityInPercent);

  @CdsName(ORDER_COMBINATION_IS_ALLOWED)
  Boolean getOrderCombinationIsAllowed();

  @CdsName(ORDER_COMBINATION_IS_ALLOWED)
  void setOrderCombinationIsAllowed(Boolean orderCombinationIsAllowed);

  @CdsName(ORDER_IS_BLOCKED_FOR_CUSTOMER)
  String getOrderIsBlockedForCustomer();

  @CdsName(ORDER_IS_BLOCKED_FOR_CUSTOMER)
  void setOrderIsBlockedForCustomer(String orderIsBlockedForCustomer);

  @CdsName(PARTIAL_DELIVERY_IS_ALLOWED)
  String getPartialDeliveryIsAllowed();

  @CdsName(PARTIAL_DELIVERY_IS_ALLOWED)
  void setPartialDeliveryIsAllowed(String partialDeliveryIsAllowed);

  @CdsName(PRICE_LIST_TYPE)
  String getPriceListType();

  @CdsName(PRICE_LIST_TYPE)
  void setPriceListType(String priceListType);

  @CdsName(SALES_GROUP)
  String getSalesGroup();

  @CdsName(SALES_GROUP)
  void setSalesGroup(String salesGroup);

  @CdsName(SALES_OFFICE)
  String getSalesOffice();

  @CdsName(SALES_OFFICE)
  void setSalesOffice(String salesOffice);

  @CdsName(SHIPPING_CONDITION)
  String getShippingCondition();

  @CdsName(SHIPPING_CONDITION)
  void setShippingCondition(String shippingCondition);

  @CdsName(SUPPLYING_PLANT)
  String getSupplyingPlant();

  @CdsName(SUPPLYING_PLANT)
  void setSupplyingPlant(String supplyingPlant);

  @CdsName(SALES_DISTRICT)
  String getSalesDistrict();

  @CdsName(SALES_DISTRICT)
  void setSalesDistrict(String salesDistrict);

  @CdsName(INVOICE_LIST_SCHEDULE)
  String getInvoiceListSchedule();

  @CdsName(INVOICE_LIST_SCHEDULE)
  void setInvoiceListSchedule(String invoiceListSchedule);

  @CdsName(EXCHANGE_RATE_TYPE)
  String getExchangeRateType();

  @CdsName(EXCHANGE_RATE_TYPE)
  void setExchangeRateType(String exchangeRateType);

  @CdsName(ADDITIONAL_CUSTOMER_GROUP1)
  String getAdditionalCustomerGroup1();

  @CdsName(ADDITIONAL_CUSTOMER_GROUP1)
  void setAdditionalCustomerGroup1(String additionalCustomerGroup1);

  @CdsName(ADDITIONAL_CUSTOMER_GROUP2)
  String getAdditionalCustomerGroup2();

  @CdsName(ADDITIONAL_CUSTOMER_GROUP2)
  void setAdditionalCustomerGroup2(String additionalCustomerGroup2);

  @CdsName(ADDITIONAL_CUSTOMER_GROUP3)
  String getAdditionalCustomerGroup3();

  @CdsName(ADDITIONAL_CUSTOMER_GROUP3)
  void setAdditionalCustomerGroup3(String additionalCustomerGroup3);

  @CdsName(ADDITIONAL_CUSTOMER_GROUP4)
  String getAdditionalCustomerGroup4();

  @CdsName(ADDITIONAL_CUSTOMER_GROUP4)
  void setAdditionalCustomerGroup4(String additionalCustomerGroup4);

  @CdsName(ADDITIONAL_CUSTOMER_GROUP5)
  String getAdditionalCustomerGroup5();

  @CdsName(ADDITIONAL_CUSTOMER_GROUP5)
  void setAdditionalCustomerGroup5(String additionalCustomerGroup5);

  @CdsName(PAYMENT_GUARANTEE_PROCEDURE)
  String getPaymentGuaranteeProcedure();

  @CdsName(PAYMENT_GUARANTEE_PROCEDURE)
  void setPaymentGuaranteeProcedure(String paymentGuaranteeProcedure);

  @CdsName(CUSTOMER_ACCOUNT_GROUP)
  String getCustomerAccountGroup();

  @CdsName(CUSTOMER_ACCOUNT_GROUP)
  void setCustomerAccountGroup(String customerAccountGroup);

  @CdsName(TO_PARTNER_FUNCTION)
  List<ACustSalesPartnerFunc> getToPartnerFunction();

  @CdsName(TO_PARTNER_FUNCTION)
  void setToPartnerFunction(List<? extends Map<String, ?>> toPartnerFunction);

  @CdsName(TO_PARTNER_FUNCTION_CUSTOMER)
  String getToPartnerFunctionCustomer();

  @CdsName(TO_PARTNER_FUNCTION_CUSTOMER)
  void setToPartnerFunctionCustomer(String toPartnerFunctionCustomer);

  @CdsName(TO_PARTNER_FUNCTION_SALES_ORGANIZATION)
  String getToPartnerFunctionSalesOrganization();

  @CdsName(TO_PARTNER_FUNCTION_SALES_ORGANIZATION)
  void setToPartnerFunctionSalesOrganization(String toPartnerFunctionSalesOrganization);

  @CdsName(TO_PARTNER_FUNCTION_DISTRIBUTION_CHANNEL)
  String getToPartnerFunctionDistributionChannel();

  @CdsName(TO_PARTNER_FUNCTION_DISTRIBUTION_CHANNEL)
  void setToPartnerFunctionDistributionChannel(String toPartnerFunctionDistributionChannel);

  @CdsName(TO_PARTNER_FUNCTION_DIVISION)
  String getToPartnerFunctionDivision();

  @CdsName(TO_PARTNER_FUNCTION_DIVISION)
  void setToPartnerFunctionDivision(String toPartnerFunctionDivision);

  @CdsName(TO_PARTNER_FUNCTION_PARTNER_COUNTER)
  String getToPartnerFunctionPartnerCounter();

  @CdsName(TO_PARTNER_FUNCTION_PARTNER_COUNTER)
  void setToPartnerFunctionPartnerCounter(String toPartnerFunctionPartnerCounter);

  @CdsName(TO_PARTNER_FUNCTION_PARTNER_FUNCTION)
  String getToPartnerFunctionPartnerFunction();

  @CdsName(TO_PARTNER_FUNCTION_PARTNER_FUNCTION)
  void setToPartnerFunctionPartnerFunction(String toPartnerFunctionPartnerFunction);

  @CdsName(TO_SALES_AREA_TAX)
  List<ACustomerSalesAreaTax> getToSalesAreaTax();

  @CdsName(TO_SALES_AREA_TAX)
  void setToSalesAreaTax(List<? extends Map<String, ?>> toSalesAreaTax);

  @CdsName(TO_SALES_AREA_TAX_CUSTOMER)
  String getToSalesAreaTaxCustomer();

  @CdsName(TO_SALES_AREA_TAX_CUSTOMER)
  void setToSalesAreaTaxCustomer(String toSalesAreaTaxCustomer);

  @CdsName(TO_SALES_AREA_TAX_SALES_ORGANIZATION)
  String getToSalesAreaTaxSalesOrganization();

  @CdsName(TO_SALES_AREA_TAX_SALES_ORGANIZATION)
  void setToSalesAreaTaxSalesOrganization(String toSalesAreaTaxSalesOrganization);

  @CdsName(TO_SALES_AREA_TAX_DISTRIBUTION_CHANNEL)
  String getToSalesAreaTaxDistributionChannel();

  @CdsName(TO_SALES_AREA_TAX_DISTRIBUTION_CHANNEL)
  void setToSalesAreaTaxDistributionChannel(String toSalesAreaTaxDistributionChannel);

  @CdsName(TO_SALES_AREA_TAX_DIVISION)
  String getToSalesAreaTaxDivision();

  @CdsName(TO_SALES_AREA_TAX_DIVISION)
  void setToSalesAreaTaxDivision(String toSalesAreaTaxDivision);

  @CdsName(TO_SALES_AREA_TAX_DEPARTURE_COUNTRY)
  String getToSalesAreaTaxDepartureCountry();

  @CdsName(TO_SALES_AREA_TAX_DEPARTURE_COUNTRY)
  void setToSalesAreaTaxDepartureCountry(String toSalesAreaTaxDepartureCountry);

  @CdsName(TO_SALES_AREA_TAX_CUSTOMER_TAX_CATEGORY)
  String getToSalesAreaTaxCustomerTaxCategory();

  @CdsName(TO_SALES_AREA_TAX_CUSTOMER_TAX_CATEGORY)
  void setToSalesAreaTaxCustomerTaxCategory(String toSalesAreaTaxCustomerTaxCategory);

  ACustomerSalesArea_ ref();

  static ACustomerSalesArea create() {
    return Struct.create(ACustomerSalesArea.class);
  }
}
