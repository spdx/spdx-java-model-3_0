/**
 * Copyright (c) 2024 Source Auditor Inc.
 *
 * SPDX-License-Identifier: Apache-2.0
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
 
package org.spdx.library.model.v3_0_1.security;

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
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Pattern;
import junit.framework.TestCase;
import org.spdx.core.ModelRegistry;
import org.spdx.library.model.v3_0_1.MockCopyManager;
import org.spdx.library.model.v3_0_1.MockModelStore;
import org.spdx.library.model.v3_0_1.SpdxConstantsV3;
import org.spdx.library.model.v3_0_1.SpdxModelInfoV3_0;
import org.spdx.library.model.v3_0_1.TestValuesGenerator;
import org.spdx.library.model.v3_0_1.UnitTestHelper;
import org.spdx.library.model.v3_0_1.core.Agent.AgentBuilder;
import org.spdx.library.model.v3_0_1.core.Agent;
import org.spdx.library.model.v3_0_1.core.CreationInfo;
import org.spdx.library.model.v3_0_1.core.Element;
import org.spdx.library.model.v3_0_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_0_1.core.ExternalRef;
import org.spdx.library.model.v3_0_1.core.IntegrityMethod;
import org.spdx.library.model.v3_0_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_0_1.core.RelationshipCompleteness;
import org.spdx.library.model.v3_0_1.core.RelationshipType;
import org.spdx.library.model.v3_0_1.extension.Extension;
import org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship.CvssV2VulnAssessmentRelationshipBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class CvssV2VulnAssessmentRelationshipTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		List<String> result = testCvssV2VulnAssessmentRelationship.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals("Security.CvssV2VulnAssessmentRelationship", testCvssV2VulnAssessmentRelationship.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#Element(org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship.CvssV2VulnAssessmentRelationshipBuilder)}.
	 */
	public void testCvssV2VulnAssessmentRelationshipCvssV2VulnAssessmentRelationshipBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		CvssV2VulnAssessmentRelationship test2CvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests("https://testObject2").build();
		assertTrue(testCvssV2VulnAssessmentRelationship.equivalent(test2CvssV2VulnAssessmentRelationship));
		assertTrue(test2CvssV2VulnAssessmentRelationship.equivalent(testCvssV2VulnAssessmentRelationship));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#setFrom}.
	 */
	public void testCvssV2VulnAssessmentRelationshipsetFrom() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testCvssV2VulnAssessmentRelationship.getFrom());
//		testCvssV2VulnAssessmentRelationship.setFrom(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testCvssV2VulnAssessmentRelationship.getFrom());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#setCreationInfo}.
	 */
	public void testCvssV2VulnAssessmentRelationshipsetCreationInfo() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testCvssV2VulnAssessmentRelationship.getCreationInfo());
//		testCvssV2VulnAssessmentRelationship.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testCvssV2VulnAssessmentRelationship.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#setAssessedElement}.
	 */
	public void testCvssV2VulnAssessmentRelationshipsetAssessedElement() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testCvssV2VulnAssessmentRelationship.getAssessedElement());
//		testCvssV2VulnAssessmentRelationship.setAssessedElement(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testCvssV2VulnAssessmentRelationship.getAssessedElement());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#setSuppliedBy}.
	 */
	public void testCvssV2VulnAssessmentRelationshipsetSuppliedBy() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testCvssV2VulnAssessmentRelationship.getSuppliedBy());
