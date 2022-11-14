package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.String;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@CdsName("API_BUSINESS_PARTNER.A_BusinessPartnerAddress")
public interface ABusinessPartnerAddress extends CdsData {
  String BUSINESS_PARTNER = "BusinessPartner";

  String ADDRESS_ID = "AddressID";

  String VALIDITY_START_DATE = "ValidityStartDate";

  String VALIDITY_END_DATE = "ValidityEndDate";

  String AUTHORIZATION_GROUP = "AuthorizationGroup";

  String ADDRESS_UUID = "AddressUUID";

  String ADDITIONAL_STREET_PREFIX_NAME = "AdditionalStreetPrefixName";

  String ADDITIONAL_STREET_SUFFIX_NAME = "AdditionalStreetSuffixName";

  String ADDRESS_TIME_ZONE = "AddressTimeZone";

  String CARE_OF_NAME = "CareOfName";

  String CITY_CODE = "CityCode";

  String CITY_NAME = "CityName";

  String COMPANY_POSTAL_CODE = "CompanyPostalCode";

  String COUNTRY = "Country";

  String COUNTY = "County";

  String DELIVERY_SERVICE_NUMBER = "DeliveryServiceNumber";

  String DELIVERY_SERVICE_TYPE_CODE = "DeliveryServiceTypeCode";

  String DISTRICT = "District";

  String FORM_OF_ADDRESS = "FormOfAddress";

  String FULL_NAME = "FullName";

  String HOME_CITY_NAME = "HomeCityName";

  String HOUSE_NUMBER = "HouseNumber";

  String HOUSE_NUMBER_SUPPLEMENT_TEXT = "HouseNumberSupplementText";

  String LANGUAGE = "Language";

  String POBOX = "POBox";

  String POBOX_DEVIATING_CITY_NAME = "POBoxDeviatingCityName";

  String POBOX_DEVIATING_COUNTRY = "POBoxDeviatingCountry";

  String POBOX_DEVIATING_REGION = "POBoxDeviatingRegion";

  String POBOX_IS_WITHOUT_NUMBER = "POBoxIsWithoutNumber";

  String POBOX_LOBBY_NAME = "POBoxLobbyName";

  String POBOX_POSTAL_CODE = "POBoxPostalCode";

  String PERSON = "Person";

  String POSTAL_CODE = "PostalCode";

  String PRFRD_COMM_MEDIUM_TYPE = "PrfrdCommMediumType";

  String REGION = "Region";

  String STREET_NAME = "StreetName";

  String STREET_PREFIX_NAME = "StreetPrefixName";

  String STREET_SUFFIX_NAME = "StreetSuffixName";

  String TAX_JURISDICTION = "TaxJurisdiction";

  String TRANSPORT_ZONE = "TransportZone";

  String ADDRESS_IDBY_EXTERNAL_SYSTEM = "AddressIDByExternalSystem";

  String TO_ADDRESS_USAGE = "to_AddressUsage";

  String TO_ADDRESS_USAGE_BUSINESS_PARTNER = "to_AddressUsage_BusinessPartner";

  String TO_ADDRESS_USAGE_VALIDITY_END_DATE = "to_AddressUsage_ValidityEndDate";

  String TO_ADDRESS_USAGE_ADDRESS_USAGE = "to_AddressUsage_AddressUsage";

  String TO_ADDRESS_USAGE_ADDRESS_ID = "to_AddressUsage_AddressID";

  String TO_EMAIL_ADDRESS = "to_EmailAddress";

  String TO_EMAIL_ADDRESS_ADDRESS_ID = "to_EmailAddress_AddressID";

  String TO_EMAIL_ADDRESS_PERSON = "to_EmailAddress_Person";

  String TO_EMAIL_ADDRESS_ORDINAL_NUMBER = "to_EmailAddress_OrdinalNumber";

  String TO_FAX_NUMBER = "to_FaxNumber";

  String TO_FAX_NUMBER_ADDRESS_ID = "to_FaxNumber_AddressID";

  String TO_FAX_NUMBER_PERSON = "to_FaxNumber_Person";

  String TO_FAX_NUMBER_ORDINAL_NUMBER = "to_FaxNumber_OrdinalNumber";

  String TO_MOBILE_PHONE_NUMBER = "to_MobilePhoneNumber";

