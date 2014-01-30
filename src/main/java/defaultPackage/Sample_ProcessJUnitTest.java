package defaultPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jbpm.process.instance.impl.demo.SystemOutWorkItemHandler;
import org.jbpm.test.JbpmJUnitTestCase;

import org.junit.Test;

import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.process.ProcessInstance;
import org.kie.api.task.TaskService;
import org.kie.api.task.model.TaskSummary;

public class Sample_ProcessJUnitTest extends JbpmJUnitTestCase {

	@Test
    public void testImplicit() {
        KieSession ksession = createKnowledgeSession("sample.bpmn");
        ProcessInstance processInstance = ksession.startProcess("com.sample.bpmn");
        // do your checks here
        // for example, assertProcessInstanceCompleted(processInstance.getId(), ksession);
    }

}