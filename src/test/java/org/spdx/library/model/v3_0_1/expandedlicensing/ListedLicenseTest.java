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
import org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense.ListedLicenseBuilder;
import org.spdx.library.model.v3_0_1.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class ListedLicenseTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
		List<String> result = testListedLicense.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
		assertEquals("ExpandedLicensing.ListedLicense", testListedLicense.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#Element(org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense.ListedLicenseBuilder)}.
	 */
	public void testListedLicenseListedLicenseBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
		ListedLicense test2ListedLicense = generator.builderForListedLicenseTests("https://testObject2").build();
		assertTrue(testListedLicense.equivalent(test2ListedLicense));
		assertTrue(test2ListedLicense.equivalent(testListedLicense));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#setCreationInfo}.
	 */
	public void testListedLicensesetCreationInfo() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testListedLicense.getCreationInfo());
//		testListedLicense.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testListedLicense.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#setIsFsfLibre}.
	 */
	public void testListedLicensesetIsFsfLibre() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(new Boolean(true)), testListedLicense.getIsFsfLibre());
		testListedLicense.setIsFsfLibre(false);
		assertEquals(Optional.of(new Boolean(false)), testListedLicense.getIsFsfLibre());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#setIsDeprecatedLicenseId}.
	 */
	public void testListedLicensesetIsDeprecatedLicenseId() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(new Boolean(true)), testListedLicense.getIsDeprecatedLicenseId());
		testListedLicense.setIsDeprecatedLicenseId(false);
		assertEquals(Optional.of(new Boolean(false)), testListedLicense.getIsDeprecatedLicenseId());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#setIsOsiApproved}.
	 */
	public void testListedLicensesetIsOsiApproved() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(new Boolean(true)), testListedLicense.getIsOsiApproved());
		testListedLicense.setIsOsiApproved(false);
		assertEquals(Optional.of(new Boolean(false)), testListedLicense.getIsOsiApproved());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#setLicenseText}.
	 */
	public void testListedLicensesetLicenseText() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.LICENSE_TEXT_TEST_VALUE, testListedLicense.getLicenseText());
		String newStringValue = "new licenseText value";
		testListedLicense.setLicenseText(newStringValue);
		assertEquals(newStringValue, testListedLicense.getLicenseText());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#setSummary}.
	 */
	public void testListedLicensesetSummary() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testListedLicense.getSummary());
		String newStringValue = "new summary value";
		testListedLicense.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testListedLicense.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#setDescription}.
	 */
	public void testListedLicensesetDescription() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testListedLicense.getDescription());
		String newStringValue = "new description value";
		testListedLicense.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testListedLicense.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#setStandardLicenseTemplate}.
	 */
	public void testListedLicensesetStandardLicenseTemplate() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.STANDARD_LICENSE_TEMPLATE_TEST_VALUE), testListedLicense.getStandardLicenseTemplate());
		String newStringValue = "new standardLicenseTemplate value";
		testListedLicense.setStandardLicenseTemplate(newStringValue);
		assertEquals(Optional.of(newStringValue), testListedLicense.getStandardLicenseTemplate());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#setObsoletedBy}.
	 */
	public void testListedLicensesetObsoletedBy() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.OBSOLETED_BY_TEST_VALUE), testListedLicense.getObsoletedBy());
		String newStringValue = "new obsoletedBy value";
		testListedLicense.setObsoletedBy(newStringValue);
		assertEquals(Optional.of(newStringValue), testListedLicense.getObsoletedBy());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#setListVersionAdded}.
	 */
	public void testListedLicensesetListVersionAdded() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.LIST_VERSION_ADDED_TEST_VALUE), testListedLicense.getListVersionAdded());
		String newStringValue = "new listVersionAdded value";
		testListedLicense.setListVersionAdded(newStringValue);
		assertEquals(Optional.of(newStringValue), testListedLicense.getListVersionAdded());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#setLicenseXml}.
	 */
	public void testListedLicensesetLicenseXml() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.LICENSE_XML_TEST_VALUE), testListedLicense.getLicenseXml());
		String newStringValue = "new licenseXml value";
		testListedLicense.setLicenseXml(newStringValue);
		assertEquals(Optional.of(newStringValue), testListedLicense.getLicenseXml());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#setComment}.
	 */
	public void testListedLicensesetComment() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testListedLicense.getComment());
		String newStringValue = "new comment value";
		testListedLicense.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testListedLicense.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#setName}.
	 */
	public void testListedLicensesetName() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testListedLicense.getName());
		String newStringValue = "new name value";
		testListedLicense.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testListedLicense.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#setDeprecatedVersion}.
	 */
	public void testListedLicensesetDeprecatedVersion() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DEPRECATED_VERSION_TEST_VALUE), testListedLicense.getDeprecatedVersion());
		String newStringValue = "new deprecatedVersion value";
		testListedLicense.setDeprecatedVersion(newStringValue);
		assertEquals(Optional.of(newStringValue), testListedLicense.getDeprecatedVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#setStandardLicenseHeader}.
	 */
	public void testListedLicensesetStandardLicenseHeader() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.STANDARD_LICENSE_HEADER_TEST_VALUE), testListedLicense.getStandardLicenseHeader());
		String newStringValue = "new standardLicenseHeader value";
		testListedLicense.setStandardLicenseHeader(newStringValue);
		assertEquals(Optional.of(newStringValue), testListedLicense.getStandardLicenseHeader());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#getExtension}.
	 */
	public void testListedLicensegetExtensions() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testListedLicense.getExtensions())));
//		testListedLicense.getExtensions().clear();
//		testListedLicense.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testListedLicense.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#getVerifiedUsing}.
	 */
	public void testListedLicensegetVerifiedUsings() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testListedLicense.getVerifiedUsings())));
//		testListedLicense.getVerifiedUsings().clear();
//		testListedLicense.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testListedLicense.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#getExternalRef}.
	 */
	public void testListedLicensegetExternalRefs() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testListedLicense.getExternalRefs())));
//		testListedLicense.getExternalRefs().clear();
//		testListedLicense.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testListedLicense.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#getExternalIdentifier}.
	 */
	public void testListedLicensegetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testListedLicense.getExternalIdentifiers())));
//		testListedLicense.getExternalIdentifiers().clear();
//		testListedLicense.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testListedLicense.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense#getSeeAlsos}.
	 */
	public void testListedLicensegetSeeAlsos() throws InvalidSPDXAnalysisException {
		ListedLicense testListedLicense = generator.builderForListedLicenseTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SEE_ALSO_TEST_LIST1, new ArrayList<>(testListedLicense.getSeeAlsos())));
		testListedLicense.getSeeAlsos().clear();
		testListedLicense.getSeeAlsos().addAll(TestValuesGenerator.SEE_ALSO_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SEE_ALSO_TEST_LIST2, new ArrayList<>(testListedLicense.getSeeAlsos())));
	}
}