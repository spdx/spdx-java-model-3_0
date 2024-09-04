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
import org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship.VexNotAffectedVulnAssessmentRelationshipBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class VexNotAffectedVulnAssessmentRelationshipTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		List<String> result = testVexNotAffectedVulnAssessmentRelationship.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals("Security.VexNotAffectedVulnAssessmentRelationship", testVexNotAffectedVulnAssessmentRelationship.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#Element(org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship.VexNotAffectedVulnAssessmentRelationshipBuilder)}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipVexNotAffectedVulnAssessmentRelationshipBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		VexNotAffectedVulnAssessmentRelationship test2VexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests("https://testObject2").build();
		assertTrue(testVexNotAffectedVulnAssessmentRelationship.equivalent(test2VexNotAffectedVulnAssessmentRelationship));
		assertTrue(test2VexNotAffectedVulnAssessmentRelationship.equivalent(testVexNotAffectedVulnAssessmentRelationship));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#setCreationInfo}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipsetCreationInfo() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testVexNotAffectedVulnAssessmentRelationship.getCreationInfo());
//		testVexNotAffectedVulnAssessmentRelationship.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testVexNotAffectedVulnAssessmentRelationship.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#setSuppliedBy}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipsetSuppliedBy() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testVexNotAffectedVulnAssessmentRelationship.getSuppliedBy());
//		testVexNotAffectedVulnAssessmentRelationship.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testVexNotAffectedVulnAssessmentRelationship.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#setFrom}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipsetFrom() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testVexNotAffectedVulnAssessmentRelationship.getFrom());
//		testVexNotAffectedVulnAssessmentRelationship.setFrom(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testVexNotAffectedVulnAssessmentRelationship.getFrom());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#setAssessedElement}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipsetAssessedElement() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testVexNotAffectedVulnAssessmentRelationship.getAssessedElement());
//		testVexNotAffectedVulnAssessmentRelationship.setAssessedElement(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testVexNotAffectedVulnAssessmentRelationship.getAssessedElement());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#setRelationshipType}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipsetRelationshipType() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE1, testVexNotAffectedVulnAssessmentRelationship.getRelationshipType());
		testVexNotAffectedVulnAssessmentRelationship.setRelationshipType(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2);
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2, testVexNotAffectedVulnAssessmentRelationship.getRelationshipType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#setCompleteness}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipsetCompleteness() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE1), testVexNotAffectedVulnAssessmentRelationship.getCompleteness());
		testVexNotAffectedVulnAssessmentRelationship.setCompleteness(TestValuesGenerator.COMPLETENESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE2), testVexNotAffectedVulnAssessmentRelationship.getCompleteness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#setJustificationType}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipsetJustificationType() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.JUSTIFICATION_TYPE_TEST_VALUE1), testVexNotAffectedVulnAssessmentRelationship.getJustificationType());
		testVexNotAffectedVulnAssessmentRelationship.setJustificationType(TestValuesGenerator.JUSTIFICATION_TYPE_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.JUSTIFICATION_TYPE_TEST_VALUE2), testVexNotAffectedVulnAssessmentRelationship.getJustificationType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#setSummary}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipsetSummary() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testVexNotAffectedVulnAssessmentRelationship.getSummary());
		String newStringValue = "new summary value";
		testVexNotAffectedVulnAssessmentRelationship.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexNotAffectedVulnAssessmentRelationship.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#setWithdrawnTime}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipsetWithdrawnTime() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.WITHDRAWN_TIME_TEST_VALUE), testVexNotAffectedVulnAssessmentRelationship.getWithdrawnTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexNotAffectedVulnAssessmentRelationship.setWithdrawnTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexNotAffectedVulnAssessmentRelationship.getWithdrawnTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#setComment}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipsetComment() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testVexNotAffectedVulnAssessmentRelationship.getComment());
		String newStringValue = "new comment value";
		testVexNotAffectedVulnAssessmentRelationship.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexNotAffectedVulnAssessmentRelationship.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#setModifiedTime}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipsetModifiedTime() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.MODIFIED_TIME_TEST_VALUE), testVexNotAffectedVulnAssessmentRelationship.getModifiedTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexNotAffectedVulnAssessmentRelationship.setModifiedTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexNotAffectedVulnAssessmentRelationship.getModifiedTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#setPublishedTime}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipsetPublishedTime() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PUBLISHED_TIME_TEST_VALUE), testVexNotAffectedVulnAssessmentRelationship.getPublishedTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexNotAffectedVulnAssessmentRelationship.setPublishedTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexNotAffectedVulnAssessmentRelationship.getPublishedTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#setVexVersion}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipsetVexVersion() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VEX_VERSION_TEST_VALUE), testVexNotAffectedVulnAssessmentRelationship.getVexVersion());
		String newStringValue = "new vexVersion value";
		testVexNotAffectedVulnAssessmentRelationship.setVexVersion(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexNotAffectedVulnAssessmentRelationship.getVexVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#setImpactStatementTime}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipsetImpactStatementTime() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.IMPACT_STATEMENT_TIME_TEST_VALUE), testVexNotAffectedVulnAssessmentRelationship.getImpactStatementTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexNotAffectedVulnAssessmentRelationship.setImpactStatementTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexNotAffectedVulnAssessmentRelationship.getImpactStatementTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#setDescription}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipsetDescription() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testVexNotAffectedVulnAssessmentRelationship.getDescription());
		String newStringValue = "new description value";
		testVexNotAffectedVulnAssessmentRelationship.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexNotAffectedVulnAssessmentRelationship.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#setEndTime}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipsetEndTime() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.END_TIME_TEST_VALUE), testVexNotAffectedVulnAssessmentRelationship.getEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexNotAffectedVulnAssessmentRelationship.setEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexNotAffectedVulnAssessmentRelationship.getEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#setStatusNotes}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipsetStatusNotes() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.STATUS_NOTES_TEST_VALUE), testVexNotAffectedVulnAssessmentRelationship.getStatusNotes());
		String newStringValue = "new statusNotes value";
		testVexNotAffectedVulnAssessmentRelationship.setStatusNotes(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexNotAffectedVulnAssessmentRelationship.getStatusNotes());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#setStartTime}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipsetStartTime() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.START_TIME_TEST_VALUE), testVexNotAffectedVulnAssessmentRelationship.getStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexNotAffectedVulnAssessmentRelationship.setStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexNotAffectedVulnAssessmentRelationship.getStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#setName}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipsetName() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testVexNotAffectedVulnAssessmentRelationship.getName());
		String newStringValue = "new name value";
		testVexNotAffectedVulnAssessmentRelationship.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexNotAffectedVulnAssessmentRelationship.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#setImpactStatement}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipsetImpactStatement() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.IMPACT_STATEMENT_TEST_VALUE), testVexNotAffectedVulnAssessmentRelationship.getImpactStatement());
		String newStringValue = "new impactStatement value";
		testVexNotAffectedVulnAssessmentRelationship.setImpactStatement(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexNotAffectedVulnAssessmentRelationship.getImpactStatement());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#getVerifiedUsing}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVexNotAffectedVulnAssessmentRelationship.getVerifiedUsings())));
//		testVexNotAffectedVulnAssessmentRelationship.getVerifiedUsings().clear();
//		testVexNotAffectedVulnAssessmentRelationship.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVexNotAffectedVulnAssessmentRelationship.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#getTo}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipgetTos() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVexNotAffectedVulnAssessmentRelationship.getTos())));
//		testVexNotAffectedVulnAssessmentRelationship.getTos().clear();
//		testVexNotAffectedVulnAssessmentRelationship.getTos().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVexNotAffectedVulnAssessmentRelationship.getTos())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#getExternalRef}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipgetExternalRefs() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVexNotAffectedVulnAssessmentRelationship.getExternalRefs())));
//		testVexNotAffectedVulnAssessmentRelationship.getExternalRefs().clear();
//		testVexNotAffectedVulnAssessmentRelationship.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVexNotAffectedVulnAssessmentRelationship.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#getExternalIdentifier}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVexNotAffectedVulnAssessmentRelationship.getExternalIdentifiers())));
//		testVexNotAffectedVulnAssessmentRelationship.getExternalIdentifiers().clear();
//		testVexNotAffectedVulnAssessmentRelationship.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVexNotAffectedVulnAssessmentRelationship.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship#getExtension}.
	 */
	public void testVexNotAffectedVulnAssessmentRelationshipgetExtensions() throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationship testVexNotAffectedVulnAssessmentRelationship = generator.builderForVexNotAffectedVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVexNotAffectedVulnAssessmentRelationship.getExtensions())));
//		testVexNotAffectedVulnAssessmentRelationship.getExtensions().clear();
//		testVexNotAffectedVulnAssessmentRelationship.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVexNotAffectedVulnAssessmentRelationship.getExtensions())));
		//TODO: Implement
	}
}