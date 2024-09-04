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
import org.spdx.library.model.v3_0_1.core.Person.PersonBuilder;
import org.spdx.library.model.v3_0_1.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class PersonTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Person#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		Person testPerson = generator.builderForPersonTests(TEST_OBJECT_URI).build();
		List<String> result = testPerson.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Person#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		Person testPerson = generator.builderForPersonTests(TEST_OBJECT_URI).build();
		assertEquals("Core.Person", testPerson.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Person#Element(org.spdx.library.model.v3_0_1.core.Person.PersonBuilder)}.
	 */
	public void testPersonPersonBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForPersonTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		Person testPerson = generator.builderForPersonTests(TEST_OBJECT_URI).build();
		Person test2Person = generator.builderForPersonTests("https://testObject2").build();
		assertTrue(testPerson.equivalent(test2Person));
		assertTrue(test2Person.equivalent(testPerson));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Person#setCreationInfo}.
	 */
	public void testPersonsetCreationInfo() throws InvalidSPDXAnalysisException {
		Person testPerson = generator.builderForPersonTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testPerson.getCreationInfo());
//		testPerson.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testPerson.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Person#setSummary}.
	 */
	public void testPersonsetSummary() throws InvalidSPDXAnalysisException {
		Person testPerson = generator.builderForPersonTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testPerson.getSummary());
		String newStringValue = "new summary value";
		testPerson.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testPerson.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Person#setDescription}.
	 */
	public void testPersonsetDescription() throws InvalidSPDXAnalysisException {
		Person testPerson = generator.builderForPersonTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testPerson.getDescription());
		String newStringValue = "new description value";
		testPerson.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testPerson.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Person#setComment}.
	 */
	public void testPersonsetComment() throws InvalidSPDXAnalysisException {
		Person testPerson = generator.builderForPersonTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testPerson.getComment());
		String newStringValue = "new comment value";
		testPerson.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testPerson.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Person#setName}.
	 */
	public void testPersonsetName() throws InvalidSPDXAnalysisException {
		Person testPerson = generator.builderForPersonTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testPerson.getName());
		String newStringValue = "new name value";
		testPerson.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testPerson.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Person#getExternalRef}.
	 */
	public void testPersongetExternalRefs() throws InvalidSPDXAnalysisException {
		Person testPerson = generator.builderForPersonTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPerson.getExternalRefs())));
//		testPerson.getExternalRefs().clear();
//		testPerson.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPerson.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Person#getExtension}.
	 */
	public void testPersongetExtensions() throws InvalidSPDXAnalysisException {
		Person testPerson = generator.builderForPersonTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPerson.getExtensions())));
//		testPerson.getExtensions().clear();
//		testPerson.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPerson.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Person#getVerifiedUsing}.
	 */
	public void testPersongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		Person testPerson = generator.builderForPersonTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPerson.getVerifiedUsings())));
//		testPerson.getVerifiedUsings().clear();
//		testPerson.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPerson.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Person#getExternalIdentifier}.
	 */
	public void testPersongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		Person testPerson = generator.builderForPersonTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPerson.getExternalIdentifiers())));
//		testPerson.getExternalIdentifiers().clear();
//		testPerson.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPerson.getExternalIdentifiers())));
		//TODO: Implement
	}
}