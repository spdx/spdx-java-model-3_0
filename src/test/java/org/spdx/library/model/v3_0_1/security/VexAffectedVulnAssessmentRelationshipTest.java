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
import org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship.VexAffectedVulnAssessmentRelationshipBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class VexAffectedVulnAssessmentRelationshipTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		List<String> result = testVexAffectedVulnAssessmentRelationship.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals("Security.VexAffectedVulnAssessmentRelationship", testVexAffectedVulnAssessmentRelationship.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#Element(org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship.VexAffectedVulnAssessmentRelationshipBuilder)}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipVexAffectedVulnAssessmentRelationshipBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		VexAffectedVulnAssessmentRelationship test2VexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests("https://testObject2").build();
		assertTrue(testVexAffectedVulnAssessmentRelationship.equivalent(test2VexAffectedVulnAssessmentRelationship));
		assertTrue(test2VexAffectedVulnAssessmentRelationship.equivalent(testVexAffectedVulnAssessmentRelationship));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#setFrom}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipsetFrom() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testVexAffectedVulnAssessmentRelationship.getFrom());
//		testVexAffectedVulnAssessmentRelationship.setFrom(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testVexAffectedVulnAssessmentRelationship.getFrom());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#setCreationInfo}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipsetCreationInfo() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testVexAffectedVulnAssessmentRelationship.getCreationInfo());
//		testVexAffectedVulnAssessmentRelationship.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testVexAffectedVulnAssessmentRelationship.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#setAssessedElement}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipsetAssessedElement() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testVexAffectedVulnAssessmentRelationship.getAssessedElement());
//		testVexAffectedVulnAssessmentRelationship.setAssessedElement(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testVexAffectedVulnAssessmentRelationship.getAssessedElement());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#setSuppliedBy}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipsetSuppliedBy() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testVexAffectedVulnAssessmentRelationship.getSuppliedBy());
//		testVexAffectedVulnAssessmentRelationship.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testVexAffectedVulnAssessmentRelationship.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#setCompleteness}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipsetCompleteness() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE1), testVexAffectedVulnAssessmentRelationship.getCompleteness());
		testVexAffectedVulnAssessmentRelationship.setCompleteness(TestValuesGenerator.COMPLETENESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE2), testVexAffectedVulnAssessmentRelationship.getCompleteness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#setRelationshipType}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipsetRelationshipType() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE1, testVexAffectedVulnAssessmentRelationship.getRelationshipType());
		testVexAffectedVulnAssessmentRelationship.setRelationshipType(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2);
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2, testVexAffectedVulnAssessmentRelationship.getRelationshipType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#setPublishedTime}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipsetPublishedTime() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PUBLISHED_TIME_TEST_VALUE), testVexAffectedVulnAssessmentRelationship.getPublishedTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexAffectedVulnAssessmentRelationship.setPublishedTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexAffectedVulnAssessmentRelationship.getPublishedTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#setVexVersion}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipsetVexVersion() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VEX_VERSION_TEST_VALUE), testVexAffectedVulnAssessmentRelationship.getVexVersion());
		String newStringValue = "new vexVersion value";
		testVexAffectedVulnAssessmentRelationship.setVexVersion(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexAffectedVulnAssessmentRelationship.getVexVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#setSummary}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipsetSummary() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testVexAffectedVulnAssessmentRelationship.getSummary());
		String newStringValue = "new summary value";
		testVexAffectedVulnAssessmentRelationship.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexAffectedVulnAssessmentRelationship.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#setDescription}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipsetDescription() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testVexAffectedVulnAssessmentRelationship.getDescription());
		String newStringValue = "new description value";
		testVexAffectedVulnAssessmentRelationship.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexAffectedVulnAssessmentRelationship.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#setActionStatement}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipsetActionStatement() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_STATEMENT_TEST_VALUE), testVexAffectedVulnAssessmentRelationship.getActionStatement());
		String newStringValue = "new actionStatement value";
		testVexAffectedVulnAssessmentRelationship.setActionStatement(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexAffectedVulnAssessmentRelationship.getActionStatement());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#setEndTime}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipsetEndTime() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.END_TIME_TEST_VALUE), testVexAffectedVulnAssessmentRelationship.getEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexAffectedVulnAssessmentRelationship.setEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexAffectedVulnAssessmentRelationship.getEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#setStatusNotes}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipsetStatusNotes() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.STATUS_NOTES_TEST_VALUE), testVexAffectedVulnAssessmentRelationship.getStatusNotes());
		String newStringValue = "new statusNotes value";
		testVexAffectedVulnAssessmentRelationship.setStatusNotes(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexAffectedVulnAssessmentRelationship.getStatusNotes());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#setStartTime}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipsetStartTime() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.START_TIME_TEST_VALUE), testVexAffectedVulnAssessmentRelationship.getStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexAffectedVulnAssessmentRelationship.setStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexAffectedVulnAssessmentRelationship.getStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#setWithdrawnTime}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipsetWithdrawnTime() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.WITHDRAWN_TIME_TEST_VALUE), testVexAffectedVulnAssessmentRelationship.getWithdrawnTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexAffectedVulnAssessmentRelationship.setWithdrawnTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexAffectedVulnAssessmentRelationship.getWithdrawnTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#setComment}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipsetComment() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testVexAffectedVulnAssessmentRelationship.getComment());
		String newStringValue = "new comment value";
		testVexAffectedVulnAssessmentRelationship.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexAffectedVulnAssessmentRelationship.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#setName}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipsetName() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testVexAffectedVulnAssessmentRelationship.getName());
		String newStringValue = "new name value";
		testVexAffectedVulnAssessmentRelationship.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexAffectedVulnAssessmentRelationship.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#setModifiedTime}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipsetModifiedTime() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.MODIFIED_TIME_TEST_VALUE), testVexAffectedVulnAssessmentRelationship.getModifiedTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexAffectedVulnAssessmentRelationship.setModifiedTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexAffectedVulnAssessmentRelationship.getModifiedTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#getExtension}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipgetExtensions() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVexAffectedVulnAssessmentRelationship.getExtensions())));
//		testVexAffectedVulnAssessmentRelationship.getExtensions().clear();
//		testVexAffectedVulnAssessmentRelationship.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVexAffectedVulnAssessmentRelationship.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#getVerifiedUsing}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVexAffectedVulnAssessmentRelationship.getVerifiedUsings())));
//		testVexAffectedVulnAssessmentRelationship.getVerifiedUsings().clear();
//		testVexAffectedVulnAssessmentRelationship.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVexAffectedVulnAssessmentRelationship.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#getTo}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipgetTos() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVexAffectedVulnAssessmentRelationship.getTos())));
//		testVexAffectedVulnAssessmentRelationship.getTos().clear();
//		testVexAffectedVulnAssessmentRelationship.getTos().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVexAffectedVulnAssessmentRelationship.getTos())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#getExternalRef}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipgetExternalRefs() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVexAffectedVulnAssessmentRelationship.getExternalRefs())));
//		testVexAffectedVulnAssessmentRelationship.getExternalRefs().clear();
//		testVexAffectedVulnAssessmentRelationship.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVexAffectedVulnAssessmentRelationship.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#getExternalIdentifier}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVexAffectedVulnAssessmentRelationship.getExternalIdentifiers())));
//		testVexAffectedVulnAssessmentRelationship.getExternalIdentifiers().clear();
//		testVexAffectedVulnAssessmentRelationship.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVexAffectedVulnAssessmentRelationship.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship#getActionStatementTimes}.
	 */
	public void testVexAffectedVulnAssessmentRelationshipgetActionStatementTimes() throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationship testVexAffectedVulnAssessmentRelationship = generator.builderForVexAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ACTION_STATEMENT_TIME_TEST_LIST1, new ArrayList<>(testVexAffectedVulnAssessmentRelationship.getActionStatementTimes())));
		testVexAffectedVulnAssessmentRelationship.getActionStatementTimes().clear();
		testVexAffectedVulnAssessmentRelationship.getActionStatementTimes().addAll(TestValuesGenerator.ACTION_STATEMENT_TIME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ACTION_STATEMENT_TIME_TEST_LIST2, new ArrayList<>(testVexAffectedVulnAssessmentRelationship.getActionStatementTimes())));
	}
}