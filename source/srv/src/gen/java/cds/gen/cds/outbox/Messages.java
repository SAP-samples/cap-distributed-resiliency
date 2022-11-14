package cds.gen.cds.outbox;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.time.Instant;

@CdsName("cds.outbox.Messages")
public interface Messages extends CdsData {
  String ID = "ID";

  String TIMESTAMP = "timestamp";

  String TARGET = "target";

  String MSG = "msg";

  String ATTEMPTS = "attempts";

  String PARTITION = "partition";

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  Instant getTimestamp();

  void setTimestamp(Instant timestamp);

  String getTarget();

  void setTarget(String target);

  String getMsg();

  void setMsg(String msg);

  Integer getAttempts();

  void setAttempts(Integer attempts);

  Integer getPartition();

  void setPartition(Integer partition);

  Messages_ ref();

  static Messages create() {
    return Struct.create(Messages.class);
  }
}
