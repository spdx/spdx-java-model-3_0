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
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import org.spdx.library.model.v3_0_1.SpdxConstantsV3;

/**
 * DO NOT EDIT - this file is generated by the Owl to Java Utility 
 * See: https://github.com/spdx/tools-java 
 * 
 * A tuple of two positive integers that define a range. 
 */
public  class PositiveIntegerRange extends ModelObjectV3  {

	
	/**
	 * Create the PositiveIntegerRange with default model store and generated anonymous ID
	 * @throws InvalidSPDXAnalysisException when unable to create the PositiveIntegerRange
	 */
	public PositiveIntegerRange() throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore().getNextId(IdType.Anonymous));
	}

	/**
	 * @param objectUri URI or anonymous ID for the PositiveIntegerRange
	 * @throws InvalidSPDXAnalysisException when unable to create the PositiveIntegerRange
	 */
	public PositiveIntegerRange(String objectUri) throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore(), objectUri, DefaultModelStore.getDefaultCopyManager(), 
				true, DefaultModelStore.getDefaultDocumentUri() + "#");
	}

	/**
	 * @param modelStore Model store where the PositiveIntegerRange is to be stored
	 * @param objectUri URI or anonymous ID for the PositiveIntegerRange
	 * @param copyManager Copy manager for the PositiveIntegerRange - can be null if copying is not required
	 * @param create true if PositiveIntegerRange is to be created
	 * @param idPrefix - prefix to be used when generating new SPDX IDs
	 * @throws InvalidSPDXAnalysisException when unable to create the PositiveIntegerRange
	 */
	public PositiveIntegerRange(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
		super(modelStore, objectUri, copyManager, create, idPrefix);
	}

	/**
	 * Create the PositiveIntegerRange from the builder - used in the builder class
	 * @param builder Builder to create the PositiveIntegerRange from
	 * @throws InvalidSPDXAnalysisException when unable to create the PositiveIntegerRange
	 */
	protected PositiveIntegerRange(PositiveIntegerRangeBuilder builder) throws InvalidSPDXAnalysisException {
		super(builder);
		if (Objects.nonNull(builder.endIntegerRange)) {
			setEndIntegerRange(builder.endIntegerRange);
		}
		if (Objects.nonNull(builder.beginIntegerRange)) {
			setBeginIntegerRange(builder.beginIntegerRange);
		}
	}

	/* (non-Javadoc)
	 * @see org.spdx.library.core.CoreModelObject#getType()
	 */
	@Override
	public String getType() {
		return "Core.PositiveIntegerRange";
	}
	
	// Getters and Setters
	
	/**
	 * @return the endIntegerRange
	 */
	public @Nullable Integer getEndIntegerRange() throws InvalidSPDXAnalysisException {
		Optional<Integer> retval = getIntegerPropertyValue(SpdxConstantsV3.PROP_END_INTEGER_RANGE);
		return retval.isPresent() ? retval.get() : null;
	}
	
	/**
	 * @param endIntegerRange the endIntegerRange to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PositiveIntegerRange setEndIntegerRange(@Nullable Integer endIntegerRange) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.isNull(endIntegerRange)) {
			throw new InvalidSPDXAnalysisException("endIntegerRange is a required property");
		}
		if (isStrict() && Objects.nonNull(endIntegerRange) && endIntegerRange < 1) {
			throw new InvalidSPDXAnalysisException("endIntegerRange value " + endIntegerRange + " is less than the minimum 1 in PositiveIntegerRange");
		}
		setPropertyValue(SpdxConstantsV3.PROP_END_INTEGER_RANGE, endIntegerRange);
		return this;
	}
	/**
	 * @return the beginIntegerRange
	 */
	public @Nullable Integer getBeginIntegerRange() throws InvalidSPDXAnalysisException {
		Optional<Integer> retval = getIntegerPropertyValue(SpdxConstantsV3.PROP_BEGIN_INTEGER_RANGE);
		return retval.isPresent() ? retval.get() : null;
	}
	
	/**
	 * @param beginIntegerRange the beginIntegerRange to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PositiveIntegerRange setBeginIntegerRange(@Nullable Integer beginIntegerRange) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.isNull(beginIntegerRange)) {
			throw new InvalidSPDXAnalysisException("beginIntegerRange is a required property");
		}
		if (isStrict() && Objects.nonNull(beginIntegerRange) && beginIntegerRange < 1) {
			throw new InvalidSPDXAnalysisException("beginIntegerRange value " + beginIntegerRange + " is less than the minimum 1 in PositiveIntegerRange");
		}
		setPropertyValue(SpdxConstantsV3.PROP_BEGIN_INTEGER_RANGE, beginIntegerRange);
		return this;
	}
	
	
	@Override
	public String toString() {
		return "PositiveIntegerRange: "+getObjectUri();
		
	}
	
	/* (non-Javadoc)
	 * @see org.spdx.library.model.v3.ModelObjectV3#_verify(java.util.List)
	 */
	@Override
	public List<String> _verify(Set<String> verifiedIds, String specVersionForVerify, List<IndividualUriValue> profiles) {
		List<String> retval = new ArrayList<>();
		try {
			Integer endIntegerRange = getEndIntegerRange();
			if (Objects.isNull(endIntegerRange) &&
					Collections.disjoint(profiles, Arrays.asList(new ProfileIdentifierType[] { ProfileIdentifierType.CORE }))) {
				retval.add("Missing endIntegerRange in PositiveIntegerRange");
			}
			if (Objects.nonNull(endIntegerRange) && endIntegerRange < 1) {
				retval.add("endIntegerRange value " + endIntegerRange + " is less than the minimum 1 in PositiveIntegerRange");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting endIntegerRange for PositiveIntegerRange: "+e.getMessage());
		}
		try {
			Integer beginIntegerRange = getBeginIntegerRange();
			if (Objects.isNull(beginIntegerRange) &&
					Collections.disjoint(profiles, Arrays.asList(new ProfileIdentifierType[] { ProfileIdentifierType.CORE }))) {
				retval.add("Missing beginIntegerRange in PositiveIntegerRange");
			}
			if (Objects.nonNull(beginIntegerRange) && beginIntegerRange < 1) {
				retval.add("beginIntegerRange value " + beginIntegerRange + " is less than the minimum 1 in PositiveIntegerRange");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting beginIntegerRange for PositiveIntegerRange: "+e.getMessage());
		}
		return retval;
	}
	
	
	
	public static class PositiveIntegerRangeBuilder extends ModelObjectV3Builder {
	
		/**
		 * Create an PositiveIntegerRangeBuilder from another model object copying the modelStore and copyManager and using an anonymous ID
		 * @param from model object to copy the model store and copyManager from
		 * @throws InvalidSPDXAnalysisException
		 */
		public PositiveIntegerRangeBuilder(ModelObjectV3 from) throws InvalidSPDXAnalysisException {
			this(from, from.getModelStore().getNextId(IdType.Anonymous));
		}
	
		/**
		 * Create an PositiveIntegerRangeBuilder from another model object copying the modelStore and copyManager
		 * @param from model object to copy the model store and copyManager from
		 * @param objectUri URI for the object
		 * @throws InvalidSPDXAnalysisException if creationInfo can not be fetched from the from
		 */
		public PositiveIntegerRangeBuilder(ModelObjectV3 from, String objectUri) throws InvalidSPDXAnalysisException {
			this(from.getModelStore(), objectUri, from.getCopyManager());
			setStrict(from.isStrict());
			setIdPrefix(from.getIdPrefix());
		}
		
		/**
		 * Creates a PositiveIntegerRangeBuilder
		 * @param modelStore model store for the built PositiveIntegerRange
		 * @param objectUri objectUri for the built PositiveIntegerRange
		 * @param copyManager optional copyManager for the built PositiveIntegerRange
		 */
		public PositiveIntegerRangeBuilder(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager) {
			super(modelStore, objectUri, copyManager);
		}
		
		protected Integer endIntegerRange = null;
		protected Integer beginIntegerRange = null;
		
		
		/**
		 * Sets the initial value of endIntegerRange
		 * @parameter endIntegerRange value to set
		 * @return this for chaining
		**/
		public PositiveIntegerRangeBuilder setEndIntegerRange(Integer endIntegerRange) {
			this.endIntegerRange = endIntegerRange;
			return this;
		}
		
		/**
		 * Sets the initial value of beginIntegerRange
		 * @parameter beginIntegerRange value to set
		 * @return this for chaining
		**/
		public PositiveIntegerRangeBuilder setBeginIntegerRange(Integer beginIntegerRange) {
			this.beginIntegerRange = beginIntegerRange;
			return this;
		}
	
		/**
		 * @return the PositiveIntegerRange
		 * @throws InvalidSPDXAnalysisException on any errors during build
		 */
		public PositiveIntegerRange build() throws InvalidSPDXAnalysisException {
			IModelStoreLock lock = getModelStore().enterCriticalSection(false);
			try {
				return new PositiveIntegerRange(this);
			} finally {
				getModelStore().leaveCriticalSection(lock);
			}
		}
	}
}