//		testCvssV2VulnAssessmentRelationship.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testCvssV2VulnAssessmentRelationship.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#setCompleteness}.
	 */
	public void testCvssV2VulnAssessmentRelationshipsetCompleteness() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE1), testCvssV2VulnAssessmentRelationship.getCompleteness());
		testCvssV2VulnAssessmentRelationship.setCompleteness(TestValuesGenerator.COMPLETENESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE2), testCvssV2VulnAssessmentRelationship.getCompleteness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#setRelationshipType}.
	 */
	public void testCvssV2VulnAssessmentRelationshipsetRelationshipType() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE1, testCvssV2VulnAssessmentRelationship.getRelationshipType());
		testCvssV2VulnAssessmentRelationship.setRelationshipType(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2);
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2, testCvssV2VulnAssessmentRelationship.getRelationshipType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#setScore}.
	 */
	public void testCvssV2VulnAssessmentRelationshipsetScore() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.SCORE_TEST_VALUE, testCvssV2VulnAssessmentRelationship.getScore());
		testCvssV2VulnAssessmentRelationship.setScore(new Integer(653));
		assertEquals(new Integer(653), testCvssV2VulnAssessmentRelationship.getScore());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#setVectorString}.
	 */
	public void testCvssV2VulnAssessmentRelationshipsetVectorString() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.VECTOR_STRING_TEST_VALUE, testCvssV2VulnAssessmentRelationship.getVectorString());
		String newStringValue = "new vectorString value";
		testCvssV2VulnAssessmentRelationship.setVectorString(newStringValue);
		assertEquals(newStringValue, testCvssV2VulnAssessmentRelationship.getVectorString());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#setPublishedTime}.
	 */
	public void testCvssV2VulnAssessmentRelationshipsetPublishedTime() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PUBLISHED_TIME_TEST_VALUE), testCvssV2VulnAssessmentRelationship.getPublishedTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCvssV2VulnAssessmentRelationship.setPublishedTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV2VulnAssessmentRelationship.getPublishedTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#setSummary}.
	 */
	public void testCvssV2VulnAssessmentRelationshipsetSummary() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testCvssV2VulnAssessmentRelationship.getSummary());
		String newStringValue = "new summary value";
		testCvssV2VulnAssessmentRelationship.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV2VulnAssessmentRelationship.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#setDescription}.
	 */
	public void testCvssV2VulnAssessmentRelationshipsetDescription() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testCvssV2VulnAssessmentRelationship.getDescription());
		String newStringValue = "new description value";
		testCvssV2VulnAssessmentRelationship.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV2VulnAssessmentRelationship.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#setEndTime}.
	 */
	public void testCvssV2VulnAssessmentRelationshipsetEndTime() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.END_TIME_TEST_VALUE), testCvssV2VulnAssessmentRelationship.getEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCvssV2VulnAssessmentRelationship.setEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV2VulnAssessmentRelationship.getEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#setStartTime}.
	 */
	public void testCvssV2VulnAssessmentRelationshipsetStartTime() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.START_TIME_TEST_VALUE), testCvssV2VulnAssessmentRelationship.getStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCvssV2VulnAssessmentRelationship.setStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV2VulnAssessmentRelationship.getStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#setWithdrawnTime}.
	 */
	public void testCvssV2VulnAssessmentRelationshipsetWithdrawnTime() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.WITHDRAWN_TIME_TEST_VALUE), testCvssV2VulnAssessmentRelationship.getWithdrawnTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCvssV2VulnAssessmentRelationship.setWithdrawnTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV2VulnAssessmentRelationship.getWithdrawnTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#setComment}.
	 */
	public void testCvssV2VulnAssessmentRelationshipsetComment() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testCvssV2VulnAssessmentRelationship.getComment());
		String newStringValue = "new comment value";
		testCvssV2VulnAssessmentRelationship.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV2VulnAssessmentRelationship.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#setName}.
	 */
	public void testCvssV2VulnAssessmentRelationshipsetName() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testCvssV2VulnAssessmentRelationship.getName());
		String newStringValue = "new name value";
		testCvssV2VulnAssessmentRelationship.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV2VulnAssessmentRelationship.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#setModifiedTime}.
	 */
	public void testCvssV2VulnAssessmentRelationshipsetModifiedTime() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.MODIFIED_TIME_TEST_VALUE), testCvssV2VulnAssessmentRelationship.getModifiedTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCvssV2VulnAssessmentRelationship.setModifiedTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV2VulnAssessmentRelationship.getModifiedTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#getExtension}.
	 */
	public void testCvssV2VulnAssessmentRelationshipgetExtensions() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCvssV2VulnAssessmentRelationship.getExtensions())));
//		testCvssV2VulnAssessmentRelationship.getExtensions().clear();
//		testCvssV2VulnAssessmentRelationship.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCvssV2VulnAssessmentRelationship.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#getVerifiedUsing}.
	 */
	public void testCvssV2VulnAssessmentRelationshipgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCvssV2VulnAssessmentRelationship.getVerifiedUsings())));
//		testCvssV2VulnAssessmentRelationship.getVerifiedUsings().clear();
//		testCvssV2VulnAssessmentRelationship.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCvssV2VulnAssessmentRelationship.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#getTo}.
	 */
	public void testCvssV2VulnAssessmentRelationshipgetTos() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCvssV2VulnAssessmentRelationship.getTos())));
//		testCvssV2VulnAssessmentRelationship.getTos().clear();
//		testCvssV2VulnAssessmentRelationship.getTos().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCvssV2VulnAssessmentRelationship.getTos())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#getExternalRef}.
	 */
	public void testCvssV2VulnAssessmentRelationshipgetExternalRefs() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCvssV2VulnAssessmentRelationship.getExternalRefs())));
//		testCvssV2VulnAssessmentRelationship.getExternalRefs().clear();
//		testCvssV2VulnAssessmentRelationship.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCvssV2VulnAssessmentRelationship.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship#getExternalIdentifier}.
	 */
	public void testCvssV2VulnAssessmentRelationshipgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationship testCvssV2VulnAssessmentRelationship = generator.builderForCvssV2VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCvssV2VulnAssessmentRelationship.getExternalIdentifiers())));
//		testCvssV2VulnAssessmentRelationship.getExternalIdentifiers().clear();
//		testCvssV2VulnAssessmentRelationship.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCvssV2VulnAssessmentRelationship.getExternalIdentifiers())));
		//TODO: Implement
	}
}