  String TO_MOBILE_PHONE_NUMBER_ADDRESS_ID = "to_MobilePhoneNumber_AddressID";

  String TO_MOBILE_PHONE_NUMBER_PERSON = "to_MobilePhoneNumber_Person";

  String TO_MOBILE_PHONE_NUMBER_ORDINAL_NUMBER = "to_MobilePhoneNumber_OrdinalNumber";

  String TO_PHONE_NUMBER = "to_PhoneNumber";

  String TO_PHONE_NUMBER_ADDRESS_ID = "to_PhoneNumber_AddressID";

  String TO_PHONE_NUMBER_PERSON = "to_PhoneNumber_Person";

  String TO_PHONE_NUMBER_ORDINAL_NUMBER = "to_PhoneNumber_OrdinalNumber";

  String TO_URLADDRESS = "to_URLAddress";

  String TO_URLADDRESS_ADDRESS_ID = "to_URLAddress_AddressID";

  String TO_URLADDRESS_PERSON = "to_URLAddress_Person";

  String TO_URLADDRESS_ORDINAL_NUMBER = "to_URLAddress_OrdinalNumber";

  String TO_URLADDRESS_VALIDITY_START_DATE = "to_URLAddress_ValidityStartDate";

  String TO_URLADDRESS_IS_DEFAULT_URLADDRESS = "to_URLAddress_IsDefaultURLAddress";

  @CdsName(BUSINESS_PARTNER)
  String getBusinessPartner();

  @CdsName(BUSINESS_PARTNER)
  void setBusinessPartner(String businessPartner);

  @CdsName(ADDRESS_ID)
  String getAddressID();

  @CdsName(ADDRESS_ID)
  void setAddressID(String addressID);

  @CdsName(VALIDITY_START_DATE)
  Instant getValidityStartDate();

  @CdsName(VALIDITY_START_DATE)
  void setValidityStartDate(Instant validityStartDate);

  @CdsName(VALIDITY_END_DATE)
  Instant getValidityEndDate();

  @CdsName(VALIDITY_END_DATE)
  void setValidityEndDate(Instant validityEndDate);

  @CdsName(AUTHORIZATION_GROUP)
  String getAuthorizationGroup();

  @CdsName(AUTHORIZATION_GROUP)
  void setAuthorizationGroup(String authorizationGroup);

  @CdsName(ADDRESS_UUID)
  String getAddressUUID();

  @CdsName(ADDRESS_UUID)
  void setAddressUUID(String addressUUID);

  @CdsName(ADDITIONAL_STREET_PREFIX_NAME)
  String getAdditionalStreetPrefixName();

  @CdsName(ADDITIONAL_STREET_PREFIX_NAME)
  void setAdditionalStreetPrefixName(String additionalStreetPrefixName);

  @CdsName(ADDITIONAL_STREET_SUFFIX_NAME)
  String getAdditionalStreetSuffixName();

  @CdsName(ADDITIONAL_STREET_SUFFIX_NAME)
  void setAdditionalStreetSuffixName(String additionalStreetSuffixName);

  @CdsName(ADDRESS_TIME_ZONE)
  String getAddressTimeZone();

  @CdsName(ADDRESS_TIME_ZONE)
  void setAddressTimeZone(String addressTimeZone);

  @CdsName(CARE_OF_NAME)
  String getCareOfName();

  @CdsName(CARE_OF_NAME)
  void setCareOfName(String careOfName);

  @CdsName(CITY_CODE)
  String getCityCode();

  @CdsName(CITY_CODE)
  void setCityCode(String cityCode);

  @CdsName(CITY_NAME)
  String getCityName();

  @CdsName(CITY_NAME)
  void setCityName(String cityName);

  @CdsName(COMPANY_POSTAL_CODE)
  String getCompanyPostalCode();

  @CdsName(COMPANY_POSTAL_CODE)
  void setCompanyPostalCode(String companyPostalCode);

  @CdsName(COUNTRY)
  String getCountry();

  @CdsName(COUNTRY)
  void setCountry(String country);

  @CdsName(COUNTY)
  String getCounty();

  @CdsName(COUNTY)
  void setCounty(String county);

  @CdsName(DELIVERY_SERVICE_NUMBER)
  String getDeliveryServiceNumber();

  @CdsName(DELIVERY_SERVICE_NUMBER)
  void setDeliveryServiceNumber(String deliveryServiceNumber);

