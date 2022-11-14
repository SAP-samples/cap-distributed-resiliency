package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import java.util.function.Function;

@CdsName("API_BUSINESS_PARTNER.A_SupplierPurchasingOrg")
public interface ASupplierPurchasingOrg_ extends StructuredType<ASupplierPurchasingOrg_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_SupplierPurchasingOrg";

  ElementRef<String> Supplier();

  ElementRef<String> PurchasingOrganization();

  ElementRef<String> CalculationSchemaGroupCode();

  ElementRef<Boolean> DeletionIndicator();

  ElementRef<String> IncotermsClassification();

  ElementRef<String> IncotermsTransferLocation();

  ElementRef<String> IncotermsVersion();

  ElementRef<String> IncotermsLocation1();

  ElementRef<String> IncotermsLocation2();

  ElementRef<Boolean> InvoiceIsGoodsReceiptBased();

  ElementRef<BigDecimal> MaterialPlannedDeliveryDurn();

  ElementRef<BigDecimal> MinimumOrderAmount();

  ElementRef<String> PaymentTerms();

  ElementRef<String> PricingDateControl();

  ElementRef<Boolean> PurOrdAutoGenerationIsAllowed();

  ElementRef<String> PurchaseOrderCurrency();

  ElementRef<String> PurchasingGroup();

  ElementRef<Boolean> PurchasingIsBlockedForSupplier();

  ElementRef<String> ShippingCondition();

  ElementRef<String> SupplierABCClassificationCode();

  ElementRef<String> SupplierPhoneNumber();

  ElementRef<String> SupplierRespSalesPersonName();

  ElementRef<String> AuthorizationGroup();

  ElementRef<String> SupplierAccountGroup();

  ASupplierPartnerFunc_ to_PartnerFunction();

  ASupplierPartnerFunc_ to_PartnerFunction(Function<ASupplierPartnerFunc_, CqnPredicate> filter);

  ElementRef<String> to_PartnerFunction_Supplier();

  ElementRef<String> to_PartnerFunction_PurchasingOrganization();

  ElementRef<String> to_PartnerFunction_SupplierSubrange();

  ElementRef<String> to_PartnerFunction_Plant();

  ElementRef<String> to_PartnerFunction_PartnerFunction();

  ElementRef<String> to_PartnerFunction_PartnerCounter();
}
