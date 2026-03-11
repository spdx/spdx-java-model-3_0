/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.extension;

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
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.extension.CdxPropertyEntry.CdxPropertyEntryBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class CdxPropertyEntryTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.extension.CdxPropertyEntry#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		CdxPropertyEntry testCdxPropertyEntry = generator.builderForCdxPropertyEntryTests(TEST_OBJECT_URI).build();
		List<String> result = testCdxPropertyEntry.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.extension.CdxPropertyEntry#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		CdxPropertyEntry testCdxPropertyEntry = generator.builderForCdxPropertyEntryTests(TEST_OBJECT_URI).build();
		assertEquals("Extension.CdxPropertyEntry", testCdxPropertyEntry.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.extension.CdxPropertyEntry#Element(org.spdx.library.model.v3.extension.CdxPropertyEntry.CdxPropertyEntryBuilder)}.
	 */
	public void testCdxPropertyEntryCdxPropertyEntryBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForCdxPropertyEntryTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		CdxPropertyEntry testCdxPropertyEntry = generator.builderForCdxPropertyEntryTests(TEST_OBJECT_URI).build();
		CdxPropertyEntry test2CdxPropertyEntry = generator.builderForCdxPropertyEntryTests("https://testObject2").build();
		assertTrue(testCdxPropertyEntry.equivalent(test2CdxPropertyEntry));
		assertTrue(test2CdxPropertyEntry.equivalent(testCdxPropertyEntry));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.extension.CdxPropertyEntry#setCdxPropValue}.
	 */
	public void testCdxPropertyEntrysetCdxPropValue() throws InvalidSPDXAnalysisException {
		CdxPropertyEntry testCdxPropertyEntry = generator.builderForCdxPropertyEntryTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.CDX_PROP_VALUE_TEST_VALUE), testCdxPropertyEntry.getCdxPropValue());
		String newStringValue = "new cdxPropValue value";
		testCdxPropertyEntry.setCdxPropValue(newStringValue);
		assertEquals(Optional.of(newStringValue), testCdxPropertyEntry.getCdxPropValue());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.extension.CdxPropertyEntry#setCdxPropName}.
	 */
	public void testCdxPropertyEntrysetCdxPropName() throws InvalidSPDXAnalysisException {
		CdxPropertyEntry testCdxPropertyEntry = generator.builderForCdxPropertyEntryTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.CDX_PROP_NAME_TEST_VALUE, testCdxPropertyEntry.getCdxPropName());
		String newStringValue = "new cdxPropName value";
		testCdxPropertyEntry.setCdxPropName(newStringValue);
		assertEquals(newStringValue, testCdxPropertyEntry.getCdxPropName());
	}
}
