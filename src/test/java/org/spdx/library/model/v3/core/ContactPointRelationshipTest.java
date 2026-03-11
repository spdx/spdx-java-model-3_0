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
import org.spdx.library.model.v3.core.ContactPointRelationship.ContactPointRelationshipBuilder;
import org.spdx.library.model.v3.core.CreationInfo;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ContactPointRelationshipTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.core.ContactPointRelationship#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ContactPointRelationship testContactPointRelationship = generator.builderForContactPointRelationshipTests(TEST_OBJECT_URI).build();
		List<String> result = testContactPointRelationship.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ContactPointRelationship#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ContactPointRelationship testContactPointRelationship = generator.builderForContactPointRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals("Core.ContactPointRelationship", testContactPointRelationship.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ContactPointRelationship#Element(org.spdx.library.model.v3.core.ContactPointRelationship.ContactPointRelationshipBuilder)}.
	 */
	public void testContactPointRelationshipContactPointRelationshipBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForContactPointRelationshipTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ContactPointRelationship testContactPointRelationship = generator.builderForContactPointRelationshipTests(TEST_OBJECT_URI).build();
		ContactPointRelationship test2ContactPointRelationship = generator.builderForContactPointRelationshipTests("https://testObject2").build();
		assertTrue(testContactPointRelationship.equivalent(test2ContactPointRelationship));
		assertTrue(test2ContactPointRelationship.equivalent(testContactPointRelationship));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ContactPointRelationship#setFrom}.
	 */
	public void testContactPointRelationshipsetFrom() throws InvalidSPDXAnalysisException {
		ContactPointRelationship testContactPointRelationship = generator.builderForContactPointRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testContactPointRelationship.getFrom());
//		testContactPointRelationship.setFrom(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testContactPointRelationship.getFrom());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ContactPointRelationship#setExtension}.
	 */
	public void testContactPointRelationshipsetExtension() throws InvalidSPDXAnalysisException {
		ContactPointRelationship testContactPointRelationship = generator.builderForContactPointRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testContactPointRelationship.getExtension());
//		testContactPointRelationship.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testContactPointRelationship.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ContactPointRelationship#setCreationInfo}.
	 */
	public void testContactPointRelationshipsetCreationInfo() throws InvalidSPDXAnalysisException {
		ContactPointRelationship testContactPointRelationship = generator.builderForContactPointRelationshipTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testContactPointRelationship.getCreationInfo());
