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
import org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship.SsvcVulnAssessmentRelationshipBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class SsvcVulnAssessmentRelationshipTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		List<String> result = testSsvcVulnAssessmentRelationship.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals("Security.SsvcVulnAssessmentRelationship", testSsvcVulnAssessmentRelationship.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#Element(org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship.SsvcVulnAssessmentRelationshipBuilder)}.
	 */
	public void testSsvcVulnAssessmentRelationshipSsvcVulnAssessmentRelationshipBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		SsvcVulnAssessmentRelationship test2SsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests("https://testObject2").build();
		assertTrue(testSsvcVulnAssessmentRelationship.equivalent(test2SsvcVulnAssessmentRelationship));
		assertTrue(test2SsvcVulnAssessmentRelationship.equivalent(testSsvcVulnAssessmentRelationship));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#setFrom}.
	 */
	public void testSsvcVulnAssessmentRelationshipsetFrom() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testSsvcVulnAssessmentRelationship.getFrom());
//		testSsvcVulnAssessmentRelationship.setFrom(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testSsvcVulnAssessmentRelationship.getFrom());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#setCreationInfo}.
	 */
	public void testSsvcVulnAssessmentRelationshipsetCreationInfo() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testSsvcVulnAssessmentRelationship.getCreationInfo());
//		testSsvcVulnAssessmentRelationship.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testSsvcVulnAssessmentRelationship.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#setAssessedElement}.
	 */
	public void testSsvcVulnAssessmentRelationshipsetAssessedElement() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testSsvcVulnAssessmentRelationship.getAssessedElement());
//		testSsvcVulnAssessmentRelationship.setAssessedElement(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testSsvcVulnAssessmentRelationship.getAssessedElement());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#setSuppliedBy}.
	 */
	public void testSsvcVulnAssessmentRelationshipsetSuppliedBy() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testSsvcVulnAssessmentRelationship.getSuppliedBy());
