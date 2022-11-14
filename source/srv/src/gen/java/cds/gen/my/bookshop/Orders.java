package cds.gen.my.bookshop;

import cds.gen.sap.common.Currencies;
import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Map;

@CdsName("my.bookshop.Orders")
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

  Orders_ ref();

  static Orders create() {
    return Struct.create(Orders.class);
  }
}
