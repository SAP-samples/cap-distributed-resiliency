package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.String;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@CdsName("API_BUSINESS_PARTNER.A_Supplier")
public interface ASupplier extends CdsData {
  String SUPPLIER = "Supplier";

  String ALTERNATIVE_PAYEE_ACCOUNT_NUMBER = "AlternativePayeeAccountNumber";

  String AUTHORIZATION_GROUP = "AuthorizationGroup";

  String CREATED_BY_USER = "CreatedByUser";

  String CREATION_DATE = "CreationDate";

  String CUSTOMER = "Customer";

  String PAYMENT_IS_BLOCKED_FOR_SUPPLIER = "PaymentIsBlockedForSupplier";

  String POSTING_IS_BLOCKED = "PostingIsBlocked";

  String PURCHASING_IS_BLOCKED = "PurchasingIsBlocked";

  String SUPPLIER_ACCOUNT_GROUP = "SupplierAccountGroup";

  String SUPPLIER_FULL_NAME = "SupplierFullName";

  String SUPPLIER_NAME = "SupplierName";

  String VATREGISTRATION = "VATRegistration";

  String BIRTH_DATE = "BirthDate";

  String CONCATENATED_INTERNATIONAL_LOC_NO = "ConcatenatedInternationalLocNo";

  String DELETION_INDICATOR = "DeletionIndicator";

  String FISCAL_ADDRESS = "FiscalAddress";

  String INDUSTRY = "Industry";

  String INTERNATIONAL_LOCATION_NUMBER1 = "InternationalLocationNumber1";

  String INTERNATIONAL_LOCATION_NUMBER2 = "InternationalLocationNumber2";

  String INTERNATIONAL_LOCATION_NUMBER3 = "InternationalLocationNumber3";

  String IS_NATURAL_PERSON = "IsNaturalPerson";

  String RESPONSIBLE_TYPE = "ResponsibleType";

  String SUPLR_QLTY_IN_PROCMT_CERTFN_VALID_TO = "SuplrQltyInProcmtCertfnValidTo";

  String SUPLR_QUALITY_MANAGEMENT_SYSTEM = "SuplrQualityManagementSystem";

  String SUPPLIER_CORPORATE_GROUP = "SupplierCorporateGroup";

  String SUPPLIER_PROCUREMENT_BLOCK = "SupplierProcurementBlock";

  String TAX_NUMBER1 = "TaxNumber1";

  String TAX_NUMBER2 = "TaxNumber2";

  String TAX_NUMBER3 = "TaxNumber3";

  String TAX_NUMBER4 = "TaxNumber4";

  String TAX_NUMBER5 = "TaxNumber5";

  String TAX_NUMBER_RESPONSIBLE = "TaxNumberResponsible";

  String TAX_NUMBER_TYPE = "TaxNumberType";

  String SUPLR_PROOF_OF_DELIV_RLVT_CODE = "SuplrProofOfDelivRlvtCode";

  String BR_TAX_IS_SPLIT = "BR_TaxIsSplit";

  String TO_SUPPLIER_COMPANY = "to_SupplierCompany";

  String TO_SUPPLIER_COMPANY_SUPPLIER = "to_SupplierCompany_Supplier";

  String TO_SUPPLIER_COMPANY_COMPANY_CODE = "to_SupplierCompany_CompanyCode";

  String TO_SUPPLIER_PURCHASING_ORG = "to_SupplierPurchasingOrg";

  String TO_SUPPLIER_PURCHASING_ORG_SUPPLIER = "to_SupplierPurchasingOrg_Supplier";

  String TO_SUPPLIER_PURCHASING_ORG_PURCHASING_ORGANIZATION = "to_SupplierPurchasingOrg_PurchasingOrganization";

  @CdsName(SUPPLIER)
  String getSupplier();

  @CdsName(SUPPLIER)
  void setSupplier(String supplier);

  @CdsName(ALTERNATIVE_PAYEE_ACCOUNT_NUMBER)
  String getAlternativePayeeAccountNumber();

  @CdsName(ALTERNATIVE_PAYEE_ACCOUNT_NUMBER)
  void setAlternativePayeeAccountNumber(String alternativePayeeAccountNumber);

  @CdsName(AUTHORIZATION_GROUP)
  String getAuthorizationGroup();

  @CdsName(AUTHORIZATION_GROUP)
  void setAuthorizationGroup(String authorizationGroup);

  @CdsName(CREATED_BY_USER)
  String getCreatedByUser();

  @CdsName(CREATED_BY_USER)
  void setCreatedByUser(String createdByUser);

  @CdsName(CREATION_DATE)
  LocalDate getCreationDate();

