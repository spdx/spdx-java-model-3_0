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
 
package org.spdx.library.model.v3_0_1.core;

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
import org.spdx.library.model.v3_0_1.core.CreationInfo;
import org.spdx.library.model.v3_0_1.core.Element;
import org.spdx.library.model.v3_0_1.core.Relationship.RelationshipBuilder;
import org.spdx.library.model.v3_0_1.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class RelationshipTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Relationship#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		Relationship testRelationship = generator.builderForRelationshipTests(TEST_OBJECT_URI).build();
		List<String> result = testRelationship.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Relationship#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		Relationship testRelationship = generator.builderForRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals("Core.Relationship", testRelationship.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Relationship#Element(org.spdx.library.model.v3_0_1.core.Relationship.RelationshipBuilder)}.
	 */
	public void testRelationshipRelationshipBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForRelationshipTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		Relationship testRelationship = generator.builderForRelationshipTests(TEST_OBJECT_URI).build();
		Relationship test2Relationship = generator.builderForRelationshipTests("https://testObject2").build();
		assertTrue(testRelationship.equivalent(test2Relationship));
		assertTrue(test2Relationship.equivalent(testRelationship));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Relationship#setFrom}.
	 */
	public void testRelationshipsetFrom() throws InvalidSPDXAnalysisException {
		Relationship testRelationship = generator.builderForRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testRelationship.getFrom());
//		testRelationship.setFrom(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testRelationship.getFrom());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Relationship#setCreationInfo}.
	 */
	public void testRelationshipsetCreationInfo() throws InvalidSPDXAnalysisException {
		Relationship testRelationship = generator.builderForRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testRelationship.getCreationInfo());
//		testRelationship.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testRelationship.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Relationship#setCompleteness}.
	 */
	public void testRelationshipsetCompleteness() throws InvalidSPDXAnalysisException {
		Relationship testRelationship = generator.builderForRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE1), testRelationship.getCompleteness());
		testRelationship.setCompleteness(TestValuesGenerator.COMPLETENESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE2), testRelationship.getCompleteness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Relationship#setRelationshipType}.
	 */
	public void testRelationshipsetRelationshipType() throws InvalidSPDXAnalysisException {
		Relationship testRelationship = generator.builderForRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE1, testRelationship.getRelationshipType());
		testRelationship.setRelationshipType(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2);
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2, testRelationship.getRelationshipType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Relationship#setSummary}.
	 */
	public void testRelationshipsetSummary() throws InvalidSPDXAnalysisException {
		Relationship testRelationship = generator.builderForRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testRelationship.getSummary());
		String newStringValue = "new summary value";
		testRelationship.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testRelationship.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Relationship#setDescription}.
	 */
	public void testRelationshipsetDescription() throws InvalidSPDXAnalysisException {
		Relationship testRelationship = generator.builderForRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testRelationship.getDescription());
		String newStringValue = "new description value";
		testRelationship.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testRelationship.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Relationship#setEndTime}.
	 */
	public void testRelationshipsetEndTime() throws InvalidSPDXAnalysisException {
		Relationship testRelationship = generator.builderForRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.END_TIME_TEST_VALUE), testRelationship.getEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testRelationship.setEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testRelationship.getEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Relationship#setStartTime}.
	 */
	public void testRelationshipsetStartTime() throws InvalidSPDXAnalysisException {
		Relationship testRelationship = generator.builderForRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.START_TIME_TEST_VALUE), testRelationship.getStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testRelationship.setStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testRelationship.getStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Relationship#setComment}.
	 */
	public void testRelationshipsetComment() throws InvalidSPDXAnalysisException {
		Relationship testRelationship = generator.builderForRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testRelationship.getComment());
		String newStringValue = "new comment value";
		testRelationship.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testRelationship.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Relationship#setName}.
	 */
	public void testRelationshipsetName() throws InvalidSPDXAnalysisException {
		Relationship testRelationship = generator.builderForRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testRelationship.getName());
		String newStringValue = "new name value";
		testRelationship.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testRelationship.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Relationship#getExtension}.
	 */
	public void testRelationshipgetExtensions() throws InvalidSPDXAnalysisException {
		Relationship testRelationship = generator.builderForRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testRelationship.getExtensions())));
//		testRelationship.getExtensions().clear();
//		testRelationship.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testRelationship.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Relationship#getVerifiedUsing}.
	 */
	public void testRelationshipgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		Relationship testRelationship = generator.builderForRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testRelationship.getVerifiedUsings())));
//		testRelationship.getVerifiedUsings().clear();
//		testRelationship.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testRelationship.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Relationship#getTo}.
	 */
	public void testRelationshipgetTos() throws InvalidSPDXAnalysisException {
		Relationship testRelationship = generator.builderForRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testRelationship.getTos())));
//		testRelationship.getTos().clear();
//		testRelationship.getTos().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testRelationship.getTos())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Relationship#getExternalRef}.
	 */
	public void testRelationshipgetExternalRefs() throws InvalidSPDXAnalysisException {
		Relationship testRelationship = generator.builderForRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testRelationship.getExternalRefs())));
//		testRelationship.getExternalRefs().clear();
//		testRelationship.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testRelationship.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Relationship#getExternalIdentifier}.
	 */
	public void testRelationshipgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		Relationship testRelationship = generator.builderForRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testRelationship.getExternalIdentifiers())));
//		testRelationship.getExternalIdentifiers().clear();
//		testRelationship.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testRelationship.getExternalIdentifiers())));
		//TODO: Implement
	}
}