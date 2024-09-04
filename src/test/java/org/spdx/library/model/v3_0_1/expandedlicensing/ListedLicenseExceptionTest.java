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
import org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException.ListedLicenseExceptionBuilder;
import org.spdx.library.model.v3_0_1.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class ListedLicenseExceptionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ListedLicenseException testListedLicenseException = generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
		List<String> result = testListedLicenseException.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ListedLicenseException testListedLicenseException = generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
		assertEquals("ExpandedLicensing.ListedLicenseException", testListedLicenseException.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException#Element(org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException.ListedLicenseExceptionBuilder)}.
	 */
	public void testListedLicenseExceptionListedLicenseExceptionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ListedLicenseException testListedLicenseException = generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
		ListedLicenseException test2ListedLicenseException = generator.builderForListedLicenseExceptionTests("https://testObject2").build();
		assertTrue(testListedLicenseException.equivalent(test2ListedLicenseException));
		assertTrue(test2ListedLicenseException.equivalent(testListedLicenseException));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException#setCreationInfo}.
	 */
	public void testListedLicenseExceptionsetCreationInfo() throws InvalidSPDXAnalysisException {
		ListedLicenseException testListedLicenseException = generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testListedLicenseException.getCreationInfo());
//		testListedLicenseException.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testListedLicenseException.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException#setIsDeprecatedAdditionId}.
	 */
	public void testListedLicenseExceptionsetIsDeprecatedAdditionId() throws InvalidSPDXAnalysisException {
		ListedLicenseException testListedLicenseException = generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(new Boolean(true)), testListedLicenseException.getIsDeprecatedAdditionId());
		testListedLicenseException.setIsDeprecatedAdditionId(false);
		assertEquals(Optional.of(new Boolean(false)), testListedLicenseException.getIsDeprecatedAdditionId());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException#setSummary}.
	 */
	public void testListedLicenseExceptionsetSummary() throws InvalidSPDXAnalysisException {
		ListedLicenseException testListedLicenseException = generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testListedLicenseException.getSummary());
		String newStringValue = "new summary value";
		testListedLicenseException.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testListedLicenseException.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException#setDescription}.
	 */
	public void testListedLicenseExceptionsetDescription() throws InvalidSPDXAnalysisException {
		ListedLicenseException testListedLicenseException = generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testListedLicenseException.getDescription());
		String newStringValue = "new description value";
		testListedLicenseException.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testListedLicenseException.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException#setObsoletedBy}.
	 */
	public void testListedLicenseExceptionsetObsoletedBy() throws InvalidSPDXAnalysisException {
		ListedLicenseException testListedLicenseException = generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.OBSOLETED_BY_TEST_VALUE), testListedLicenseException.getObsoletedBy());
		String newStringValue = "new obsoletedBy value";
		testListedLicenseException.setObsoletedBy(newStringValue);
		assertEquals(Optional.of(newStringValue), testListedLicenseException.getObsoletedBy());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException#setAdditionText}.
	 */
	public void testListedLicenseExceptionsetAdditionText() throws InvalidSPDXAnalysisException {
		ListedLicenseException testListedLicenseException = generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.ADDITION_TEXT_TEST_VALUE, testListedLicenseException.getAdditionText());
		String newStringValue = "new additionText value";
		testListedLicenseException.setAdditionText(newStringValue);
		assertEquals(newStringValue, testListedLicenseException.getAdditionText());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException#setListVersionAdded}.
	 */
	public void testListedLicenseExceptionsetListVersionAdded() throws InvalidSPDXAnalysisException {
		ListedLicenseException testListedLicenseException = generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.LIST_VERSION_ADDED_TEST_VALUE), testListedLicenseException.getListVersionAdded());
		String newStringValue = "new listVersionAdded value";
		testListedLicenseException.setListVersionAdded(newStringValue);
		assertEquals(Optional.of(newStringValue), testListedLicenseException.getListVersionAdded());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException#setLicenseXml}.
	 */
	public void testListedLicenseExceptionsetLicenseXml() throws InvalidSPDXAnalysisException {
		ListedLicenseException testListedLicenseException = generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.LICENSE_XML_TEST_VALUE), testListedLicenseException.getLicenseXml());
		String newStringValue = "new licenseXml value";
		testListedLicenseException.setLicenseXml(newStringValue);
		assertEquals(Optional.of(newStringValue), testListedLicenseException.getLicenseXml());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException#setComment}.
	 */
	public void testListedLicenseExceptionsetComment() throws InvalidSPDXAnalysisException {
		ListedLicenseException testListedLicenseException = generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testListedLicenseException.getComment());
		String newStringValue = "new comment value";
		testListedLicenseException.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testListedLicenseException.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException#setName}.
	 */
	public void testListedLicenseExceptionsetName() throws InvalidSPDXAnalysisException {
		ListedLicenseException testListedLicenseException = generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testListedLicenseException.getName());
		String newStringValue = "new name value";
		testListedLicenseException.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testListedLicenseException.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException#setStandardAdditionTemplate}.
	 */
	public void testListedLicenseExceptionsetStandardAdditionTemplate() throws InvalidSPDXAnalysisException {
		ListedLicenseException testListedLicenseException = generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.STANDARD_ADDITION_TEMPLATE_TEST_VALUE), testListedLicenseException.getStandardAdditionTemplate());
		String newStringValue = "new standardAdditionTemplate value";
		testListedLicenseException.setStandardAdditionTemplate(newStringValue);
		assertEquals(Optional.of(newStringValue), testListedLicenseException.getStandardAdditionTemplate());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException#setDeprecatedVersion}.
	 */
	public void testListedLicenseExceptionsetDeprecatedVersion() throws InvalidSPDXAnalysisException {
		ListedLicenseException testListedLicenseException = generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DEPRECATED_VERSION_TEST_VALUE), testListedLicenseException.getDeprecatedVersion());
		String newStringValue = "new deprecatedVersion value";
		testListedLicenseException.setDeprecatedVersion(newStringValue);
		assertEquals(Optional.of(newStringValue), testListedLicenseException.getDeprecatedVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException#getExtension}.
	 */
	public void testListedLicenseExceptiongetExtensions() throws InvalidSPDXAnalysisException {
		ListedLicenseException testListedLicenseException = generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testListedLicenseException.getExtensions())));
