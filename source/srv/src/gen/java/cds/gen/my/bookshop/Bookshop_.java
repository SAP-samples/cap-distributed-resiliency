package cds.gen.my.bookshop;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("my.bookshop")
public interface Bookshop_ {
  String CDS_NAME = "my.bookshop";

  Class<Orders_> ORDERS = Orders_.class;

  Class<Authors_> AUTHORS = Authors_.class;

  Class<Books_> BOOKS = Books_.class;

  Class<Addresses_> ADDRESSES = Addresses_.class;

  Class<BooksTexts_> BOOKS_TEXTS = BooksTexts_.class;

  Class<Genres_> GENRES = Genres_.class;

  Class<GenresTexts_> GENRES_TEXTS = GenresTexts_.class;

  Class<OrderItems_> ORDER_ITEMS = OrderItems_.class;

  Class<Reviews_> REVIEWS = Reviews_.class;

  Class<NoteableAddresses_> NOTEABLE_ADDRESSES = NoteableAddresses_.class;

  Class<Notes_> NOTES = Notes_.class;
}
