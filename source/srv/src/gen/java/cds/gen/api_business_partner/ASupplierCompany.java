package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@CdsName("API_BUSINESS_PARTNER.A_SupplierCompany")
public interface ASupplierCompany extends CdsData {
  String SUPPLIER = "Supplier";

  String COMPANY_CODE = "CompanyCode";

  String AUTHORIZATION_GROUP = "AuthorizationGroup";

  String COMPANY_CODE_NAME = "CompanyCodeName";

  String PAYMENT_BLOCKING_REASON = "PaymentBlockingReason";

  String SUPPLIER_IS_BLOCKED_FOR_POSTING = "SupplierIsBlockedForPosting";

  String ACCOUNTING_CLERK = "AccountingClerk";

  String ACCOUNTING_CLERK_FAX_NUMBER = "AccountingClerkFaxNumber";

  String ACCOUNTING_CLERK_PHONE_NUMBER = "AccountingClerkPhoneNumber";

  String SUPPLIER_CLERK = "SupplierClerk";

  String SUPPLIER_CLERK_URL = "SupplierClerkURL";

  String PAYMENT_METHODS_LIST = "PaymentMethodsList";

  String PAYMENT_TERMS = "PaymentTerms";

  String CLEAR_CUSTOMER_SUPPLIER = "ClearCustomerSupplier";

  String IS_TO_BE_LOCALLY_PROCESSED = "IsToBeLocallyProcessed";

  String ITEM_IS_TO_BE_PAID_SEPARATELY = "ItemIsToBePaidSeparately";

  String PAYMENT_IS_TO_BE_SENT_BY_EDI = "PaymentIsToBeSentByEDI";

  String HOUSE_BANK = "HouseBank";

  String CHECK_PAID_DURATION_IN_DAYS = "CheckPaidDurationInDays";

  String CURRENCY = "Currency";

  String BILL_OF_EXCH_LMT_AMT_IN_CO_CODE_CRCY = "BillOfExchLmtAmtInCoCodeCrcy";

  String SUPPLIER_CLERK_IDBY_SUPPLIER = "SupplierClerkIDBySupplier";

  String RECONCILIATION_ACCOUNT = "ReconciliationAccount";

  String INTEREST_CALCULATION_CODE = "InterestCalculationCode";

  String INTEREST_CALCULATION_DATE = "InterestCalculationDate";

  String SUPPLIER_HEAD_OFFICE = "SupplierHeadOffice";

  String ALTERNATIVE_PAYEE = "AlternativePayee";

  String LAYOUT_SORTING_RULE = "LayoutSortingRule";

  String APARTOLERANCE_GROUP = "APARToleranceGroup";

  String SUPPLIER_CERTIFICATION_DATE = "SupplierCertificationDate";

  String SUPPLIER_ACCOUNT_NOTE = "SupplierAccountNote";

  String WITHHOLDING_TAX_COUNTRY = "WithholdingTaxCountry";

  String DELETION_INDICATOR = "DeletionIndicator";

  String CASH_PLANNING_GROUP = "CashPlanningGroup";

  String IS_TO_BE_CHECKED_FOR_DUPLICATES = "IsToBeCheckedForDuplicates";

  String MINORITY_GROUP = "MinorityGroup";

  String SUPPLIER_ACCOUNT_GROUP = "SupplierAccountGroup";

  String TO_SUPPLIER_DUNNING = "to_SupplierDunning";

  String TO_SUPPLIER_DUNNING_SUPPLIER = "to_SupplierDunning_Supplier";

  String TO_SUPPLIER_DUNNING_COMPANY_CODE = "to_SupplierDunning_CompanyCode";

  String TO_SUPPLIER_DUNNING_DUNNING_AREA = "to_SupplierDunning_DunningArea";

  String TO_SUPPLIER_WITH_HOLDING_TAX = "to_SupplierWithHoldingTax";

  String TO_SUPPLIER_WITH_HOLDING_TAX_SUPPLIER = "to_SupplierWithHoldingTax_Supplier";

