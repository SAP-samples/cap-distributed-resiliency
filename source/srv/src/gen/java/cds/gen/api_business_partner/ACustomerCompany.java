package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.String;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@CdsName("API_BUSINESS_PARTNER.A_CustomerCompany")
public interface ACustomerCompany extends CdsData {
  String CUSTOMER = "Customer";

  String COMPANY_CODE = "CompanyCode";

  String APARTOLERANCE_GROUP = "APARToleranceGroup";

  String ACCOUNT_BY_CUSTOMER = "AccountByCustomer";

  String ACCOUNTING_CLERK = "AccountingClerk";

  String ACCOUNTING_CLERK_FAX_NUMBER = "AccountingClerkFaxNumber";

  String ACCOUNTING_CLERK_INTERNET_ADDRESS = "AccountingClerkInternetAddress";

  String ACCOUNTING_CLERK_PHONE_NUMBER = "AccountingClerkPhoneNumber";

  String ALTERNATIVE_PAYER_ACCOUNT = "AlternativePayerAccount";

  String AUTHORIZATION_GROUP = "AuthorizationGroup";

  String COLLECTIVE_INVOICE_VARIANT = "CollectiveInvoiceVariant";

  String CUSTOMER_ACCOUNT_NOTE = "CustomerAccountNote";

  String CUSTOMER_HEAD_OFFICE = "CustomerHeadOffice";

  String CUSTOMER_SUPPLIER_CLEARING_IS_USED = "CustomerSupplierClearingIsUsed";

  String HOUSE_BANK = "HouseBank";

  String INTEREST_CALCULATION_CODE = "InterestCalculationCode";

  String INTEREST_CALCULATION_DATE = "InterestCalculationDate";

  String IS_TO_BE_LOCALLY_PROCESSED = "IsToBeLocallyProcessed";

  String ITEM_IS_TO_BE_PAID_SEPARATELY = "ItemIsToBePaidSeparately";

  String LAYOUT_SORTING_RULE = "LayoutSortingRule";

  String PAYMENT_BLOCKING_REASON = "PaymentBlockingReason";

  String PAYMENT_METHODS_LIST = "PaymentMethodsList";

  String PAYMENT_TERMS = "PaymentTerms";

  String PAYT_ADVICE_IS_SENTBY_EDI = "PaytAdviceIsSentbyEDI";

  String PHYSICAL_INVENTORY_BLOCK_IND = "PhysicalInventoryBlockInd";

  String RECONCILIATION_ACCOUNT = "ReconciliationAccount";

  String RECORD_PAYMENT_HISTORY_INDICATOR = "RecordPaymentHistoryIndicator";

  String USER_AT_CUSTOMER = "UserAtCustomer";

  String DELETION_INDICATOR = "DeletionIndicator";

  String CASH_PLANNING_GROUP = "CashPlanningGroup";

  String KNOWN_OR_NEGOTIATED_LEAVE = "KnownOrNegotiatedLeave";

  String VALUE_ADJUSTMENT_KEY = "ValueAdjustmentKey";

  String CUSTOMER_ACCOUNT_GROUP = "CustomerAccountGroup";

  String TO_CUSTOMER_DUNNING = "to_CustomerDunning";

  String TO_CUSTOMER_DUNNING_CUSTOMER = "to_CustomerDunning_Customer";

  String TO_CUSTOMER_DUNNING_COMPANY_CODE = "to_CustomerDunning_CompanyCode";

  String TO_CUSTOMER_DUNNING_DUNNING_AREA = "to_CustomerDunning_DunningArea";

  String TO_WITH_HOLDING_TAX = "to_WithHoldingTax";

  String TO_WITH_HOLDING_TAX_CUSTOMER = "to_WithHoldingTax_Customer";

  String TO_WITH_HOLDING_TAX_COMPANY_CODE = "to_WithHoldingTax_CompanyCode";

  String TO_WITH_HOLDING_TAX_WITHHOLDING_TAX_TYPE = "to_WithHoldingTax_WithholdingTaxType";

  @CdsName(CUSTOMER)
  String getCustomer();

  @CdsName(CUSTOMER)
  void setCustomer(String customer);

  @CdsName(COMPANY_CODE)
  String getCompanyCode();

  @CdsName(COMPANY_CODE)
  void setCompanyCode(String companyCode);

  @CdsName(APARTOLERANCE_GROUP)
  String getAPARToleranceGroup();

  @CdsName(APARTOLERANCE_GROUP)
  void setAPARToleranceGroup(String aPARToleranceGroup);

  @CdsName(ACCOUNT_BY_CUSTOMER)
  String getAccountByCustomer();

  @CdsName(ACCOUNT_BY_CUSTOMER)
  void setAccountByCustomer(String accountByCustomer);

  @CdsName(ACCOUNTING_CLERK)
  String getAccountingClerk();

