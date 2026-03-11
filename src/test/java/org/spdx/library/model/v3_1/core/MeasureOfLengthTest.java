/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.core;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.spdx.core.CoreModelObject;
import org.spdx.core.DefaultModelStore;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.IndividualUriValue;
import org.spdx.library.model.v3_1.ModelObjectV3;
import org.spdx.storage.IModelStore;
import org.spdx.storage.IModelStore.IdType;
import org.spdx.storage.IModelStore.IModelStoreLock;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import junit.framework.TestCase;
import org.spdx.core.ModelRegistry;
import org.spdx.library.model.v3_1.MockCopyManager;
import org.spdx.library.model.v3_1.MockModelStore;
import org.spdx.library.model.v3_1.SpdxConstantsV3;
import org.spdx.library.model.v3_1.SpdxModelInfoV3_0;
import org.spdx.library.model.v3_1.TestValuesGenerator;
import org.spdx.library.model.v3_1.UnitTestHelper;
import org.spdx.library.model.v3_1.core.Agent.AgentBuilder;
import org.spdx.library.model.v3_1.core.MeasureOfLength.MeasureOfLengthBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class MeasureOfLengthTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.core.MeasureOfLength#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		MeasureOfLength testMeasureOfLength = generator.builderForMeasureOfLengthTests(TEST_OBJECT_URI).build();
		List<String> result = testMeasureOfLength.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.MeasureOfLength#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		MeasureOfLength testMeasureOfLength = generator.builderForMeasureOfLengthTests(TEST_OBJECT_URI).build();
		assertEquals("Core.MeasureOfLength", testMeasureOfLength.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.MeasureOfLength#Element(org.spdx.library.model.v3_1.core.MeasureOfLength.MeasureOfLengthBuilder)}.
	 */
	public void testMeasureOfLengthMeasureOfLengthBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForMeasureOfLengthTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		MeasureOfLength testMeasureOfLength = generator.builderForMeasureOfLengthTests(TEST_OBJECT_URI).build();
		MeasureOfLength test2MeasureOfLength = generator.builderForMeasureOfLengthTests("https://testObject2").build();
		assertTrue(testMeasureOfLength.equivalent(test2MeasureOfLength));
		assertTrue(test2MeasureOfLength.equivalent(testMeasureOfLength));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.MeasureOfLength#setUnitQUDT}.
	 */
	public void testMeasureOfLengthsetUnitQUDT() throws InvalidSPDXAnalysisException {
		MeasureOfLength testMeasureOfLength = generator.builderForMeasureOfLengthTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.UNIT_Q_U_D_T_TEST_VALUE, testMeasureOfLength.getUnitQUDT());
		String newStringValue = "new unitQUDT value";
		testMeasureOfLength.setUnitQUDT(newStringValue);
		assertEquals(newStringValue, testMeasureOfLength.getUnitQUDT());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.MeasureOfLength#setQuantity}.
	 */
	public void testMeasureOfLengthsetQuantity() throws InvalidSPDXAnalysisException {
		MeasureOfLength testMeasureOfLength = generator.builderForMeasureOfLengthTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.QUANTITY_TEST_VALUE, testMeasureOfLength.getQuantity());
		String newStringValue = "new quantity value";
		testMeasureOfLength.setQuantity(newStringValue);
		assertEquals(newStringValue, testMeasureOfLength.getQuantity());
	}
}
