package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.String;

@CdsName("API_BUSINESS_PARTNER.A_AddressEmailAddress")
public interface AAddressEmailAddress extends CdsData {
  String ADDRESS_ID = "AddressID";

  String PERSON = "Person";

  String ORDINAL_NUMBER = "OrdinalNumber";

  String IS_DEFAULT_EMAIL_ADDRESS = "IsDefaultEmailAddress";

  String EMAIL_ADDRESS = "EmailAddress";

  String SEARCH_EMAIL_ADDRESS = "SearchEmailAddress";

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

  @CdsName(IS_DEFAULT_EMAIL_ADDRESS)
  Boolean getIsDefaultEmailAddress();

  @CdsName(IS_DEFAULT_EMAIL_ADDRESS)
  void setIsDefaultEmailAddress(Boolean isDefaultEmailAddress);

  @CdsName(EMAIL_ADDRESS)
  String getEmailAddress();

  @CdsName(EMAIL_ADDRESS)
  void setEmailAddress(String emailAddress);

  @CdsName(SEARCH_EMAIL_ADDRESS)
  String getSearchEmailAddress();

  @CdsName(SEARCH_EMAIL_ADDRESS)
  void setSearchEmailAddress(String searchEmailAddress);

  @CdsName(ADDRESS_COMMUNICATION_REMARK_TEXT)
  String getAddressCommunicationRemarkText();

  @CdsName(ADDRESS_COMMUNICATION_REMARK_TEXT)
  void setAddressCommunicationRemarkText(String addressCommunicationRemarkText);

  AAddressEmailAddress_ ref();

  static AAddressEmailAddress create() {
    return Struct.create(AAddressEmailAddress.class);
  }
}