  @CdsName(ACCOUNTING_CLERK)
  void setAccountingClerk(String accountingClerk);

  @CdsName(ACCOUNTING_CLERK_FAX_NUMBER)
  String getAccountingClerkFaxNumber();

  @CdsName(ACCOUNTING_CLERK_FAX_NUMBER)
  void setAccountingClerkFaxNumber(String accountingClerkFaxNumber);

  @CdsName(ACCOUNTING_CLERK_INTERNET_ADDRESS)
  String getAccountingClerkInternetAddress();

  @CdsName(ACCOUNTING_CLERK_INTERNET_ADDRESS)
  void setAccountingClerkInternetAddress(String accountingClerkInternetAddress);

  @CdsName(ACCOUNTING_CLERK_PHONE_NUMBER)
  String getAccountingClerkPhoneNumber();

  @CdsName(ACCOUNTING_CLERK_PHONE_NUMBER)
  void setAccountingClerkPhoneNumber(String accountingClerkPhoneNumber);

  @CdsName(ALTERNATIVE_PAYER_ACCOUNT)
  String getAlternativePayerAccount();

  @CdsName(ALTERNATIVE_PAYER_ACCOUNT)
  void setAlternativePayerAccount(String alternativePayerAccount);

  @CdsName(AUTHORIZATION_GROUP)
  String getAuthorizationGroup();

  @CdsName(AUTHORIZATION_GROUP)
  void setAuthorizationGroup(String authorizationGroup);

  @CdsName(COLLECTIVE_INVOICE_VARIANT)
  String getCollectiveInvoiceVariant();

  @CdsName(COLLECTIVE_INVOICE_VARIANT)
  void setCollectiveInvoiceVariant(String collectiveInvoiceVariant);

  @CdsName(CUSTOMER_ACCOUNT_NOTE)
  String getCustomerAccountNote();

  @CdsName(CUSTOMER_ACCOUNT_NOTE)
  void setCustomerAccountNote(String customerAccountNote);

  @CdsName(CUSTOMER_HEAD_OFFICE)
  String getCustomerHeadOffice();

  @CdsName(CUSTOMER_HEAD_OFFICE)
  void setCustomerHeadOffice(String customerHeadOffice);

  @CdsName(CUSTOMER_SUPPLIER_CLEARING_IS_USED)
  Boolean getCustomerSupplierClearingIsUsed();

  @CdsName(CUSTOMER_SUPPLIER_CLEARING_IS_USED)
  void setCustomerSupplierClearingIsUsed(Boolean customerSupplierClearingIsUsed);

  @CdsName(HOUSE_BANK)
  String getHouseBank();

  @CdsName(HOUSE_BANK)
  void setHouseBank(String houseBank);

  @CdsName(INTEREST_CALCULATION_CODE)
  String getInterestCalculationCode();

  @CdsName(INTEREST_CALCULATION_CODE)
  void setInterestCalculationCode(String interestCalculationCode);

  @CdsName(INTEREST_CALCULATION_DATE)
  LocalDate getInterestCalculationDate();

  @CdsName(INTEREST_CALCULATION_DATE)
  void setInterestCalculationDate(LocalDate interestCalculationDate);

  @CdsName(IS_TO_BE_LOCALLY_PROCESSED)
  Boolean getIsToBeLocallyProcessed();

  @CdsName(IS_TO_BE_LOCALLY_PROCESSED)
  void setIsToBeLocallyProcessed(Boolean isToBeLocallyProcessed);

  @CdsName(ITEM_IS_TO_BE_PAID_SEPARATELY)
  Boolean getItemIsToBePaidSeparately();

  @CdsName(ITEM_IS_TO_BE_PAID_SEPARATELY)
  void setItemIsToBePaidSeparately(Boolean itemIsToBePaidSeparately);

  @CdsName(LAYOUT_SORTING_RULE)
  String getLayoutSortingRule();

  @CdsName(LAYOUT_SORTING_RULE)
  void setLayoutSortingRule(String layoutSortingRule);

  @CdsName(PAYMENT_BLOCKING_REASON)
  String getPaymentBlockingReason();

  @CdsName(PAYMENT_BLOCKING_REASON)
  void setPaymentBlockingReason(String paymentBlockingReason);

  @CdsName(PAYMENT_METHODS_LIST)
  String getPaymentMethodsList();

  @CdsName(PAYMENT_METHODS_LIST)
  void setPaymentMethodsList(String paymentMethodsList);

  @CdsName(PAYMENT_TERMS)
  String getPaymentTerms();

  @CdsName(PAYMENT_TERMS)
  void setPaymentTerms(String paymentTerms);

  @CdsName(PAYT_ADVICE_IS_SENTBY_EDI)
  Boolean getPaytAdviceIsSentbyEDI();

  @CdsName(PAYT_ADVICE_IS_SENTBY_EDI)
  void setPaytAdviceIsSentbyEDI(Boolean paytAdviceIsSentbyEDI);

