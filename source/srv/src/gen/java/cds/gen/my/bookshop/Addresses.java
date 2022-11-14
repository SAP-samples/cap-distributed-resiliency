package cds.gen.my.bookshop;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.String;

/**
 * Simplified view on external addresses, which in addition acts as a table to store replicated external address data.
 */
@CdsName("my.bookshop.Addresses")
public interface Addresses extends CdsData {
  String ID = "ID";

  String BUSINESS_PARTNER = "businessPartner";

  String COUNTRY = "country";

  String CITY = "city";

  String POSTAL_CODE = "postalCode";

  String STREET = "street";

  String HOUSE_NUMBER = "houseNumber";

  String TOMBSTONE = "tombstone";

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  String getBusinessPartner();

  void setBusinessPartner(String businessPartner);

  String getCountry();

  void setCountry(String country);

  String getCity();

  void setCity(String city);

  String getPostalCode();

  void setPostalCode(String postalCode);

  String getStreet();

  void setStreet(String street);

  String getHouseNumber();

  void setHouseNumber(String houseNumber);

  Boolean getTombstone();

  void setTombstone(Boolean tombstone);

  Addresses_ ref();

  static Addresses create() {
    return Struct.create(Addresses.class);
  }
}