  @CdsName(DELIVERY_SERVICE_TYPE_CODE)
  String getDeliveryServiceTypeCode();

  @CdsName(DELIVERY_SERVICE_TYPE_CODE)
  void setDeliveryServiceTypeCode(String deliveryServiceTypeCode);

  @CdsName(DISTRICT)
  String getDistrict();

  @CdsName(DISTRICT)
  void setDistrict(String district);

  @CdsName(FORM_OF_ADDRESS)
  String getFormOfAddress();

  @CdsName(FORM_OF_ADDRESS)
  void setFormOfAddress(String formOfAddress);

  @CdsName(FULL_NAME)
  String getFullName();

  @CdsName(FULL_NAME)
  void setFullName(String fullName);

  @CdsName(HOME_CITY_NAME)
  String getHomeCityName();

  @CdsName(HOME_CITY_NAME)
  void setHomeCityName(String homeCityName);

  @CdsName(HOUSE_NUMBER)
  String getHouseNumber();

  @CdsName(HOUSE_NUMBER)
  void setHouseNumber(String houseNumber);

  @CdsName(HOUSE_NUMBER_SUPPLEMENT_TEXT)
  String getHouseNumberSupplementText();

  @CdsName(HOUSE_NUMBER_SUPPLEMENT_TEXT)
  void setHouseNumberSupplementText(String houseNumberSupplementText);

  @CdsName(LANGUAGE)
  String getLanguage();

  @CdsName(LANGUAGE)
  void setLanguage(String language);

  @CdsName(POBOX)
  String getPOBox();

  @CdsName(POBOX)
  void setPOBox(String pOBox);

  @CdsName(POBOX_DEVIATING_CITY_NAME)
  String getPOBoxDeviatingCityName();

  @CdsName(POBOX_DEVIATING_CITY_NAME)
  void setPOBoxDeviatingCityName(String pOBoxDeviatingCityName);

  @CdsName(POBOX_DEVIATING_COUNTRY)
  String getPOBoxDeviatingCountry();

  @CdsName(POBOX_DEVIATING_COUNTRY)
  void setPOBoxDeviatingCountry(String pOBoxDeviatingCountry);

  @CdsName(POBOX_DEVIATING_REGION)
  String getPOBoxDeviatingRegion();

  @CdsName(POBOX_DEVIATING_REGION)
  void setPOBoxDeviatingRegion(String pOBoxDeviatingRegion);

  @CdsName(POBOX_IS_WITHOUT_NUMBER)
  Boolean getPOBoxIsWithoutNumber();

  @CdsName(POBOX_IS_WITHOUT_NUMBER)
  void setPOBoxIsWithoutNumber(Boolean pOBoxIsWithoutNumber);

  @CdsName(POBOX_LOBBY_NAME)
  String getPOBoxLobbyName();

  @CdsName(POBOX_LOBBY_NAME)
  void setPOBoxLobbyName(String pOBoxLobbyName);

  @CdsName(POBOX_POSTAL_CODE)
  String getPOBoxPostalCode();

  @CdsName(POBOX_POSTAL_CODE)
  void setPOBoxPostalCode(String pOBoxPostalCode);

  @CdsName(PERSON)
  String getPerson();

  @CdsName(PERSON)
  void setPerson(String person);

  @CdsName(POSTAL_CODE)
  String getPostalCode();

  @CdsName(POSTAL_CODE)
  void setPostalCode(String postalCode);

  @CdsName(PRFRD_COMM_MEDIUM_TYPE)
  String getPrfrdCommMediumType();

  @CdsName(PRFRD_COMM_MEDIUM_TYPE)
  void setPrfrdCommMediumType(String prfrdCommMediumType);

  @CdsName(REGION)
  String getRegion();

  @CdsName(REGION)
  void setRegion(String region);

  @CdsName(STREET_NAME)
  String getStreetName();

  @CdsName(STREET_NAME)
  void setStreetName(String streetName);

  @CdsName(STREET_PREFIX_NAME)
  String getStreetPrefixName();

  @CdsName(STREET_PREFIX_NAME)
  void setStreetPrefixName(String streetPrefixName);

  @CdsName(STREET_SUFFIX_NAME)
  String getStreetSuffixName();

  @CdsName(STREET_SUFFIX_NAME)
  void setStreetSuffixName(String streetSuffixName);

