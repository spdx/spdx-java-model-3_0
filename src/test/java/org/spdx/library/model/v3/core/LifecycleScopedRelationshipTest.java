/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.core;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.spdx.core.CoreModelObject;
import org.spdx.core.DefaultModelStore;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.IndividualUriValue;
import org.spdx.library.model.v3.ModelObjectV3;
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
import org.spdx.library.model.v3.MockCopyManager;
import org.spdx.library.model.v3.MockModelStore;
import org.spdx.library.model.v3.SpdxConstantsV3;
import org.spdx.library.model.v3.SpdxModelInfoV3_0;
import org.spdx.library.model.v3.TestValuesGenerator;
import org.spdx.library.model.v3.UnitTestHelper;
import org.spdx.library.model.v3.core.Agent.AgentBuilder;
import org.spdx.library.model.v3.core.CreationInfo;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.LifecycleScopedRelationship.LifecycleScopedRelationshipBuilder;
import org.spdx.library.model.v3.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class LifecycleScopedRelationshipTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.core.LifecycleScopedRelationship#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationship testLifecycleScopedRelationship = generator.builderForLifecycleScopedRelationshipTests(TEST_OBJECT_URI).build();
		List<String> result = testLifecycleScopedRelationship.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.LifecycleScopedRelationship#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationship testLifecycleScopedRelationship = generator.builderForLifecycleScopedRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals("Core.LifecycleScopedRelationship", testLifecycleScopedRelationship.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.LifecycleScopedRelationship#Element(org.spdx.library.model.v3.core.LifecycleScopedRelationship.LifecycleScopedRelationshipBuilder)}.
	 */
	public void testLifecycleScopedRelationshipLifecycleScopedRelationshipBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForLifecycleScopedRelationshipTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationship testLifecycleScopedRelationship = generator.builderForLifecycleScopedRelationshipTests(TEST_OBJECT_URI).build();
		LifecycleScopedRelationship test2LifecycleScopedRelationship = generator.builderForLifecycleScopedRelationshipTests("https://testObject2").build();
		assertTrue(testLifecycleScopedRelationship.equivalent(test2LifecycleScopedRelationship));
		assertTrue(test2LifecycleScopedRelationship.equivalent(testLifecycleScopedRelationship));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.LifecycleScopedRelationship#setFrom}.
	 */
	public void testLifecycleScopedRelationshipsetFrom() throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationship testLifecycleScopedRelationship = generator.builderForLifecycleScopedRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testLifecycleScopedRelationship.getFrom());
//		testLifecycleScopedRelationship.setFrom(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testLifecycleScopedRelationship.getFrom());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.LifecycleScopedRelationship#setExtension}.
	 */
	public void testLifecycleScopedRelationshipsetExtension() throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationship testLifecycleScopedRelationship = generator.builderForLifecycleScopedRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testLifecycleScopedRelationship.getExtension());
//		testLifecycleScopedRelationship.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testLifecycleScopedRelationship.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.LifecycleScopedRelationship#setCreationInfo}.
	 */
	public void testLifecycleScopedRelationshipsetCreationInfo() throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationship testLifecycleScopedRelationship = generator.builderForLifecycleScopedRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testLifecycleScopedRelationship.getCreationInfo());