//		testContactPointRelationship.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testContactPointRelationship.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ContactPointRelationship#setContactType}.
	 */
	public void testContactPointRelationshipsetContactType() throws InvalidSPDXAnalysisException {
		ContactPointRelationship testContactPointRelationship = generator.builderForContactPointRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.CONTACT_TYPE_TEST_VALUE1, testContactPointRelationship.getContactType());
		testContactPointRelationship.setContactType(TestValuesGenerator.CONTACT_TYPE_TEST_VALUE2);
		assertEquals(TestValuesGenerator.CONTACT_TYPE_TEST_VALUE2, testContactPointRelationship.getContactType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ContactPointRelationship#setCompleteness}.
	 */
	public void testContactPointRelationshipsetCompleteness() throws InvalidSPDXAnalysisException {
		ContactPointRelationship testContactPointRelationship = generator.builderForContactPointRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE1), testContactPointRelationship.getCompleteness());
		testContactPointRelationship.setCompleteness(TestValuesGenerator.COMPLETENESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.COMPLETENESS_TEST_VALUE2), testContactPointRelationship.getCompleteness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ContactPointRelationship#setRelationshipType}.
	 */
	public void testContactPointRelationshipsetRelationshipType() throws InvalidSPDXAnalysisException {
		ContactPointRelationship testContactPointRelationship = generator.builderForContactPointRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE1, testContactPointRelationship.getRelationshipType());
		testContactPointRelationship.setRelationshipType(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2);
		assertEquals(TestValuesGenerator.RELATIONSHIP_TYPE_TEST_VALUE2, testContactPointRelationship.getRelationshipType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ContactPointRelationship#setDescription}.
	 */
	public void testContactPointRelationshipsetDescription() throws InvalidSPDXAnalysisException {
		ContactPointRelationship testContactPointRelationship = generator.builderForContactPointRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testContactPointRelationship.getDescription());
		String newStringValue = "new description value";
		testContactPointRelationship.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testContactPointRelationship.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ContactPointRelationship#setStartTime}.
	 */
	public void testContactPointRelationshipsetStartTime() throws InvalidSPDXAnalysisException {
		ContactPointRelationship testContactPointRelationship = generator.builderForContactPointRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.START_TIME_TEST_VALUE), testContactPointRelationship.getStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testContactPointRelationship.setStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testContactPointRelationship.getStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ContactPointRelationship#setComment}.
	 */
	public void testContactPointRelationshipsetComment() throws InvalidSPDXAnalysisException {
		ContactPointRelationship testContactPointRelationship = generator.builderForContactPointRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testContactPointRelationship.getComment());
		String newStringValue = "new comment value";
		testContactPointRelationship.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testContactPointRelationship.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ContactPointRelationship#setEndTime}.
	 */
	public void testContactPointRelationshipsetEndTime() throws InvalidSPDXAnalysisException {
		ContactPointRelationship testContactPointRelationship = generator.builderForContactPointRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.END_TIME_TEST_VALUE), testContactPointRelationship.getEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testContactPointRelationship.setEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testContactPointRelationship.getEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ContactPointRelationship#setName}.
	 */
	public void testContactPointRelationshipsetName() throws InvalidSPDXAnalysisException {
		ContactPointRelationship testContactPointRelationship = generator.builderForContactPointRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testContactPointRelationship.getName());
		String newStringValue = "new name value";
		testContactPointRelationship.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testContactPointRelationship.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ContactPointRelationship#setSummary}.
	 */
	public void testContactPointRelationshipsetSummary() throws InvalidSPDXAnalysisException {
		ContactPointRelationship testContactPointRelationship = generator.builderForContactPointRelationshipTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testContactPointRelationship.getSummary());
		String newStringValue = "new summary value";
		testContactPointRelationship.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testContactPointRelationship.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ContactPointRelationship#getVerifiedUsing}.
	 */
	public void testContactPointRelationshipgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		ContactPointRelationship testContactPointRelationship = generator.builderForContactPointRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testContactPointRelationship.getVerifiedUsings())));
//		testContactPointRelationship.getVerifiedUsings().clear();
//		testContactPointRelationship.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testContactPointRelationship.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ContactPointRelationship#getExternalRef}.
	 */
	public void testContactPointRelationshipgetExternalRefs() throws InvalidSPDXAnalysisException {
		ContactPointRelationship testContactPointRelationship = generator.builderForContactPointRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testContactPointRelationship.getExternalRefs())));
//		testContactPointRelationship.getExternalRefs().clear();
//		testContactPointRelationship.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testContactPointRelationship.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ContactPointRelationship#getExternalIdentifier}.
	 */
	public void testContactPointRelationshipgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		ContactPointRelationship testContactPointRelationship = generator.builderForContactPointRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testContactPointRelationship.getExternalIdentifiers())));
//		testContactPointRelationship.getExternalIdentifiers().clear();
//		testContactPointRelationship.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testContactPointRelationship.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.ContactPointRelationship#getTo}.
	 */
	public void testContactPointRelationshipgetTos() throws InvalidSPDXAnalysisException {
		ContactPointRelationship testContactPointRelationship = generator.builderForContactPointRelationshipTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testContactPointRelationship.getTos())));
//		testContactPointRelationship.getTos().clear();
//		testContactPointRelationship.getTos().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testContactPointRelationship.getTos())));
		//TODO: Implement
	}
}
