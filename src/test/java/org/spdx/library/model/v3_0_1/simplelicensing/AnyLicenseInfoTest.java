/**
 * Copyright (c) 2025 Source Auditor Inc.
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
 
package org.spdx.library.model.v3_0_1.simplelicensing;

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
import org.spdx.library.model.v3_0_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_0_1.core.ExternalRef;
import org.spdx.library.model.v3_0_1.core.IntegrityMethod;
import org.spdx.library.model.v3_0_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_0_1.extension.Extension;
import org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo.AnyLicenseInfoBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class AnyLicenseInfoTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		AnyLicenseInfo testAnyLicenseInfo = generator.builderForAnyLicenseInfoTests(TEST_OBJECT_URI).build();
		List<String> result = testAnyLicenseInfo.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		AnyLicenseInfo testAnyLicenseInfo = generator.builderForAnyLicenseInfoTests(TEST_OBJECT_URI).build();
		assertEquals("SimpleLicensing.AnyLicenseInfo", testAnyLicenseInfo.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo#Element(org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo.AnyLicenseInfoBuilder)}.
	 */
	public void testAnyLicenseInfoAnyLicenseInfoBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForAnyLicenseInfoTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		AnyLicenseInfo testAnyLicenseInfo = generator.builderForAnyLicenseInfoTests(TEST_OBJECT_URI).build();
		AnyLicenseInfo test2AnyLicenseInfo = generator.builderForAnyLicenseInfoTests("https://testObject2").build();
		assertTrue(testAnyLicenseInfo.equivalent(test2AnyLicenseInfo));
		assertTrue(test2AnyLicenseInfo.equivalent(testAnyLicenseInfo));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo#setCreationInfo}.
	 */
	public void testAnyLicenseInfosetCreationInfo() throws InvalidSPDXAnalysisException {
		AnyLicenseInfo testAnyLicenseInfo = generator.builderForAnyLicenseInfoTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testAnyLicenseInfo.getCreationInfo());
//		testAnyLicenseInfo.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testAnyLicenseInfo.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo#setName}.
	 */
	public void testAnyLicenseInfosetName() throws InvalidSPDXAnalysisException {
		AnyLicenseInfo testAnyLicenseInfo = generator.builderForAnyLicenseInfoTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testAnyLicenseInfo.getName());
		String newStringValue = "new name value";
		testAnyLicenseInfo.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testAnyLicenseInfo.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo#setSummary}.
	 */
	public void testAnyLicenseInfosetSummary() throws InvalidSPDXAnalysisException {
		AnyLicenseInfo testAnyLicenseInfo = generator.builderForAnyLicenseInfoTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testAnyLicenseInfo.getSummary());
		String newStringValue = "new summary value";
		testAnyLicenseInfo.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testAnyLicenseInfo.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo#setComment}.
	 */
	public void testAnyLicenseInfosetComment() throws InvalidSPDXAnalysisException {
		AnyLicenseInfo testAnyLicenseInfo = generator.builderForAnyLicenseInfoTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testAnyLicenseInfo.getComment());
		String newStringValue = "new comment value";
		testAnyLicenseInfo.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testAnyLicenseInfo.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo#setDescription}.
	 */
	public void testAnyLicenseInfosetDescription() throws InvalidSPDXAnalysisException {
		AnyLicenseInfo testAnyLicenseInfo = generator.builderForAnyLicenseInfoTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testAnyLicenseInfo.getDescription());
		String newStringValue = "new description value";
		testAnyLicenseInfo.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testAnyLicenseInfo.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo#getExternalRef}.
	 */
	public void testAnyLicenseInfogetExternalRefs() throws InvalidSPDXAnalysisException {
		AnyLicenseInfo testAnyLicenseInfo = generator.builderForAnyLicenseInfoTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAnyLicenseInfo.getExternalRefs())));
//		testAnyLicenseInfo.getExternalRefs().clear();
//		testAnyLicenseInfo.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAnyLicenseInfo.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo#getExtension}.
	 */
	public void testAnyLicenseInfogetExtensions() throws InvalidSPDXAnalysisException {
		AnyLicenseInfo testAnyLicenseInfo = generator.builderForAnyLicenseInfoTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAnyLicenseInfo.getExtensions())));
//		testAnyLicenseInfo.getExtensions().clear();
//		testAnyLicenseInfo.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAnyLicenseInfo.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo#getVerifiedUsing}.
	 */
	public void testAnyLicenseInfogetVerifiedUsings() throws InvalidSPDXAnalysisException {
		AnyLicenseInfo testAnyLicenseInfo = generator.builderForAnyLicenseInfoTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAnyLicenseInfo.getVerifiedUsings())));
//		testAnyLicenseInfo.getVerifiedUsings().clear();
//		testAnyLicenseInfo.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAnyLicenseInfo.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo#getExternalIdentifier}.
	 */
	public void testAnyLicenseInfogetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		AnyLicenseInfo testAnyLicenseInfo = generator.builderForAnyLicenseInfoTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAnyLicenseInfo.getExternalIdentifiers())));
//		testAnyLicenseInfo.getExternalIdentifiers().clear();
//		testAnyLicenseInfo.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAnyLicenseInfo.getExternalIdentifiers())));
		//TODO: Implement
	}
}