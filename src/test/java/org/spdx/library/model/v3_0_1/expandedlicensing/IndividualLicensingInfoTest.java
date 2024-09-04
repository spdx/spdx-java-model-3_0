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
 
package org.spdx.library.model.v3_0_1.expandedlicensing;

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
import org.spdx.library.model.v3_0_1.expandedlicensing.IndividualLicensingInfo.IndividualLicensingInfoBuilder;
import org.spdx.library.model.v3_0_1.extension.Extension;
import org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class IndividualLicensingInfoTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.IndividualLicensingInfo#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		IndividualLicensingInfo testIndividualLicensingInfo = generator.builderForIndividualLicensingInfoTests(TEST_OBJECT_URI).build();
		List<String> result = testIndividualLicensingInfo.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.IndividualLicensingInfo#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		IndividualLicensingInfo testIndividualLicensingInfo = generator.builderForIndividualLicensingInfoTests(TEST_OBJECT_URI).build();
		assertEquals("ExpandedLicensing.IndividualLicensingInfo", testIndividualLicensingInfo.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.IndividualLicensingInfo#Element(org.spdx.library.model.v3_0_1.expandedlicensing.IndividualLicensingInfo.IndividualLicensingInfoBuilder)}.
	 */
	public void testIndividualLicensingInfoIndividualLicensingInfoBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForIndividualLicensingInfoTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		IndividualLicensingInfo testIndividualLicensingInfo = generator.builderForIndividualLicensingInfoTests(TEST_OBJECT_URI).build();
		IndividualLicensingInfo test2IndividualLicensingInfo = generator.builderForIndividualLicensingInfoTests("https://testObject2").build();
		assertTrue(testIndividualLicensingInfo.equivalent(test2IndividualLicensingInfo));
		assertTrue(test2IndividualLicensingInfo.equivalent(testIndividualLicensingInfo));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.IndividualLicensingInfo#setCreationInfo}.
	 */
	public void testIndividualLicensingInfosetCreationInfo() throws InvalidSPDXAnalysisException {
		IndividualLicensingInfo testIndividualLicensingInfo = generator.builderForIndividualLicensingInfoTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testIndividualLicensingInfo.getCreationInfo());
//		testIndividualLicensingInfo.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testIndividualLicensingInfo.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.IndividualLicensingInfo#setSummary}.
	 */
	public void testIndividualLicensingInfosetSummary() throws InvalidSPDXAnalysisException {
		IndividualLicensingInfo testIndividualLicensingInfo = generator.builderForIndividualLicensingInfoTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testIndividualLicensingInfo.getSummary());
		String newStringValue = "new summary value";
		testIndividualLicensingInfo.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testIndividualLicensingInfo.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.IndividualLicensingInfo#setDescription}.
	 */
	public void testIndividualLicensingInfosetDescription() throws InvalidSPDXAnalysisException {
		IndividualLicensingInfo testIndividualLicensingInfo = generator.builderForIndividualLicensingInfoTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testIndividualLicensingInfo.getDescription());
		String newStringValue = "new description value";
		testIndividualLicensingInfo.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testIndividualLicensingInfo.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.IndividualLicensingInfo#setComment}.
	 */
	public void testIndividualLicensingInfosetComment() throws InvalidSPDXAnalysisException {
		IndividualLicensingInfo testIndividualLicensingInfo = generator.builderForIndividualLicensingInfoTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testIndividualLicensingInfo.getComment());
		String newStringValue = "new comment value";
		testIndividualLicensingInfo.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testIndividualLicensingInfo.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.IndividualLicensingInfo#setName}.
	 */
	public void testIndividualLicensingInfosetName() throws InvalidSPDXAnalysisException {
		IndividualLicensingInfo testIndividualLicensingInfo = generator.builderForIndividualLicensingInfoTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testIndividualLicensingInfo.getName());
		String newStringValue = "new name value";
		testIndividualLicensingInfo.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testIndividualLicensingInfo.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.IndividualLicensingInfo#getExternalRef}.
	 */
	public void testIndividualLicensingInfogetExternalRefs() throws InvalidSPDXAnalysisException {
		IndividualLicensingInfo testIndividualLicensingInfo = generator.builderForIndividualLicensingInfoTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testIndividualLicensingInfo.getExternalRefs())));
//		testIndividualLicensingInfo.getExternalRefs().clear();
//		testIndividualLicensingInfo.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testIndividualLicensingInfo.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.IndividualLicensingInfo#getExtension}.
	 */
	public void testIndividualLicensingInfogetExtensions() throws InvalidSPDXAnalysisException {
		IndividualLicensingInfo testIndividualLicensingInfo = generator.builderForIndividualLicensingInfoTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testIndividualLicensingInfo.getExtensions())));
//		testIndividualLicensingInfo.getExtensions().clear();
//		testIndividualLicensingInfo.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testIndividualLicensingInfo.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.IndividualLicensingInfo#getVerifiedUsing}.
	 */
	public void testIndividualLicensingInfogetVerifiedUsings() throws InvalidSPDXAnalysisException {
		IndividualLicensingInfo testIndividualLicensingInfo = generator.builderForIndividualLicensingInfoTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testIndividualLicensingInfo.getVerifiedUsings())));
//		testIndividualLicensingInfo.getVerifiedUsings().clear();
//		testIndividualLicensingInfo.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testIndividualLicensingInfo.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.IndividualLicensingInfo#getExternalIdentifier}.
	 */
	public void testIndividualLicensingInfogetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		IndividualLicensingInfo testIndividualLicensingInfo = generator.builderForIndividualLicensingInfoTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testIndividualLicensingInfo.getExternalIdentifiers())));
//		testIndividualLicensingInfo.getExternalIdentifiers().clear();
//		testIndividualLicensingInfo.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testIndividualLicensingInfo.getExternalIdentifiers())));
		//TODO: Implement
	}
}