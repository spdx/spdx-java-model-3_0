/**
 * SPDX-FileCopyrightText: Copyright (c) 2025 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_0_1.core;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.spdx.core.CoreModelObject;
import org.spdx.core.DefaultModelStore;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.IndividualUriValue;
import org.spdx.library.model.v3_0_1.ModelObjectV3;
import org.spdx.storage.IModelStore;
import org.spdx.storage.IModelStore.IdType;
import org.spdx.storage.IModelStore.IModelStoreLock;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import junit.framework.TestCase;
import org.spdx.core.ModelRegistry;
import org.spdx.library.model.v3_0_1.MockCopyManager;
import org.spdx.library.model.v3_0_1.MockModelStore;
import org.spdx.library.model.v3_0_1.SpdxConstantsV3;
import org.spdx.library.model.v3_0_1.SpdxModelInfoV3_0;
import org.spdx.library.model.v3_0_1.TestValuesGenerator;
import org.spdx.library.model.v3_0_1.UnitTestHelper;
import org.spdx.library.model.v3_0_1.core.Agent.AgentBuilder;
import org.spdx.library.model.v3_0_1.core.NamespaceMap.NamespaceMapBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class NamespaceMapTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.NamespaceMap#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		NamespaceMap testNamespaceMap = generator.builderForNamespaceMapTests(TEST_OBJECT_URI).build();
		List<String> result = testNamespaceMap.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.NamespaceMap#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		NamespaceMap testNamespaceMap = generator.builderForNamespaceMapTests(TEST_OBJECT_URI).build();
		assertEquals("Core.NamespaceMap", testNamespaceMap.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.NamespaceMap#Element(org.spdx.library.model.v3_0_1.core.NamespaceMap.NamespaceMapBuilder)}.
	 */
	public void testNamespaceMapNamespaceMapBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForNamespaceMapTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		NamespaceMap testNamespaceMap = generator.builderForNamespaceMapTests(TEST_OBJECT_URI).build();
		NamespaceMap test2NamespaceMap = generator.builderForNamespaceMapTests("https://testObject2").build();
		assertTrue(testNamespaceMap.equivalent(test2NamespaceMap));
		assertTrue(test2NamespaceMap.equivalent(testNamespaceMap));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.NamespaceMap#setPrefix}.
	 */
	public void testNamespaceMapsetPrefix() throws InvalidSPDXAnalysisException {
		NamespaceMap testNamespaceMap = generator.builderForNamespaceMapTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PREFIX_TEST_VALUE, testNamespaceMap.getPrefix());
		String newStringValue = "new prefix value";
		testNamespaceMap.setPrefix(newStringValue);
		assertEquals(newStringValue, testNamespaceMap.getPrefix());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.NamespaceMap#setNamespace}.
	 */
	public void testNamespaceMapsetNamespace() throws InvalidSPDXAnalysisException {
		NamespaceMap testNamespaceMap = generator.builderForNamespaceMapTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.NAMESPACE_TEST_VALUE, testNamespaceMap.getNamespace());
		String newStringValue = "new namespace value";
		testNamespaceMap.setNamespace(newStringValue);
		assertEquals(newStringValue, testNamespaceMap.getNamespace());
	}
}
