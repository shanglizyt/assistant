package com.assistant.model;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

public class CreatTables {
	@Test
	public void createTables(){
		new SchemaExport(new AnnotationConfiguration().configure()).create(true, true);
	}
}
