package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Boolean;
import java.lang.String;
import java.time.LocalDate;
import java.util.function.Function;

@CdsName("API_BUSINESS_PARTNER.A_Supplier")
public interface ASupplier_ extends StructuredType<ASupplier_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_Supplier";

  ElementRef<String> Supplier();

  ElementRef<String> AlternativePayeeAccountNumber();

  ElementRef<String> AuthorizationGroup();

  ElementRef<String> CreatedByUser();

  ElementRef<LocalDate> CreationDate();

  ElementRef<String> Customer();

  ElementRef<Boolean> PaymentIsBlockedForSupplier();

  ElementRef<Boolean> PostingIsBlocked();

  ElementRef<Boolean> PurchasingIsBlocked();

  ElementRef<String> SupplierAccountGroup();

  ElementRef<String> SupplierFullName();

  ElementRef<String> SupplierName();

  ElementRef<String> VATRegistration();

  ElementRef<LocalDate> BirthDate();

  ElementRef<String> ConcatenatedInternationalLocNo();

  ElementRef<Boolean> DeletionIndicator();

  ElementRef<String> FiscalAddress();

  ElementRef<String> Industry();

  ElementRef<String> InternationalLocationNumber1();

  ElementRef<String> InternationalLocationNumber2();

  ElementRef<String> InternationalLocationNumber3();

  ElementRef<String> IsNaturalPerson();

  ElementRef<String> ResponsibleType();

  ElementRef<LocalDate> SuplrQltyInProcmtCertfnValidTo();

  ElementRef<String> SuplrQualityManagementSystem();

  ElementRef<String> SupplierCorporateGroup();

  ElementRef<String> SupplierProcurementBlock();

  ElementRef<String> TaxNumber1();

  ElementRef<String> TaxNumber2();

  ElementRef<String> TaxNumber3();

  ElementRef<String> TaxNumber4();

  ElementRef<String> TaxNumber5();

  ElementRef<String> TaxNumberResponsible();

  ElementRef<String> TaxNumberType();

  ElementRef<String> SuplrProofOfDelivRlvtCode();

  ElementRef<Boolean> BR_TaxIsSplit();

  ASupplierCompany_ to_SupplierCompany();

  ASupplierCompany_ to_SupplierCompany(Function<ASupplierCompany_, CqnPredicate> filter);

  ElementRef<String> to_SupplierCompany_Supplier();

  ElementRef<String> to_SupplierCompany_CompanyCode();

  ASupplierPurchasingOrg_ to_SupplierPurchasingOrg();

  ASupplierPurchasingOrg_ to_SupplierPurchasingOrg(
      Function<ASupplierPurchasingOrg_, CqnPredicate> filter);

  ElementRef<String> to_SupplierPurchasingOrg_Supplier();

  ElementRef<String> to_SupplierPurchasingOrg_PurchasingOrganization();
}
