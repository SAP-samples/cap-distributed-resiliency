package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;

@CdsName("API_BUSINESS_PARTNER.A_AddressHomePageURL")
public interface AAddressHomePageURL extends CdsData {
  String ADDRESS_ID = "AddressID";

  String PERSON = "Person";

  String ORDINAL_NUMBER = "OrdinalNumber";

  String VALIDITY_START_DATE = "ValidityStartDate";

  String IS_DEFAULT_URLADDRESS = "IsDefaultURLAddress";

  String SEARCH_URLADDRESS = "SearchURLAddress";

  String ADDRESS_COMMUNICATION_REMARK_TEXT = "AddressCommunicationRemarkText";

  String URLFIELD_LENGTH = "URLFieldLength";

  String WEBSITE_URL = "WebsiteURL";

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

  @CdsName(VALIDITY_START_DATE)
  LocalDate getValidityStartDate();

  @CdsName(VALIDITY_START_DATE)
  void setValidityStartDate(LocalDate validityStartDate);

  @CdsName(IS_DEFAULT_URLADDRESS)
  Boolean getIsDefaultURLAddress();

  @CdsName(IS_DEFAULT_URLADDRESS)
  void setIsDefaultURLAddress(Boolean isDefaultURLAddress);

  @CdsName(SEARCH_URLADDRESS)
  String getSearchURLAddress();

  @CdsName(SEARCH_URLADDRESS)
  void setSearchURLAddress(String searchURLAddress);

  @CdsName(ADDRESS_COMMUNICATION_REMARK_TEXT)
  String getAddressCommunicationRemarkText();

  @CdsName(ADDRESS_COMMUNICATION_REMARK_TEXT)
  void setAddressCommunicationRemarkText(String addressCommunicationRemarkText);

  @CdsName(URLFIELD_LENGTH)
  Integer getURLFieldLength();

  @CdsName(URLFIELD_LENGTH)
  void setURLFieldLength(Integer uRLFieldLength);

  @CdsName(WEBSITE_URL)
  String getWebsiteURL();

  @CdsName(WEBSITE_URL)
  void setWebsiteURL(String websiteURL);

  AAddressHomePageURL_ ref();

  static AAddressHomePageURL create() {
    return Struct.create(AAddressHomePageURL.class);
  }
}
