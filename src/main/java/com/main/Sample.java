package com.main;


import org.junit.Test;
import org.kie.api.io.ResourceType;
import org.kie.internal.KnowledgeBase;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.runtime.StatefulKnowledgeSession;

public class Sample  {
	
	
	@Test
	public void asd(){
	try {
		KnowledgeBase kbase = readKnowledgeBase();
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		ksession.startProcess("com.sample.bpmn", null);
	} catch (Throwable t) {
		t.printStackTrace();
  }
	}

private static KnowledgeBase readKnowledgeBase() throws Exception {
	KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
	kbuilder.add(ResourceFactory.newClassPathResource("sample.bpmn"), ResourceType.BPMN2);
	return kbuilder.newKnowledgeBase();
}
}
