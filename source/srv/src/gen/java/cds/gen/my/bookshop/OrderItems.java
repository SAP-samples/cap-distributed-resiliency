package cds.gen.my.bookshop;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Map;

@CdsName("my.bookshop.OrderItems")
public interface OrderItems extends CdsData {
  String ID = "ID";

  String PARENT = "parent";

  String PARENT_ID = "parent_ID";

  String BOOK = "book";

  String BOOK_ID = "book_ID";

  String QUANTITY = "quantity";

  String AMOUNT = "amount";

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  Orders getParent();

  void setParent(Map<String, ?> parent);

  @CdsName(PARENT_ID)
  String getParentId();

  @CdsName(PARENT_ID)
  void setParentId(String parentId);

  Books getBook();

  void setBook(Map<String, ?> book);

  @CdsName(BOOK_ID)
  String getBookId();

  @CdsName(BOOK_ID)
  void setBookId(String bookId);

  Integer getQuantity();

  void setQuantity(Integer quantity);

  BigDecimal getAmount();

  void setAmount(BigDecimal amount);

  OrderItems_ ref();

  static OrderItems create() {
    return Struct.create(OrderItems.class);
  }
}
