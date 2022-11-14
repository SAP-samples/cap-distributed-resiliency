package cds.gen.adminservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * Hierarchically organized Code List for Genres
 */
@CdsName("AdminService.Genres")
public interface Genres extends CdsData {
  String NAME = "name";

  String DESCR = "descr";

  String ID = "ID";

  String PARENT = "parent";

  String PARENT_ID = "parent_ID";

  String CHILDREN = "children";

  String TEXTS = "texts";

  String LOCALIZED = "localized";

  String getName();

  void setName(String name);

  String getDescr();

  void setDescr(String descr);

  @CdsName(ID)
  Integer getId();

  @CdsName(ID)
  void setId(Integer id);

  Genres getParent();

  void setParent(Map<String, ?> parent);

  @CdsName(PARENT_ID)
  Integer getParentId();

  @CdsName(PARENT_ID)
  void setParentId(Integer parentId);

  List<Genres> getChildren();

  void setChildren(List<? extends Map<String, ?>> children);

  List<GenresTexts> getTexts();

  void setTexts(List<? extends Map<String, ?>> texts);

  GenresTexts getLocalized();

  void setLocalized(Map<String, ?> localized);

  Genres_ ref();

  static Genres create() {
    return Struct.create(Genres.class);
  }
}
