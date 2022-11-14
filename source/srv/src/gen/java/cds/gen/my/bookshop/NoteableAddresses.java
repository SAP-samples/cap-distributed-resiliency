package cds.gen.my.bookshop;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * Simplified view on external addresses, which is used as an association target in Notes.
 */
@CdsName("my.bookshop.NoteableAddresses")
public interface NoteableAddresses extends CdsData {
  String ID = "ID";

  String BUSINESS_PARTNER = "businessPartner";

  String COUNTRY = "country";

  String CITY = "city";

  String POSTAL_CODE = "postalCode";

  String STREET = "street";

  String HOUSE_NUMBER = "houseNumber";

  String NOTES = "notes";

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

  List<Notes> getNotes();

  void setNotes(List<? extends Map<String, ?>> notes);

  NoteableAddresses_ ref();

  static NoteableAddresses create() {
    return Struct.create(NoteableAddresses.class);
  }
}
