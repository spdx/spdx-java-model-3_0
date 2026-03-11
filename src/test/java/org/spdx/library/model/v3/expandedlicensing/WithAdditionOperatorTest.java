/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.expandedlicensing;

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
import org.spdx.library.model.v3.core.ExternalIdentifier;
import org.spdx.library.model.v3.core.ExternalRef;
import org.spdx.library.model.v3.core.IntegrityMethod;
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.expandedlicensing.WithAdditionOperator.WithAdditionOperatorBuilder;
import org.spdx.library.model.v3.extension.Extension;
import org.spdx.library.model.v3.simplelicensing.AnyLicenseInfo;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class WithAdditionOperatorTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.WithAdditionOperator#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
		List<String> result = testWithAdditionOperator.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.WithAdditionOperator#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
		assertEquals("ExpandedLicensing.WithAdditionOperator", testWithAdditionOperator.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.WithAdditionOperator#Element(org.spdx.library.model.v3.expandedlicensing.WithAdditionOperator.WithAdditionOperatorBuilder)}.
	 */
	public void testWithAdditionOperatorWithAdditionOperatorBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
		WithAdditionOperator test2WithAdditionOperator = generator.builderForWithAdditionOperatorTests("https://testObject2").build();
		assertTrue(testWithAdditionOperator.equivalent(test2WithAdditionOperator));
		assertTrue(test2WithAdditionOperator.equivalent(testWithAdditionOperator));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.WithAdditionOperator#setExtension}.
	 */
	public void testWithAdditionOperatorsetExtension() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testWithAdditionOperator.getExtension());
//		testWithAdditionOperator.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testWithAdditionOperator.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.WithAdditionOperator#setCreationInfo}.
	 */
	public void testWithAdditionOperatorsetCreationInfo() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testWithAdditionOperator.getCreationInfo());
//		testWithAdditionOperator.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testWithAdditionOperator.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.WithAdditionOperator#setSubjectAddition}.
	 */
	public void testWithAdditionOperatorsetSubjectAddition() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testWithAdditionOperator.getSubjectAddition());
//		testWithAdditionOperator.setSubjectAddition(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testWithAdditionOperator.getSubjectAddition());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.WithAdditionOperator#setSubjectExtendableLicense}.
	 */
	public void testWithAdditionOperatorsetSubjectExtendableLicense() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testWithAdditionOperator.getSubjectExtendableLicense());
//		testWithAdditionOperator.setSubjectExtendableLicense(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testWithAdditionOperator.getSubjectExtendableLicense());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.WithAdditionOperator#setDescription}.
	 */
	public void testWithAdditionOperatorsetDescription() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testWithAdditionOperator.getDescription());
		String newStringValue = "new description value";
		testWithAdditionOperator.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testWithAdditionOperator.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.WithAdditionOperator#setComment}.
	 */
	public void testWithAdditionOperatorsetComment() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testWithAdditionOperator.getComment());
		String newStringValue = "new comment value";
		testWithAdditionOperator.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testWithAdditionOperator.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.WithAdditionOperator#setName}.
	 */
	public void testWithAdditionOperatorsetName() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testWithAdditionOperator.getName());
		String newStringValue = "new name value";
		testWithAdditionOperator.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testWithAdditionOperator.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.WithAdditionOperator#setSummary}.
	 */
	public void testWithAdditionOperatorsetSummary() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testWithAdditionOperator.getSummary());
		String newStringValue = "new summary value";
		testWithAdditionOperator.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testWithAdditionOperator.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.WithAdditionOperator#getExternalIdentifier}.
	 */
	public void testWithAdditionOperatorgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testWithAdditionOperator.getExternalIdentifiers())));
//		testWithAdditionOperator.getExternalIdentifiers().clear();
//		testWithAdditionOperator.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testWithAdditionOperator.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.WithAdditionOperator#getVerifiedUsing}.
	 */
	public void testWithAdditionOperatorgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testWithAdditionOperator.getVerifiedUsings())));
//		testWithAdditionOperator.getVerifiedUsings().clear();
//		testWithAdditionOperator.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testWithAdditionOperator.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.expandedlicensing.WithAdditionOperator#getExternalRef}.
	 */
	public void testWithAdditionOperatorgetExternalRefs() throws InvalidSPDXAnalysisException {
		WithAdditionOperator testWithAdditionOperator = generator.builderForWithAdditionOperatorTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testWithAdditionOperator.getExternalRefs())));
//		testWithAdditionOperator.getExternalRefs().clear();
//		testWithAdditionOperator.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testWithAdditionOperator.getExternalRefs())));
		//TODO: Implement
	}
}
