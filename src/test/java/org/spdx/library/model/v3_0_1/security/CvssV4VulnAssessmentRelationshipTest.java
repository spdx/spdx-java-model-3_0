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
import org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship.CvssV4VulnAssessmentRelationshipBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class CvssV4VulnAssessmentRelationshipTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		List<String> result = testCvssV4VulnAssessmentRelationship.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals("Security.CvssV4VulnAssessmentRelationship", testCvssV4VulnAssessmentRelationship.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#Element(org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship.CvssV4VulnAssessmentRelationshipBuilder)}.
	 */
	public void testCvssV4VulnAssessmentRelationshipCvssV4VulnAssessmentRelationshipBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		CvssV4VulnAssessmentRelationship test2CvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests("https://testObject2").build();
		assertTrue(testCvssV4VulnAssessmentRelationship.equivalent(test2CvssV4VulnAssessmentRelationship));
		assertTrue(test2CvssV4VulnAssessmentRelationship.equivalent(testCvssV4VulnAssessmentRelationship));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#setFrom}.
	 */
	public void testCvssV4VulnAssessmentRelationshipsetFrom() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testCvssV4VulnAssessmentRelationship.getFrom());
//		testCvssV4VulnAssessmentRelationship.setFrom(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testCvssV4VulnAssessmentRelationship.getFrom());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#setCreationInfo}.
	 */
	public void testCvssV4VulnAssessmentRelationshipsetCreationInfo() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testCvssV4VulnAssessmentRelationship.getCreationInfo());
//		testCvssV4VulnAssessmentRelationship.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testCvssV4VulnAssessmentRelationship.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#setAssessedElement}.
	 */
	public void testCvssV4VulnAssessmentRelationshipsetAssessedElement() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testCvssV4VulnAssessmentRelationship.getAssessedElement());
//		testCvssV4VulnAssessmentRelationship.setAssessedElement(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testCvssV4VulnAssessmentRelationship.getAssessedElement());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#setSuppliedBy}.
	 */
	public void testCvssV4VulnAssessmentRelationshipsetSuppliedBy() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testCvssV4VulnAssessmentRelationship.getSuppliedBy());