//		testSsvcVulnAssessmentRelationship.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testSsvcVulnAssessmentRelationship.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#setCompleteness}.
	 */
	public void testSsvcVulnAssessmentRelationshipsetCompleteness() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE1), testSsvcVulnAssessmentRelationship.getCompleteness());
		testSsvcVulnAssessmentRelationship.setCompleteness(TestValuesGenerator.COMPLETENESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE2), testSsvcVulnAssessmentRelationship.getCompleteness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#setDecisionType}.
	 */
	public void testSsvcVulnAssessmentRelationshipsetDecisionType() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.DECISION_TYPE_TEST_VALUE1, testSsvcVulnAssessmentRelationship.getDecisionType());
		testSsvcVulnAssessmentRelationship.setDecisionType(TestValuesGenerator.DECISION_TYPE_TEST_VALUE2);
		assertEquals(TestValuesGenerator.DECISION_TYPE_TEST_VALUE2, testSsvcVulnAssessmentRelationship.getDecisionType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#setRelationshipType}.
	 */
	public void testSsvcVulnAssessmentRelationshipsetRelationshipType() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE1, testSsvcVulnAssessmentRelationship.getRelationshipType());
		testSsvcVulnAssessmentRelationship.setRelationshipType(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2);
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2, testSsvcVulnAssessmentRelationship.getRelationshipType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#setPublishedTime}.
	 */
	public void testSsvcVulnAssessmentRelationshipsetPublishedTime() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PUBLISHED_TIME_TEST_VALUE), testSsvcVulnAssessmentRelationship.getPublishedTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testSsvcVulnAssessmentRelationship.setPublishedTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testSsvcVulnAssessmentRelationship.getPublishedTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#setSummary}.
	 */
	public void testSsvcVulnAssessmentRelationshipsetSummary() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testSsvcVulnAssessmentRelationship.getSummary());
		String newStringValue = "new summary value";
		testSsvcVulnAssessmentRelationship.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testSsvcVulnAssessmentRelationship.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#setDescription}.
	 */
	public void testSsvcVulnAssessmentRelationshipsetDescription() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testSsvcVulnAssessmentRelationship.getDescription());
		String newStringValue = "new description value";
		testSsvcVulnAssessmentRelationship.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testSsvcVulnAssessmentRelationship.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#setEndTime}.
	 */
	public void testSsvcVulnAssessmentRelationshipsetEndTime() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.END_TIME_TEST_VALUE), testSsvcVulnAssessmentRelationship.getEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testSsvcVulnAssessmentRelationship.setEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testSsvcVulnAssessmentRelationship.getEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#setStartTime}.
	 */
	public void testSsvcVulnAssessmentRelationshipsetStartTime() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.START_TIME_TEST_VALUE), testSsvcVulnAssessmentRelationship.getStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testSsvcVulnAssessmentRelationship.setStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testSsvcVulnAssessmentRelationship.getStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#setWithdrawnTime}.
	 */
	public void testSsvcVulnAssessmentRelationshipsetWithdrawnTime() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.WITHDRAWN_TIME_TEST_VALUE), testSsvcVulnAssessmentRelationship.getWithdrawnTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testSsvcVulnAssessmentRelationship.setWithdrawnTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testSsvcVulnAssessmentRelationship.getWithdrawnTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#setComment}.
	 */
	public void testSsvcVulnAssessmentRelationshipsetComment() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testSsvcVulnAssessmentRelationship.getComment());
		String newStringValue = "new comment value";
		testSsvcVulnAssessmentRelationship.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testSsvcVulnAssessmentRelationship.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#setName}.
	 */
	public void testSsvcVulnAssessmentRelationshipsetName() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testSsvcVulnAssessmentRelationship.getName());
		String newStringValue = "new name value";
		testSsvcVulnAssessmentRelationship.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testSsvcVulnAssessmentRelationship.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#setModifiedTime}.
	 */
	public void testSsvcVulnAssessmentRelationshipsetModifiedTime() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.MODIFIED_TIME_TEST_VALUE), testSsvcVulnAssessmentRelationship.getModifiedTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testSsvcVulnAssessmentRelationship.setModifiedTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testSsvcVulnAssessmentRelationship.getModifiedTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#getExtension}.
	 */
	public void testSsvcVulnAssessmentRelationshipgetExtensions() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSsvcVulnAssessmentRelationship.getExtensions())));
//		testSsvcVulnAssessmentRelationship.getExtensions().clear();
//		testSsvcVulnAssessmentRelationship.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSsvcVulnAssessmentRelationship.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#getVerifiedUsing}.
	 */
	public void testSsvcVulnAssessmentRelationshipgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSsvcVulnAssessmentRelationship.getVerifiedUsings())));
//		testSsvcVulnAssessmentRelationship.getVerifiedUsings().clear();
//		testSsvcVulnAssessmentRelationship.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSsvcVulnAssessmentRelationship.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#getTo}.
	 */
	public void testSsvcVulnAssessmentRelationshipgetTos() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSsvcVulnAssessmentRelationship.getTos())));
//		testSsvcVulnAssessmentRelationship.getTos().clear();
//		testSsvcVulnAssessmentRelationship.getTos().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSsvcVulnAssessmentRelationship.getTos())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#getExternalRef}.
	 */
	public void testSsvcVulnAssessmentRelationshipgetExternalRefs() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSsvcVulnAssessmentRelationship.getExternalRefs())));
//		testSsvcVulnAssessmentRelationship.getExternalRefs().clear();
//		testSsvcVulnAssessmentRelationship.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSsvcVulnAssessmentRelationship.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship#getExternalIdentifier}.
	 */
	public void testSsvcVulnAssessmentRelationshipgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationship testSsvcVulnAssessmentRelationship = generator.builderForSsvcVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSsvcVulnAssessmentRelationship.getExternalIdentifiers())));
//		testSsvcVulnAssessmentRelationship.getExternalIdentifiers().clear();
//		testSsvcVulnAssessmentRelationship.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSsvcVulnAssessmentRelationship.getExternalIdentifiers())));
		//TODO: Implement
	}
}