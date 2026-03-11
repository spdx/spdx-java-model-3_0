/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_0.expandedlicensing;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.spdx.core.CoreModelObject;
import org.spdx.core.DefaultModelStore;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.IndividualUriValue;
import org.spdx.library.model.v3_0.ModelObjectV3;
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
import org.spdx.library.model.v3_0.MockCopyManager;
import org.spdx.library.model.v3_0.MockModelStore;
import org.spdx.library.model.v3_0.SpdxConstantsV3;
import org.spdx.library.model.v3_0.SpdxModelInfoV3_0;
import org.spdx.library.model.v3_0.TestValuesGenerator;
import org.spdx.library.model.v3_0.UnitTestHelper;
import org.spdx.library.model.v3_0.core.Agent.AgentBuilder;
import org.spdx.library.model.v3_0.core.CreationInfo;
import org.spdx.library.model.v3_0.core.Element;
import org.spdx.library.model.v3_0.core.ExternalIdentifier;
import org.spdx.library.model.v3_0.core.ExternalRef;
import org.spdx.library.model.v3_0.core.IntegrityMethod;
import org.spdx.library.model.v3_0.core.ProfileIdentifierType;
import org.spdx.library.model.v3_0.expandedlicensing.OrLaterOperator.OrLaterOperatorBuilder;
import org.spdx.library.model.v3_0.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class OrLaterOperatorTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.OrLaterOperator#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		OrLaterOperator testOrLaterOperator = generator.builderForOrLaterOperatorTests(TEST_OBJECT_URI).build();
		List<String> result = testOrLaterOperator.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.OrLaterOperator#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		OrLaterOperator testOrLaterOperator = generator.builderForOrLaterOperatorTests(TEST_OBJECT_URI).build();
		assertEquals("ExpandedLicensing.OrLaterOperator", testOrLaterOperator.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.OrLaterOperator#Element(org.spdx.library.model.v3_0.expandedlicensing.OrLaterOperator.OrLaterOperatorBuilder)}.
	 */
	public void testOrLaterOperatorOrLaterOperatorBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForOrLaterOperatorTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		OrLaterOperator testOrLaterOperator = generator.builderForOrLaterOperatorTests(TEST_OBJECT_URI).build();
		OrLaterOperator test2OrLaterOperator = generator.builderForOrLaterOperatorTests("https://testObject2").build();
		assertTrue(testOrLaterOperator.equivalent(test2OrLaterOperator));
		assertTrue(test2OrLaterOperator.equivalent(testOrLaterOperator));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.OrLaterOperator#setExtension}.
	 */
	public void testOrLaterOperatorsetExtension() throws InvalidSPDXAnalysisException {
		OrLaterOperator testOrLaterOperator = generator.builderForOrLaterOperatorTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testOrLaterOperator.getExtension());
//		testOrLaterOperator.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testOrLaterOperator.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.OrLaterOperator#setCreationInfo}.
	 */
	public void testOrLaterOperatorsetCreationInfo() throws InvalidSPDXAnalysisException {
		OrLaterOperator testOrLaterOperator = generator.builderForOrLaterOperatorTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testOrLaterOperator.getCreationInfo());
//		testOrLaterOperator.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testOrLaterOperator.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.OrLaterOperator#setSubjectLicense}.
	 */
	public void testOrLaterOperatorsetSubjectLicense() throws InvalidSPDXAnalysisException {
		OrLaterOperator testOrLaterOperator = generator.builderForOrLaterOperatorTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testOrLaterOperator.getSubjectLicense());
//		testOrLaterOperator.setSubjectLicense(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testOrLaterOperator.getSubjectLicense());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.OrLaterOperator#setName}.
	 */
	public void testOrLaterOperatorsetName() throws InvalidSPDXAnalysisException {
		OrLaterOperator testOrLaterOperator = generator.builderForOrLaterOperatorTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testOrLaterOperator.getName());
		String newStringValue = "new name value";
		testOrLaterOperator.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testOrLaterOperator.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.OrLaterOperator#setDescription}.
	 */
	public void testOrLaterOperatorsetDescription() throws InvalidSPDXAnalysisException {
		OrLaterOperator testOrLaterOperator = generator.builderForOrLaterOperatorTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testOrLaterOperator.getDescription());
		String newStringValue = "new description value";
		testOrLaterOperator.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testOrLaterOperator.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.OrLaterOperator#setComment}.
	 */
	public void testOrLaterOperatorsetComment() throws InvalidSPDXAnalysisException {
		OrLaterOperator testOrLaterOperator = generator.builderForOrLaterOperatorTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testOrLaterOperator.getComment());
		String newStringValue = "new comment value";
		testOrLaterOperator.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testOrLaterOperator.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.OrLaterOperator#setSummary}.
	 */
	public void testOrLaterOperatorsetSummary() throws InvalidSPDXAnalysisException {
		OrLaterOperator testOrLaterOperator = generator.builderForOrLaterOperatorTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testOrLaterOperator.getSummary());
		String newStringValue = "new summary value";
		testOrLaterOperator.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testOrLaterOperator.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.OrLaterOperator#getExternalRef}.
	 */
	public void testOrLaterOperatorgetExternalRefs() throws InvalidSPDXAnalysisException {
		OrLaterOperator testOrLaterOperator = generator.builderForOrLaterOperatorTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testOrLaterOperator.getExternalRefs())));
//		testOrLaterOperator.getExternalRefs().clear();
//		testOrLaterOperator.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testOrLaterOperator.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.OrLaterOperator#getVerifiedUsing}.
	 */
	public void testOrLaterOperatorgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		OrLaterOperator testOrLaterOperator = generator.builderForOrLaterOperatorTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testOrLaterOperator.getVerifiedUsings())));
//		testOrLaterOperator.getVerifiedUsings().clear();
//		testOrLaterOperator.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testOrLaterOperator.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0.expandedlicensing.OrLaterOperator#getExternalIdentifier}.
	 */
	public void testOrLaterOperatorgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		OrLaterOperator testOrLaterOperator = generator.builderForOrLaterOperatorTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testOrLaterOperator.getExternalIdentifiers())));
//		testOrLaterOperator.getExternalIdentifiers().clear();
//		testOrLaterOperator.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testOrLaterOperator.getExternalIdentifiers())));
		//TODO: Implement
	}
}