//		testCvssV4VulnAssessmentRelationship.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testCvssV4VulnAssessmentRelationship.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#setSeverity}.
	 */
	public void testCvssV4VulnAssessmentRelationshipsetSeverity() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.SEVERITY_TEST_VALUE1, testCvssV4VulnAssessmentRelationship.getSeverity());
		testCvssV4VulnAssessmentRelationship.setSeverity(TestValuesGenerator.SEVERITY_TEST_VALUE2);
		assertEquals(TestValuesGenerator.SEVERITY_TEST_VALUE2, testCvssV4VulnAssessmentRelationship.getSeverity());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#setCompleteness}.
	 */
	public void testCvssV4VulnAssessmentRelationshipsetCompleteness() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE1), testCvssV4VulnAssessmentRelationship.getCompleteness());
		testCvssV4VulnAssessmentRelationship.setCompleteness(TestValuesGenerator.COMPLETENESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE2), testCvssV4VulnAssessmentRelationship.getCompleteness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#setRelationshipType}.
	 */
	public void testCvssV4VulnAssessmentRelationshipsetRelationshipType() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE1, testCvssV4VulnAssessmentRelationship.getRelationshipType());
		testCvssV4VulnAssessmentRelationship.setRelationshipType(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2);
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2, testCvssV4VulnAssessmentRelationship.getRelationshipType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#setScore}.
	 */
	public void testCvssV4VulnAssessmentRelationshipsetScore() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.SCORE_TEST_VALUE, testCvssV4VulnAssessmentRelationship.getScore());
		testCvssV4VulnAssessmentRelationship.setScore(new Integer(653));
		assertEquals(new Integer(653), testCvssV4VulnAssessmentRelationship.getScore());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#setVectorString}.
	 */
	public void testCvssV4VulnAssessmentRelationshipsetVectorString() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.VECTOR_STRING_TEST_VALUE, testCvssV4VulnAssessmentRelationship.getVectorString());
		String newStringValue = "new vectorString value";
		testCvssV4VulnAssessmentRelationship.setVectorString(newStringValue);
		assertEquals(newStringValue, testCvssV4VulnAssessmentRelationship.getVectorString());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#setPublishedTime}.
	 */
	public void testCvssV4VulnAssessmentRelationshipsetPublishedTime() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PUBLISHED_TIME_TEST_VALUE), testCvssV4VulnAssessmentRelationship.getPublishedTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCvssV4VulnAssessmentRelationship.setPublishedTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV4VulnAssessmentRelationship.getPublishedTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#setSummary}.
	 */
	public void testCvssV4VulnAssessmentRelationshipsetSummary() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testCvssV4VulnAssessmentRelationship.getSummary());
		String newStringValue = "new summary value";
		testCvssV4VulnAssessmentRelationship.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV4VulnAssessmentRelationship.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#setDescription}.
	 */
	public void testCvssV4VulnAssessmentRelationshipsetDescription() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testCvssV4VulnAssessmentRelationship.getDescription());
		String newStringValue = "new description value";
		testCvssV4VulnAssessmentRelationship.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV4VulnAssessmentRelationship.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#setEndTime}.
	 */
	public void testCvssV4VulnAssessmentRelationshipsetEndTime() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.END_TIME_TEST_VALUE), testCvssV4VulnAssessmentRelationship.getEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCvssV4VulnAssessmentRelationship.setEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV4VulnAssessmentRelationship.getEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#setStartTime}.
	 */
	public void testCvssV4VulnAssessmentRelationshipsetStartTime() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.START_TIME_TEST_VALUE), testCvssV4VulnAssessmentRelationship.getStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCvssV4VulnAssessmentRelationship.setStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV4VulnAssessmentRelationship.getStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#setWithdrawnTime}.
	 */
	public void testCvssV4VulnAssessmentRelationshipsetWithdrawnTime() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.WITHDRAWN_TIME_TEST_VALUE), testCvssV4VulnAssessmentRelationship.getWithdrawnTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCvssV4VulnAssessmentRelationship.setWithdrawnTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV4VulnAssessmentRelationship.getWithdrawnTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#setComment}.
	 */
	public void testCvssV4VulnAssessmentRelationshipsetComment() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testCvssV4VulnAssessmentRelationship.getComment());
		String newStringValue = "new comment value";
		testCvssV4VulnAssessmentRelationship.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV4VulnAssessmentRelationship.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#setName}.
	 */
	public void testCvssV4VulnAssessmentRelationshipsetName() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testCvssV4VulnAssessmentRelationship.getName());
		String newStringValue = "new name value";
		testCvssV4VulnAssessmentRelationship.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV4VulnAssessmentRelationship.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#setModifiedTime}.
	 */
	public void testCvssV4VulnAssessmentRelationshipsetModifiedTime() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.MODIFIED_TIME_TEST_VALUE), testCvssV4VulnAssessmentRelationship.getModifiedTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCvssV4VulnAssessmentRelationship.setModifiedTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCvssV4VulnAssessmentRelationship.getModifiedTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#getExtension}.
	 */
	public void testCvssV4VulnAssessmentRelationshipgetExtensions() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCvssV4VulnAssessmentRelationship.getExtensions())));
//		testCvssV4VulnAssessmentRelationship.getExtensions().clear();
//		testCvssV4VulnAssessmentRelationship.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCvssV4VulnAssessmentRelationship.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#getVerifiedUsing}.
	 */
	public void testCvssV4VulnAssessmentRelationshipgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCvssV4VulnAssessmentRelationship.getVerifiedUsings())));
//		testCvssV4VulnAssessmentRelationship.getVerifiedUsings().clear();
//		testCvssV4VulnAssessmentRelationship.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCvssV4VulnAssessmentRelationship.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#getTo}.
	 */
	public void testCvssV4VulnAssessmentRelationshipgetTos() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCvssV4VulnAssessmentRelationship.getTos())));
//		testCvssV4VulnAssessmentRelationship.getTos().clear();
//		testCvssV4VulnAssessmentRelationship.getTos().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCvssV4VulnAssessmentRelationship.getTos())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#getExternalRef}.
	 */
	public void testCvssV4VulnAssessmentRelationshipgetExternalRefs() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCvssV4VulnAssessmentRelationship.getExternalRefs())));
//		testCvssV4VulnAssessmentRelationship.getExternalRefs().clear();
//		testCvssV4VulnAssessmentRelationship.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCvssV4VulnAssessmentRelationship.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship#getExternalIdentifier}.
	 */
	public void testCvssV4VulnAssessmentRelationshipgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationship testCvssV4VulnAssessmentRelationship = generator.builderForCvssV4VulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCvssV4VulnAssessmentRelationship.getExternalIdentifiers())));
//		testCvssV4VulnAssessmentRelationship.getExternalIdentifiers().clear();
//		testCvssV4VulnAssessmentRelationship.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCvssV4VulnAssessmentRelationship.getExternalIdentifiers())));
		//TODO: Implement
	}
}