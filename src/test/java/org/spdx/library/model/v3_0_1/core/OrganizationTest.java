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
import org.spdx.library.model.v3_0_1.core.Organization.OrganizationBuilder;
import org.spdx.library.model.v3_0_1.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class OrganizationTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Organization#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		Organization testOrganization = generator.builderForOrganizationTests(TEST_OBJECT_URI).build();
		List<String> result = testOrganization.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Organization#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		Organization testOrganization = generator.builderForOrganizationTests(TEST_OBJECT_URI).build();
		assertEquals("Core.Organization", testOrganization.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Organization#Element(org.spdx.library.model.v3_0_1.core.Organization.OrganizationBuilder)}.
	 */
	public void testOrganizationOrganizationBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForOrganizationTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		Organization testOrganization = generator.builderForOrganizationTests(TEST_OBJECT_URI).build();
		Organization test2Organization = generator.builderForOrganizationTests("https://testObject2").build();
		assertTrue(testOrganization.equivalent(test2Organization));
		assertTrue(test2Organization.equivalent(testOrganization));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Organization#setCreationInfo}.
	 */
	public void testOrganizationsetCreationInfo() throws InvalidSPDXAnalysisException {
		Organization testOrganization = generator.builderForOrganizationTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testOrganization.getCreationInfo());
//		testOrganization.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testOrganization.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Organization#setSummary}.
	 */
	public void testOrganizationsetSummary() throws InvalidSPDXAnalysisException {
		Organization testOrganization = generator.builderForOrganizationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testOrganization.getSummary());
		String newStringValue = "new summary value";
		testOrganization.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testOrganization.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Organization#setDescription}.
	 */
	public void testOrganizationsetDescription() throws InvalidSPDXAnalysisException {
		Organization testOrganization = generator.builderForOrganizationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testOrganization.getDescription());
		String newStringValue = "new description value";
		testOrganization.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testOrganization.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Organization#setComment}.
	 */
	public void testOrganizationsetComment() throws InvalidSPDXAnalysisException {
		Organization testOrganization = generator.builderForOrganizationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testOrganization.getComment());
		String newStringValue = "new comment value";
		testOrganization.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testOrganization.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Organization#setName}.
	 */
	public void testOrganizationsetName() throws InvalidSPDXAnalysisException {
		Organization testOrganization = generator.builderForOrganizationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testOrganization.getName());
		String newStringValue = "new name value";
		testOrganization.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testOrganization.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Organization#getExternalRef}.
	 */
	public void testOrganizationgetExternalRefs() throws InvalidSPDXAnalysisException {
		Organization testOrganization = generator.builderForOrganizationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testOrganization.getExternalRefs())));
//		testOrganization.getExternalRefs().clear();
//		testOrganization.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testOrganization.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Organization#getExtension}.
	 */
	public void testOrganizationgetExtensions() throws InvalidSPDXAnalysisException {
		Organization testOrganization = generator.builderForOrganizationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testOrganization.getExtensions())));
//		testOrganization.getExtensions().clear();
//		testOrganization.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testOrganization.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Organization#getVerifiedUsing}.
	 */
	public void testOrganizationgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		Organization testOrganization = generator.builderForOrganizationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testOrganization.getVerifiedUsings())));
//		testOrganization.getVerifiedUsings().clear();
//		testOrganization.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testOrganization.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.Organization#getExternalIdentifier}.
	 */
	public void testOrganizationgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		Organization testOrganization = generator.builderForOrganizationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testOrganization.getExternalIdentifiers())));
//		testOrganization.getExternalIdentifiers().clear();
//		testOrganization.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testOrganization.getExternalIdentifiers())));
		//TODO: Implement
	}
}