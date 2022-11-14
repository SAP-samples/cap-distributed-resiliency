package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.String;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@CdsName("API_BUSINESS_PARTNER.A_BusinessPartnerContact")
public interface ABusinessPartnerContact extends CdsData {
  String RELATIONSHIP_NUMBER = "RelationshipNumber";

  String BUSINESS_PARTNER_COMPANY = "BusinessPartnerCompany";

  String BUSINESS_PARTNER_PERSON = "BusinessPartnerPerson";

  String VALIDITY_END_DATE = "ValidityEndDate";

  String VALIDITY_START_DATE = "ValidityStartDate";

  String IS_STANDARD_RELATIONSHIP = "IsStandardRelationship";

  String RELATIONSHIP_CATEGORY = "RelationshipCategory";

  String TO_CONTACT_ADDRESS = "to_ContactAddress";

  String TO_CONTACT_ADDRESS_RELATIONSHIP_NUMBER = "to_ContactAddress_RelationshipNumber";

  String TO_CONTACT_ADDRESS_BUSINESS_PARTNER_COMPANY = "to_ContactAddress_BusinessPartnerCompany";

  String TO_CONTACT_ADDRESS_BUSINESS_PARTNER_PERSON = "to_ContactAddress_BusinessPartnerPerson";

  String TO_CONTACT_ADDRESS_VALIDITY_END_DATE = "to_ContactAddress_ValidityEndDate";

  String TO_CONTACT_ADDRESS_ADDRESS_ID = "to_ContactAddress_AddressID";

  String TO_CONTACT_RELATIONSHIP = "to_ContactRelationship";

  String TO_CONTACT_RELATIONSHIP_RELATIONSHIP_NUMBER = "to_ContactRelationship_RelationshipNumber";

  String TO_CONTACT_RELATIONSHIP_BUSINESS_PARTNER_COMPANY = "to_ContactRelationship_BusinessPartnerCompany";

  String TO_CONTACT_RELATIONSHIP_BUSINESS_PARTNER_PERSON = "to_ContactRelationship_BusinessPartnerPerson";

  String TO_CONTACT_RELATIONSHIP_VALIDITY_END_DATE = "to_ContactRelationship_ValidityEndDate";

  @CdsName(RELATIONSHIP_NUMBER)
  String getRelationshipNumber();

  @CdsName(RELATIONSHIP_NUMBER)
  void setRelationshipNumber(String relationshipNumber);

  @CdsName(BUSINESS_PARTNER_COMPANY)
  String getBusinessPartnerCompany();

  @CdsName(BUSINESS_PARTNER_COMPANY)
  void setBusinessPartnerCompany(String businessPartnerCompany);

  @CdsName(BUSINESS_PARTNER_PERSON)
  String getBusinessPartnerPerson();

  @CdsName(BUSINESS_PARTNER_PERSON)
  void setBusinessPartnerPerson(String businessPartnerPerson);

  @CdsName(VALIDITY_END_DATE)
  LocalDate getValidityEndDate();

  @CdsName(VALIDITY_END_DATE)
  void setValidityEndDate(LocalDate validityEndDate);

  @CdsName(VALIDITY_START_DATE)
  LocalDate getValidityStartDate();

  @CdsName(VALIDITY_START_DATE)
  void setValidityStartDate(LocalDate validityStartDate);

  @CdsName(IS_STANDARD_RELATIONSHIP)
  Boolean getIsStandardRelationship();

  @CdsName(IS_STANDARD_RELATIONSHIP)
  void setIsStandardRelationship(Boolean isStandardRelationship);

  @CdsName(RELATIONSHIP_CATEGORY)
  String getRelationshipCategory();

  @CdsName(RELATIONSHIP_CATEGORY)
  void setRelationshipCategory(String relationshipCategory);

  @CdsName(TO_CONTACT_ADDRESS)
  List<ABPContactToAddress> getToContactAddress();

  @CdsName(TO_CONTACT_ADDRESS)
  void setToContactAddress(List<? extends Map<String, ?>> toContactAddress);

  @CdsName(TO_CONTACT_ADDRESS_RELATIONSHIP_NUMBER)
  String getToContactAddressRelationshipNumber();

  @CdsName(TO_CONTACT_ADDRESS_RELATIONSHIP_NUMBER)
  void setToContactAddressRelationshipNumber(String toContactAddressRelationshipNumber);

  @CdsName(TO_CONTACT_ADDRESS_BUSINESS_PARTNER_COMPANY)
  String getToContactAddressBusinessPartnerCompany();

  @CdsName(TO_CONTACT_ADDRESS_BUSINESS_PARTNER_COMPANY)
  void setToContactAddressBusinessPartnerCompany(String toContactAddressBusinessPartnerCompany);

  @CdsName(TO_CONTACT_ADDRESS_BUSINESS_PARTNER_PERSON)
  String getToContactAddressBusinessPartnerPerson();

  @CdsName(TO_CONTACT_ADDRESS_BUSINESS_PARTNER_PERSON)
  void setToContactAddressBusinessPartnerPerson(String toContactAddressBusinessPartnerPerson);

  @CdsName(TO_CONTACT_ADDRESS_VALIDITY_END_DATE)
  LocalDate getToContactAddressValidityEndDate();

  @CdsName(TO_CONTACT_ADDRESS_VALIDITY_END_DATE)
  void setToContactAddressValidityEndDate(LocalDate toContactAddressValidityEndDate);

  @CdsName(TO_CONTACT_ADDRESS_ADDRESS_ID)
  String getToContactAddressAddressID();

  @CdsName(TO_CONTACT_ADDRESS_ADDRESS_ID)
  void setToContactAddressAddressID(String toContactAddressAddressID);

  @CdsName(TO_CONTACT_RELATIONSHIP)
  ABPContactToFuncAndDept getToContactRelationship();

  @CdsName(TO_CONTACT_RELATIONSHIP)
  void setToContactRelationship(Map<String, ?> toContactRelationship);

  @CdsName(TO_CONTACT_RELATIONSHIP_RELATIONSHIP_NUMBER)
  String getToContactRelationshipRelationshipNumber();

  @CdsName(TO_CONTACT_RELATIONSHIP_RELATIONSHIP_NUMBER)
  void setToContactRelationshipRelationshipNumber(String toContactRelationshipRelationshipNumber);

  @CdsName(TO_CONTACT_RELATIONSHIP_BUSINESS_PARTNER_COMPANY)
  String getToContactRelationshipBusinessPartnerCompany();

  @CdsName(TO_CONTACT_RELATIONSHIP_BUSINESS_PARTNER_COMPANY)
  void setToContactRelationshipBusinessPartnerCompany(
      String toContactRelationshipBusinessPartnerCompany);

  @CdsName(TO_CONTACT_RELATIONSHIP_BUSINESS_PARTNER_PERSON)
  String getToContactRelationshipBusinessPartnerPerson();

  @CdsName(TO_CONTACT_RELATIONSHIP_BUSINESS_PARTNER_PERSON)
  void setToContactRelationshipBusinessPartnerPerson(
      String toContactRelationshipBusinessPartnerPerson);

  @CdsName(TO_CONTACT_RELATIONSHIP_VALIDITY_END_DATE)
  LocalDate getToContactRelationshipValidityEndDate();

  @CdsName(TO_CONTACT_RELATIONSHIP_VALIDITY_END_DATE)
  void setToContactRelationshipValidityEndDate(LocalDate toContactRelationshipValidityEndDate);

  ABusinessPartnerContact_ ref();

  static ABusinessPartnerContact create() {
    return Struct.create(ABusinessPartnerContact.class);
  }
}
