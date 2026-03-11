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
import org.spdx.library.model.v3.core.DefinedType.DefinedTypeBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class DefinedTypeTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.core.DefinedType#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		DefinedType testDefinedType = generator.builderForDefinedTypeTests(TEST_OBJECT_URI).build();
		List<String> result = testDefinedType.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.DefinedType#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		DefinedType testDefinedType = generator.builderForDefinedTypeTests(TEST_OBJECT_URI).build();
		assertEquals("Core.DefinedType", testDefinedType.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.DefinedType#Element(org.spdx.library.model.v3.core.DefinedType.DefinedTypeBuilder)}.
	 */
	public void testDefinedTypeDefinedTypeBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForDefinedTypeTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		DefinedType testDefinedType = generator.builderForDefinedTypeTests(TEST_OBJECT_URI).build();
		DefinedType test2DefinedType = generator.builderForDefinedTypeTests("https://testObject2").build();
		assertTrue(testDefinedType.equivalent(test2DefinedType));
		assertTrue(test2DefinedType.equivalent(testDefinedType));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.DefinedType#setDefinitionSource}.
	 */
	public void testDefinedTypesetDefinitionSource() throws InvalidSPDXAnalysisException {
		DefinedType testDefinedType = generator.builderForDefinedTypeTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testDefinedType.getDefinitionSource());
//		testDefinedType.setDefinitionSource(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testDefinedType.getDefinitionSource());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.DefinedType#setTypeFromSource}.
	 */
	public void testDefinedTypesetTypeFromSource() throws InvalidSPDXAnalysisException {
		DefinedType testDefinedType = generator.builderForDefinedTypeTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.TYPE_FROM_SOURCE_TEST_VALUE, testDefinedType.getTypeFromSource());
		String newStringValue = "new typeFromSource value";
		testDefinedType.setTypeFromSource(newStringValue);
		assertEquals(newStringValue, testDefinedType.getTypeFromSource());
	}
}
