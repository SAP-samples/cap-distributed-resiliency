package cds.gen.notesservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;

@CdsName("NotesService.Notes")
public interface Notes extends CdsData {
  String ID = "ID";

  String NOTE = "note";

  String ADDRESS = "address";

  String ADDRESS_ID = "address_ID";

  String ADDRESS_BUSINESS_PARTNER = "address_businessPartner";

  String IS_ACTIVE_ENTITY = "IsActiveEntity";

  String HAS_ACTIVE_ENTITY = "HasActiveEntity";

  String HAS_DRAFT_ENTITY = "HasDraftEntity";

  String DRAFT_ADMINISTRATIVE_DATA = "DraftAdministrativeData";

  String DRAFT_ADMINISTRATIVE_DATA_DRAFT_UUID = "DraftAdministrativeData_DraftUUID";

  String SIBLING_ENTITY = "SiblingEntity";

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  String getNote();

  void setNote(String note);

  Addresses getAddress();

  void setAddress(Map<String, ?> address);

  @CdsName(ADDRESS_ID)
  String getAddressId();

  @CdsName(ADDRESS_ID)
  void setAddressId(String addressId);

  @CdsName(ADDRESS_BUSINESS_PARTNER)
  String getAddressBusinessPartner();

  @CdsName(ADDRESS_BUSINESS_PARTNER)
  void setAddressBusinessPartner(String addressBusinessPartner);

  @CdsName(IS_ACTIVE_ENTITY)
  Boolean getIsActiveEntity();

  @CdsName(IS_ACTIVE_ENTITY)
  void setIsActiveEntity(Boolean isActiveEntity);

  @CdsName(HAS_ACTIVE_ENTITY)
  Boolean getHasActiveEntity();

  @CdsName(HAS_ACTIVE_ENTITY)
  void setHasActiveEntity(Boolean hasActiveEntity);

  @CdsName(HAS_DRAFT_ENTITY)
  Boolean getHasDraftEntity();

  @CdsName(HAS_DRAFT_ENTITY)
  void setHasDraftEntity(Boolean hasDraftEntity);

  @CdsName(DRAFT_ADMINISTRATIVE_DATA)
  DraftAdministrativeData getDraftAdministrativeData();

  @CdsName(DRAFT_ADMINISTRATIVE_DATA)
  void setDraftAdministrativeData(Map<String, ?> draftAdministrativeData);

  @CdsName(DRAFT_ADMINISTRATIVE_DATA_DRAFT_UUID)
  String getDraftAdministrativeDataDraftUUID();

  @CdsName(DRAFT_ADMINISTRATIVE_DATA_DRAFT_UUID)
  void setDraftAdministrativeDataDraftUUID(String draftAdministrativeDataDraftUUID);

  @CdsName(SIBLING_ENTITY)
  Notes getSiblingEntity();

  @CdsName(SIBLING_ENTITY)
  void setSiblingEntity(Map<String, ?> siblingEntity);

  Notes_ ref();

  static Notes create() {
    return Struct.create(Notes.class);
  }
}
