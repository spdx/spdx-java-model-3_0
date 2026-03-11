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
import org.spdx.library.model.v3.core.DictionaryEntry.DictionaryEntryBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class DictionaryEntryTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.core.DictionaryEntry#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		DictionaryEntry testDictionaryEntry = generator.builderForDictionaryEntryTests(TEST_OBJECT_URI).build();
		List<String> result = testDictionaryEntry.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.DictionaryEntry#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		DictionaryEntry testDictionaryEntry = generator.builderForDictionaryEntryTests(TEST_OBJECT_URI).build();
		assertEquals("Core.DictionaryEntry", testDictionaryEntry.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.DictionaryEntry#Element(org.spdx.library.model.v3.core.DictionaryEntry.DictionaryEntryBuilder)}.
	 */
	public void testDictionaryEntryDictionaryEntryBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForDictionaryEntryTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		DictionaryEntry testDictionaryEntry = generator.builderForDictionaryEntryTests(TEST_OBJECT_URI).build();
		DictionaryEntry test2DictionaryEntry = generator.builderForDictionaryEntryTests("https://testObject2").build();
		assertTrue(testDictionaryEntry.equivalent(test2DictionaryEntry));
		assertTrue(test2DictionaryEntry.equivalent(testDictionaryEntry));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.DictionaryEntry#setKey}.
	 */
	public void testDictionaryEntrysetKey() throws InvalidSPDXAnalysisException {
		DictionaryEntry testDictionaryEntry = generator.builderForDictionaryEntryTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.KEY_TEST_VALUE, testDictionaryEntry.getKey());
		String newStringValue = "new key value";
		testDictionaryEntry.setKey(newStringValue);
		assertEquals(newStringValue, testDictionaryEntry.getKey());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.DictionaryEntry#setValue}.
	 */
	public void testDictionaryEntrysetValue() throws InvalidSPDXAnalysisException {
		DictionaryEntry testDictionaryEntry = generator.builderForDictionaryEntryTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALUE_TEST_VALUE), testDictionaryEntry.getValue());
		String newStringValue = "new value value";
		testDictionaryEntry.setValue(newStringValue);
		assertEquals(Optional.of(newStringValue), testDictionaryEntry.getValue());
	}
}
