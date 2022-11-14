package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import java.time.LocalDate;

@CdsName("API_BUSINESS_PARTNER.A_SupplierWithHoldingTax")
public interface ASupplierWithHoldingTax_ extends StructuredType<ASupplierWithHoldingTax_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_SupplierWithHoldingTax";

  ElementRef<String> Supplier();

  ElementRef<String> CompanyCode();

  ElementRef<String> WithholdingTaxType();

  ElementRef<LocalDate> ExemptionDateBegin();

  ElementRef<LocalDate> ExemptionDateEnd();

  ElementRef<String> ExemptionReason();

  ElementRef<Boolean> IsWithholdingTaxSubject();

  ElementRef<String> RecipientType();

  ElementRef<String> WithholdingTaxCertificate();

  ElementRef<String> WithholdingTaxCode();

  ElementRef<BigDecimal> WithholdingTaxExmptPercent();

  ElementRef<String> WithholdingTaxNumber();

  ElementRef<String> AuthorizationGroup();
}
