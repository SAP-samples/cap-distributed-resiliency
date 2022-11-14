package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import java.time.LocalDate;

@CdsName("API_BUSINESS_PARTNER.A_SupplierWithHoldingTax")
public interface ASupplierWithHoldingTax extends CdsData {
  String SUPPLIER = "Supplier";

  String COMPANY_CODE = "CompanyCode";

  String WITHHOLDING_TAX_TYPE = "WithholdingTaxType";

  String EXEMPTION_DATE_BEGIN = "ExemptionDateBegin";

  String EXEMPTION_DATE_END = "ExemptionDateEnd";

  String EXEMPTION_REASON = "ExemptionReason";

  String IS_WITHHOLDING_TAX_SUBJECT = "IsWithholdingTaxSubject";

  String RECIPIENT_TYPE = "RecipientType";

  String WITHHOLDING_TAX_CERTIFICATE = "WithholdingTaxCertificate";

  String WITHHOLDING_TAX_CODE = "WithholdingTaxCode";

  String WITHHOLDING_TAX_EXMPT_PERCENT = "WithholdingTaxExmptPercent";

  String WITHHOLDING_TAX_NUMBER = "WithholdingTaxNumber";

  String AUTHORIZATION_GROUP = "AuthorizationGroup";

  @CdsName(SUPPLIER)
  String getSupplier();

  @CdsName(SUPPLIER)
  void setSupplier(String supplier);

  @CdsName(COMPANY_CODE)
  String getCompanyCode();

  @CdsName(COMPANY_CODE)
  void setCompanyCode(String companyCode);

  @CdsName(WITHHOLDING_TAX_TYPE)
  String getWithholdingTaxType();

  @CdsName(WITHHOLDING_TAX_TYPE)
  void setWithholdingTaxType(String withholdingTaxType);

  @CdsName(EXEMPTION_DATE_BEGIN)
  LocalDate getExemptionDateBegin();

  @CdsName(EXEMPTION_DATE_BEGIN)
  void setExemptionDateBegin(LocalDate exemptionDateBegin);

  @CdsName(EXEMPTION_DATE_END)
  LocalDate getExemptionDateEnd();

  @CdsName(EXEMPTION_DATE_END)
  void setExemptionDateEnd(LocalDate exemptionDateEnd);

  @CdsName(EXEMPTION_REASON)
  String getExemptionReason();

  @CdsName(EXEMPTION_REASON)
  void setExemptionReason(String exemptionReason);

  @CdsName(IS_WITHHOLDING_TAX_SUBJECT)
  Boolean getIsWithholdingTaxSubject();

  @CdsName(IS_WITHHOLDING_TAX_SUBJECT)
  void setIsWithholdingTaxSubject(Boolean isWithholdingTaxSubject);

  @CdsName(RECIPIENT_TYPE)
  String getRecipientType();

  @CdsName(RECIPIENT_TYPE)
  void setRecipientType(String recipientType);

  @CdsName(WITHHOLDING_TAX_CERTIFICATE)
  String getWithholdingTaxCertificate();

  @CdsName(WITHHOLDING_TAX_CERTIFICATE)
  void setWithholdingTaxCertificate(String withholdingTaxCertificate);

  @CdsName(WITHHOLDING_TAX_CODE)
  String getWithholdingTaxCode();

  @CdsName(WITHHOLDING_TAX_CODE)
  void setWithholdingTaxCode(String withholdingTaxCode);

  @CdsName(WITHHOLDING_TAX_EXMPT_PERCENT)
  BigDecimal getWithholdingTaxExmptPercent();

  @CdsName(WITHHOLDING_TAX_EXMPT_PERCENT)
  void setWithholdingTaxExmptPercent(BigDecimal withholdingTaxExmptPercent);

  @CdsName(WITHHOLDING_TAX_NUMBER)
  String getWithholdingTaxNumber();

  @CdsName(WITHHOLDING_TAX_NUMBER)
  void setWithholdingTaxNumber(String withholdingTaxNumber);

  @CdsName(AUTHORIZATION_GROUP)
  String getAuthorizationGroup();

  @CdsName(AUTHORIZATION_GROUP)
  void setAuthorizationGroup(String authorizationGroup);

  ASupplierWithHoldingTax_ ref();

  static ASupplierWithHoldingTax create() {
    return Struct.create(ASupplierWithHoldingTax.class);
  }
}
