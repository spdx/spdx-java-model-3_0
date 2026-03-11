/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.functionalsafety;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.spdx.core.CoreModelObject;
import org.spdx.core.DefaultModelStore;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.IndividualUriValue;
import org.spdx.library.model.v3_1.ModelObjectV3;
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
import org.spdx.library.model.v3_1.MockCopyManager;
import org.spdx.library.model.v3_1.MockModelStore;
import org.spdx.library.model.v3_1.SpdxConstantsV3;
import org.spdx.library.model.v3_1.SpdxModelInfoV3_0;
import org.spdx.library.model.v3_1.TestValuesGenerator;
import org.spdx.library.model.v3_1.UnitTestHelper;
import org.spdx.library.model.v3_1.core.Agent.AgentBuilder;
import org.spdx.library.model.v3_1.core.CreationInfo;
import org.spdx.library.model.v3_1.core.Element;
import org.spdx.library.model.v3_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_1.core.ExternalRef;
import org.spdx.library.model.v3_1.core.IntegrityMethod;
import org.spdx.library.model.v3_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_1.core.Relationship;
import org.spdx.library.model.v3_1.core.RelationshipCompleteness;
import org.spdx.library.model.v3_1.core.RelationshipType;
import org.spdx.library.model.v3_1.extension.Extension;
import org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship.EvidenceRelationshipBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class EvidenceRelationshipTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		EvidenceRelationship testEvidenceRelationship = generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
		List<String> result = testEvidenceRelationship.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		EvidenceRelationship testEvidenceRelationship = generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals("FunctionalSafety.EvidenceRelationship", testEvidenceRelationship.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship#Element(org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship.EvidenceRelationshipBuilder)}.
	 */
	public void testEvidenceRelationshipEvidenceRelationshipBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		EvidenceRelationship testEvidenceRelationship = generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
		EvidenceRelationship test2EvidenceRelationship = generator.builderForEvidenceRelationshipTests("https://testObject2").build();
		assertTrue(testEvidenceRelationship.equivalent(test2EvidenceRelationship));
		assertTrue(test2EvidenceRelationship.equivalent(testEvidenceRelationship));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship#setFrom}.
	 */
	public void testEvidenceRelationshipsetFrom() throws InvalidSPDXAnalysisException {
		EvidenceRelationship testEvidenceRelationship = generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testEvidenceRelationship.getFrom());
//		testEvidenceRelationship.setFrom(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testEvidenceRelationship.getFrom());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship#setEvidenceUUID}.
	 */
	public void testEvidenceRelationshipsetEvidenceUUID() throws InvalidSPDXAnalysisException {
		EvidenceRelationship testEvidenceRelationship = generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testEvidenceRelationship.getEvidenceUUID());
//		testEvidenceRelationship.setEvidenceUUID(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testEvidenceRelationship.getEvidenceUUID());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship#setExtension}.
	 */
	public void testEvidenceRelationshipsetExtension() throws InvalidSPDXAnalysisException {
		EvidenceRelationship testEvidenceRelationship = generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testEvidenceRelationship.getExtension());
//		testEvidenceRelationship.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testEvidenceRelationship.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship#setCreationInfo}.
	 */
	public void testEvidenceRelationshipsetCreationInfo() throws InvalidSPDXAnalysisException {
		EvidenceRelationship testEvidenceRelationship = generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testEvidenceRelationship.getCreationInfo());
//		testEvidenceRelationship.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testEvidenceRelationship.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship#setCompleteness}.
	 */
	public void testEvidenceRelationshipsetCompleteness() throws InvalidSPDXAnalysisException {
		EvidenceRelationship testEvidenceRelationship = generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE1), testEvidenceRelationship.getCompleteness());
		testEvidenceRelationship.setCompleteness(TestValuesGenerator.COMPLETENESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE2), testEvidenceRelationship.getCompleteness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship#setRelationshipType}.
	 */
	public void testEvidenceRelationshipsetRelationshipType() throws InvalidSPDXAnalysisException {
		EvidenceRelationship testEvidenceRelationship = generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE1, testEvidenceRelationship.getRelationshipType());
		testEvidenceRelationship.setRelationshipType(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2);
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2, testEvidenceRelationship.getRelationshipType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship#setDescription}.
	 */
	public void testEvidenceRelationshipsetDescription() throws InvalidSPDXAnalysisException {
		EvidenceRelationship testEvidenceRelationship = generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testEvidenceRelationship.getDescription());
		String newStringValue = "new description value";
		testEvidenceRelationship.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testEvidenceRelationship.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship#setStartTime}.
	 */
	public void testEvidenceRelationshipsetStartTime() throws InvalidSPDXAnalysisException {
		EvidenceRelationship testEvidenceRelationship = generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.START_TIME_TEST_VALUE), testEvidenceRelationship.getStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testEvidenceRelationship.setStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testEvidenceRelationship.getStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship#setComment}.
	 */
	public void testEvidenceRelationshipsetComment() throws InvalidSPDXAnalysisException {
		EvidenceRelationship testEvidenceRelationship = generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testEvidenceRelationship.getComment());
		String newStringValue = "new comment value";
		testEvidenceRelationship.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testEvidenceRelationship.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship#setEndTime}.
	 */
	public void testEvidenceRelationshipsetEndTime() throws InvalidSPDXAnalysisException {
		EvidenceRelationship testEvidenceRelationship = generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.END_TIME_TEST_VALUE), testEvidenceRelationship.getEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testEvidenceRelationship.setEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testEvidenceRelationship.getEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship#setName}.
	 */
	public void testEvidenceRelationshipsetName() throws InvalidSPDXAnalysisException {
		EvidenceRelationship testEvidenceRelationship = generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testEvidenceRelationship.getName());
		String newStringValue = "new name value";
		testEvidenceRelationship.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testEvidenceRelationship.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship#setSummary}.
	 */
	public void testEvidenceRelationshipsetSummary() throws InvalidSPDXAnalysisException {
		EvidenceRelationship testEvidenceRelationship = generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testEvidenceRelationship.getSummary());
		String newStringValue = "new summary value";
		testEvidenceRelationship.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testEvidenceRelationship.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship#getVerifiedUsing}.
	 */
	public void testEvidenceRelationshipgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		EvidenceRelationship testEvidenceRelationship = generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testEvidenceRelationship.getVerifiedUsings())));