  @CdsName(CREATION_DATE)
  void setCreationDate(LocalDate creationDate);

  @CdsName(CUSTOMER)
  String getCustomer();

  @CdsName(CUSTOMER)
  void setCustomer(String customer);

  @CdsName(PAYMENT_IS_BLOCKED_FOR_SUPPLIER)
  Boolean getPaymentIsBlockedForSupplier();

  @CdsName(PAYMENT_IS_BLOCKED_FOR_SUPPLIER)
  void setPaymentIsBlockedForSupplier(Boolean paymentIsBlockedForSupplier);

  @CdsName(POSTING_IS_BLOCKED)
  Boolean getPostingIsBlocked();

  @CdsName(POSTING_IS_BLOCKED)
  void setPostingIsBlocked(Boolean postingIsBlocked);

  @CdsName(PURCHASING_IS_BLOCKED)
  Boolean getPurchasingIsBlocked();

  @CdsName(PURCHASING_IS_BLOCKED)
  void setPurchasingIsBlocked(Boolean purchasingIsBlocked);

  @CdsName(SUPPLIER_ACCOUNT_GROUP)
  String getSupplierAccountGroup();

  @CdsName(SUPPLIER_ACCOUNT_GROUP)
  void setSupplierAccountGroup(String supplierAccountGroup);

  @CdsName(SUPPLIER_FULL_NAME)
  String getSupplierFullName();

  @CdsName(SUPPLIER_FULL_NAME)
  void setSupplierFullName(String supplierFullName);

  @CdsName(SUPPLIER_NAME)
  String getSupplierName();

  @CdsName(SUPPLIER_NAME)
  void setSupplierName(String supplierName);

  @CdsName(VATREGISTRATION)
  String getVATRegistration();

  @CdsName(VATREGISTRATION)
  void setVATRegistration(String vATRegistration);

  @CdsName(BIRTH_DATE)
  LocalDate getBirthDate();

  @CdsName(BIRTH_DATE)
  void setBirthDate(LocalDate birthDate);

  @CdsName(CONCATENATED_INTERNATIONAL_LOC_NO)
  String getConcatenatedInternationalLocNo();

  @CdsName(CONCATENATED_INTERNATIONAL_LOC_NO)
  void setConcatenatedInternationalLocNo(String concatenatedInternationalLocNo);

  @CdsName(DELETION_INDICATOR)
  Boolean getDeletionIndicator();

  @CdsName(DELETION_INDICATOR)
  void setDeletionIndicator(Boolean deletionIndicator);

  @CdsName(FISCAL_ADDRESS)
  String getFiscalAddress();

  @CdsName(FISCAL_ADDRESS)
  void setFiscalAddress(String fiscalAddress);

  @CdsName(INDUSTRY)
  String getIndustry();

  @CdsName(INDUSTRY)
  void setIndustry(String industry);

  @CdsName(INTERNATIONAL_LOCATION_NUMBER1)
  String getInternationalLocationNumber1();

  @CdsName(INTERNATIONAL_LOCATION_NUMBER1)
  void setInternationalLocationNumber1(String internationalLocationNumber1);

  @CdsName(INTERNATIONAL_LOCATION_NUMBER2)
  String getInternationalLocationNumber2();

  @CdsName(INTERNATIONAL_LOCATION_NUMBER2)
  void setInternationalLocationNumber2(String internationalLocationNumber2);

  @CdsName(INTERNATIONAL_LOCATION_NUMBER3)
  String getInternationalLocationNumber3();

  @CdsName(INTERNATIONAL_LOCATION_NUMBER3)
  void setInternationalLocationNumber3(String internationalLocationNumber3);

  @CdsName(IS_NATURAL_PERSON)
  String getIsNaturalPerson();

  @CdsName(IS_NATURAL_PERSON)
  void setIsNaturalPerson(String isNaturalPerson);

  @CdsName(RESPONSIBLE_TYPE)
  String getResponsibleType();

  @CdsName(RESPONSIBLE_TYPE)
  void setResponsibleType(String responsibleType);

  @CdsName(SUPLR_QLTY_IN_PROCMT_CERTFN_VALID_TO)
  LocalDate getSuplrQltyInProcmtCertfnValidTo();

  @CdsName(SUPLR_QLTY_IN_PROCMT_CERTFN_VALID_TO)
  void setSuplrQltyInProcmtCertfnValidTo(LocalDate suplrQltyInProcmtCertfnValidTo);

  @CdsName(SUPLR_QUALITY_MANAGEMENT_SYSTEM)
  String getSuplrQualityManagementSystem();

