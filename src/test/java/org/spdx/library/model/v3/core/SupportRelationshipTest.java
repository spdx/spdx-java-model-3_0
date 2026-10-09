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
import org.spdx.library.model.v3.core.CreationInfo;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.SupportRelationship.SupportRelationshipBuilder;
import org.spdx.library.model.v3.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class SupportRelationshipTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.core.SupportRelationship#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		SupportRelationship testSupportRelationship = generator.builderForSupportRelationshipTests(TEST_OBJECT_URI).build();
		List<String> result = testSupportRelationship.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.SupportRelationship#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		SupportRelationship testSupportRelationship = generator.builderForSupportRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals("Core.SupportRelationship", testSupportRelationship.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.SupportRelationship#Element(org.spdx.library.model.v3.core.SupportRelationship.SupportRelationshipBuilder)}.
	 */
	public void testSupportRelationshipSupportRelationshipBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForSupportRelationshipTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		SupportRelationship testSupportRelationship = generator.builderForSupportRelationshipTests(TEST_OBJECT_URI).build();
		SupportRelationship test2SupportRelationship = generator.builderForSupportRelationshipTests("https://testObject2").build();
		assertTrue(testSupportRelationship.equivalent(test2SupportRelationship));
		assertTrue(test2SupportRelationship.equivalent(testSupportRelationship));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.SupportRelationship#setFrom}.
	 */
	public void testSupportRelationshipsetFrom() throws InvalidSPDXAnalysisException {
		SupportRelationship testSupportRelationship = generator.builderForSupportRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testSupportRelationship.getFrom());
//		testSupportRelationship.setFrom(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testSupportRelationship.getFrom());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.SupportRelationship#setCreationInfo}.
	 */
	public void testSupportRelationshipsetCreationInfo() throws InvalidSPDXAnalysisException {
		SupportRelationship testSupportRelationship = generator.builderForSupportRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testSupportRelationship.getCreationInfo());
//		testSupportRelationship.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testSupportRelationship.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.SupportRelationship#setCompleteness}.
	 */
	public void testSupportRelationshipsetCompleteness() throws InvalidSPDXAnalysisException {
		SupportRelationship testSupportRelationship = generator.builderForSupportRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE1), testSupportRelationship.getCompleteness());
		testSupportRelationship.setCompleteness(TestValuesGenerator.COMPLETENESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE2), testSupportRelationship.getCompleteness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.SupportRelationship#setRelationshipType}.
	 */
	public void testSupportRelationshipsetRelationshipType() throws InvalidSPDXAnalysisException {
		SupportRelationship testSupportRelationship = generator.builderForSupportRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE1, testSupportRelationship.getRelationshipType());
		testSupportRelationship.setRelationshipType(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2);
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2, testSupportRelationship.getRelationshipType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.SupportRelationship#setSupportLevel}.
	 */
	public void testSupportRelationshipsetSupportLevel() throws InvalidSPDXAnalysisException {
		SupportRelationship testSupportRelationship = generator.builderForSupportRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.SUPPORT_LEVEL_TEST_VALUE1, testSupportRelationship.getSupportLevel());
		testSupportRelationship.setSupportLevel(TestValuesGenerator.SUPPORT_LEVEL_TEST_VALUE2);
		assertEquals(TestValuesGenerator.SUPPORT_LEVEL_TEST_VALUE2, testSupportRelationship.getSupportLevel());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.SupportRelationship#setDescription}.
	 */
	public void testSupportRelationshipsetDescription() throws InvalidSPDXAnalysisException {
		SupportRelationship testSupportRelationship = generator.builderForSupportRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testSupportRelationship.getDescription());
		String newStringValue = "new description value";
		testSupportRelationship.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testSupportRelationship.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.SupportRelationship#setStartTime}.
	 */
	public void testSupportRelationshipsetStartTime() throws InvalidSPDXAnalysisException {
		SupportRelationship testSupportRelationship = generator.builderForSupportRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.START_TIME_TEST_VALUE), testSupportRelationship.getStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testSupportRelationship.setStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testSupportRelationship.getStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.SupportRelationship#setComment}.
	 */
	public void testSupportRelationshipsetComment() throws InvalidSPDXAnalysisException {
		SupportRelationship testSupportRelationship = generator.builderForSupportRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testSupportRelationship.getComment());
		String newStringValue = "new comment value";
		testSupportRelationship.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testSupportRelationship.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.SupportRelationship#setEndTime}.
	 */
	public void testSupportRelationshipsetEndTime() throws InvalidSPDXAnalysisException {
		SupportRelationship testSupportRelationship = generator.builderForSupportRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.END_TIME_TEST_VALUE), testSupportRelationship.getEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testSupportRelationship.setEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testSupportRelationship.getEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.SupportRelationship#setName}.
	 */
	public void testSupportRelationshipsetName() throws InvalidSPDXAnalysisException {
		SupportRelationship testSupportRelationship = generator.builderForSupportRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testSupportRelationship.getName());
		String newStringValue = "new name value";
		testSupportRelationship.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testSupportRelationship.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.SupportRelationship#setSummary}.
	 */
	public void testSupportRelationshipsetSummary() throws InvalidSPDXAnalysisException {
		SupportRelationship testSupportRelationship = generator.builderForSupportRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testSupportRelationship.getSummary());
		String newStringValue = "new summary value";
		testSupportRelationship.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testSupportRelationship.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.SupportRelationship#getVerifiedUsing}.
	 */
	public void testSupportRelationshipgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		SupportRelationship testSupportRelationship = generator.builderForSupportRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSupportRelationship.getVerifiedUsings())));
//		testSupportRelationship.getVerifiedUsings().clear();
//		testSupportRelationship.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSupportRelationship.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.SupportRelationship#getExternalRef}.
	 */
	public void testSupportRelationshipgetExternalRefs() throws InvalidSPDXAnalysisException {
		SupportRelationship testSupportRelationship = generator.builderForSupportRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSupportRelationship.getExternalRefs())));
//		testSupportRelationship.getExternalRefs().clear();
//		testSupportRelationship.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSupportRelationship.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.SupportRelationship#getExternalIdentifier}.
	 */
	public void testSupportRelationshipgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		SupportRelationship testSupportRelationship = generator.builderForSupportRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSupportRelationship.getExternalIdentifiers())));
//		testSupportRelationship.getExternalIdentifiers().clear();
//		testSupportRelationship.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSupportRelationship.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.SupportRelationship#getExtension}.
	 */
	public void testSupportRelationshipgetExtensions() throws InvalidSPDXAnalysisException {
		SupportRelationship testSupportRelationship = generator.builderForSupportRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSupportRelationship.getExtensions())));
//		testSupportRelationship.getExtensions().clear();
//		testSupportRelationship.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSupportRelationship.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.SupportRelationship#getTo}.
	 */
	public void testSupportRelationshipgetTos() throws InvalidSPDXAnalysisException {
		SupportRelationship testSupportRelationship = generator.builderForSupportRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSupportRelationship.getTos())));
//		testSupportRelationship.getTos().clear();
//		testSupportRelationship.getTos().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSupportRelationship.getTos())));
		//TODO: Implement
	}
}