//		testListedLicenseException.getExtensions().clear();
//		testListedLicenseException.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testListedLicenseException.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException#getVerifiedUsing}.
	 */
	public void testListedLicenseExceptiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		ListedLicenseException testListedLicenseException = generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testListedLicenseException.getVerifiedUsings())));
//		testListedLicenseException.getVerifiedUsings().clear();
//		testListedLicenseException.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testListedLicenseException.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException#getExternalRef}.
	 */
	public void testListedLicenseExceptiongetExternalRefs() throws InvalidSPDXAnalysisException {
		ListedLicenseException testListedLicenseException = generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testListedLicenseException.getExternalRefs())));
//		testListedLicenseException.getExternalRefs().clear();
//		testListedLicenseException.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testListedLicenseException.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException#getExternalIdentifier}.
	 */
	public void testListedLicenseExceptiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		ListedLicenseException testListedLicenseException = generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testListedLicenseException.getExternalIdentifiers())));
//		testListedLicenseException.getExternalIdentifiers().clear();
//		testListedLicenseException.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testListedLicenseException.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException#getSeeAlsos}.
	 */
	public void testListedLicenseExceptiongetSeeAlsos() throws InvalidSPDXAnalysisException {
		ListedLicenseException testListedLicenseException = generator.builderForListedLicenseExceptionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SEE_ALSO_TEST_LIST1, new ArrayList<>(testListedLicenseException.getSeeAlsos())));
		testListedLicenseException.getSeeAlsos().clear();
		testListedLicenseException.getSeeAlsos().addAll(TestValuesGenerator.SEE_ALSO_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SEE_ALSO_TEST_LIST2, new ArrayList<>(testListedLicenseException.getSeeAlsos())));
	}
}