  String TO_SUPPLIER_WITH_HOLDING_TAX_COMPANY_CODE = "to_SupplierWithHoldingTax_CompanyCode";

  String TO_SUPPLIER_WITH_HOLDING_TAX_WITHHOLDING_TAX_TYPE = "to_SupplierWithHoldingTax_WithholdingTaxType";

  @CdsName(SUPPLIER)
  String getSupplier();

  @CdsName(SUPPLIER)
  void setSupplier(String supplier);

  @CdsName(COMPANY_CODE)
  String getCompanyCode();

  @CdsName(COMPANY_CODE)
  void setCompanyCode(String companyCode);

  @CdsName(AUTHORIZATION_GROUP)
  String getAuthorizationGroup();

  @CdsName(AUTHORIZATION_GROUP)
  void setAuthorizationGroup(String authorizationGroup);

  @CdsName(COMPANY_CODE_NAME)
  String getCompanyCodeName();

  @CdsName(COMPANY_CODE_NAME)
  void setCompanyCodeName(String companyCodeName);

  @CdsName(PAYMENT_BLOCKING_REASON)
  String getPaymentBlockingReason();

  @CdsName(PAYMENT_BLOCKING_REASON)
  void setPaymentBlockingReason(String paymentBlockingReason);

  @CdsName(SUPPLIER_IS_BLOCKED_FOR_POSTING)
  Boolean getSupplierIsBlockedForPosting();

  @CdsName(SUPPLIER_IS_BLOCKED_FOR_POSTING)
  void setSupplierIsBlockedForPosting(Boolean supplierIsBlockedForPosting);

  @CdsName(ACCOUNTING_CLERK)
  String getAccountingClerk();

  @CdsName(ACCOUNTING_CLERK)
  void setAccountingClerk(String accountingClerk);

  @CdsName(ACCOUNTING_CLERK_FAX_NUMBER)
  String getAccountingClerkFaxNumber();

  @CdsName(ACCOUNTING_CLERK_FAX_NUMBER)
  void setAccountingClerkFaxNumber(String accountingClerkFaxNumber);

  @CdsName(ACCOUNTING_CLERK_PHONE_NUMBER)
  String getAccountingClerkPhoneNumber();

  @CdsName(ACCOUNTING_CLERK_PHONE_NUMBER)
  void setAccountingClerkPhoneNumber(String accountingClerkPhoneNumber);

  @CdsName(SUPPLIER_CLERK)
  String getSupplierClerk();

  @CdsName(SUPPLIER_CLERK)
  void setSupplierClerk(String supplierClerk);

  @CdsName(SUPPLIER_CLERK_URL)
  String getSupplierClerkURL();

  @CdsName(SUPPLIER_CLERK_URL)
  void setSupplierClerkURL(String supplierClerkURL);

  @CdsName(PAYMENT_METHODS_LIST)
  String getPaymentMethodsList();

  @CdsName(PAYMENT_METHODS_LIST)
  void setPaymentMethodsList(String paymentMethodsList);

  @CdsName(PAYMENT_TERMS)
  String getPaymentTerms();

  @CdsName(PAYMENT_TERMS)
  void setPaymentTerms(String paymentTerms);

  @CdsName(CLEAR_CUSTOMER_SUPPLIER)
  Boolean getClearCustomerSupplier();

  @CdsName(CLEAR_CUSTOMER_SUPPLIER)
  void setClearCustomerSupplier(Boolean clearCustomerSupplier);

  @CdsName(IS_TO_BE_LOCALLY_PROCESSED)
  Boolean getIsToBeLocallyProcessed();

  @CdsName(IS_TO_BE_LOCALLY_PROCESSED)
  void setIsToBeLocallyProcessed(Boolean isToBeLocallyProcessed);

  @CdsName(ITEM_IS_TO_BE_PAID_SEPARATELY)
  Boolean getItemIsToBePaidSeparately();

  @CdsName(ITEM_IS_TO_BE_PAID_SEPARATELY)
  void setItemIsToBePaidSeparately(Boolean itemIsToBePaidSeparately);