  @CdsName(PHYSICAL_INVENTORY_BLOCK_IND)
  Boolean getPhysicalInventoryBlockInd();

  @CdsName(PHYSICAL_INVENTORY_BLOCK_IND)
  void setPhysicalInventoryBlockInd(Boolean physicalInventoryBlockInd);

  @CdsName(RECONCILIATION_ACCOUNT)
  String getReconciliationAccount();

  @CdsName(RECONCILIATION_ACCOUNT)
  void setReconciliationAccount(String reconciliationAccount);

  @CdsName(RECORD_PAYMENT_HISTORY_INDICATOR)
  Boolean getRecordPaymentHistoryIndicator();

  @CdsName(RECORD_PAYMENT_HISTORY_INDICATOR)
  void setRecordPaymentHistoryIndicator(Boolean recordPaymentHistoryIndicator);

  @CdsName(USER_AT_CUSTOMER)
  String getUserAtCustomer();

  @CdsName(USER_AT_CUSTOMER)
  void setUserAtCustomer(String userAtCustomer);

  @CdsName(DELETION_INDICATOR)
  Boolean getDeletionIndicator();

  @CdsName(DELETION_INDICATOR)
  void setDeletionIndicator(Boolean deletionIndicator);

  @CdsName(CASH_PLANNING_GROUP)
  String getCashPlanningGroup();

  @CdsName(CASH_PLANNING_GROUP)
  void setCashPlanningGroup(String cashPlanningGroup);

  @CdsName(KNOWN_OR_NEGOTIATED_LEAVE)
  String getKnownOrNegotiatedLeave();

  @CdsName(KNOWN_OR_NEGOTIATED_LEAVE)
  void setKnownOrNegotiatedLeave(String knownOrNegotiatedLeave);

  @CdsName(VALUE_ADJUSTMENT_KEY)
  String getValueAdjustmentKey();

  @CdsName(VALUE_ADJUSTMENT_KEY)
  void setValueAdjustmentKey(String valueAdjustmentKey);

  @CdsName(CUSTOMER_ACCOUNT_GROUP)
  String getCustomerAccountGroup();

  @CdsName(CUSTOMER_ACCOUNT_GROUP)
  void setCustomerAccountGroup(String customerAccountGroup);

  @CdsName(TO_CUSTOMER_DUNNING)
  List<ACustomerDunning> getToCustomerDunning();

  @CdsName(TO_CUSTOMER_DUNNING)
  void setToCustomerDunning(List<? extends Map<String, ?>> toCustomerDunning);

  @CdsName(TO_CUSTOMER_DUNNING_CUSTOMER)
  String getToCustomerDunningCustomer();

  @CdsName(TO_CUSTOMER_DUNNING_CUSTOMER)
  void setToCustomerDunningCustomer(String toCustomerDunningCustomer);

  @CdsName(TO_CUSTOMER_DUNNING_COMPANY_CODE)
  String getToCustomerDunningCompanyCode();

  @CdsName(TO_CUSTOMER_DUNNING_COMPANY_CODE)
  void setToCustomerDunningCompanyCode(String toCustomerDunningCompanyCode);

  @CdsName(TO_CUSTOMER_DUNNING_DUNNING_AREA)
  String getToCustomerDunningDunningArea();

  @CdsName(TO_CUSTOMER_DUNNING_DUNNING_AREA)
  void setToCustomerDunningDunningArea(String toCustomerDunningDunningArea);

  @CdsName(TO_WITH_HOLDING_TAX)
  List<ACustomerWithHoldingTax> getToWithHoldingTax();

  @CdsName(TO_WITH_HOLDING_TAX)
  void setToWithHoldingTax(List<? extends Map<String, ?>> toWithHoldingTax);

  @CdsName(TO_WITH_HOLDING_TAX_CUSTOMER)
  String getToWithHoldingTaxCustomer();

  @CdsName(TO_WITH_HOLDING_TAX_CUSTOMER)
  void setToWithHoldingTaxCustomer(String toWithHoldingTaxCustomer);

  @CdsName(TO_WITH_HOLDING_TAX_COMPANY_CODE)
  String getToWithHoldingTaxCompanyCode();

  @CdsName(TO_WITH_HOLDING_TAX_COMPANY_CODE)
  void setToWithHoldingTaxCompanyCode(String toWithHoldingTaxCompanyCode);

  @CdsName(TO_WITH_HOLDING_TAX_WITHHOLDING_TAX_TYPE)
  String getToWithHoldingTaxWithholdingTaxType();

  @CdsName(TO_WITH_HOLDING_TAX_WITHHOLDING_TAX_TYPE)
  void setToWithHoldingTaxWithholdingTaxType(String toWithHoldingTaxWithholdingTaxType);

  ACustomerCompany_ ref();

  static ACustomerCompany create() {
    return Struct.create(ACustomerCompany.class);
  }
}