  @CdsName(TAX_JURISDICTION)
  String getTaxJurisdiction();

  @CdsName(TAX_JURISDICTION)
  void setTaxJurisdiction(String taxJurisdiction);

  @CdsName(TRANSPORT_ZONE)
  String getTransportZone();

  @CdsName(TRANSPORT_ZONE)
  void setTransportZone(String transportZone);

  @CdsName(ADDRESS_IDBY_EXTERNAL_SYSTEM)
  String getAddressIDByExternalSystem();

  @CdsName(ADDRESS_IDBY_EXTERNAL_SYSTEM)
  void setAddressIDByExternalSystem(String addressIDByExternalSystem);

  @CdsName(TO_ADDRESS_USAGE)
  List<ABuPaAddressUsage> getToAddressUsage();

  @CdsName(TO_ADDRESS_USAGE)
  void setToAddressUsage(List<? extends Map<String, ?>> toAddressUsage);

  @CdsName(TO_ADDRESS_USAGE_BUSINESS_PARTNER)
  String getToAddressUsageBusinessPartner();

  @CdsName(TO_ADDRESS_USAGE_BUSINESS_PARTNER)
  void setToAddressUsageBusinessPartner(String toAddressUsageBusinessPartner);

  @CdsName(TO_ADDRESS_USAGE_VALIDITY_END_DATE)
  Instant getToAddressUsageValidityEndDate();

  @CdsName(TO_ADDRESS_USAGE_VALIDITY_END_DATE)
  void setToAddressUsageValidityEndDate(Instant toAddressUsageValidityEndDate);

  @CdsName(TO_ADDRESS_USAGE_ADDRESS_USAGE)
  String getToAddressUsageAddressUsage();

  @CdsName(TO_ADDRESS_USAGE_ADDRESS_USAGE)
  void setToAddressUsageAddressUsage(String toAddressUsageAddressUsage);

  @CdsName(TO_ADDRESS_USAGE_ADDRESS_ID)
  String getToAddressUsageAddressID();

  @CdsName(TO_ADDRESS_USAGE_ADDRESS_ID)
  void setToAddressUsageAddressID(String toAddressUsageAddressID);

  @CdsName(TO_EMAIL_ADDRESS)
  List<AAddressEmailAddress> getToEmailAddress();

  @CdsName(TO_EMAIL_ADDRESS)
  void setToEmailAddress(List<? extends Map<String, ?>> toEmailAddress);

  @CdsName(TO_EMAIL_ADDRESS_ADDRESS_ID)
  String getToEmailAddressAddressID();

  @CdsName(TO_EMAIL_ADDRESS_ADDRESS_ID)
  void setToEmailAddressAddressID(String toEmailAddressAddressID);

  @CdsName(TO_EMAIL_ADDRESS_PERSON)
  String getToEmailAddressPerson();

  @CdsName(TO_EMAIL_ADDRESS_PERSON)
  void setToEmailAddressPerson(String toEmailAddressPerson);

  @CdsName(TO_EMAIL_ADDRESS_ORDINAL_NUMBER)
  String getToEmailAddressOrdinalNumber();

  @CdsName(TO_EMAIL_ADDRESS_ORDINAL_NUMBER)
  void setToEmailAddressOrdinalNumber(String toEmailAddressOrdinalNumber);

  @CdsName(TO_FAX_NUMBER)
  List<AAddressFaxNumber> getToFaxNumber();

  @CdsName(TO_FAX_NUMBER)
  void setToFaxNumber(List<? extends Map<String, ?>> toFaxNumber);

  @CdsName(TO_FAX_NUMBER_ADDRESS_ID)
  String getToFaxNumberAddressID();

  @CdsName(TO_FAX_NUMBER_ADDRESS_ID)
  void setToFaxNumberAddressID(String toFaxNumberAddressID);

  @CdsName(TO_FAX_NUMBER_PERSON)
  String getToFaxNumberPerson();

  @CdsName(TO_FAX_NUMBER_PERSON)
  void setToFaxNumberPerson(String toFaxNumberPerson);

  @CdsName(TO_FAX_NUMBER_ORDINAL_NUMBER)
  String getToFaxNumberOrdinalNumber();

  @CdsName(TO_FAX_NUMBER_ORDINAL_NUMBER)
  void setToFaxNumberOrdinalNumber(String toFaxNumberOrdinalNumber);