  @CdsName(PAYMENT_IS_TO_BE_SENT_BY_EDI)
  Boolean getPaymentIsToBeSentByEDI();

  @CdsName(PAYMENT_IS_TO_BE_SENT_BY_EDI)
  void setPaymentIsToBeSentByEDI(Boolean paymentIsToBeSentByEDI);

  @CdsName(HOUSE_BANK)
  String getHouseBank();

  @CdsName(HOUSE_BANK)
  void setHouseBank(String houseBank);

  @CdsName(CHECK_PAID_DURATION_IN_DAYS)
  BigDecimal getCheckPaidDurationInDays();

  @CdsName(CHECK_PAID_DURATION_IN_DAYS)
  void setCheckPaidDurationInDays(BigDecimal checkPaidDurationInDays);

  @CdsName(CURRENCY)
  String getCurrency();

  @CdsName(CURRENCY)
  void setCurrency(String currency);

  @CdsName(BILL_OF_EXCH_LMT_AMT_IN_CO_CODE_CRCY)
  BigDecimal getBillOfExchLmtAmtInCoCodeCrcy();

  @CdsName(BILL_OF_EXCH_LMT_AMT_IN_CO_CODE_CRCY)
  void setBillOfExchLmtAmtInCoCodeCrcy(BigDecimal billOfExchLmtAmtInCoCodeCrcy);

  @CdsName(SUPPLIER_CLERK_IDBY_SUPPLIER)
  String getSupplierClerkIDBySupplier();

  @CdsName(SUPPLIER_CLERK_IDBY_SUPPLIER)
  void setSupplierClerkIDBySupplier(String supplierClerkIDBySupplier);

  @CdsName(RECONCILIATION_ACCOUNT)
  String getReconciliationAccount();

  @CdsName(RECONCILIATION_ACCOUNT)
  void setReconciliationAccount(String reconciliationAccount);

  @CdsName(INTEREST_CALCULATION_CODE)
  String getInterestCalculationCode();

  @CdsName(INTEREST_CALCULATION_CODE)
  void setInterestCalculationCode(String interestCalculationCode);

  @CdsName(INTEREST_CALCULATION_DATE)
  LocalDate getInterestCalculationDate();

  @CdsName(INTEREST_CALCULATION_DATE)
  void setInterestCalculationDate(LocalDate interestCalculationDate);

  @CdsName(SUPPLIER_HEAD_OFFICE)
  String getSupplierHeadOffice();

  @CdsName(SUPPLIER_HEAD_OFFICE)
  void setSupplierHeadOffice(String supplierHeadOffice);

  @CdsName(ALTERNATIVE_PAYEE)
  String getAlternativePayee();

  @CdsName(ALTERNATIVE_PAYEE)
  void setAlternativePayee(String alternativePayee);

  @CdsName(LAYOUT_SORTING_RULE)
  String getLayoutSortingRule();

  @CdsName(LAYOUT_SORTING_RULE)
  void setLayoutSortingRule(String layoutSortingRule);

  @CdsName(APARTOLERANCE_GROUP)
  String getAPARToleranceGroup();

  @CdsName(APARTOLERANCE_GROUP)
  void setAPARToleranceGroup(String aPARToleranceGroup);

  @CdsName(SUPPLIER_CERTIFICATION_DATE)
  LocalDate getSupplierCertificationDate();

  @CdsName(SUPPLIER_CERTIFICATION_DATE)
  void setSupplierCertificationDate(LocalDate supplierCertificationDate);

  @CdsName(SUPPLIER_ACCOUNT_NOTE)
  String getSupplierAccountNote();

  @CdsName(SUPPLIER_ACCOUNT_NOTE)
  void setSupplierAccountNote(String supplierAccountNote);

  @CdsName(WITHHOLDING_TAX_COUNTRY)
  String getWithholdingTaxCountry();

  @CdsName(WITHHOLDING_TAX_COUNTRY)
  void setWithholdingTaxCountry(String withholdingTaxCountry);

  @CdsName(DELETION_INDICATOR)
  Boolean getDeletionIndicator();

