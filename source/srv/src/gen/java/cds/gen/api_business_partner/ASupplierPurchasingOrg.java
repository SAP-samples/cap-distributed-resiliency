package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@CdsName("API_BUSINESS_PARTNER.A_SupplierPurchasingOrg")
public interface ASupplierPurchasingOrg extends CdsData {
  String SUPPLIER = "Supplier";

  String PURCHASING_ORGANIZATION = "PurchasingOrganization";

  String CALCULATION_SCHEMA_GROUP_CODE = "CalculationSchemaGroupCode";

  String DELETION_INDICATOR = "DeletionIndicator";

  String INCOTERMS_CLASSIFICATION = "IncotermsClassification";

  String INCOTERMS_TRANSFER_LOCATION = "IncotermsTransferLocation";

  String INCOTERMS_VERSION = "IncotermsVersion";

  String INCOTERMS_LOCATION1 = "IncotermsLocation1";

  String INCOTERMS_LOCATION2 = "IncotermsLocation2";

  String INVOICE_IS_GOODS_RECEIPT_BASED = "InvoiceIsGoodsReceiptBased";

  String MATERIAL_PLANNED_DELIVERY_DURN = "MaterialPlannedDeliveryDurn";

  String MINIMUM_ORDER_AMOUNT = "MinimumOrderAmount";

  String PAYMENT_TERMS = "PaymentTerms";

  String PRICING_DATE_CONTROL = "PricingDateControl";

  String PUR_ORD_AUTO_GENERATION_IS_ALLOWED = "PurOrdAutoGenerationIsAllowed";

  String PURCHASE_ORDER_CURRENCY = "PurchaseOrderCurrency";

  String PURCHASING_GROUP = "PurchasingGroup";

  String PURCHASING_IS_BLOCKED_FOR_SUPPLIER = "PurchasingIsBlockedForSupplier";

  String SHIPPING_CONDITION = "ShippingCondition";

  String SUPPLIER_ABCCLASSIFICATION_CODE = "SupplierABCClassificationCode";

  String SUPPLIER_PHONE_NUMBER = "SupplierPhoneNumber";

  String SUPPLIER_RESP_SALES_PERSON_NAME = "SupplierRespSalesPersonName";

  String AUTHORIZATION_GROUP = "AuthorizationGroup";

  String SUPPLIER_ACCOUNT_GROUP = "SupplierAccountGroup";

  String TO_PARTNER_FUNCTION = "to_PartnerFunction";

  String TO_PARTNER_FUNCTION_SUPPLIER = "to_PartnerFunction_Supplier";

  String TO_PARTNER_FUNCTION_PURCHASING_ORGANIZATION = "to_PartnerFunction_PurchasingOrganization";

  String TO_PARTNER_FUNCTION_SUPPLIER_SUBRANGE = "to_PartnerFunction_SupplierSubrange";

  String TO_PARTNER_FUNCTION_PLANT = "to_PartnerFunction_Plant";

  String TO_PARTNER_FUNCTION_PARTNER_FUNCTION = "to_PartnerFunction_PartnerFunction";

  String TO_PARTNER_FUNCTION_PARTNER_COUNTER = "to_PartnerFunction_PartnerCounter";

  @CdsName(SUPPLIER)
  String getSupplier();

  @CdsName(SUPPLIER)
  void setSupplier(String supplier);

  @CdsName(PURCHASING_ORGANIZATION)
  String getPurchasingOrganization();

  @CdsName(PURCHASING_ORGANIZATION)
  void setPurchasingOrganization(String purchasingOrganization);

  @CdsName(CALCULATION_SCHEMA_GROUP_CODE)
  String getCalculationSchemaGroupCode();

  @CdsName(CALCULATION_SCHEMA_GROUP_CODE)
  void setCalculationSchemaGroupCode(String calculationSchemaGroupCode);

  @CdsName(DELETION_INDICATOR)
  Boolean getDeletionIndicator();

  @CdsName(DELETION_INDICATOR)
  void setDeletionIndicator(Boolean deletionIndicator);

  @CdsName(INCOTERMS_CLASSIFICATION)
  String getIncotermsClassification();

  @CdsName(INCOTERMS_CLASSIFICATION)
  void setIncotermsClassification(String incotermsClassification);

  @CdsName(INCOTERMS_TRANSFER_LOCATION)
  String getIncotermsTransferLocation();

  @CdsName(INCOTERMS_TRANSFER_LOCATION)
  void setIncotermsTransferLocation(String incotermsTransferLocation);

  @CdsName(INCOTERMS_VERSION)
  String getIncotermsVersion();

  @CdsName(INCOTERMS_VERSION)
  void setIncotermsVersion(String incotermsVersion);

  @CdsName(INCOTERMS_LOCATION1)
  String getIncotermsLocation1();

  @CdsName(INCOTERMS_LOCATION1)
  void setIncotermsLocation1(String incotermsLocation1);

  @CdsName(INCOTERMS_LOCATION2)
  String getIncotermsLocation2();

  @CdsName(INCOTERMS_LOCATION2)
  void setIncotermsLocation2(String incotermsLocation2);

  @CdsName(INVOICE_IS_GOODS_RECEIPT_BASED)
  Boolean getInvoiceIsGoodsReceiptBased();

  @CdsName(INVOICE_IS_GOODS_RECEIPT_BASED)
  void setInvoiceIsGoodsReceiptBased(Boolean invoiceIsGoodsReceiptBased);

  @CdsName(MATERIAL_PLANNED_DELIVERY_DURN)
  BigDecimal getMaterialPlannedDeliveryDurn();

  @CdsName(MATERIAL_PLANNED_DELIVERY_DURN)
  void setMaterialPlannedDeliveryDurn(BigDecimal materialPlannedDeliveryDurn);

