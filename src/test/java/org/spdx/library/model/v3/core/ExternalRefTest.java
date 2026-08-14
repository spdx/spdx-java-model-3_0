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
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Pattern;
import junit.framework.TestCase;
import org.spdx.core.ModelRegistry;
import org.spdx.library.model.v3.MockCopyManager;
import org.spdx.library.model.v3.MockModelStore;
import org.spdx.library.model.v3.SpdxConstantsV3;
import org.spdx.library.model.v3.TestValuesGenerator;
import org.spdx.library.model.v3.UnitTestHelper;
import org.spdx.library.model.v3.core.Agent.AgentBuilder;
import org.spdx.library.model.v3.core.ExternalRef.ExternalRefBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ExternalRefTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.core.ExternalRef#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ExternalRef testExternalRef = generator.builderForExternalRefTests(TEST_OBJECT_URI).build();
		List<String> result = testExternalRef.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ExternalRef#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ExternalRef testExternalRef = generator.builderForExternalRefTests(TEST_OBJECT_URI).build();
		assertEquals("Core.ExternalRef", testExternalRef.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ExternalRef#Element(org.spdx.library.model.v3.core.ExternalRef.ExternalRefBuilder)}.
	 */
	public void testExternalRefExternalRefBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForExternalRefTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ExternalRef testExternalRef = generator.builderForExternalRefTests(TEST_OBJECT_URI).build();
		ExternalRef test2ExternalRef = generator.builderForExternalRefTests("https://testObject2").build();
		assertTrue(testExternalRef.equivalent(test2ExternalRef));
		assertTrue(test2ExternalRef.equivalent(testExternalRef));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ExternalRef#setExternalRefType}.
	 */
	public void testExternalRefsetExternalRefType() throws InvalidSPDXAnalysisException {
		ExternalRef testExternalRef = generator.builderForExternalRefTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.EXTERNAL_REF_TYPE_TEST_VALUE1), testExternalRef.getExternalRefType());
		testExternalRef.setExternalRefType(TestValuesGenerator.EXTERNAL_REF_TYPE_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.EXTERNAL_REF_TYPE_TEST_VALUE2), testExternalRef.getExternalRefType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ExternalRef#setComment}.
	 */
	public void testExternalRefsetComment() throws InvalidSPDXAnalysisException {
		ExternalRef testExternalRef = generator.builderForExternalRefTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testExternalRef.getComment());
		String newStringValue = "new comment value";
		testExternalRef.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testExternalRef.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ExternalRef#setContentType}.
	 */
	public void testExternalRefsetContentType() throws InvalidSPDXAnalysisException {
		ExternalRef testExternalRef = generator.builderForExternalRefTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.CONTENT_TYPE_TEST_VALUE), testExternalRef.getContentType());
		String newStringValue = UnitTestHelper.genRandPattern("^[^\\/]+\\/[^\\/]+$");
		testExternalRef.setContentType(newStringValue);
		assertEquals(Optional.of(newStringValue), testExternalRef.getContentType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ExternalRef#getLocators}.
	 */
	public void testExternalRefgetLocators() throws InvalidSPDXAnalysisException {
		ExternalRef testExternalRef = generator.builderForExternalRefTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.LOCATOR_TEST_LIST1, new ArrayList<>(testExternalRef.getLocators())));
		testExternalRef.getLocators().clear();
		testExternalRef.getLocators().addAll(TestValuesGenerator.LOCATOR_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.LOCATOR_TEST_LIST2, new ArrayList<>(testExternalRef.getLocators())));
	}
}
