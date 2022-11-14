package cds.gen.catalogservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;

@CdsName("CatalogService.Genres.texts")
public interface GenresTexts extends CdsData {
  String LOCALE = "locale";

  String NAME = "name";

  String DESCR = "descr";

  String ID = "ID";

  String getLocale();

  void setLocale(String locale);

  String getName();

  void setName(String name);

  String getDescr();

  void setDescr(String descr);

  @CdsName(ID)
  Integer getId();

  @CdsName(ID)
  void setId(Integer id);

  GenresTexts_ ref();

  static GenresTexts create() {
    return Struct.create(GenresTexts.class);
  }
}
