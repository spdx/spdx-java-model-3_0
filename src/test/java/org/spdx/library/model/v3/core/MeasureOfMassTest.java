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
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import junit.framework.TestCase;
import org.spdx.core.ModelRegistry;
import org.spdx.library.model.v3.MockCopyManager;
import org.spdx.library.model.v3.MockModelStore;
import org.spdx.library.model.v3.SpdxConstantsV3;
import org.spdx.library.model.v3.TestValuesGenerator;
import org.spdx.library.model.v3.UnitTestHelper;
import org.spdx.library.model.v3.core.Agent.AgentBuilder;
import org.spdx.library.model.v3.core.MeasureOfMass.MeasureOfMassBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class MeasureOfMassTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.core.MeasureOfMass#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		MeasureOfMass testMeasureOfMass = generator.builderForMeasureOfMassTests(TEST_OBJECT_URI).build();
		List<String> result = testMeasureOfMass.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.MeasureOfMass#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		MeasureOfMass testMeasureOfMass = generator.builderForMeasureOfMassTests(TEST_OBJECT_URI).build();
		assertEquals("Core.MeasureOfMass", testMeasureOfMass.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.MeasureOfMass#Element(org.spdx.library.model.v3.core.MeasureOfMass.MeasureOfMassBuilder)}.
	 */
	public void testMeasureOfMassMeasureOfMassBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForMeasureOfMassTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		MeasureOfMass testMeasureOfMass = generator.builderForMeasureOfMassTests(TEST_OBJECT_URI).build();
		MeasureOfMass test2MeasureOfMass = generator.builderForMeasureOfMassTests("https://testObject2").build();
		assertTrue(testMeasureOfMass.equivalent(test2MeasureOfMass));
		assertTrue(test2MeasureOfMass.equivalent(testMeasureOfMass));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.MeasureOfMass#setUnitQUDT}.
	 */
	public void testMeasureOfMasssetUnitQUDT() throws InvalidSPDXAnalysisException {
		MeasureOfMass testMeasureOfMass = generator.builderForMeasureOfMassTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.UNIT_Q_U_D_T_TEST_VALUE, testMeasureOfMass.getUnitQUDT());
		String newStringValue = "new unitQUDT value";
		testMeasureOfMass.setUnitQUDT(newStringValue);
		assertEquals(newStringValue, testMeasureOfMass.getUnitQUDT());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.MeasureOfMass#setQuantity}.
	 */
	public void testMeasureOfMasssetQuantity() throws InvalidSPDXAnalysisException {
		MeasureOfMass testMeasureOfMass = generator.builderForMeasureOfMassTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.QUANTITY_TEST_VALUE, testMeasureOfMass.getQuantity());
		String newStringValue = "new quantity value";
		testMeasureOfMass.setQuantity(newStringValue);
		assertEquals(newStringValue, testMeasureOfMass.getQuantity());
	}
}
