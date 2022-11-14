package cds.gen.catalogservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.time.Instant;
import java.util.Map;

@CdsName("CatalogService.Reviews")
public interface Reviews extends CdsData {
  String ID = "ID";

  String CREATED_AT = "createdAt";

  String CREATED_BY = "createdBy";

  String MODIFIED_AT = "modifiedAt";

  String MODIFIED_BY = "modifiedBy";

  String BOOK = "book";

  String BOOK_ID = "book_ID";

  String RATING = "rating";

  String TITLE = "title";

  String TEXT = "text";

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

  Books getBook();

  void setBook(Map<String, ?> book);

  @CdsName(BOOK_ID)
  String getBookId();

  @CdsName(BOOK_ID)
  void setBookId(String bookId);

  Integer getRating();

  void setRating(Integer rating);

  String getTitle();

  void setTitle(String title);

  String getText();

  void setText(String text);

  Reviews_ ref();

  static Reviews create() {
    return Struct.create(Reviews.class);
  }
}
