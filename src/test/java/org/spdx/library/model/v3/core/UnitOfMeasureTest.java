/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.core;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.spdx.core.CoreModelObject;
import org.spdx.core.DefaultModelStore;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.IndividualUriValue;
import org.spdx.library.model.v3.ModelObjectV3;
import org.spdx.storage.IModelStore;
import org.spdx.storage.IModelStore.IdType;
import org.spdx.storage.IModelStore.IModelStoreLock;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import junit.framework.TestCase;
import org.spdx.core.ModelRegistry;
import org.spdx.library.model.v3.MockCopyManager;
import org.spdx.library.model.v3.MockModelStore;
import org.spdx.library.model.v3.SpdxConstantsV3;
import org.spdx.library.model.v3.SpdxModelInfoV3_0;
import org.spdx.library.model.v3.TestValuesGenerator;
import org.spdx.library.model.v3.UnitTestHelper;
import org.spdx.library.model.v3.core.Agent.AgentBuilder;
import org.spdx.library.model.v3.core.UnitOfMeasure.UnitOfMeasureBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class UnitOfMeasureTest extends TestCase {

	static final String TEST_OBJECT_URI = "https://test.uri/testuri";
	
	TestValuesGenerator generator;
	
	protected void setUp() throws Exception {
		super.setUp();
		generator = new TestValuesGenerator(new MockModelStore(), new MockCopyManager());
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.UnitOfMeasure#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		UnitOfMeasure testUnitOfMeasure = generator.builderForUnitOfMeasureTests(TEST_OBJECT_URI).build();
		List<String> result = testUnitOfMeasure.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.UnitOfMeasure#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		UnitOfMeasure testUnitOfMeasure = generator.builderForUnitOfMeasureTests(TEST_OBJECT_URI).build();
		assertEquals("Core.UnitOfMeasure", testUnitOfMeasure.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.UnitOfMeasure#Element(org.spdx.library.model.v3.core.UnitOfMeasure.UnitOfMeasureBuilder)}.
	 */
	public void testUnitOfMeasureUnitOfMeasureBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForUnitOfMeasureTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		UnitOfMeasure testUnitOfMeasure = generator.builderForUnitOfMeasureTests(TEST_OBJECT_URI).build();
		UnitOfMeasure test2UnitOfMeasure = generator.builderForUnitOfMeasureTests("https://testObject2").build();
		assertTrue(testUnitOfMeasure.equivalent(test2UnitOfMeasure));
		assertTrue(test2UnitOfMeasure.equivalent(testUnitOfMeasure));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.UnitOfMeasure#setUnitQUDT}.
	 */
	public void testUnitOfMeasuresetUnitQUDT() throws InvalidSPDXAnalysisException {
		UnitOfMeasure testUnitOfMeasure = generator.builderForUnitOfMeasureTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.UNIT_Q_U_D_T_TEST_VALUE, testUnitOfMeasure.getUnitQUDT());
		String newStringValue = "new unitQUDT value";
		testUnitOfMeasure.setUnitQUDT(newStringValue);
		assertEquals(newStringValue, testUnitOfMeasure.getUnitQUDT());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.UnitOfMeasure#setQuantity}.
	 */
	public void testUnitOfMeasuresetQuantity() throws InvalidSPDXAnalysisException {
		UnitOfMeasure testUnitOfMeasure = generator.builderForUnitOfMeasureTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.QUANTITY_TEST_VALUE, testUnitOfMeasure.getQuantity());
		String newStringValue = "new quantity value";
		testUnitOfMeasure.setQuantity(newStringValue);
		assertEquals(newStringValue, testUnitOfMeasure.getQuantity());
	}
}
