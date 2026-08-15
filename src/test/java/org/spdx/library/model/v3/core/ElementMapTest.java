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
import org.spdx.library.model.v3.TestValuesGenerator;
import org.spdx.library.model.v3.UnitTestHelper;
import org.spdx.library.model.v3.core.Agent.AgentBuilder;
import org.spdx.library.model.v3.core.ElementMap.ElementMapBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ElementMapTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.core.ElementMap#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ElementMap testElementMap = generator.builderForElementMapTests(TEST_OBJECT_URI).build();
		List<String> result = testElementMap.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ElementMap#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ElementMap testElementMap = generator.builderForElementMapTests(TEST_OBJECT_URI).build();
		assertEquals("Core.ElementMap", testElementMap.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ElementMap#Element(org.spdx.library.model.v3.core.ElementMap.ElementMapBuilder)}.
	 */
	public void testElementMapElementMapBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForElementMapTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ElementMap testElementMap = generator.builderForElementMapTests(TEST_OBJECT_URI).build();
		ElementMap test2ElementMap = generator.builderForElementMapTests("https://testObject2").build();
		assertTrue(testElementMap.equivalent(test2ElementMap));
		assertTrue(test2ElementMap.equivalent(testElementMap));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ElementMap#setElementValue}.
	 */
	public void testElementMapsetElementValue() throws InvalidSPDXAnalysisException {
		ElementMap testElementMap = generator.builderForElementMapTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testElementMap.getElementValue());
//		testElementMap.setElementValue(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testElementMap.getElementValue());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ElementMap#setKey}.
	 */
	public void testElementMapsetKey() throws InvalidSPDXAnalysisException {
		ElementMap testElementMap = generator.builderForElementMapTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.KEY_TEST_VALUE, testElementMap.getKey());
		String newStringValue = "new key value";
		testElementMap.setKey(newStringValue);
		assertEquals(newStringValue, testElementMap.getKey());
	}
}
