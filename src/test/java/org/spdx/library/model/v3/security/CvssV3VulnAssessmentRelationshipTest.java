/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.security;

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
import org.spdx.library.model.v3.core.Agent;
import org.spdx.library.model.v3.core.CreationInfo;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.ExternalIdentifier;
import org.spdx.library.model.v3.core.ExternalRef;
import org.spdx.library.model.v3.core.IntegrityMethod;
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.core.RelationshipCompleteness;
import org.spdx.library.model.v3.core.RelationshipType;
import org.spdx.library.model.v3.extension.Extension;
import org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship.CvssV3VulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3.software.SoftwareArtifact;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class CvssV3VulnAssessmentRelationshipTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		List<String> result = testCvssV3VulnAssessmentRelationship.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals("Security.CvssV3VulnAssessmentRelationship", testCvssV3VulnAssessmentRelationship.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#Element(org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship.CvssV3VulnAssessmentRelationshipBuilder)}.
	 */
	public void testCvssV3VulnAssessmentRelationshipCvssV3VulnAssessmentRelationshipBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		CvssV3VulnAssessmentRelationship test2CvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests("https://testObject2").build();
		assertTrue(testCvssV3VulnAssessmentRelationship.equivalent(test2CvssV3VulnAssessmentRelationship));
		assertTrue(test2CvssV3VulnAssessmentRelationship.equivalent(testCvssV3VulnAssessmentRelationship));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#setFrom}.
	 */
	public void testCvssV3VulnAssessmentRelationshipsetFrom() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testCvssV3VulnAssessmentRelationship.getFrom());
//		testCvssV3VulnAssessmentRelationship.setFrom(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testCvssV3VulnAssessmentRelationship.getFrom());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#setSecurityAssessedElement}.
	 */
	public void testCvssV3VulnAssessmentRelationshipsetSecurityAssessedElement() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testCvssV3VulnAssessmentRelationship.getSecurityAssessedElement());
//		testCvssV3VulnAssessmentRelationship.setSecurityAssessedElement(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testCvssV3VulnAssessmentRelationship.getSecurityAssessedElement());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#setSuppliedBy}.
	 */
	public void testCvssV3VulnAssessmentRelationshipsetSuppliedBy() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testCvssV3VulnAssessmentRelationship.getSuppliedBy());
//		testCvssV3VulnAssessmentRelationship.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testCvssV3VulnAssessmentRelationship.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#setCreationInfo}.
	 */
	public void testCvssV3VulnAssessmentRelationshipsetCreationInfo() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testCvssV3VulnAssessmentRelationship.getCreationInfo());