//		testLifecycleScopedRelationship.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testLifecycleScopedRelationship.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.LifecycleScopedRelationship#setCompleteness}.
	 */
	public void testLifecycleScopedRelationshipsetCompleteness() throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationship testLifecycleScopedRelationship = generator.builderForLifecycleScopedRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE1), testLifecycleScopedRelationship.getCompleteness());
		testLifecycleScopedRelationship.setCompleteness(TestValuesGenerator.COMPLETENESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE2), testLifecycleScopedRelationship.getCompleteness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.LifecycleScopedRelationship#setRelationshipType}.
	 */
	public void testLifecycleScopedRelationshipsetRelationshipType() throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationship testLifecycleScopedRelationship = generator.builderForLifecycleScopedRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE1, testLifecycleScopedRelationship.getRelationshipType());
		testLifecycleScopedRelationship.setRelationshipType(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2);
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2, testLifecycleScopedRelationship.getRelationshipType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.LifecycleScopedRelationship#setScope}.
	 */
	public void testLifecycleScopedRelationshipsetScope() throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationship testLifecycleScopedRelationship = generator.builderForLifecycleScopedRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SCOPE_TEST_VALUE1), testLifecycleScopedRelationship.getScope());
		testLifecycleScopedRelationship.setScope(TestValuesGenerator.SCOPE_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.SCOPE_TEST_VALUE2), testLifecycleScopedRelationship.getScope());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.LifecycleScopedRelationship#setDescription}.
	 */
	public void testLifecycleScopedRelationshipsetDescription() throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationship testLifecycleScopedRelationship = generator.builderForLifecycleScopedRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testLifecycleScopedRelationship.getDescription());
		String newStringValue = "new description value";
		testLifecycleScopedRelationship.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testLifecycleScopedRelationship.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.LifecycleScopedRelationship#setStartTime}.
	 */
	public void testLifecycleScopedRelationshipsetStartTime() throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationship testLifecycleScopedRelationship = generator.builderForLifecycleScopedRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.START_TIME_TEST_VALUE), testLifecycleScopedRelationship.getStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testLifecycleScopedRelationship.setStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testLifecycleScopedRelationship.getStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.LifecycleScopedRelationship#setComment}.
	 */
	public void testLifecycleScopedRelationshipsetComment() throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationship testLifecycleScopedRelationship = generator.builderForLifecycleScopedRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testLifecycleScopedRelationship.getComment());
		String newStringValue = "new comment value";
		testLifecycleScopedRelationship.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testLifecycleScopedRelationship.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.LifecycleScopedRelationship#setEndTime}.
	 */
	public void testLifecycleScopedRelationshipsetEndTime() throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationship testLifecycleScopedRelationship = generator.builderForLifecycleScopedRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.END_TIME_TEST_VALUE), testLifecycleScopedRelationship.getEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testLifecycleScopedRelationship.setEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testLifecycleScopedRelationship.getEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.LifecycleScopedRelationship#setName}.
	 */
	public void testLifecycleScopedRelationshipsetName() throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationship testLifecycleScopedRelationship = generator.builderForLifecycleScopedRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testLifecycleScopedRelationship.getName());
		String newStringValue = "new name value";
		testLifecycleScopedRelationship.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testLifecycleScopedRelationship.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.LifecycleScopedRelationship#setSummary}.
	 */
	public void testLifecycleScopedRelationshipsetSummary() throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationship testLifecycleScopedRelationship = generator.builderForLifecycleScopedRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testLifecycleScopedRelationship.getSummary());
		String newStringValue = "new summary value";
		testLifecycleScopedRelationship.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testLifecycleScopedRelationship.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.LifecycleScopedRelationship#getVerifiedUsing}.
	 */
	public void testLifecycleScopedRelationshipgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationship testLifecycleScopedRelationship = generator.builderForLifecycleScopedRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testLifecycleScopedRelationship.getVerifiedUsings())));
//		testLifecycleScopedRelationship.getVerifiedUsings().clear();
//		testLifecycleScopedRelationship.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testLifecycleScopedRelationship.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.LifecycleScopedRelationship#getExternalRef}.
	 */
	public void testLifecycleScopedRelationshipgetExternalRefs() throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationship testLifecycleScopedRelationship = generator.builderForLifecycleScopedRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testLifecycleScopedRelationship.getExternalRefs())));
//		testLifecycleScopedRelationship.getExternalRefs().clear();
//		testLifecycleScopedRelationship.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testLifecycleScopedRelationship.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.LifecycleScopedRelationship#getExternalIdentifier}.
	 */
	public void testLifecycleScopedRelationshipgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationship testLifecycleScopedRelationship = generator.builderForLifecycleScopedRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testLifecycleScopedRelationship.getExternalIdentifiers())));
//		testLifecycleScopedRelationship.getExternalIdentifiers().clear();
//		testLifecycleScopedRelationship.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testLifecycleScopedRelationship.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.LifecycleScopedRelationship#getTo}.
	 */
	public void testLifecycleScopedRelationshipgetTos() throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationship testLifecycleScopedRelationship = generator.builderForLifecycleScopedRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testLifecycleScopedRelationship.getTos())));
//		testLifecycleScopedRelationship.getTos().clear();
//		testLifecycleScopedRelationship.getTos().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testLifecycleScopedRelationship.getTos())));
		//TODO: Implement
	}
}
