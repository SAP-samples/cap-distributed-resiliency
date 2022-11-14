package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import java.time.LocalDate;

@CdsName("API_BUSINESS_PARTNER.A_BPContactToFuncAndDept")
public interface ABPContactToFuncAndDept extends CdsData {
  String RELATIONSHIP_NUMBER = "RelationshipNumber";

  String BUSINESS_PARTNER_COMPANY = "BusinessPartnerCompany";

  String BUSINESS_PARTNER_PERSON = "BusinessPartnerPerson";

  String VALIDITY_END_DATE = "ValidityEndDate";

  String CONTACT_PERSON_FUNCTION = "ContactPersonFunction";

  String CONTACT_PERSON_DEPARTMENT = "ContactPersonDepartment";

  String PHONE_NUMBER = "PhoneNumber";

  String PHONE_NUMBER_EXTENSION = "PhoneNumberExtension";

  String FAX_NUMBER = "FaxNumber";

  String FAX_NUMBER_EXTENSION = "FaxNumberExtension";

  String EMAIL_ADDRESS = "EmailAddress";

  String RELATIONSHIP_CATEGORY = "RelationshipCategory";

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

  @CdsName(CONTACT_PERSON_FUNCTION)
  String getContactPersonFunction();

  @CdsName(CONTACT_PERSON_FUNCTION)
  void setContactPersonFunction(String contactPersonFunction);

  @CdsName(CONTACT_PERSON_DEPARTMENT)
  String getContactPersonDepartment();

  @CdsName(CONTACT_PERSON_DEPARTMENT)
  void setContactPersonDepartment(String contactPersonDepartment);

  @CdsName(PHONE_NUMBER)
  String getPhoneNumber();

  @CdsName(PHONE_NUMBER)
  void setPhoneNumber(String phoneNumber);

  @CdsName(PHONE_NUMBER_EXTENSION)
  String getPhoneNumberExtension();

  @CdsName(PHONE_NUMBER_EXTENSION)
  void setPhoneNumberExtension(String phoneNumberExtension);

  @CdsName(FAX_NUMBER)
  String getFaxNumber();

  @CdsName(FAX_NUMBER)
  void setFaxNumber(String faxNumber);

  @CdsName(FAX_NUMBER_EXTENSION)
  String getFaxNumberExtension();

  @CdsName(FAX_NUMBER_EXTENSION)
  void setFaxNumberExtension(String faxNumberExtension);

  @CdsName(EMAIL_ADDRESS)
  String getEmailAddress();

  @CdsName(EMAIL_ADDRESS)
  void setEmailAddress(String emailAddress);

  @CdsName(RELATIONSHIP_CATEGORY)
  String getRelationshipCategory();

  @CdsName(RELATIONSHIP_CATEGORY)
  void setRelationshipCategory(String relationshipCategory);

  ABPContactToFuncAndDept_ ref();

  static ABPContactToFuncAndDept create() {
    return Struct.create(ABPContactToFuncAndDept.class);
  }
}
