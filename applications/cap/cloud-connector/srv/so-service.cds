using { API_SALES_ORDER_SRV as sales } from  '../srv/external/API_SALES_ORDER_SRV.cds';

service SalesOrderService {
    entity SalesOrders as projection on sales.A_SalesOrder;
}

annotate API_SALES_ORDER_SRV.FunctionResult {
  Boolean @cds.java.name: 'bool'
}