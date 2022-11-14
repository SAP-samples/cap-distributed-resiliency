package cds.gen.my.bookshop;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;

@CdsName("my.bookshop.Books.texts")
public interface BooksTexts extends CdsData {
  String ID_TEXTS = "ID_texts";

  String LOCALE = "locale";

  String ID = "ID";

  String TITLE = "title";

  String DESCR = "descr";

  @CdsName(ID_TEXTS)
  String getIDTexts();

  @CdsName(ID_TEXTS)
  void setIDTexts(String iDTexts);

  String getLocale();

  void setLocale(String locale);

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  String getTitle();

  void setTitle(String title);

  String getDescr();

  void setDescr(String descr);

  BooksTexts_ ref();

  static BooksTexts create() {
    return Struct.create(BooksTexts.class);
  }
}
