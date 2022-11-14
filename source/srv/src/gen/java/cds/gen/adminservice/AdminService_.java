package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("AdminService")
public interface AdminService_ {
  String CDS_NAME = "AdminService";

  Class<Languages_> LANGUAGES = Languages_.class;

  Class<LanguagesTexts_> LANGUAGES_TEXTS = LanguagesTexts_.class;

  Class<Addresses_> ADDRESSES = Addresses_.class;

  Class<BooksTexts_> BOOKS_TEXTS = BooksTexts_.class;

  Class<GenresTexts_> GENRES_TEXTS = GenresTexts_.class;

  Class<Genres_> GENRES = Genres_.class;

  Class<Currencies_> CURRENCIES = Currencies_.class;

  Class<Books_> BOOKS = Books_.class;

  Class<Upload_> UPLOAD = Upload_.class;

  Class<Authors_> AUTHORS = Authors_.class;

  Class<CurrenciesTexts_> CURRENCIES_TEXTS = CurrenciesTexts_.class;

  Class<Orders_> ORDERS = Orders_.class;

  Class<OrderItems_> ORDER_ITEMS = OrderItems_.class;

  Class<DraftAdministrativeData_> DRAFT_ADMINISTRATIVE_DATA = DraftAdministrativeData_.class;
}
