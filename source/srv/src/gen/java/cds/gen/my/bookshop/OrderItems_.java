package cds.gen.my.bookshop;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import java.util.function.Function;

@CdsName("my.bookshop.OrderItems")
public interface OrderItems_ extends StructuredType<OrderItems_> {
  String CDS_NAME = "my.bookshop.OrderItems";

  ElementRef<String> ID();

  Orders_ parent();

  Orders_ parent(Function<Orders_, CqnPredicate> filter);

  ElementRef<String> parent_ID();

  Books_ book();

  Books_ book(Function<Books_, CqnPredicate> filter);

  ElementRef<String> book_ID();

  ElementRef<Integer> quantity();

  ElementRef<BigDecimal> amount();
}
