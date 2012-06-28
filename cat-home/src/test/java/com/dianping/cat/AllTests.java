package com.dianping.cat;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.dianping.cat.report.graph.ValueTranslaterTest;
import com.dianping.cat.report.page.event.EventGraphDataTest;
import com.dianping.cat.report.page.heartbeat.HeartbeatGraphDataTest;
import com.dianping.cat.report.page.heartbeat.HeartbeatGraphTest;
import com.dianping.cat.report.page.ip.DisplayModelTest;
import com.dianping.cat.report.page.model.EventReportFilterTest;
import com.dianping.cat.report.page.model.TransactionReportFilterTest;
import com.dianping.cat.report.page.model.event.EventModelServiceTest;
import com.dianping.cat.report.page.model.transaction.TransactionModelServiceTest;
import com.dianping.cat.report.page.problem.ProblemGraphDataTest;
import com.dianping.cat.report.page.sql.TestComputeStr;
import com.dianping.cat.report.page.transaction.PayloadTest;
import com.dianping.cat.report.page.transaction.TransactionGraphDataTest;
import com.dianping.cat.report.page.transaction.TransactionReportMergerTest;
import com.dianping.cat.report.task.HistoryEventMergerTest;
import com.dianping.cat.report.task.HistoryTransactionMergerTest;
import com.dianping.cat.report.task.TaskConsumerTest;
import com.dianping.cat.report.task.TaskHelperTest;

@RunWith(Suite.class)
@SuiteClasses({

/* .report.page.model.event */
EventModelServiceTest.class, EventGraphDataTest.class,

/* .report.page.model.transaction */
TransactionModelServiceTest.class,

/* .report.page.transaction */
TransactionReportMergerTest.class,

/* .report.graph */
ValueTranslaterTest.class,

/* .report.page.ip */
DisplayModelTest.class,

/* .report.page.heartbeart */
HeartbeatGraphTest.class,

/* .report.page.model */
EventReportFilterTest.class, TransactionReportFilterTest.class,

/* .report.page.sql */
TestComputeStr.class,

/* . report.page.transcation */
PayloadTest.class, TransactionReportMergerTest.class,

/* graph test */
EventGraphDataTest.class, HeartbeatGraphDataTest.class,

ProblemGraphDataTest.class, TransactionGraphDataTest.class,

/* .report.task */
TaskConsumerTest.class, TaskHelperTest.class,

HistoryEventMergerTest.class, HistoryTransactionMergerTest.class,

ProblemGraphDataTest.class })
public class AllTests {

}
