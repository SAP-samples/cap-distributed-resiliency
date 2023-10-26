package com.msft.sap.test.performance.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sap.cds.Result;
import com.sap.cds.services.cds.CdsReadEventContext;
import com.sap.cds.services.cds.CqnService;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.On;
import com.sap.cds.services.handler.annotations.ServiceName;

import cds.gen.api_sales_order_srv.ApiSalesOrderSrv_;
import cds.gen.salesorderservice.SalesOrderService_;
import cds.gen.salesorderservice.SalesOrders_;

@Component
@ServiceName(SalesOrderService_.CDS_NAME)
public class SalesOrderServiceHandler implements EventHandler {
	
	@Autowired
	@Qualifier(ApiSalesOrderSrv_.CDS_NAME)
	CqnService sales;
    @On(entity = SalesOrders_.CDS_NAME)
	Result readSalesOrders(CdsReadEventContext context) {
	    return sales.run(context.getCqn());	
	}

}