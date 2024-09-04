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
import org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship.VexFixedVulnAssessmentRelationshipBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class VexFixedVulnAssessmentRelationshipTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		List<String> result = testVexFixedVulnAssessmentRelationship.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals("Security.VexFixedVulnAssessmentRelationship", testVexFixedVulnAssessmentRelationship.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#Element(org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship.VexFixedVulnAssessmentRelationshipBuilder)}.
	 */
	public void testVexFixedVulnAssessmentRelationshipVexFixedVulnAssessmentRelationshipBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		VexFixedVulnAssessmentRelationship test2VexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests("https://testObject2").build();
		assertTrue(testVexFixedVulnAssessmentRelationship.equivalent(test2VexFixedVulnAssessmentRelationship));
		assertTrue(test2VexFixedVulnAssessmentRelationship.equivalent(testVexFixedVulnAssessmentRelationship));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#setFrom}.
	 */
	public void testVexFixedVulnAssessmentRelationshipsetFrom() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testVexFixedVulnAssessmentRelationship.getFrom());
//		testVexFixedVulnAssessmentRelationship.setFrom(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testVexFixedVulnAssessmentRelationship.getFrom());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#setCreationInfo}.
	 */
	public void testVexFixedVulnAssessmentRelationshipsetCreationInfo() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testVexFixedVulnAssessmentRelationship.getCreationInfo());
//		testVexFixedVulnAssessmentRelationship.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testVexFixedVulnAssessmentRelationship.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#setAssessedElement}.
	 */
	public void testVexFixedVulnAssessmentRelationshipsetAssessedElement() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testVexFixedVulnAssessmentRelationship.getAssessedElement());
//		testVexFixedVulnAssessmentRelationship.setAssessedElement(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testVexFixedVulnAssessmentRelationship.getAssessedElement());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#setSuppliedBy}.
	 */
	public void testVexFixedVulnAssessmentRelationshipsetSuppliedBy() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testVexFixedVulnAssessmentRelationship.getSuppliedBy());
