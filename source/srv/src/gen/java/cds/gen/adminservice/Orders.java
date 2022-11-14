package cds.gen.adminservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Map;

@CdsName("AdminService.Orders")
public interface Orders extends CdsData {
  String ID = "ID";

  String CREATED_AT = "createdAt";

  String CREATED_BY = "createdBy";

  String MODIFIED_AT = "modifiedAt";

  String MODIFIED_BY = "modifiedBy";

  String ORDER_NO = "OrderNo";

  String ITEMS = "Items";

  String BUYER = "buyer";

  String TOTAL = "total";

  String CURRENCY = "currency";

  String CURRENCY_CODE = "currency_code";

  String SHIPPING_ADDRESS = "shippingAddress";

  String SHIPPING_ADDRESS_ID = "shippingAddress_ID";

  String SHIPPING_ADDRESS_BUSINESS_PARTNER = "shippingAddress_businessPartner";

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

  Instant getCreatedAt();

  void setCreatedAt(Instant createdAt);

  /**
   * Canonical user ID
   */
  String getCreatedBy();

  /**
   * Canonical user ID
   */
  void setCreatedBy(String createdBy);

  Instant getModifiedAt();

  void setModifiedAt(Instant modifiedAt);

  /**
   * Canonical user ID
   */
  String getModifiedBy();

  /**
   * Canonical user ID
   */
  void setModifiedBy(String modifiedBy);

  @CdsName(ORDER_NO)
  String getOrderNo();

  @CdsName(ORDER_NO)
  void setOrderNo(String orderNo);

  @CdsName(ITEMS)
  List<OrderItems> getItems();

  @CdsName(ITEMS)
  void setItems(List<? extends Map<String, ?>> items);

  /**
   * Canonical user ID
   */
  String getBuyer();

  /**
   * Canonical user ID
   */
  void setBuyer(String buyer);

  BigDecimal getTotal();

  void setTotal(BigDecimal total);

  Currencies getCurrency();

  void setCurrency(Map<String, ?> currency);

  @CdsName(CURRENCY_CODE)
  String getCurrencyCode();

  @CdsName(CURRENCY_CODE)
  void setCurrencyCode(String currencyCode);

  Addresses getShippingAddress();

  void setShippingAddress(Map<String, ?> shippingAddress);

  @CdsName(SHIPPING_ADDRESS_ID)
  String getShippingAddressId();

  @CdsName(SHIPPING_ADDRESS_ID)
  void setShippingAddressId(String shippingAddressId);

  @CdsName(SHIPPING_ADDRESS_BUSINESS_PARTNER)
  String getShippingAddressBusinessPartner();

  @CdsName(SHIPPING_ADDRESS_BUSINESS_PARTNER)
  void setShippingAddressBusinessPartner(String shippingAddressBusinessPartner);

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
  Orders getSiblingEntity();

  @CdsName(SIBLING_ENTITY)
  void setSiblingEntity(Map<String, ?> siblingEntity);

  Orders_ ref();

  static Orders create() {
    return Struct.create(Orders.class);
  }
}
