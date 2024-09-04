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
import org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship.EpssVulnAssessmentRelationshipBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class EpssVulnAssessmentRelationshipTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		List<String> result = testEpssVulnAssessmentRelationship.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals("Security.EpssVulnAssessmentRelationship", testEpssVulnAssessmentRelationship.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#Element(org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship.EpssVulnAssessmentRelationshipBuilder)}.
	 */
	public void testEpssVulnAssessmentRelationshipEpssVulnAssessmentRelationshipBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		EpssVulnAssessmentRelationship test2EpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests("https://testObject2").build();
		assertTrue(testEpssVulnAssessmentRelationship.equivalent(test2EpssVulnAssessmentRelationship));
		assertTrue(test2EpssVulnAssessmentRelationship.equivalent(testEpssVulnAssessmentRelationship));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#setFrom}.
	 */
	public void testEpssVulnAssessmentRelationshipsetFrom() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testEpssVulnAssessmentRelationship.getFrom());
//		testEpssVulnAssessmentRelationship.setFrom(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testEpssVulnAssessmentRelationship.getFrom());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#setCreationInfo}.
	 */
	public void testEpssVulnAssessmentRelationshipsetCreationInfo() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testEpssVulnAssessmentRelationship.getCreationInfo());
//		testEpssVulnAssessmentRelationship.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testEpssVulnAssessmentRelationship.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#setAssessedElement}.
	 */
	public void testEpssVulnAssessmentRelationshipsetAssessedElement() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testEpssVulnAssessmentRelationship.getAssessedElement());
//		testEpssVulnAssessmentRelationship.setAssessedElement(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testEpssVulnAssessmentRelationship.getAssessedElement());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#setSuppliedBy}.
	 */
	public void testEpssVulnAssessmentRelationshipsetSuppliedBy() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testEpssVulnAssessmentRelationship.getSuppliedBy());
