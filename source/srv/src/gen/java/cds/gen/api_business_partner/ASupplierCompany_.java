package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.Function;

@CdsName("API_BUSINESS_PARTNER.A_SupplierCompany")
public interface ASupplierCompany_ extends StructuredType<ASupplierCompany_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_SupplierCompany";

  ElementRef<String> Supplier();

  ElementRef<String> CompanyCode();

  ElementRef<String> AuthorizationGroup();

  ElementRef<String> CompanyCodeName();

  ElementRef<String> PaymentBlockingReason();

  ElementRef<Boolean> SupplierIsBlockedForPosting();

  ElementRef<String> AccountingClerk();

  ElementRef<String> AccountingClerkFaxNumber();

  ElementRef<String> AccountingClerkPhoneNumber();

  ElementRef<String> SupplierClerk();

  ElementRef<String> SupplierClerkURL();

  ElementRef<String> PaymentMethodsList();

  ElementRef<String> PaymentTerms();

  ElementRef<Boolean> ClearCustomerSupplier();

  ElementRef<Boolean> IsToBeLocallyProcessed();

  ElementRef<Boolean> ItemIsToBePaidSeparately();

  ElementRef<Boolean> PaymentIsToBeSentByEDI();

  ElementRef<String> HouseBank();

  ElementRef<BigDecimal> CheckPaidDurationInDays();

  ElementRef<String> Currency();

  ElementRef<BigDecimal> BillOfExchLmtAmtInCoCodeCrcy();

  ElementRef<String> SupplierClerkIDBySupplier();

  ElementRef<String> ReconciliationAccount();

  ElementRef<String> InterestCalculationCode();

  ElementRef<LocalDate> InterestCalculationDate();

  ElementRef<String> SupplierHeadOffice();

  ElementRef<String> AlternativePayee();

  ElementRef<String> LayoutSortingRule();

  ElementRef<String> APARToleranceGroup();

  ElementRef<LocalDate> SupplierCertificationDate();

  ElementRef<String> SupplierAccountNote();

  ElementRef<String> WithholdingTaxCountry();

  ElementRef<Boolean> DeletionIndicator();

  ElementRef<String> CashPlanningGroup();

  ElementRef<Boolean> IsToBeCheckedForDuplicates();

  ElementRef<String> MinorityGroup();

  ElementRef<String> SupplierAccountGroup();

  ASupplierDunning_ to_SupplierDunning();

  ASupplierDunning_ to_SupplierDunning(Function<ASupplierDunning_, CqnPredicate> filter);

  ElementRef<String> to_SupplierDunning_Supplier();

  ElementRef<String> to_SupplierDunning_CompanyCode();

  ElementRef<String> to_SupplierDunning_DunningArea();

  ASupplierWithHoldingTax_ to_SupplierWithHoldingTax();

  ASupplierWithHoldingTax_ to_SupplierWithHoldingTax(
      Function<ASupplierWithHoldingTax_, CqnPredicate> filter);

  ElementRef<String> to_SupplierWithHoldingTax_Supplier();

  ElementRef<String> to_SupplierWithHoldingTax_CompanyCode();

  ElementRef<String> to_SupplierWithHoldingTax_WithholdingTaxType();
}