  @CdsName(MINIMUM_ORDER_AMOUNT)
  BigDecimal getMinimumOrderAmount();

  @CdsName(MINIMUM_ORDER_AMOUNT)
  void setMinimumOrderAmount(BigDecimal minimumOrderAmount);

  @CdsName(PAYMENT_TERMS)
  String getPaymentTerms();

  @CdsName(PAYMENT_TERMS)
  void setPaymentTerms(String paymentTerms);

  @CdsName(PRICING_DATE_CONTROL)
  String getPricingDateControl();

  @CdsName(PRICING_DATE_CONTROL)
  void setPricingDateControl(String pricingDateControl);

  @CdsName(PUR_ORD_AUTO_GENERATION_IS_ALLOWED)
  Boolean getPurOrdAutoGenerationIsAllowed();

  @CdsName(PUR_ORD_AUTO_GENERATION_IS_ALLOWED)
  void setPurOrdAutoGenerationIsAllowed(Boolean purOrdAutoGenerationIsAllowed);

  @CdsName(PURCHASE_ORDER_CURRENCY)
  String getPurchaseOrderCurrency();

  @CdsName(PURCHASE_ORDER_CURRENCY)
  void setPurchaseOrderCurrency(String purchaseOrderCurrency);

  @CdsName(PURCHASING_GROUP)
  String getPurchasingGroup();

  @CdsName(PURCHASING_GROUP)
  void setPurchasingGroup(String purchasingGroup);

  @CdsName(PURCHASING_IS_BLOCKED_FOR_SUPPLIER)
  Boolean getPurchasingIsBlockedForSupplier();

  @CdsName(PURCHASING_IS_BLOCKED_FOR_SUPPLIER)
  void setPurchasingIsBlockedForSupplier(Boolean purchasingIsBlockedForSupplier);

  @CdsName(SHIPPING_CONDITION)
  String getShippingCondition();

  @CdsName(SHIPPING_CONDITION)
  void setShippingCondition(String shippingCondition);

  @CdsName(SUPPLIER_ABCCLASSIFICATION_CODE)
  String getSupplierABCClassificationCode();

  @CdsName(SUPPLIER_ABCCLASSIFICATION_CODE)
  void setSupplierABCClassificationCode(String supplierABCClassificationCode);

  @CdsName(SUPPLIER_PHONE_NUMBER)
  String getSupplierPhoneNumber();

  @CdsName(SUPPLIER_PHONE_NUMBER)
  void setSupplierPhoneNumber(String supplierPhoneNumber);

  @CdsName(SUPPLIER_RESP_SALES_PERSON_NAME)
  String getSupplierRespSalesPersonName();

  @CdsName(SUPPLIER_RESP_SALES_PERSON_NAME)
  void setSupplierRespSalesPersonName(String supplierRespSalesPersonName);

  @CdsName(AUTHORIZATION_GROUP)
  String getAuthorizationGroup();

  @CdsName(AUTHORIZATION_GROUP)
  void setAuthorizationGroup(String authorizationGroup);

  @CdsName(SUPPLIER_ACCOUNT_GROUP)
  String getSupplierAccountGroup();

  @CdsName(SUPPLIER_ACCOUNT_GROUP)
  void setSupplierAccountGroup(String supplierAccountGroup);

  @CdsName(TO_PARTNER_FUNCTION)
  List<ASupplierPartnerFunc> getToPartnerFunction();

  @CdsName(TO_PARTNER_FUNCTION)
  void setToPartnerFunction(List<? extends Map<String, ?>> toPartnerFunction);

  @CdsName(TO_PARTNER_FUNCTION_SUPPLIER)
  String getToPartnerFunctionSupplier();

  @CdsName(TO_PARTNER_FUNCTION_SUPPLIER)
  void setToPartnerFunctionSupplier(String toPartnerFunctionSupplier);

  @CdsName(TO_PARTNER_FUNCTION_PURCHASING_ORGANIZATION)
  String getToPartnerFunctionPurchasingOrganization();

  @CdsName(TO_PARTNER_FUNCTION_PURCHASING_ORGANIZATION)
  void setToPartnerFunctionPurchasingOrganization(String toPartnerFunctionPurchasingOrganization);

  @CdsName(TO_PARTNER_FUNCTION_SUPPLIER_SUBRANGE)
  String getToPartnerFunctionSupplierSubrange();

  @CdsName(TO_PARTNER_FUNCTION_SUPPLIER_SUBRANGE)
  void setToPartnerFunctionSupplierSubrange(String toPartnerFunctionSupplierSubrange);

  @CdsName(TO_PARTNER_FUNCTION_PLANT)
  String getToPartnerFunctionPlant();

  @CdsName(TO_PARTNER_FUNCTION_PLANT)
  void setToPartnerFunctionPlant(String toPartnerFunctionPlant);

  @CdsName(TO_PARTNER_FUNCTION_PARTNER_FUNCTION)
  String getToPartnerFunctionPartnerFunction();

  @CdsName(TO_PARTNER_FUNCTION_PARTNER_FUNCTION)
  void setToPartnerFunctionPartnerFunction(String toPartnerFunctionPartnerFunction);

  @CdsName(TO_PARTNER_FUNCTION_PARTNER_COUNTER)
  String getToPartnerFunctionPartnerCounter();

  @CdsName(TO_PARTNER_FUNCTION_PARTNER_COUNTER)
  void setToPartnerFunctionPartnerCounter(String toPartnerFunctionPartnerCounter);

  ASupplierPurchasingOrg_ ref();

  static ASupplierPurchasingOrg create() {
    return Struct.create(ASupplierPurchasingOrg.class);
  }
}
