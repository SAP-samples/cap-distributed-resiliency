package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Boolean;
import java.lang.String;
import java.time.LocalDate;
import java.util.function.Function;

@CdsName("API_BUSINESS_PARTNER.A_BPContactToAddress")
public interface ABPContactToAddress_ extends StructuredType<ABPContactToAddress_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_BPContactToAddress";

  ElementRef<String> RelationshipNumber();

  ElementRef<String> BusinessPartnerCompany();

  ElementRef<String> BusinessPartnerPerson();

  ElementRef<LocalDate> ValidityEndDate();

  ElementRef<String> AddressID();

  ElementRef<String> AddressNumber();

  ElementRef<String> AdditionalStreetPrefixName();

  ElementRef<String> AdditionalStreetSuffixName();

  ElementRef<String> AddressTimeZone();

  ElementRef<String> CareOfName();

  ElementRef<String> CityCode();

  ElementRef<String> CityName();

  ElementRef<String> CompanyPostalCode();

  ElementRef<String> Country();

  ElementRef<String> County();

  ElementRef<String> DeliveryServiceNumber();

  ElementRef<String> DeliveryServiceTypeCode();

  ElementRef<String> District();

  ElementRef<String> FormOfAddress();

  ElementRef<String> FullName();

  ElementRef<String> HomeCityName();

  ElementRef<String> HouseNumber();

  ElementRef<String> HouseNumberSupplementText();

  ElementRef<String> Language();

  ElementRef<String> POBox();

  ElementRef<String> POBoxDeviatingCityName();

  ElementRef<String> POBoxDeviatingCountry();

  ElementRef<String> POBoxDeviatingRegion();

  ElementRef<Boolean> POBoxIsWithoutNumber();

  ElementRef<String> POBoxLobbyName();

  ElementRef<String> POBoxPostalCode();

  ElementRef<String> Person();

  ElementRef<String> PostalCode();

  ElementRef<String> PrfrdCommMediumType();

  ElementRef<String> Region();

  ElementRef<String> StreetName();

  ElementRef<String> StreetPrefixName();

  ElementRef<String> StreetSuffixName();

  ElementRef<String> TaxJurisdiction();

  ElementRef<String> TransportZone();

  AAddressEmailAddress_ to_EmailAddress();

  AAddressEmailAddress_ to_EmailAddress(Function<AAddressEmailAddress_, CqnPredicate> filter);

  ElementRef<String> to_EmailAddress_AddressID();

  ElementRef<String> to_EmailAddress_Person();

  ElementRef<String> to_EmailAddress_OrdinalNumber();

  AAddressFaxNumber_ to_FaxNumber();

  AAddressFaxNumber_ to_FaxNumber(Function<AAddressFaxNumber_, CqnPredicate> filter);

  ElementRef<String> to_FaxNumber_AddressID();

  ElementRef<String> to_FaxNumber_Person();

  ElementRef<String> to_FaxNumber_OrdinalNumber();

  AAddressPhoneNumber_ to_MobilePhoneNumber();

  AAddressPhoneNumber_ to_MobilePhoneNumber(Function<AAddressPhoneNumber_, CqnPredicate> filter);

  ElementRef<String> to_MobilePhoneNumber_AddressID();

  ElementRef<String> to_MobilePhoneNumber_Person();

  ElementRef<String> to_MobilePhoneNumber_OrdinalNumber();

  AAddressPhoneNumber_ to_PhoneNumber();

  AAddressPhoneNumber_ to_PhoneNumber(Function<AAddressPhoneNumber_, CqnPredicate> filter);

  ElementRef<String> to_PhoneNumber_AddressID();

  ElementRef<String> to_PhoneNumber_Person();

  ElementRef<String> to_PhoneNumber_OrdinalNumber();

  AAddressHomePageURL_ to_URLAddress();

  AAddressHomePageURL_ to_URLAddress(Function<AAddressHomePageURL_, CqnPredicate> filter);

  ElementRef<String> to_URLAddress_AddressID();

  ElementRef<String> to_URLAddress_Person();

  ElementRef<String> to_URLAddress_OrdinalNumber();

  ElementRef<LocalDate> to_URLAddress_ValidityStartDate();

  ElementRef<Boolean> to_URLAddress_IsDefaultURLAddress();
}
