package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.String;
import java.time.Instant;
import java.time.LocalDate;

@CdsName("API_BUSINESS_PARTNER.A_BusinessPartnerBank")
public interface ABusinessPartnerBank extends CdsData {
  String BUSINESS_PARTNER = "BusinessPartner";

  String BANK_IDENTIFICATION = "BankIdentification";

  String BANK_COUNTRY_KEY = "BankCountryKey";

  String BANK_NAME = "BankName";

  String BANK_NUMBER = "BankNumber";

  String SWIFTCODE = "SWIFTCode";

  String BANK_CONTROL_KEY = "BankControlKey";

  String BANK_ACCOUNT_HOLDER_NAME = "BankAccountHolderName";

  String BANK_ACCOUNT_NAME = "BankAccountName";

  String VALIDITY_START_DATE = "ValidityStartDate";

  String VALIDITY_END_DATE = "ValidityEndDate";

  String IBAN = "IBAN";

  String IBANVALIDITY_START_DATE = "IBANValidityStartDate";

  String BANK_ACCOUNT = "BankAccount";

  String BANK_ACCOUNT_REFERENCE_TEXT = "BankAccountReferenceText";

  String COLLECTION_AUTH_IND = "CollectionAuthInd";

  String CITY_NAME = "CityName";

  String AUTHORIZATION_GROUP = "AuthorizationGroup";

  @CdsName(BUSINESS_PARTNER)
  String getBusinessPartner();

  @CdsName(BUSINESS_PARTNER)
  void setBusinessPartner(String businessPartner);

  @CdsName(BANK_IDENTIFICATION)
  String getBankIdentification();

  @CdsName(BANK_IDENTIFICATION)
  void setBankIdentification(String bankIdentification);

  @CdsName(BANK_COUNTRY_KEY)
  String getBankCountryKey();

  @CdsName(BANK_COUNTRY_KEY)
  void setBankCountryKey(String bankCountryKey);

  @CdsName(BANK_NAME)
  String getBankName();

  @CdsName(BANK_NAME)
  void setBankName(String bankName);

  @CdsName(BANK_NUMBER)
  String getBankNumber();

  @CdsName(BANK_NUMBER)
  void setBankNumber(String bankNumber);

  @CdsName(SWIFTCODE)
  String getSWIFTCode();

  @CdsName(SWIFTCODE)
  void setSWIFTCode(String sWIFTCode);

  @CdsName(BANK_CONTROL_KEY)
  String getBankControlKey();

  @CdsName(BANK_CONTROL_KEY)
  void setBankControlKey(String bankControlKey);

  @CdsName(BANK_ACCOUNT_HOLDER_NAME)
  String getBankAccountHolderName();

  @CdsName(BANK_ACCOUNT_HOLDER_NAME)
  void setBankAccountHolderName(String bankAccountHolderName);

  @CdsName(BANK_ACCOUNT_NAME)
  String getBankAccountName();

  @CdsName(BANK_ACCOUNT_NAME)
  void setBankAccountName(String bankAccountName);

  @CdsName(VALIDITY_START_DATE)
  Instant getValidityStartDate();

  @CdsName(VALIDITY_START_DATE)
  void setValidityStartDate(Instant validityStartDate);

  @CdsName(VALIDITY_END_DATE)
  Instant getValidityEndDate();

  @CdsName(VALIDITY_END_DATE)
  void setValidityEndDate(Instant validityEndDate);

  @CdsName(IBAN)
  String getIban();

  @CdsName(IBAN)
  void setIban(String iban);

  @CdsName(IBANVALIDITY_START_DATE)
  LocalDate getIBANValidityStartDate();

  @CdsName(IBANVALIDITY_START_DATE)
  void setIBANValidityStartDate(LocalDate iBANValidityStartDate);

  @CdsName(BANK_ACCOUNT)
  String getBankAccount();

  @CdsName(BANK_ACCOUNT)
  void setBankAccount(String bankAccount);

  @CdsName(BANK_ACCOUNT_REFERENCE_TEXT)
  String getBankAccountReferenceText();

  @CdsName(BANK_ACCOUNT_REFERENCE_TEXT)
  void setBankAccountReferenceText(String bankAccountReferenceText);

  @CdsName(COLLECTION_AUTH_IND)
  Boolean getCollectionAuthInd();

  @CdsName(COLLECTION_AUTH_IND)
  void setCollectionAuthInd(Boolean collectionAuthInd);

  @CdsName(CITY_NAME)
  String getCityName();

  @CdsName(CITY_NAME)
  void setCityName(String cityName);

  @CdsName(AUTHORIZATION_GROUP)
  String getAuthorizationGroup();

  @CdsName(AUTHORIZATION_GROUP)
  void setAuthorizationGroup(String authorizationGroup);

  ABusinessPartnerBank_ ref();

  static ABusinessPartnerBank create() {
    return Struct.create(ABusinessPartnerBank.class);
  }
}
