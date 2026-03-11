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
import junit.framework.TestCase;
import org.spdx.core.ModelRegistry;
import org.spdx.library.model.v3.MockCopyManager;
import org.spdx.library.model.v3.MockModelStore;
import org.spdx.library.model.v3.SpdxConstantsV3;
import org.spdx.library.model.v3.SpdxModelInfoV3_0;
import org.spdx.library.model.v3.TestValuesGenerator;
import org.spdx.library.model.v3.UnitTestHelper;
import org.spdx.library.model.v3.core.Agent.AgentBuilder;
import org.spdx.library.model.v3.core.ExternalIdentifier.ExternalIdentifierBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ExternalIdentifierTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.core.ExternalIdentifier#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ExternalIdentifier testExternalIdentifier = generator.builderForExternalIdentifierTests(TEST_OBJECT_URI).build();
		List<String> result = testExternalIdentifier.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ExternalIdentifier#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ExternalIdentifier testExternalIdentifier = generator.builderForExternalIdentifierTests(TEST_OBJECT_URI).build();
		assertEquals("Core.ExternalIdentifier", testExternalIdentifier.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ExternalIdentifier#Element(org.spdx.library.model.v3.core.ExternalIdentifier.ExternalIdentifierBuilder)}.
	 */
	public void testExternalIdentifierExternalIdentifierBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForExternalIdentifierTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ExternalIdentifier testExternalIdentifier = generator.builderForExternalIdentifierTests(TEST_OBJECT_URI).build();
		ExternalIdentifier test2ExternalIdentifier = generator.builderForExternalIdentifierTests("https://testObject2").build();
		assertTrue(testExternalIdentifier.equivalent(test2ExternalIdentifier));
		assertTrue(test2ExternalIdentifier.equivalent(testExternalIdentifier));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ExternalIdentifier#setExternalIdentifierType}.
	 */
	public void testExternalIdentifiersetExternalIdentifierType() throws InvalidSPDXAnalysisException {
		ExternalIdentifier testExternalIdentifier = generator.builderForExternalIdentifierTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.EXTERNAL_IDENTIFIER_TYPE_TEST_VALUE1, testExternalIdentifier.getExternalIdentifierType());
		testExternalIdentifier.setExternalIdentifierType(TestValuesGenerator.EXTERNAL_IDENTIFIER_TYPE_TEST_VALUE2);
		assertEquals(TestValuesGenerator.EXTERNAL_IDENTIFIER_TYPE_TEST_VALUE2, testExternalIdentifier.getExternalIdentifierType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ExternalIdentifier#setIdentifier}.
	 */
	public void testExternalIdentifiersetIdentifier() throws InvalidSPDXAnalysisException {
		ExternalIdentifier testExternalIdentifier = generator.builderForExternalIdentifierTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.IDENTIFIER_TEST_VALUE, testExternalIdentifier.getIdentifier());
		String newStringValue = "new identifier value";
		testExternalIdentifier.setIdentifier(newStringValue);
		assertEquals(newStringValue, testExternalIdentifier.getIdentifier());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ExternalIdentifier#setIssuingAuthority}.
	 */
	public void testExternalIdentifiersetIssuingAuthority() throws InvalidSPDXAnalysisException {
		ExternalIdentifier testExternalIdentifier = generator.builderForExternalIdentifierTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ISSUING_AUTHORITY_TEST_VALUE), testExternalIdentifier.getIssuingAuthority());
		String newStringValue = "new issuingAuthority value";
		testExternalIdentifier.setIssuingAuthority(newStringValue);
		assertEquals(Optional.of(newStringValue), testExternalIdentifier.getIssuingAuthority());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ExternalIdentifier#setComment}.
	 */
	public void testExternalIdentifiersetComment() throws InvalidSPDXAnalysisException {
		ExternalIdentifier testExternalIdentifier = generator.builderForExternalIdentifierTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testExternalIdentifier.getComment());
		String newStringValue = "new comment value";
		testExternalIdentifier.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testExternalIdentifier.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ExternalIdentifier#getIdentifierLocators}.
	 */
	public void testExternalIdentifiergetIdentifierLocators() throws InvalidSPDXAnalysisException {
		ExternalIdentifier testExternalIdentifier = generator.builderForExternalIdentifierTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.IDENTIFIER_LOCATOR_TEST_LIST1, new ArrayList<>(testExternalIdentifier.getIdentifierLocators())));
		testExternalIdentifier.getIdentifierLocators().clear();
		testExternalIdentifier.getIdentifierLocators().addAll(TestValuesGenerator.IDENTIFIER_LOCATOR_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.IDENTIFIER_LOCATOR_TEST_LIST2, new ArrayList<>(testExternalIdentifier.getIdentifierLocators())));
	}
}