  @CdsName(SUPLR_QUALITY_MANAGEMENT_SYSTEM)
  void setSuplrQualityManagementSystem(String suplrQualityManagementSystem);

  @CdsName(SUPPLIER_CORPORATE_GROUP)
  String getSupplierCorporateGroup();

  @CdsName(SUPPLIER_CORPORATE_GROUP)
  void setSupplierCorporateGroup(String supplierCorporateGroup);

  @CdsName(SUPPLIER_PROCUREMENT_BLOCK)
  String getSupplierProcurementBlock();

  @CdsName(SUPPLIER_PROCUREMENT_BLOCK)
  void setSupplierProcurementBlock(String supplierProcurementBlock);

  @CdsName(TAX_NUMBER1)
  String getTaxNumber1();

  @CdsName(TAX_NUMBER1)
  void setTaxNumber1(String taxNumber1);

  @CdsName(TAX_NUMBER2)
  String getTaxNumber2();

  @CdsName(TAX_NUMBER2)
  void setTaxNumber2(String taxNumber2);

  @CdsName(TAX_NUMBER3)
  String getTaxNumber3();

  @CdsName(TAX_NUMBER3)
  void setTaxNumber3(String taxNumber3);

  @CdsName(TAX_NUMBER4)
  String getTaxNumber4();

  @CdsName(TAX_NUMBER4)
  void setTaxNumber4(String taxNumber4);

  @CdsName(TAX_NUMBER5)
  String getTaxNumber5();

  @CdsName(TAX_NUMBER5)
  void setTaxNumber5(String taxNumber5);

  @CdsName(TAX_NUMBER_RESPONSIBLE)
  String getTaxNumberResponsible();

  @CdsName(TAX_NUMBER_RESPONSIBLE)
  void setTaxNumberResponsible(String taxNumberResponsible);

  @CdsName(TAX_NUMBER_TYPE)
  String getTaxNumberType();

  @CdsName(TAX_NUMBER_TYPE)
  void setTaxNumberType(String taxNumberType);

  @CdsName(SUPLR_PROOF_OF_DELIV_RLVT_CODE)
  String getSuplrProofOfDelivRlvtCode();

  @CdsName(SUPLR_PROOF_OF_DELIV_RLVT_CODE)
  void setSuplrProofOfDelivRlvtCode(String suplrProofOfDelivRlvtCode);

  @CdsName(BR_TAX_IS_SPLIT)
  Boolean getBRTaxIsSplit();

  @CdsName(BR_TAX_IS_SPLIT)
  void setBRTaxIsSplit(Boolean bRTaxIsSplit);

  @CdsName(TO_SUPPLIER_COMPANY)
  List<ASupplierCompany> getToSupplierCompany();

  @CdsName(TO_SUPPLIER_COMPANY)
  void setToSupplierCompany(List<? extends Map<String, ?>> toSupplierCompany);

  @CdsName(TO_SUPPLIER_COMPANY_SUPPLIER)
  String getToSupplierCompanySupplier();

  @CdsName(TO_SUPPLIER_COMPANY_SUPPLIER)
  void setToSupplierCompanySupplier(String toSupplierCompanySupplier);

  @CdsName(TO_SUPPLIER_COMPANY_COMPANY_CODE)
  String getToSupplierCompanyCompanyCode();

  @CdsName(TO_SUPPLIER_COMPANY_COMPANY_CODE)
  void setToSupplierCompanyCompanyCode(String toSupplierCompanyCompanyCode);

  @CdsName(TO_SUPPLIER_PURCHASING_ORG)
  List<ASupplierPurchasingOrg> getToSupplierPurchasingOrg();

  @CdsName(TO_SUPPLIER_PURCHASING_ORG)
  void setToSupplierPurchasingOrg(List<? extends Map<String, ?>> toSupplierPurchasingOrg);

  @CdsName(TO_SUPPLIER_PURCHASING_ORG_SUPPLIER)
  String getToSupplierPurchasingOrgSupplier();

  @CdsName(TO_SUPPLIER_PURCHASING_ORG_SUPPLIER)
  void setToSupplierPurchasingOrgSupplier(String toSupplierPurchasingOrgSupplier);

  @CdsName(TO_SUPPLIER_PURCHASING_ORG_PURCHASING_ORGANIZATION)
  String getToSupplierPurchasingOrgPurchasingOrganization();

  @CdsName(TO_SUPPLIER_PURCHASING_ORG_PURCHASING_ORGANIZATION)
  void setToSupplierPurchasingOrgPurchasingOrganization(
      String toSupplierPurchasingOrgPurchasingOrganization);

  ASupplier_ ref();

  static ASupplier create() {
    return Struct.create(ASupplier.class);
  }
}
