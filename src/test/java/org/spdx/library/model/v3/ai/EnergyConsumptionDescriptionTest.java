/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.ai;

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
import org.spdx.library.model.v3.ai.EnergyConsumptionDescription.EnergyConsumptionDescriptionBuilder;
import org.spdx.library.model.v3.core.Agent.AgentBuilder;
import org.spdx.library.model.v3.core.ProfileIdentifierType;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class EnergyConsumptionDescriptionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.ai.EnergyConsumptionDescription#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		EnergyConsumptionDescription testEnergyConsumptionDescription = generator.builderForEnergyConsumptionDescriptionTests(TEST_OBJECT_URI).build();
		List<String> result = testEnergyConsumptionDescription.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.ai.EnergyConsumptionDescription#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		EnergyConsumptionDescription testEnergyConsumptionDescription = generator.builderForEnergyConsumptionDescriptionTests(TEST_OBJECT_URI).build();
		assertEquals("AI.EnergyConsumptionDescription", testEnergyConsumptionDescription.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.ai.EnergyConsumptionDescription#Element(org.spdx.library.model.v3.ai.EnergyConsumptionDescription.EnergyConsumptionDescriptionBuilder)}.
	 */
	public void testEnergyConsumptionDescriptionEnergyConsumptionDescriptionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForEnergyConsumptionDescriptionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		EnergyConsumptionDescription testEnergyConsumptionDescription = generator.builderForEnergyConsumptionDescriptionTests(TEST_OBJECT_URI).build();
		EnergyConsumptionDescription test2EnergyConsumptionDescription = generator.builderForEnergyConsumptionDescriptionTests("https://testObject2").build();
		assertTrue(testEnergyConsumptionDescription.equivalent(test2EnergyConsumptionDescription));
		assertTrue(test2EnergyConsumptionDescription.equivalent(testEnergyConsumptionDescription));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.ai.EnergyConsumptionDescription#setEnergyUnit}.
	 */
	public void testEnergyConsumptionDescriptionsetEnergyUnit() throws InvalidSPDXAnalysisException {
		EnergyConsumptionDescription testEnergyConsumptionDescription = generator.builderForEnergyConsumptionDescriptionTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.ENERGY_UNIT_TEST_VALUE1, testEnergyConsumptionDescription.getEnergyUnit());
		testEnergyConsumptionDescription.setEnergyUnit(TestValuesGenerator.ENERGY_UNIT_TEST_VALUE2);
		assertEquals(TestValuesGenerator.ENERGY_UNIT_TEST_VALUE2, testEnergyConsumptionDescription.getEnergyUnit());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.ai.EnergyConsumptionDescription#setEnergyQuantity}.
	 */
	public void testEnergyConsumptionDescriptionsetEnergyQuantity() throws InvalidSPDXAnalysisException {
		EnergyConsumptionDescription testEnergyConsumptionDescription = generator.builderForEnergyConsumptionDescriptionTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.ENERGY_QUANTITY_TEST_VALUE, testEnergyConsumptionDescription.getEnergyQuantity());
		testEnergyConsumptionDescription.setEnergyQuantity(new Double(653.6));
		assertEquals(new Double(653.6), testEnergyConsumptionDescription.getEnergyQuantity());
	}
}