//		testVexFixedVulnAssessmentRelationship.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testVexFixedVulnAssessmentRelationship.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#setCompleteness}.
	 */
	public void testVexFixedVulnAssessmentRelationshipsetCompleteness() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE1), testVexFixedVulnAssessmentRelationship.getCompleteness());
		testVexFixedVulnAssessmentRelationship.setCompleteness(TestValuesGenerator.COMPLETENESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE2), testVexFixedVulnAssessmentRelationship.getCompleteness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#setRelationshipType}.
	 */
	public void testVexFixedVulnAssessmentRelationshipsetRelationshipType() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE1, testVexFixedVulnAssessmentRelationship.getRelationshipType());
		testVexFixedVulnAssessmentRelationship.setRelationshipType(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2);
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2, testVexFixedVulnAssessmentRelationship.getRelationshipType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#setPublishedTime}.
	 */
	public void testVexFixedVulnAssessmentRelationshipsetPublishedTime() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PUBLISHED_TIME_TEST_VALUE), testVexFixedVulnAssessmentRelationship.getPublishedTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexFixedVulnAssessmentRelationship.setPublishedTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexFixedVulnAssessmentRelationship.getPublishedTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#setVexVersion}.
	 */
	public void testVexFixedVulnAssessmentRelationshipsetVexVersion() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VEX_VERSION_TEST_VALUE), testVexFixedVulnAssessmentRelationship.getVexVersion());
		String newStringValue = "new vexVersion value";
		testVexFixedVulnAssessmentRelationship.setVexVersion(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexFixedVulnAssessmentRelationship.getVexVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#setSummary}.
	 */
	public void testVexFixedVulnAssessmentRelationshipsetSummary() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testVexFixedVulnAssessmentRelationship.getSummary());
		String newStringValue = "new summary value";
		testVexFixedVulnAssessmentRelationship.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexFixedVulnAssessmentRelationship.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#setDescription}.
	 */
	public void testVexFixedVulnAssessmentRelationshipsetDescription() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testVexFixedVulnAssessmentRelationship.getDescription());
		String newStringValue = "new description value";
		testVexFixedVulnAssessmentRelationship.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexFixedVulnAssessmentRelationship.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#setEndTime}.
	 */
	public void testVexFixedVulnAssessmentRelationshipsetEndTime() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.END_TIME_TEST_VALUE), testVexFixedVulnAssessmentRelationship.getEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexFixedVulnAssessmentRelationship.setEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexFixedVulnAssessmentRelationship.getEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#setStatusNotes}.
	 */
	public void testVexFixedVulnAssessmentRelationshipsetStatusNotes() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.STATUS_NOTES_TEST_VALUE), testVexFixedVulnAssessmentRelationship.getStatusNotes());
		String newStringValue = "new statusNotes value";
		testVexFixedVulnAssessmentRelationship.setStatusNotes(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexFixedVulnAssessmentRelationship.getStatusNotes());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#setStartTime}.
	 */
	public void testVexFixedVulnAssessmentRelationshipsetStartTime() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.START_TIME_TEST_VALUE), testVexFixedVulnAssessmentRelationship.getStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexFixedVulnAssessmentRelationship.setStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexFixedVulnAssessmentRelationship.getStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#setWithdrawnTime}.
	 */
	public void testVexFixedVulnAssessmentRelationshipsetWithdrawnTime() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.WITHDRAWN_TIME_TEST_VALUE), testVexFixedVulnAssessmentRelationship.getWithdrawnTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexFixedVulnAssessmentRelationship.setWithdrawnTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexFixedVulnAssessmentRelationship.getWithdrawnTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#setComment}.
	 */
	public void testVexFixedVulnAssessmentRelationshipsetComment() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testVexFixedVulnAssessmentRelationship.getComment());
		String newStringValue = "new comment value";
		testVexFixedVulnAssessmentRelationship.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexFixedVulnAssessmentRelationship.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#setName}.
	 */
	public void testVexFixedVulnAssessmentRelationshipsetName() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testVexFixedVulnAssessmentRelationship.getName());
		String newStringValue = "new name value";
		testVexFixedVulnAssessmentRelationship.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexFixedVulnAssessmentRelationship.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#setModifiedTime}.
	 */
	public void testVexFixedVulnAssessmentRelationshipsetModifiedTime() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.MODIFIED_TIME_TEST_VALUE), testVexFixedVulnAssessmentRelationship.getModifiedTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexFixedVulnAssessmentRelationship.setModifiedTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexFixedVulnAssessmentRelationship.getModifiedTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#getExtension}.
	 */
	public void testVexFixedVulnAssessmentRelationshipgetExtensions() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVexFixedVulnAssessmentRelationship.getExtensions())));
//		testVexFixedVulnAssessmentRelationship.getExtensions().clear();
//		testVexFixedVulnAssessmentRelationship.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVexFixedVulnAssessmentRelationship.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#getVerifiedUsing}.
	 */
	public void testVexFixedVulnAssessmentRelationshipgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVexFixedVulnAssessmentRelationship.getVerifiedUsings())));
//		testVexFixedVulnAssessmentRelationship.getVerifiedUsings().clear();
//		testVexFixedVulnAssessmentRelationship.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVexFixedVulnAssessmentRelationship.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#getTo}.
	 */
	public void testVexFixedVulnAssessmentRelationshipgetTos() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVexFixedVulnAssessmentRelationship.getTos())));
//		testVexFixedVulnAssessmentRelationship.getTos().clear();
//		testVexFixedVulnAssessmentRelationship.getTos().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVexFixedVulnAssessmentRelationship.getTos())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#getExternalRef}.
	 */
	public void testVexFixedVulnAssessmentRelationshipgetExternalRefs() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVexFixedVulnAssessmentRelationship.getExternalRefs())));
//		testVexFixedVulnAssessmentRelationship.getExternalRefs().clear();
//		testVexFixedVulnAssessmentRelationship.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVexFixedVulnAssessmentRelationship.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship#getExternalIdentifier}.
	 */
	public void testVexFixedVulnAssessmentRelationshipgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationship testVexFixedVulnAssessmentRelationship = generator.builderForVexFixedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVexFixedVulnAssessmentRelationship.getExternalIdentifiers())));
//		testVexFixedVulnAssessmentRelationship.getExternalIdentifiers().clear();
//		testVexFixedVulnAssessmentRelationship.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVexFixedVulnAssessmentRelationship.getExternalIdentifiers())));
		//TODO: Implement
	}
}