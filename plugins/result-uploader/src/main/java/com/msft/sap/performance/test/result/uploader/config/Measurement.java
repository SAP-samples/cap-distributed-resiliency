package com.msft.sap.performance.test.result.uploader.config;

public interface Measurement {
	interface Common {
		interface Tags {
			String REGION = "region";
			String TYPE = "type";
			String SUB_TYPE = "subType";
			String EXECUTION_DATE = "executionDate";
			String SCENARIO = "scenario";
			String SUB_SCENARIO = "subScenario";
			String USER_LOCATION = "userLocation";
			String CONNECTION_TYPE = "connectionType";
			String BTP_LOCATION = "btpLocation";
			String S4H_LOCATION = "s4hLocation";
			String SCC_LOCATION = "sccLocation";
		}
	}

	interface Request {
		String NAME = "requestsRaw";

		interface Tags {
			String REQUEST_NAME = "requestName";
			String RESULT_CODE = "responseCode";
			String ERROR_MSG = "errorMessage";
			String RESULT = "result";
			String THREAD_NAME = "threadName";
			String DATA_TYPE = "dataType";
		}

		interface Fields {
			String RESPONSE_TIME = "responseTime";
			String ERROR_COUNT = "errorCount";
			String REQUEST_COUNT = "count";
			String SENT_BYTES = "sentBytes";
			String RECEIVED_BYTES = "receivedBytes";
			String LATENCY = "latency";
			String CONNECT_TIME = "connectTime";
			String PROCESSING_TIME = "processingTime";
			String GRP_THREADS = "grpThreads";
			String ALL_THREADS = "allThreads";
		}
	}
	interface StartEnd {
		String NAME = "testStartEnd";
		interface Tags {
			String TYPE = "type";
		}
		interface Fields {
			String PLACEHOLDER = "placeholder";
		}
		interface Values {
			String FINISHED = "finished";
			String STARTED = "started";
		}
	}
}
