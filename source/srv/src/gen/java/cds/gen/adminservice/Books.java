package cds.gen.adminservice;

import cds.gen.my.bookshop.Reviews;
import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Map;

@CdsName("AdminService.Books")
public interface Books extends CdsData {
  String ID = "ID";

  String CREATED_AT = "createdAt";

  String CREATED_BY = "createdBy";

  String MODIFIED_AT = "modifiedAt";

  String MODIFIED_BY = "modifiedBy";

  String TITLE = "title";

  String DESCR = "descr";

  String AUTHOR = "author";

  String AUTHOR_ID = "author_ID";

  String GENRE = "genre";

  String GENRE_ID = "genre_ID";

  String STOCK = "stock";

  String PRICE = "price";

  String CURRENCY = "currency";

  String CURRENCY_CODE = "currency_code";

  String RATING = "rating";

  String REVIEWS = "reviews";

  String IS_REVIEWABLE = "isReviewable";

  String TEXTS = "texts";

  String LOCALIZED = "localized";

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

  String getTitle();

  void setTitle(String title);

  String getDescr();

  void setDescr(String descr);

  Authors getAuthor();

  void setAuthor(Map<String, ?> author);

  @CdsName(AUTHOR_ID)
  String getAuthorId();

  @CdsName(AUTHOR_ID)
  void setAuthorId(String authorId);

  Genres getGenre();

  void setGenre(Map<String, ?> genre);

  @CdsName(GENRE_ID)
  Integer getGenreId();

  @CdsName(GENRE_ID)
  void setGenreId(Integer genreId);

  Integer getStock();

  void setStock(Integer stock);

  BigDecimal getPrice();

  void setPrice(BigDecimal price);

  Currencies getCurrency();

  void setCurrency(Map<String, ?> currency);

  @CdsName(CURRENCY_CODE)
  String getCurrencyCode();

  @CdsName(CURRENCY_CODE)
  void setCurrencyCode(String currencyCode);

  BigDecimal getRating();

  void setRating(BigDecimal rating);

  List<Reviews> getReviews();

  void setReviews(List<? extends Map<String, ?>> reviews);

  Boolean getIsReviewable();

  void setIsReviewable(Boolean isReviewable);

  List<BooksTexts> getTexts();

  void setTexts(List<? extends Map<String, ?>> texts);

  BooksTexts getLocalized();

  void setLocalized(Map<String, ?> localized);

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
  Books getSiblingEntity();

  @CdsName(SIBLING_ENTITY)
  void setSiblingEntity(Map<String, ?> siblingEntity);

  Books_ ref();

  static Books create() {
    return Struct.create(Books.class);
  }
}