  @CdsName(TO_MOBILE_PHONE_NUMBER)
  List<AAddressPhoneNumber> getToMobilePhoneNumber();

  @CdsName(TO_MOBILE_PHONE_NUMBER)
  void setToMobilePhoneNumber(List<? extends Map<String, ?>> toMobilePhoneNumber);

  @CdsName(TO_MOBILE_PHONE_NUMBER_ADDRESS_ID)
  String getToMobilePhoneNumberAddressID();

  @CdsName(TO_MOBILE_PHONE_NUMBER_ADDRESS_ID)
  void setToMobilePhoneNumberAddressID(String toMobilePhoneNumberAddressID);

  @CdsName(TO_MOBILE_PHONE_NUMBER_PERSON)
  String getToMobilePhoneNumberPerson();

  @CdsName(TO_MOBILE_PHONE_NUMBER_PERSON)
  void setToMobilePhoneNumberPerson(String toMobilePhoneNumberPerson);

  @CdsName(TO_MOBILE_PHONE_NUMBER_ORDINAL_NUMBER)
  String getToMobilePhoneNumberOrdinalNumber();

  @CdsName(TO_MOBILE_PHONE_NUMBER_ORDINAL_NUMBER)
  void setToMobilePhoneNumberOrdinalNumber(String toMobilePhoneNumberOrdinalNumber);

  @CdsName(TO_PHONE_NUMBER)
  List<AAddressPhoneNumber> getToPhoneNumber();

  @CdsName(TO_PHONE_NUMBER)
  void setToPhoneNumber(List<? extends Map<String, ?>> toPhoneNumber);

  @CdsName(TO_PHONE_NUMBER_ADDRESS_ID)
  String getToPhoneNumberAddressID();

  @CdsName(TO_PHONE_NUMBER_ADDRESS_ID)
  void setToPhoneNumberAddressID(String toPhoneNumberAddressID);

  @CdsName(TO_PHONE_NUMBER_PERSON)
  String getToPhoneNumberPerson();

  @CdsName(TO_PHONE_NUMBER_PERSON)
  void setToPhoneNumberPerson(String toPhoneNumberPerson);

  @CdsName(TO_PHONE_NUMBER_ORDINAL_NUMBER)
  String getToPhoneNumberOrdinalNumber();

  @CdsName(TO_PHONE_NUMBER_ORDINAL_NUMBER)
  void setToPhoneNumberOrdinalNumber(String toPhoneNumberOrdinalNumber);

  @CdsName(TO_URLADDRESS)
  List<AAddressHomePageURL> getToURLAddress();

  @CdsName(TO_URLADDRESS)
  void setToURLAddress(List<? extends Map<String, ?>> toURLAddress);

  @CdsName(TO_URLADDRESS_ADDRESS_ID)
  String getToURLAddressAddressID();

  @CdsName(TO_URLADDRESS_ADDRESS_ID)
  void setToURLAddressAddressID(String toURLAddressAddressID);

  @CdsName(TO_URLADDRESS_PERSON)
  String getToURLAddressPerson();

  @CdsName(TO_URLADDRESS_PERSON)
  void setToURLAddressPerson(String toURLAddressPerson);

  @CdsName(TO_URLADDRESS_ORDINAL_NUMBER)
  String getToURLAddressOrdinalNumber();

  @CdsName(TO_URLADDRESS_ORDINAL_NUMBER)
  void setToURLAddressOrdinalNumber(String toURLAddressOrdinalNumber);

  @CdsName(TO_URLADDRESS_VALIDITY_START_DATE)
  LocalDate getToURLAddressValidityStartDate();

  @CdsName(TO_URLADDRESS_VALIDITY_START_DATE)
  void setToURLAddressValidityStartDate(LocalDate toURLAddressValidityStartDate);

  @CdsName(TO_URLADDRESS_IS_DEFAULT_URLADDRESS)
  Boolean getToURLAddressIsDefaultURLAddress();

  @CdsName(TO_URLADDRESS_IS_DEFAULT_URLADDRESS)
  void setToURLAddressIsDefaultURLAddress(Boolean toURLAddressIsDefaultURLAddress);

  ABusinessPartnerAddress_ ref();

  static ABusinessPartnerAddress create() {
    return Struct.create(ABusinessPartnerAddress.class);
  }
}
