package cds.gen.cds.outbox;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("cds.outbox")
public interface Outbox_ {
  String CDS_NAME = "cds.outbox";

  Class<Messages_> MESSAGES = Messages_.class;
}
