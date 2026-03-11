/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_0.security;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.spdx.core.CoreModelObject;
import org.spdx.core.DefaultModelStore;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.IndividualUriValue;
import org.spdx.library.model.v3_0.ModelObjectV3;
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
import org.spdx.library.model.v3_0.MockCopyManager;
import org.spdx.library.model.v3_0.MockModelStore;
import org.spdx.library.model.v3_0.SpdxConstantsV3;
import org.spdx.library.model.v3_0.SpdxModelInfoV3_0;
import org.spdx.library.model.v3_0.TestValuesGenerator;
import org.spdx.library.model.v3_0.UnitTestHelper;
import org.spdx.library.model.v3_0.core.Agent.AgentBuilder;
import org.spdx.library.model.v3_0.core.Agent;
import org.spdx.library.model.v3_0.core.CreationInfo;
import org.spdx.library.model.v3_0.core.Element;
import org.spdx.library.model.v3_0.core.ExternalIdentifier;
import org.spdx.library.model.v3_0.core.ExternalRef;
import org.spdx.library.model.v3_0.core.IntegrityMethod;
import org.spdx.library.model.v3_0.core.ProfileIdentifierType;
import org.spdx.library.model.v3_0.core.RelationshipCompleteness;
import org.spdx.library.model.v3_0.core.RelationshipType;
import org.spdx.library.model.v3_0.extension.Extension;
import org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship.VexUnderInvestigationVulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3_0.software.SoftwareArtifact;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class VexUnderInvestigationVulnAssessmentRelationshipTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		List<String> result = testVexUnderInvestigationVulnAssessmentRelationship.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals("Security.VexUnderInvestigationVulnAssessmentRelationship", testVexUnderInvestigationVulnAssessmentRelationship.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#Element(org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship.VexUnderInvestigationVulnAssessmentRelationshipBuilder)}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipVexUnderInvestigationVulnAssessmentRelationshipBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		VexUnderInvestigationVulnAssessmentRelationship test2VexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests("https://testObject2").build();
		assertTrue(testVexUnderInvestigationVulnAssessmentRelationship.equivalent(test2VexUnderInvestigationVulnAssessmentRelationship));
		assertTrue(test2VexUnderInvestigationVulnAssessmentRelationship.equivalent(testVexUnderInvestigationVulnAssessmentRelationship));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#setFrom}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipsetFrom() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testVexUnderInvestigationVulnAssessmentRelationship.getFrom());
//		testVexUnderInvestigationVulnAssessmentRelationship.setFrom(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testVexUnderInvestigationVulnAssessmentRelationship.getFrom());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#setExtension}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipsetExtension() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testVexUnderInvestigationVulnAssessmentRelationship.getExtension());
//		testVexUnderInvestigationVulnAssessmentRelationship.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testVexUnderInvestigationVulnAssessmentRelationship.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#setCreationInfo}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipsetCreationInfo() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testVexUnderInvestigationVulnAssessmentRelationship.getCreationInfo());
//		testVexUnderInvestigationVulnAssessmentRelationship.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testVexUnderInvestigationVulnAssessmentRelationship.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#setAssessedElement}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipsetAssessedElement() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testVexUnderInvestigationVulnAssessmentRelationship.getAssessedElement());
//		testVexUnderInvestigationVulnAssessmentRelationship.setAssessedElement(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testVexUnderInvestigationVulnAssessmentRelationship.getAssessedElement());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#setSuppliedBy}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipsetSuppliedBy() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testVexUnderInvestigationVulnAssessmentRelationship.getSuppliedBy());
//		testVexUnderInvestigationVulnAssessmentRelationship.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testVexUnderInvestigationVulnAssessmentRelationship.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#setCompleteness}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipsetCompleteness() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE1), testVexUnderInvestigationVulnAssessmentRelationship.getCompleteness());
		testVexUnderInvestigationVulnAssessmentRelationship.setCompleteness(TestValuesGenerator.COMPLETENESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE2), testVexUnderInvestigationVulnAssessmentRelationship.getCompleteness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#setRelationshipType}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipsetRelationshipType() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE1, testVexUnderInvestigationVulnAssessmentRelationship.getRelationshipType());
		testVexUnderInvestigationVulnAssessmentRelationship.setRelationshipType(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2);
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2, testVexUnderInvestigationVulnAssessmentRelationship.getRelationshipType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#setPublishedTime}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipsetPublishedTime() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PUBLISHED_TIME_TEST_VALUE), testVexUnderInvestigationVulnAssessmentRelationship.getPublishedTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexUnderInvestigationVulnAssessmentRelationship.setPublishedTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexUnderInvestigationVulnAssessmentRelationship.getPublishedTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#setVexVersion}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipsetVexVersion() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VEX_VERSION_TEST_VALUE), testVexUnderInvestigationVulnAssessmentRelationship.getVexVersion());
		String newStringValue = "new vexVersion value";
		testVexUnderInvestigationVulnAssessmentRelationship.setVexVersion(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexUnderInvestigationVulnAssessmentRelationship.getVexVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#setDescription}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipsetDescription() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testVexUnderInvestigationVulnAssessmentRelationship.getDescription());
		String newStringValue = "new description value";
		testVexUnderInvestigationVulnAssessmentRelationship.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexUnderInvestigationVulnAssessmentRelationship.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#setSummary}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipsetSummary() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testVexUnderInvestigationVulnAssessmentRelationship.getSummary());
		String newStringValue = "new summary value";
		testVexUnderInvestigationVulnAssessmentRelationship.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexUnderInvestigationVulnAssessmentRelationship.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#setEndTime}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipsetEndTime() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.END_TIME_TEST_VALUE), testVexUnderInvestigationVulnAssessmentRelationship.getEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexUnderInvestigationVulnAssessmentRelationship.setEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexUnderInvestigationVulnAssessmentRelationship.getEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#setStatusNotes}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipsetStatusNotes() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.STATUS_NOTES_TEST_VALUE), testVexUnderInvestigationVulnAssessmentRelationship.getStatusNotes());
		String newStringValue = "new statusNotes value";
		testVexUnderInvestigationVulnAssessmentRelationship.setStatusNotes(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexUnderInvestigationVulnAssessmentRelationship.getStatusNotes());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#setStartTime}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipsetStartTime() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.START_TIME_TEST_VALUE), testVexUnderInvestigationVulnAssessmentRelationship.getStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexUnderInvestigationVulnAssessmentRelationship.setStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexUnderInvestigationVulnAssessmentRelationship.getStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#setWithdrawnTime}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipsetWithdrawnTime() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.WITHDRAWN_TIME_TEST_VALUE), testVexUnderInvestigationVulnAssessmentRelationship.getWithdrawnTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexUnderInvestigationVulnAssessmentRelationship.setWithdrawnTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexUnderInvestigationVulnAssessmentRelationship.getWithdrawnTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#setName}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipsetName() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testVexUnderInvestigationVulnAssessmentRelationship.getName());
		String newStringValue = "new name value";
		testVexUnderInvestigationVulnAssessmentRelationship.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexUnderInvestigationVulnAssessmentRelationship.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#setComment}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipsetComment() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testVexUnderInvestigationVulnAssessmentRelationship.getComment());
		String newStringValue = "new comment value";
		testVexUnderInvestigationVulnAssessmentRelationship.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexUnderInvestigationVulnAssessmentRelationship.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#setModifiedTime}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipsetModifiedTime() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.MODIFIED_TIME_TEST_VALUE), testVexUnderInvestigationVulnAssessmentRelationship.getModifiedTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVexUnderInvestigationVulnAssessmentRelationship.setModifiedTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVexUnderInvestigationVulnAssessmentRelationship.getModifiedTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#getVerifiedUsing}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVexUnderInvestigationVulnAssessmentRelationship.getVerifiedUsings())));
//		testVexUnderInvestigationVulnAssessmentRelationship.getVerifiedUsings().clear();
//		testVexUnderInvestigationVulnAssessmentRelationship.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVexUnderInvestigationVulnAssessmentRelationship.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#getTo}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipgetTos() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVexUnderInvestigationVulnAssessmentRelationship.getTos())));
//		testVexUnderInvestigationVulnAssessmentRelationship.getTos().clear();
//		testVexUnderInvestigationVulnAssessmentRelationship.getTos().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVexUnderInvestigationVulnAssessmentRelationship.getTos())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#getExternalRef}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipgetExternalRefs() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVexUnderInvestigationVulnAssessmentRelationship.getExternalRefs())));
//		testVexUnderInvestigationVulnAssessmentRelationship.getExternalRefs().clear();
//		testVexUnderInvestigationVulnAssessmentRelationship.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVexUnderInvestigationVulnAssessmentRelationship.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.security.VexUnderInvestigationVulnAssessmentRelationship#getExternalIdentifier}.
	 */
	public void testVexUnderInvestigationVulnAssessmentRelationshipgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationship testVexUnderInvestigationVulnAssessmentRelationship = generator.builderForVexUnderInvestigationVulnAssessmentRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVexUnderInvestigationVulnAssessmentRelationship.getExternalIdentifiers())));
//		testVexUnderInvestigationVulnAssessmentRelationship.getExternalIdentifiers().clear();
//		testVexUnderInvestigationVulnAssessmentRelationship.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVexUnderInvestigationVulnAssessmentRelationship.getExternalIdentifiers())));
		//TODO: Implement
	}
}
