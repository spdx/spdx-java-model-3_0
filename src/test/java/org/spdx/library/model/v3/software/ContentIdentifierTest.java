/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.software;

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
import org.spdx.library.model.v3.core.IntegrityMethod;
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.software.ContentIdentifier.ContentIdentifierBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ContentIdentifierTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.software.ContentIdentifier#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ContentIdentifier testContentIdentifier = generator.builderForContentIdentifierTests(TEST_OBJECT_URI).build();
		List<String> result = testContentIdentifier.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.software.ContentIdentifier#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ContentIdentifier testContentIdentifier = generator.builderForContentIdentifierTests(TEST_OBJECT_URI).build();
		assertEquals("Software.ContentIdentifier", testContentIdentifier.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.software.ContentIdentifier#Element(org.spdx.library.model.v3.software.ContentIdentifier.ContentIdentifierBuilder)}.
	 */
	public void testContentIdentifierContentIdentifierBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForContentIdentifierTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ContentIdentifier testContentIdentifier = generator.builderForContentIdentifierTests(TEST_OBJECT_URI).build();
		ContentIdentifier test2ContentIdentifier = generator.builderForContentIdentifierTests("https://testObject2").build();
		assertTrue(testContentIdentifier.equivalent(test2ContentIdentifier));
		assertTrue(test2ContentIdentifier.equivalent(testContentIdentifier));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.software.ContentIdentifier#setContentIdentifierType}.
	 */
	public void testContentIdentifiersetContentIdentifierType() throws InvalidSPDXAnalysisException {
		ContentIdentifier testContentIdentifier = generator.builderForContentIdentifierTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.CONTENT_IDENTIFIER_TYPE_TEST_VALUE1, testContentIdentifier.getContentIdentifierType());
		testContentIdentifier.setContentIdentifierType(TestValuesGenerator.CONTENT_IDENTIFIER_TYPE_TEST_VALUE2);
		assertEquals(TestValuesGenerator.CONTENT_IDENTIFIER_TYPE_TEST_VALUE2, testContentIdentifier.getContentIdentifierType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.software.ContentIdentifier#setComment}.
	 */
	public void testContentIdentifiersetComment() throws InvalidSPDXAnalysisException {
		ContentIdentifier testContentIdentifier = generator.builderForContentIdentifierTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testContentIdentifier.getComment());
		String newStringValue = "new comment value";
		testContentIdentifier.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testContentIdentifier.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.software.ContentIdentifier#setContentIdentifierValue}.
	 */
	public void testContentIdentifiersetContentIdentifierValue() throws InvalidSPDXAnalysisException {
		ContentIdentifier testContentIdentifier = generator.builderForContentIdentifierTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.CONTENT_IDENTIFIER_VALUE_TEST_VALUE, testContentIdentifier.getContentIdentifierValue());
		String newStringValue = "new contentIdentifierValue value";
		testContentIdentifier.setContentIdentifierValue(newStringValue);
		assertEquals(newStringValue, testContentIdentifier.getContentIdentifierValue());
	}
}
