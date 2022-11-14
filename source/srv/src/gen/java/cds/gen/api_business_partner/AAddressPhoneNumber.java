package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.String;

@CdsName("API_BUSINESS_PARTNER.A_AddressPhoneNumber")
public interface AAddressPhoneNumber extends CdsData {
  String ADDRESS_ID = "AddressID";

  String PERSON = "Person";

  String ORDINAL_NUMBER = "OrdinalNumber";

  String DESTINATION_LOCATION_COUNTRY = "DestinationLocationCountry";

  String IS_DEFAULT_PHONE_NUMBER = "IsDefaultPhoneNumber";

  String PHONE_NUMBER = "PhoneNumber";

  String PHONE_NUMBER_EXTENSION = "PhoneNumberExtension";

  String INTERNATIONAL_PHONE_NUMBER = "InternationalPhoneNumber";

  String PHONE_NUMBER_TYPE = "PhoneNumberType";

  String ADDRESS_COMMUNICATION_REMARK_TEXT = "AddressCommunicationRemarkText";

  @CdsName(ADDRESS_ID)
  String getAddressID();

  @CdsName(ADDRESS_ID)
  void setAddressID(String addressID);

  @CdsName(PERSON)
  String getPerson();

  @CdsName(PERSON)
  void setPerson(String person);

  @CdsName(ORDINAL_NUMBER)
  String getOrdinalNumber();

  @CdsName(ORDINAL_NUMBER)
  void setOrdinalNumber(String ordinalNumber);

  @CdsName(DESTINATION_LOCATION_COUNTRY)
  String getDestinationLocationCountry();

  @CdsName(DESTINATION_LOCATION_COUNTRY)
  void setDestinationLocationCountry(String destinationLocationCountry);

  @CdsName(IS_DEFAULT_PHONE_NUMBER)
  Boolean getIsDefaultPhoneNumber();

  @CdsName(IS_DEFAULT_PHONE_NUMBER)
  void setIsDefaultPhoneNumber(Boolean isDefaultPhoneNumber);

  @CdsName(PHONE_NUMBER)
  String getPhoneNumber();

  @CdsName(PHONE_NUMBER)
  void setPhoneNumber(String phoneNumber);

  @CdsName(PHONE_NUMBER_EXTENSION)
  String getPhoneNumberExtension();

  @CdsName(PHONE_NUMBER_EXTENSION)
  void setPhoneNumberExtension(String phoneNumberExtension);

  @CdsName(INTERNATIONAL_PHONE_NUMBER)
  String getInternationalPhoneNumber();

  @CdsName(INTERNATIONAL_PHONE_NUMBER)
  void setInternationalPhoneNumber(String internationalPhoneNumber);

  @CdsName(PHONE_NUMBER_TYPE)
  String getPhoneNumberType();

  @CdsName(PHONE_NUMBER_TYPE)
  void setPhoneNumberType(String phoneNumberType);

  @CdsName(ADDRESS_COMMUNICATION_REMARK_TEXT)
  String getAddressCommunicationRemarkText();

  @CdsName(ADDRESS_COMMUNICATION_REMARK_TEXT)
  void setAddressCommunicationRemarkText(String addressCommunicationRemarkText);

  AAddressPhoneNumber_ ref();

  static AAddressPhoneNumber create() {
    return Struct.create(AAddressPhoneNumber.class);
  }
}
