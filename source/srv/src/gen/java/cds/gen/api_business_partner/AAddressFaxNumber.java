package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.String;

@CdsName("API_BUSINESS_PARTNER.A_AddressFaxNumber")
public interface AAddressFaxNumber extends CdsData {
  String ADDRESS_ID = "AddressID";

  String PERSON = "Person";

  String ORDINAL_NUMBER = "OrdinalNumber";

  String IS_DEFAULT_FAX_NUMBER = "IsDefaultFaxNumber";

  String FAX_COUNTRY = "FaxCountry";

  String FAX_NUMBER = "FaxNumber";

  String FAX_NUMBER_EXTENSION = "FaxNumberExtension";

  String INTERNATIONAL_FAX_NUMBER = "InternationalFaxNumber";

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

  @CdsName(IS_DEFAULT_FAX_NUMBER)
  Boolean getIsDefaultFaxNumber();

  @CdsName(IS_DEFAULT_FAX_NUMBER)
  void setIsDefaultFaxNumber(Boolean isDefaultFaxNumber);

  @CdsName(FAX_COUNTRY)
  String getFaxCountry();

  @CdsName(FAX_COUNTRY)
  void setFaxCountry(String faxCountry);

  @CdsName(FAX_NUMBER)
  String getFaxNumber();

  @CdsName(FAX_NUMBER)
  void setFaxNumber(String faxNumber);

  @CdsName(FAX_NUMBER_EXTENSION)
  String getFaxNumberExtension();

  @CdsName(FAX_NUMBER_EXTENSION)
  void setFaxNumberExtension(String faxNumberExtension);

  @CdsName(INTERNATIONAL_FAX_NUMBER)
  String getInternationalFaxNumber();

  @CdsName(INTERNATIONAL_FAX_NUMBER)
  void setInternationalFaxNumber(String internationalFaxNumber);

  @CdsName(ADDRESS_COMMUNICATION_REMARK_TEXT)
  String getAddressCommunicationRemarkText();

  @CdsName(ADDRESS_COMMUNICATION_REMARK_TEXT)
  void setAddressCommunicationRemarkText(String addressCommunicationRemarkText);

  AAddressFaxNumber_ ref();

  static AAddressFaxNumber create() {
    return Struct.create(AAddressFaxNumber.class);
  }
}
