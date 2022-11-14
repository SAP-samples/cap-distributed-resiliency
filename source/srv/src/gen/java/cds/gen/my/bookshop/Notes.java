package cds.gen.my.bookshop;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import java.util.Map;

@CdsName("my.bookshop.Notes")
public interface Notes extends CdsData {
  String ID = "ID";

  String NOTE = "note";

  String ADDRESS = "address";

  String ADDRESS_ID = "address_ID";

  String ADDRESS_BUSINESS_PARTNER = "address_businessPartner";

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  String getNote();

  void setNote(String note);

  NoteableAddresses getAddress();

  void setAddress(Map<String, ?> address);

  @CdsName(ADDRESS_ID)
  String getAddressId();

  @CdsName(ADDRESS_ID)
  void setAddressId(String addressId);

  @CdsName(ADDRESS_BUSINESS_PARTNER)
  String getAddressBusinessPartner();

  @CdsName(ADDRESS_BUSINESS_PARTNER)
  void setAddressBusinessPartner(String addressBusinessPartner);

  Notes_ ref();

  static Notes create() {
    return Struct.create(Notes.class);
  }
}
