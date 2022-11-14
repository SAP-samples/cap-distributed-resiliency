package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Boolean;
import java.lang.String;
import java.time.LocalDate;
import java.util.function.Function;

@CdsName("API_BUSINESS_PARTNER.A_CustomerCompany")
public interface ACustomerCompany_ extends StructuredType<ACustomerCompany_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_CustomerCompany";

  ElementRef<String> Customer();

  ElementRef<String> CompanyCode();

  ElementRef<String> APARToleranceGroup();

  ElementRef<String> AccountByCustomer();

  ElementRef<String> AccountingClerk();

  ElementRef<String> AccountingClerkFaxNumber();

  ElementRef<String> AccountingClerkInternetAddress();

  ElementRef<String> AccountingClerkPhoneNumber();

  ElementRef<String> AlternativePayerAccount();

  ElementRef<String> AuthorizationGroup();

  ElementRef<String> CollectiveInvoiceVariant();

  ElementRef<String> CustomerAccountNote();

  ElementRef<String> CustomerHeadOffice();

  ElementRef<Boolean> CustomerSupplierClearingIsUsed();

  ElementRef<String> HouseBank();

  ElementRef<String> InterestCalculationCode();

  ElementRef<LocalDate> InterestCalculationDate();

  ElementRef<Boolean> IsToBeLocallyProcessed();

  ElementRef<Boolean> ItemIsToBePaidSeparately();

  ElementRef<String> LayoutSortingRule();

  ElementRef<String> PaymentBlockingReason();

  ElementRef<String> PaymentMethodsList();

  ElementRef<String> PaymentTerms();

  ElementRef<Boolean> PaytAdviceIsSentbyEDI();

  ElementRef<Boolean> PhysicalInventoryBlockInd();

  ElementRef<String> ReconciliationAccount();

  ElementRef<Boolean> RecordPaymentHistoryIndicator();

  ElementRef<String> UserAtCustomer();

  ElementRef<Boolean> DeletionIndicator();

  ElementRef<String> CashPlanningGroup();

  ElementRef<String> KnownOrNegotiatedLeave();

  ElementRef<String> ValueAdjustmentKey();

  ElementRef<String> CustomerAccountGroup();

  ACustomerDunning_ to_CustomerDunning();

  ACustomerDunning_ to_CustomerDunning(Function<ACustomerDunning_, CqnPredicate> filter);

  ElementRef<String> to_CustomerDunning_Customer();

  ElementRef<String> to_CustomerDunning_CompanyCode();

  ElementRef<String> to_CustomerDunning_DunningArea();

  ACustomerWithHoldingTax_ to_WithHoldingTax();

  ACustomerWithHoldingTax_ to_WithHoldingTax(
      Function<ACustomerWithHoldingTax_, CqnPredicate> filter);

  ElementRef<String> to_WithHoldingTax_Customer();

  ElementRef<String> to_WithHoldingTax_CompanyCode();

  ElementRef<String> to_WithHoldingTax_WithholdingTaxType();
}
