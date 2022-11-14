package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import java.time.LocalDate;

@CdsName("API_BUSINESS_PARTNER.A_CustomerWithHoldingTax")
public interface ACustomerWithHoldingTax_ extends StructuredType<ACustomerWithHoldingTax_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_CustomerWithHoldingTax";

  ElementRef<String> Customer();

  ElementRef<String> CompanyCode();

  ElementRef<String> WithholdingTaxType();

  ElementRef<String> WithholdingTaxCode();

  ElementRef<Boolean> WithholdingTaxAgent();

  ElementRef<LocalDate> ObligationDateBegin();

  ElementRef<LocalDate> ObligationDateEnd();

  ElementRef<String> WithholdingTaxNumber();

  ElementRef<String> WithholdingTaxCertificate();

  ElementRef<BigDecimal> WithholdingTaxExmptPercent();

  ElementRef<LocalDate> ExemptionDateBegin();

  ElementRef<LocalDate> ExemptionDateEnd();

  ElementRef<String> ExemptionReason();

  ElementRef<String> AuthorizationGroup();
}