//		testCvssV3VulnAssessmentRelationship.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testCvssV3VulnAssessmentRelationship.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#setSeverity}.
	 */
	public void testCvssV3VulnAssessmentRelationshipsetSeverity() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.SEVERITY_TEST_VALUE1, testCvssV3VulnAssessmentRelationship.getSeverity());
		testCvssV3VulnAssessmentRelationship.setSeverity(TestValuesGenerator.SEVERITY_TEST_VALUE2);
		assertEquals(TestValuesGenerator.SEVERITY_TEST_VALUE2, testCvssV3VulnAssessmentRelationship.getSeverity());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#setCompleteness}.
	 */
	public void testCvssV3VulnAssessmentRelationshipsetCompleteness() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE1), testCvssV3VulnAssessmentRelationship.getCompleteness());
		testCvssV3VulnAssessmentRelationship.setCompleteness(TestValuesGenerator.COMPLETENESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE2), testCvssV3VulnAssessmentRelationship.getCompleteness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#setRelationshipType}.
	 */
	public void testCvssV3VulnAssessmentRelationshipsetRelationshipType() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE1, testCvssV3VulnAssessmentRelationship.getRelationshipType());
		testCvssV3VulnAssessmentRelationship.setRelationshipType(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2);
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2, testCvssV3VulnAssessmentRelationship.getRelationshipType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#setScore}.
	 */
	public void testCvssV3VulnAssessmentRelationshipsetScore() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.SCORE_TEST_VALUE, testCvssV3VulnAssessmentRelationship.getScore());
		testCvssV3VulnAssessmentRelationship.setScore(new Double(653.6));
		assertEquals(new Double(653.6), testCvssV3VulnAssessmentRelationship.getScore());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#setDescription}.
	 */
	public void testCvssV3VulnAssessmentRelationshipsetDescription() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testCvssV3VulnAssessmentRelationship.getDescription());
		String newStringValue = "new description value";
		testCvssV3VulnAssessmentRelationship.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV3VulnAssessmentRelationship.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#setPublishedTime}.
	 */
	public void testCvssV3VulnAssessmentRelationshipsetPublishedTime() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PUBLISHED_TIME_TEST_VALUE), testCvssV3VulnAssessmentRelationship.getPublishedTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCvssV3VulnAssessmentRelationship.setPublishedTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV3VulnAssessmentRelationship.getPublishedTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#setStartTime}.
	 */
	public void testCvssV3VulnAssessmentRelationshipsetStartTime() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.START_TIME_TEST_VALUE), testCvssV3VulnAssessmentRelationship.getStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCvssV3VulnAssessmentRelationship.setStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV3VulnAssessmentRelationship.getStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#setComment}.
	 */
	public void testCvssV3VulnAssessmentRelationshipsetComment() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testCvssV3VulnAssessmentRelationship.getComment());
		String newStringValue = "new comment value";
		testCvssV3VulnAssessmentRelationship.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV3VulnAssessmentRelationship.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#setEndTime}.
	 */
	public void testCvssV3VulnAssessmentRelationshipsetEndTime() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.END_TIME_TEST_VALUE), testCvssV3VulnAssessmentRelationship.getEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCvssV3VulnAssessmentRelationship.setEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV3VulnAssessmentRelationship.getEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#setModifiedTime}.
	 */
	public void testCvssV3VulnAssessmentRelationshipsetModifiedTime() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.MODIFIED_TIME_TEST_VALUE), testCvssV3VulnAssessmentRelationship.getModifiedTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCvssV3VulnAssessmentRelationship.setModifiedTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV3VulnAssessmentRelationship.getModifiedTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#setWithdrawnTime}.
	 */
	public void testCvssV3VulnAssessmentRelationshipsetWithdrawnTime() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.WITHDRAWN_TIME_TEST_VALUE), testCvssV3VulnAssessmentRelationship.getWithdrawnTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCvssV3VulnAssessmentRelationship.setWithdrawnTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV3VulnAssessmentRelationship.getWithdrawnTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#setVectorString}.
	 */
	public void testCvssV3VulnAssessmentRelationshipsetVectorString() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.VECTOR_STRING_TEST_VALUE, testCvssV3VulnAssessmentRelationship.getVectorString());
		String newStringValue = "new vectorString value";
		testCvssV3VulnAssessmentRelationship.setVectorString(newStringValue);
		assertEquals(newStringValue, testCvssV3VulnAssessmentRelationship.getVectorString());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#setName}.
	 */
	public void testCvssV3VulnAssessmentRelationshipsetName() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testCvssV3VulnAssessmentRelationship.getName());
		String newStringValue = "new name value";
		testCvssV3VulnAssessmentRelationship.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV3VulnAssessmentRelationship.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#setSummary}.
	 */
	public void testCvssV3VulnAssessmentRelationshipsetSummary() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testCvssV3VulnAssessmentRelationship.getSummary());
		String newStringValue = "new summary value";
		testCvssV3VulnAssessmentRelationship.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV3VulnAssessmentRelationship.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#getVerifiedUsing}.
	 */
	public void testCvssV3VulnAssessmentRelationshipgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCvssV3VulnAssessmentRelationship.getVerifiedUsings())));
//		testCvssV3VulnAssessmentRelationship.getVerifiedUsings().clear();
//		testCvssV3VulnAssessmentRelationship.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCvssV3VulnAssessmentRelationship.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#getExternalRef}.
	 */
	public void testCvssV3VulnAssessmentRelationshipgetExternalRefs() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCvssV3VulnAssessmentRelationship.getExternalRefs())));
//		testCvssV3VulnAssessmentRelationship.getExternalRefs().clear();
//		testCvssV3VulnAssessmentRelationship.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCvssV3VulnAssessmentRelationship.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#getExternalIdentifier}.
	 */
	public void testCvssV3VulnAssessmentRelationshipgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCvssV3VulnAssessmentRelationship.getExternalIdentifiers())));
//		testCvssV3VulnAssessmentRelationship.getExternalIdentifiers().clear();
//		testCvssV3VulnAssessmentRelationship.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCvssV3VulnAssessmentRelationship.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#getExtension}.
	 */
	public void testCvssV3VulnAssessmentRelationshipgetExtensions() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCvssV3VulnAssessmentRelationship.getExtensions())));
//		testCvssV3VulnAssessmentRelationship.getExtensions().clear();
//		testCvssV3VulnAssessmentRelationship.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCvssV3VulnAssessmentRelationship.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship#getTo}.
	 */
	public void testCvssV3VulnAssessmentRelationshipgetTos() throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationship testCvssV3VulnAssessmentRelationship = generator.builderForCvssV3VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCvssV3VulnAssessmentRelationship.getTos())));
//		testCvssV3VulnAssessmentRelationship.getTos().clear();
//		testCvssV3VulnAssessmentRelationship.getTos().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCvssV3VulnAssessmentRelationship.getTos())));
		//TODO: Implement
	}
}
