package cds.gen.catalogservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@CdsName("CatalogService.Authors")
public interface Authors extends CdsData {
  String ID = "ID";

  String CREATED_AT = "createdAt";

  String CREATED_BY = "createdBy";

  String MODIFIED_AT = "modifiedAt";

  String MODIFIED_BY = "modifiedBy";

  String NAME = "name";

  String DATE_OF_BIRTH = "dateOfBirth";

  String DATE_OF_DEATH = "dateOfDeath";

  String PLACE_OF_BIRTH = "placeOfBirth";

  String PLACE_OF_DEATH = "placeOfDeath";

  String BOOKS = "books";

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

  String getName();

  void setName(String name);

  LocalDate getDateOfBirth();

  void setDateOfBirth(LocalDate dateOfBirth);

  LocalDate getDateOfDeath();

  void setDateOfDeath(LocalDate dateOfDeath);

  String getPlaceOfBirth();

  void setPlaceOfBirth(String placeOfBirth);

  String getPlaceOfDeath();

  void setPlaceOfDeath(String placeOfDeath);

  List<Books> getBooks();

  void setBooks(List<? extends Map<String, ?>> books);

  Authors_ ref();

  static Authors create() {
    return Struct.create(Authors.class);
  }
}