//		testEpssVulnAssessmentRelationship.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testEpssVulnAssessmentRelationship.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#setCompleteness}.
	 */
	public void testEpssVulnAssessmentRelationshipsetCompleteness() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE1), testEpssVulnAssessmentRelationship.getCompleteness());
		testEpssVulnAssessmentRelationship.setCompleteness(TestValuesGenerator.COMPLETENESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE2), testEpssVulnAssessmentRelationship.getCompleteness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#setRelationshipType}.
	 */
	public void testEpssVulnAssessmentRelationshipsetRelationshipType() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE1, testEpssVulnAssessmentRelationship.getRelationshipType());
		testEpssVulnAssessmentRelationship.setRelationshipType(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2);
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2, testEpssVulnAssessmentRelationship.getRelationshipType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#setProbability}.
	 */
	public void testEpssVulnAssessmentRelationshipsetProbability() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROBABILITY_TEST_VALUE, testEpssVulnAssessmentRelationship.getProbability());
		testEpssVulnAssessmentRelationship.setProbability(new Integer(653));
		assertEquals(new Integer(653), testEpssVulnAssessmentRelationship.getProbability());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#setPercentile}.
	 */
	public void testEpssVulnAssessmentRelationshipsetPercentile() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PERCENTILE_TEST_VALUE, testEpssVulnAssessmentRelationship.getPercentile());
		testEpssVulnAssessmentRelationship.setPercentile(new Integer(653));
		assertEquals(new Integer(653), testEpssVulnAssessmentRelationship.getPercentile());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#setPublishedTime}.
	 */
	public void testEpssVulnAssessmentRelationshipsetPublishedTime() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PUBLISHED_TIME_TEST_VALUE), testEpssVulnAssessmentRelationship.getPublishedTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testEpssVulnAssessmentRelationship.setPublishedTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testEpssVulnAssessmentRelationship.getPublishedTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#setSummary}.
	 */
	public void testEpssVulnAssessmentRelationshipsetSummary() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testEpssVulnAssessmentRelationship.getSummary());
		String newStringValue = "new summary value";
		testEpssVulnAssessmentRelationship.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testEpssVulnAssessmentRelationship.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#setDescription}.
	 */
	public void testEpssVulnAssessmentRelationshipsetDescription() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testEpssVulnAssessmentRelationship.getDescription());
		String newStringValue = "new description value";
		testEpssVulnAssessmentRelationship.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testEpssVulnAssessmentRelationship.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#setEndTime}.
	 */
	public void testEpssVulnAssessmentRelationshipsetEndTime() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.END_TIME_TEST_VALUE), testEpssVulnAssessmentRelationship.getEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testEpssVulnAssessmentRelationship.setEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testEpssVulnAssessmentRelationship.getEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#setStartTime}.
	 */
	public void testEpssVulnAssessmentRelationshipsetStartTime() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.START_TIME_TEST_VALUE), testEpssVulnAssessmentRelationship.getStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testEpssVulnAssessmentRelationship.setStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testEpssVulnAssessmentRelationship.getStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#setWithdrawnTime}.
	 */
	public void testEpssVulnAssessmentRelationshipsetWithdrawnTime() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.WITHDRAWN_TIME_TEST_VALUE), testEpssVulnAssessmentRelationship.getWithdrawnTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testEpssVulnAssessmentRelationship.setWithdrawnTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testEpssVulnAssessmentRelationship.getWithdrawnTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#setComment}.
	 */
	public void testEpssVulnAssessmentRelationshipsetComment() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testEpssVulnAssessmentRelationship.getComment());
		String newStringValue = "new comment value";
		testEpssVulnAssessmentRelationship.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testEpssVulnAssessmentRelationship.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#setName}.
	 */
	public void testEpssVulnAssessmentRelationshipsetName() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testEpssVulnAssessmentRelationship.getName());
		String newStringValue = "new name value";
		testEpssVulnAssessmentRelationship.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testEpssVulnAssessmentRelationship.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#setModifiedTime}.
	 */
	public void testEpssVulnAssessmentRelationshipsetModifiedTime() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.MODIFIED_TIME_TEST_VALUE), testEpssVulnAssessmentRelationship.getModifiedTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testEpssVulnAssessmentRelationship.setModifiedTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testEpssVulnAssessmentRelationship.getModifiedTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#getExtension}.
	 */
	public void testEpssVulnAssessmentRelationshipgetExtensions() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testEpssVulnAssessmentRelationship.getExtensions())));
//		testEpssVulnAssessmentRelationship.getExtensions().clear();
//		testEpssVulnAssessmentRelationship.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testEpssVulnAssessmentRelationship.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#getVerifiedUsing}.
	 */
	public void testEpssVulnAssessmentRelationshipgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testEpssVulnAssessmentRelationship.getVerifiedUsings())));
//		testEpssVulnAssessmentRelationship.getVerifiedUsings().clear();
//		testEpssVulnAssessmentRelationship.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testEpssVulnAssessmentRelationship.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#getTo}.
	 */
	public void testEpssVulnAssessmentRelationshipgetTos() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testEpssVulnAssessmentRelationship.getTos())));
//		testEpssVulnAssessmentRelationship.getTos().clear();
//		testEpssVulnAssessmentRelationship.getTos().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testEpssVulnAssessmentRelationship.getTos())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#getExternalRef}.
	 */
	public void testEpssVulnAssessmentRelationshipgetExternalRefs() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testEpssVulnAssessmentRelationship.getExternalRefs())));
//		testEpssVulnAssessmentRelationship.getExternalRefs().clear();
//		testEpssVulnAssessmentRelationship.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testEpssVulnAssessmentRelationship.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship#getExternalIdentifier}.
	 */
	public void testEpssVulnAssessmentRelationshipgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationship testEpssVulnAssessmentRelationship = generator.builderForEpssVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testEpssVulnAssessmentRelationship.getExternalIdentifiers())));
//		testEpssVulnAssessmentRelationship.getExternalIdentifiers().clear();
//		testEpssVulnAssessmentRelationship.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testEpssVulnAssessmentRelationship.getExternalIdentifiers())));
		//TODO: Implement
	}
}