//		testEvidenceRelationship.getVerifiedUsings().clear();
//		testEvidenceRelationship.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testEvidenceRelationship.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship#getExternalRef}.
	 */
	public void testEvidenceRelationshipgetExternalRefs() throws InvalidSPDXAnalysisException {
		EvidenceRelationship testEvidenceRelationship = generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testEvidenceRelationship.getExternalRefs())));
//		testEvidenceRelationship.getExternalRefs().clear();
//		testEvidenceRelationship.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testEvidenceRelationship.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship#getExternalIdentifier}.
	 */
	public void testEvidenceRelationshipgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		EvidenceRelationship testEvidenceRelationship = generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testEvidenceRelationship.getExternalIdentifiers())));
//		testEvidenceRelationship.getExternalIdentifiers().clear();
//		testEvidenceRelationship.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testEvidenceRelationship.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship#getTo}.
	 */
	public void testEvidenceRelationshipgetTos() throws InvalidSPDXAnalysisException {
		EvidenceRelationship testEvidenceRelationship = generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testEvidenceRelationship.getTos())));
//		testEvidenceRelationship.getTos().clear();
//		testEvidenceRelationship.getTos().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testEvidenceRelationship.getTos())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvidenceRelationship#getEvidenceCategory}.
	 */
	public void testEvidenceRelationshipgetEvidenceCategorys() throws InvalidSPDXAnalysisException {
		EvidenceRelationship testEvidenceRelationship = generator.builderForEvidenceRelationshipTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.EVIDENCE_CATEGORY_TEST_LIST1, new ArrayList<>(testEvidenceRelationship.getEvidenceCategorys())));
		testEvidenceRelationship.getEvidenceCategorys().clear();
		testEvidenceRelationship.getEvidenceCategorys().addAll(TestValuesGenerator.EVIDENCE_CATEGORY_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.EVIDENCE_CATEGORY_TEST_LIST2, new ArrayList<>(testEvidenceRelationship.getEvidenceCategorys())));
	}
}