  @CdsName(DELETION_INDICATOR)
  void setDeletionIndicator(Boolean deletionIndicator);

  @CdsName(CASH_PLANNING_GROUP)
  String getCashPlanningGroup();

  @CdsName(CASH_PLANNING_GROUP)
  void setCashPlanningGroup(String cashPlanningGroup);

  @CdsName(IS_TO_BE_CHECKED_FOR_DUPLICATES)
  Boolean getIsToBeCheckedForDuplicates();

  @CdsName(IS_TO_BE_CHECKED_FOR_DUPLICATES)
  void setIsToBeCheckedForDuplicates(Boolean isToBeCheckedForDuplicates);

  @CdsName(MINORITY_GROUP)
  String getMinorityGroup();

  @CdsName(MINORITY_GROUP)
  void setMinorityGroup(String minorityGroup);

  @CdsName(SUPPLIER_ACCOUNT_GROUP)
  String getSupplierAccountGroup();

  @CdsName(SUPPLIER_ACCOUNT_GROUP)
  void setSupplierAccountGroup(String supplierAccountGroup);

  @CdsName(TO_SUPPLIER_DUNNING)
  List<ASupplierDunning> getToSupplierDunning();

  @CdsName(TO_SUPPLIER_DUNNING)
  void setToSupplierDunning(List<? extends Map<String, ?>> toSupplierDunning);

  @CdsName(TO_SUPPLIER_DUNNING_SUPPLIER)
  String getToSupplierDunningSupplier();

  @CdsName(TO_SUPPLIER_DUNNING_SUPPLIER)
  void setToSupplierDunningSupplier(String toSupplierDunningSupplier);

  @CdsName(TO_SUPPLIER_DUNNING_COMPANY_CODE)
  String getToSupplierDunningCompanyCode();

  @CdsName(TO_SUPPLIER_DUNNING_COMPANY_CODE)
  void setToSupplierDunningCompanyCode(String toSupplierDunningCompanyCode);

  @CdsName(TO_SUPPLIER_DUNNING_DUNNING_AREA)
  String getToSupplierDunningDunningArea();

  @CdsName(TO_SUPPLIER_DUNNING_DUNNING_AREA)
  void setToSupplierDunningDunningArea(String toSupplierDunningDunningArea);

  @CdsName(TO_SUPPLIER_WITH_HOLDING_TAX)
  List<ASupplierWithHoldingTax> getToSupplierWithHoldingTax();

  @CdsName(TO_SUPPLIER_WITH_HOLDING_TAX)
  void setToSupplierWithHoldingTax(List<? extends Map<String, ?>> toSupplierWithHoldingTax);

  @CdsName(TO_SUPPLIER_WITH_HOLDING_TAX_SUPPLIER)
  String getToSupplierWithHoldingTaxSupplier();

  @CdsName(TO_SUPPLIER_WITH_HOLDING_TAX_SUPPLIER)
  void setToSupplierWithHoldingTaxSupplier(String toSupplierWithHoldingTaxSupplier);

  @CdsName(TO_SUPPLIER_WITH_HOLDING_TAX_COMPANY_CODE)
  String getToSupplierWithHoldingTaxCompanyCode();

  @CdsName(TO_SUPPLIER_WITH_HOLDING_TAX_COMPANY_CODE)
  void setToSupplierWithHoldingTaxCompanyCode(String toSupplierWithHoldingTaxCompanyCode);

  @CdsName(TO_SUPPLIER_WITH_HOLDING_TAX_WITHHOLDING_TAX_TYPE)
  String getToSupplierWithHoldingTaxWithholdingTaxType();

  @CdsName(TO_SUPPLIER_WITH_HOLDING_TAX_WITHHOLDING_TAX_TYPE)
  void setToSupplierWithHoldingTaxWithholdingTaxType(
      String toSupplierWithHoldingTaxWithholdingTaxType);

  ASupplierCompany_ ref();

  static ASupplierCompany create() {
    return Struct.create(ASupplierCompany.class);
  }
}
